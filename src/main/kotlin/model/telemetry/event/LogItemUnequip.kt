package model.telemetry.event

import model.telemetry.`object`.Character
import model.telemetry.`object`.Item

data class LogItemUnequip(
        val Character: Character,
        val Item: Item
)