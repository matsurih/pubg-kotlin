package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import java.util.*

data class LogPlayerCreate(
        val Character: Character,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)