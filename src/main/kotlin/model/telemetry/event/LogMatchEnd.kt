package model.telemetry.event

import model.telemetry.`object`.Character

data class LogMatchEnd(
        val Characters: List<Character>
)