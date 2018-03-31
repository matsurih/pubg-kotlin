package model

data class Result<out T>(
        val data: T?,
        val errors: Errors?,
        val links: Links?,
        val included: List<Included>?,
        val meta: Meta?
)