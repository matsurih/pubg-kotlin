package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import io.github.matsurhime.pubgkotlin.model.telemetry.Item
import java.util.*

data class LogItemPickup(
        val character: Character?,
        val item: Item?,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)