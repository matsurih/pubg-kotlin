package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import io.github.matsurhime.pubgkotlin.model.telemetry.Item
import java.util.*

data class LogItemAttach(
        val Character: Character,
        val ParentItem: Item,
        val ChildItem: Item,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)