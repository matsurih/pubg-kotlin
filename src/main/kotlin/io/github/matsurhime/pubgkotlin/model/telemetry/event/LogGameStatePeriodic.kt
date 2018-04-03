package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.GameState
import java.util.*


data class LogGameStatePeriodic(
        val GameState: GameState?,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)