package network

import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class HttpClient{
    private val httpBuilder: OkHttpClient.Builder get(){
        val httpClient = OkHttpClient.Builder().addInterceptor(Interceptor { chain ->
            val original = chain.request()
            val request = original.newBuilder()
                    .header("accept", "application/vnd.api+json")
                    .method(original.method(), original.body())
                    .build()
            return@Interceptor chain.proceed(request)
        }).readTimeout(30, TimeUnit.SECONDS)

        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        httpClient.addInterceptor(loggingInterceptor)
        return  httpClient
    }

    val service : PUBGService = create(PUBGService::class.java)

    lateinit var retrofit: Retrofit

    private fun <T> create(serviceClass: Class<T>): T{
        val gson = GsonBuilder().serializeNulls().create()

        retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("https://api.playbattlegrounds.com/")
                .client(httpBuilder.build())
                .build()
        return retrofit.create(serviceClass)
    }
}