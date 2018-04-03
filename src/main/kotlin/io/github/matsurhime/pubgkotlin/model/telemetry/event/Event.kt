package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.*
import io.github.matsurhime.pubgkotlin.model.telemetry.ItemPackage
import java.util.*


data class Event(
        val ItemPackage: ItemPackage?,
        val GameState: GameState?,
        val Character: Character?,
        val ParentItem: Item?,
        val ChildItem: Item?,
        val Item: Item?,
        val MatchId: String?,
        val PingQuality: String?,  // Only for PC telemetry
        val Characters: List<Character>?,
        val AttackId: Int?,
        val Attacker: Character?,
        val AttackType: String?,
        val Weapon: Item?,
        val Vehicle: Vehicle?,
        val Killer: Character?,
        val Victim: Character?,
        val DamageTypeCategory: String?,
        val DamageCauserName: String?,
        val Distance: Float?,
        val Result: Boolean?,
        val ErrorMessage: String?,
        val AccountId: String?,
        val ElapsedTime: Float?,
        val NumAlivePlayers: Int?,
        val DamageReason: String?,
        val Damage: Float?,

        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)