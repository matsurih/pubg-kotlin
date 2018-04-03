package io.github.matsurhime.pubgkotlin.model.telemetry.event

import java.util.*

data class LogMatchDefinition(
        val MatchId: String?,
        val PingQuality: String?,  // Only for PC telemetry
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)