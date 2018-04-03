package io.github.matsurhime.pubgkotlin.model.telemetry.event

import java.util.*

data class LogPlayerLogin(
        val Result: Boolean,
        val ErrorMessage: String,
        val AccountId: String,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)