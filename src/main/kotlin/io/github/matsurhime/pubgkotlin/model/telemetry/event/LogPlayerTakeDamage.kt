package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import java.util.*

data class LogPlayerTakeDamage(
        val AttackId: Int,
        val Attacker: Character,
        val Victim: Character,
        val DamageTypeCategory: String,
        val DamageReason: String,
        val Damage: Float,
        val DamageCauserName: String,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)