package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import java.util.*

data class LogPlayerKill(
        val AttackId: Int,
        val Killer: Character,
        val Victim: Character,
        val DamageTypeCategory: String,
        val DamageCauserName: String,
        val Distance: Float,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)