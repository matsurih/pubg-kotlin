package io.github.matsurhime.pubgkotlin

import io.github.matsurhime.pubgkotlin.model.Match
import io.github.matsurhime.pubgkotlin.model.Player
import io.github.matsurhime.pubgkotlin.model.Result
import io.github.matsurhime.pubgkotlin.model.Status
import io.github.matsurhime.pubgkotlin.network.HttpClient
import io.github.matsurhime.pubgkotlin.network.PUBGService
import io.github.matsurhime.pubgkotlin.network.TelemetryHttpClient
import io.github.matsurhime.pubgkotlin.util.TelemetryParser
import java.io.IOException

class PubgKotlin(private val apiKey: String){
    lateinit var service: PUBGService

    /**
     * Get api status
     */
    fun getApiStatus(): Result<Status>?{
        if (!::service.isInitialized){
            service = HttpClient(apiKey).service
        }
        try{
            val response = service.checkStatus().execute()
            return if(response.isSuccessful) response.body() else null
        }catch(e: IOException ){
            e.printStackTrace()
        }
        return null
    }

    /**
     * Get Match object
     * [matchId] match id you want to get
     */
    fun getMatch(matchId: String): Result<Match>? {
        if (!::service.isInitialized){
            service = HttpClient(apiKey).service
        }
        try{
            val response = service.getMatch(matchId).execute()
            return if(response.isSuccessful) response.body() else null
        }catch(e: IOException ){
            e.printStackTrace()
        }
        return null
    }

    /**
     * Get list of Player object
     * [playerNames] list of player names you want to get
     * [playerIds] list of player ids you want to get
     */
    fun getPlayers(playerIds: List<String>? = null, playerNames: List<String>? = null): Result<List<Player>>?{
        if (!::service.isInitialized){
            service = HttpClient(apiKey).service
        }
        try{
            if(playerIds == null && playerNames == null){
                throw Exception("set at least one argment, playerIds or playerNames")
            }
            val response = service.getPlayers(playerIds = playerIds, playerNames=playerNames).execute()
            return if(response.isSuccessful) response.body() else null
        }catch(e: IOException ){
            e.printStackTrace()
        }
        return null
    }

    /**
     * Get Telemetry Data
     * [cdnUrl] telemetry url got from match object
     */
    //TODO: not using any type
    fun startTelemetry(cdnUrl: String): List<Any>?{
        val cdnFileName = cdnUrl.split("/")[-1]
        val cdnBaseUrl = cdnUrl.replace(cdnFileName, "")
        val telemetryService = TelemetryHttpClient(cdnBaseUrl).service
        try{
            val response = telemetryService.getTelemetry(cdnFileName).execute()
            return if(response.isSuccessful) TelemetryParser.parse(response.body()) else null
        }catch(e: IOException ){
            e.printStackTrace()
        }
        return null
    }
}