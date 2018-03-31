package model.telemetry.event

import model.telemetry.`object`.Character

data class LogPlayerKill(
        val AttackId: Int,
        val Killer: Character,
        val Victim: Character,
        val DamageTypeCategory: String,
        val DamageCauserName: String,
        val Distance: Float
)