package io.github.matsurhime.pubgkotlin.model.telemetry

data class ItemPackage(
        val ItemPackageId: String,
        val Location: Location,
        val Items: List<Item>
)