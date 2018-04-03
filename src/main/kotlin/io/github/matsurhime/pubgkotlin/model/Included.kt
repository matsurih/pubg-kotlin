package io.github.matsurhime.pubgkotlin.model

data class Included(
        val type: String?,
        val id: String?,
        val attributes: IncludedAttributes
)

data class IncludedAttributes(
        val actor: String,
        val shardId: String,
        val stats: IncludedAttributesStats
)

data class IncludedAttributesStats(
        val DBNOs: Int,
        val assists: Int,
        val boosts: Int,
        val damageDealt: Int,
        val deathType: String,
        val headshotKills: Int,
        val heals: Int,
        val killPlace: Int,
        val killPoints: Int,
        val killPointsDelta: Float,
        val killStreaks: Int,
        val kills: Int,
        val lastKillPoints: Int,
        val lastWinPoints: Int,
        val longestKill: Int,
        val mostDamage: Int,
        val name: String,
        val playerId: String,
        val revives: Int,
        val rideDistance: Int,
        val roadKills: Int,
        val teamKills: Int,
        val timeSurvived: Int,
        val vehicleDestroys: Int,
        val walkDistance: Float,
        val weaponsAcquired: Int,
        val winPlace: Int,
        val winPoints: Int,
        val winPointsDelta: Float
)