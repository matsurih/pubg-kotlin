package model.telemetry.`object`

data class Item(
        val ItemId: String,
        val StackCount: Int,
        val Category: String,
        val SubCategory: String,
        val AttachedItems: List<String>
)