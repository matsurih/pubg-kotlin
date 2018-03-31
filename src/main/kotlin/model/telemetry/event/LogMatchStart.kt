package model.telemetry.event

import model.telemetry.`object`.Character

data class LogMatchStart(
        val Characters: List<Character>
)