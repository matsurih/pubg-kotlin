package io.github.matsurhime.pubgkotlin.network

import com.google.gson.GsonBuilder
import okhttp3.Headers
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class TelemetryHttpClient(private val baseUrl: String){

    private val httpBuilder: OkHttpClient.Builder get(){
         return OkHttpClient.Builder().addInterceptor(Interceptor { chain ->
            val original = chain.request()
            val request = original.newBuilder()
                    .headers(Headers.of(mapOf(
                            "Accept" to "application/vnd.api+json"
                    )))
                    .method(original.method(), original.body())
                    .build()
            return@Interceptor chain.proceed(request)
        }).readTimeout(30, TimeUnit.SECONDS)
    }

    val service : TelemetryService = create(TelemetryService::class.java)

    lateinit var retrofit: Retrofit

    private fun <T> create(serviceClass: Class<T>): T{
        val gson = GsonBuilder().serializeNulls().create()

        retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(baseUrl)
                .client(httpBuilder.build())
                .build()
        return retrofit.create(serviceClass)
    }
}