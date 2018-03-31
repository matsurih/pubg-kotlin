package model.telemetry.`object`

import model.telemetry.common.Location

data class Character(
        val Name: String,
        val TeamId: Int,
        val Health: Float,
        val Location: Location,
        val Ranking: Int,
        val AccountId: String
)