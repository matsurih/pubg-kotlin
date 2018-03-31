package model.telemetry.event

import model.telemetry.`object`.GameState

data class LogGameStatePeriodic(
        val GameState: GameState
)