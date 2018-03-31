package model.telemetry.event

import model.telemetry.`object`.Character
import model.telemetry.`object`.Item

data class LogItemUse(
        val Character: Character,
        val Item: Item
)