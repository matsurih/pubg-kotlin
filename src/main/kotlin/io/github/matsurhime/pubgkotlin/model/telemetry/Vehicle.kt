package io.github.matsurhime.pubgkotlin.model.telemetry

data class Vehicle(
        val VehicleType: String,
        val VehicleId: String,
        val HealthPercent: Float,
        val FuelPercent: Float
)