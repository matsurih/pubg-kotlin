package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import io.github.matsurhime.pubgkotlin.model.telemetry.Item
import io.github.matsurhime.pubgkotlin.model.telemetry.Vehicle
import java.util.*

data class LogPlayerAttack(
        val AttackId: Int?,
        val Attacker: Character?,
        val AttackType: String?,
        val Weapon: Item?,
        val Vehicle: Vehicle?,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)