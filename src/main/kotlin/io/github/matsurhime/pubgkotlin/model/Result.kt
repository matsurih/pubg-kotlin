package io.github.matsurhime.pubgkotlin.model

data class Result<out T>(
        val data: T?,
        val errors: Errors?,
        val links: Links?,
        val included: Any?,
        val meta: Meta?
)