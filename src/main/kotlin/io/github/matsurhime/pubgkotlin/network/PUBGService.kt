package io.github.matsurhime.pubgkotlin.network


import io.github.matsurhime.pubgkotlin.model.Match
import io.github.matsurhime.pubgkotlin.model.Player
import io.github.matsurhime.pubgkotlin.model.Result
import io.github.matsurhime.pubgkotlin.model.Status
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PUBGService{
    @GET("status")
    fun checkStatus():Call<Result<Status>>

    @GET("shards/pc-jp/players")
    fun getPlayers(
            @Query("filter[playerIds]") playerIds: List<String>? = null,
            @Query("filter[playerNames]") playerNames: List<String>? = null
    ): Call<Result<List<Player>>>

    @GET("shards/pc-jp/players/{playerId}")
    fun getPlayer(@Path("playerId") playerId: String): Call<Result<Player>>

    @GET("shards/pc-jp/matches/{matchId}")
    fun getMatch(@Path("matchId") matchId: String): Call<Result<Match>>
}