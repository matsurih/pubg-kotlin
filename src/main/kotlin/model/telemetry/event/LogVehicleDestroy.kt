package model.telemetry.event

import model.telemetry.`object`.Character
import model.telemetry.`object`.Vehicle

data class LogVehicleDestroy(
        val AttackId: Int,
        val Attacker: Character,
        val Vehicle: Vehicle,
        val DamageTypeCategory: String,
        val DamageCauserName: String,
        val Distance: Float
)