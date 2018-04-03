package io.github.matsurhime.pubgkotlin.model.telemetry.event

import io.github.matsurhime.pubgkotlin.model.telemetry.Character
import io.github.matsurhime.pubgkotlin.model.telemetry.Vehicle
import java.util.*

data class LogVehicleRide(
        val Character: Character,
        val Vehicle: Vehicle,
        val _V: Int,
        val _D: Date,
        val _T: String,
        val _U: Boolean
)