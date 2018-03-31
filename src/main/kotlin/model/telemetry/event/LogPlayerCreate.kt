package model.telemetry.event

import model.telemetry.`object`.Character

data class LogPlayerCreate(
        val Character: Character
)