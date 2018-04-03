package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import java.util.*

data class LogPlayerPosition(
        val Character: Character,
        val ElapsedTime: Float,
        val NumAlivePlayers: Int,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)