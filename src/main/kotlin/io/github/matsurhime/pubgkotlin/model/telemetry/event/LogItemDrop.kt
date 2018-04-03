package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import io.github.matsurhime.pubgkotlin.model.telemetry.Item
import java.util.*

data class LogItemDrop(
        val Character: Character?,
        val Item: Item?,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)