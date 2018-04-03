package io.github.matsurhime.pubgkotlin.model.telemetry.event

import java.util.*

data class LogPlayerLogout(
        val AccountId: String?,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)