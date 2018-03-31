package model.telemetry.`object`

data class Vehicle(
        val VehicleType: String,
        val VehicleId: String,
        val HealthPercent: Float,
        val FuelPercent: Float
)