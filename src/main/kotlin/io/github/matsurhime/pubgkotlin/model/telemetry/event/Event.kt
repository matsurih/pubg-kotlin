package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.*
import io.github.matsurhime.pubgkotlin.model.telemetry.ItemPackage
import java.util.*


data class Event(
        val itemPackage: ItemPackage?,
        val gameState: GameState?,
        val character: Character?,
        val parentItem: Item?,
        val childItem: Item?,
        val item: Item?,
        val matchId: String?,
        val pingQuality: String?,  // Only for PC telemetry
        val characters: List<Character>?,
        val attackId: Int?,
        val attacker: Character?,
        val attackType: String?,
        val weapon: Item?,
        val vehicle: Vehicle?,
        val killer: Character?,
        val victim: Character?,
        val damageTypeCategory: String?,
        val damageCauserName: String?,
        val distance: Float?,
        val result: Boolean?,
        val errorMessage: String?,
        val accountId: String?,
        val elapsedTime: Float?,
        val numAlivePlayers: Int?,
        val damageReason: String?,
        val damage: Float?,

        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)