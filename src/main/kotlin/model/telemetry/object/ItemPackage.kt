package model.telemetry.`object`

import model.telemetry.common.Location

data class ItemPackage(
        val ItemPackageId: String,
        val Location: Location,
        val Items: List<Item>
)