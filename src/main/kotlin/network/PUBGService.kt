package network

import model.Result
import model.Status
import retrofit2.Call
import retrofit2.http.GET

interface PUBGService{
    @GET("status")
    fun checkStatus():Call<Result<Status>>
}