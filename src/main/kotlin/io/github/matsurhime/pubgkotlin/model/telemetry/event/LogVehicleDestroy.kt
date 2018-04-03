package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import io.github.matsurhime.pubgkotlin.model.telemetry.Vehicle
import java.util.*

data class LogVehicleDestroy(
        val AttackId: Int,
        val Attacker: Character,
        val Vehicle: Vehicle,
        val DamageTypeCategory: String,
        val DamageCauserName: String,
        val Distance: Float,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)