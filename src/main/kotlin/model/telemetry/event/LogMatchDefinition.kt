package model.telemetry.event

data class LogMatchDefinition(
        val MatchId: String,
        val PingQuality: String?  // Only for PC telemetry
)