package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import java.util.*

data class LogMatchStart(
        val Characters: List<Character>,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)