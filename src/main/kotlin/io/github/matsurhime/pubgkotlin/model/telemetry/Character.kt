package io.github.matsurhime.pubgkotlin.model.telemetry


data class Character(
        val name: String,
        val teamId: Int,
        val health: Float,
        val location: Location,
        val ranking: Int,
        val accountId: String
)