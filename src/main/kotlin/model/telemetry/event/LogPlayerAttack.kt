package model.telemetry.event

import model.telemetry.`object`.Character
import model.telemetry.`object`.Item
import model.telemetry.`object`.Vehicle

data class LogPlayerAttack(
        val AttackId: Int,
        val Attacker: Character,
        val AttackType: String,
        val Weapon: Item,
        val Vehicle: Vehicle
)