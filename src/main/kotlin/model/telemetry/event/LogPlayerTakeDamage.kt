package model.telemetry.event

import model.telemetry.`object`.Character

data class LogPlayerTakeDamage(
        val AttackId: Int,
        val Attacker: Character,
        val Victim: Character,
        val DamageTypeCategory: String,
        val DamageReason: String,
        val Damage: Float,
        val DamageCauserName: String
)