package io.github.matsurhime.pubgkotlin.network


import io.github.matsurhime.pubgkotlin.model.Result
import io.github.matsurhime.pubgkotlin.model.Status
import io.github.matsurhime.pubgkotlin.model.telemetry.event.Event
import retrofit2.Call
import retrofit2.http.GET

interface PUBGService{
    @GET("status")
    fun checkStatus():Call<Result<Status>>

    @GET("telemetry")
    fun getTelemetry(): Call<List<Event>>
}