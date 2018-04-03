package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.ItemPackage
import java.util.*


data class LogCarePackageLand(
        val ItemPackage: ItemPackage?,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)