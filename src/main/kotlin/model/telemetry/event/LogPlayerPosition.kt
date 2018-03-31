package model.telemetry.event

import model.telemetry.`object`.Character

data class LogPlayerPosition(
        val Character: Character,
        val ElapsedTime: Float,
        val NumAlivePlayers: Int
)