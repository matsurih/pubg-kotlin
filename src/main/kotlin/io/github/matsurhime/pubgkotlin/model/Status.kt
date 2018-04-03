package io.github.matsurhime.pubgkotlin.model

import java.util.*

data class Status(
        val id: String,
        val attributes: StatusAttributes
)

data class StatusAttributes(
        val releasedAt: Date,
        val version: String
)