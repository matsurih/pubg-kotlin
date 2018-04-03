package io.github.matsurhime.pubgkotlin.model.telemetry


data class GameState(
        val ElapsedTime: Int,
        val NumAliveTeams: Int,
        val NumJoinPlayers: Int,
        val NumStartPlayers: Int,
        val NumAlivePlayers: Int,
        val SafetyZonePosition: Location,
        val SafetyZoneRadius: Float,
        val PoisonGasWarningPosition: Location,
        val PoisonGasWarningRadius: Float,
        val RedZonePosition: Location,
        val RedZoneRadius: Float
)