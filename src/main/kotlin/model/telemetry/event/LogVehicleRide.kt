package model.telemetry.event

import model.telemetry.`object`.Character
import model.telemetry.`object`.Vehicle

data class LogVehicleRide(
        val Character: Character,
        val Vehicle: Vehicle
)