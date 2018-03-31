package model.telemetry.event

import model.telemetry.`object`.Character
import model.telemetry.`object`.Item

data class LogItemDrop(
        val Character: Character,
        val Item: Item
)