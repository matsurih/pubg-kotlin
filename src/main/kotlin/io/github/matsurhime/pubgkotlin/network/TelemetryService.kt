package io.github.matsurhime.pubgkotlin.network

import io.github.matsurhime.pubgkotlin.model.telemetry.event.Event
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TelemetryService{
    @GET("{telemetryFileName}")
    fun getTelemetry(@Path("telemetryFileName") telemetryFileName: String):Call<List<Event>>
}