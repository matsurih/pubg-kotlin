package io.github.matsurhime.pubgkotlin.model.telemetry



data class Character(
        val Name: String,
        val TeamId: Int,
        val Health: Float,
        val Location: Location,
        val Ranking: Int,
        val AccountId: String
)