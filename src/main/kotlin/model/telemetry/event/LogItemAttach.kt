package model.telemetry.event

import model.telemetry.`object`.Character
import model.telemetry.`object`.Item

data class LogItemAttach(
        val Character: Character,
        val ParentItem: Item,
        val ChildItem: Item
)