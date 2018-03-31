package model.telemetry.event

data class LogPlayerLogin(
        val Result: Boolean,
        val ErrorMessage: String,
        val AccountId: String
)