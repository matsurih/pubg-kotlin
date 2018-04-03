package io.github.matsurhime.pubgkotlin.model.telemetry

data class Item(
        val itemId: String,
        val stackCount: Int,
        val category: String,
        val subCategory: String,
        val attachedItems: List<String>
)