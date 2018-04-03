package io.github.matsurhime.pubgkotlin.model

/**
 * Rosters track the scores of each opposing group of participants.
 * Rosters can have one or many participants depending on the game mode.
 * Roster objects are only meaningful within the context of a match and are not exposed as a standalone resource.
 *
 * [id]: Roster ID
 * [attributes]: ?
 * [relationships]: ?
 */
data class Roster(
        val id: String,
        val attributes: RosterAttributes?,
        val relationships: RosterRelationships?
)

/**
 * [sharedId]: Platform-region Shared
 * [stats]: Stats particular to rosters
 * [won]: Indicates if this roster won the match
 */
data class RosterAttributes(
        val sharedId: String,
        val stats: Any?,
        val won: String?
)

/**
 * References To participant objects that can be found in the included array
 * [participants]: An array of Participant Object
 * [team]: Team Object
 */
data class RosterRelationships(
        val participants: List<Participant?>?,
        val team: Team?
)

/**
 * Stats particular to rosters
 *
 * [rank]: rank
 * [teamId]: team id
 */
data class Stats(
        val rank: Int,
        val teamId: Int
)

// TODO: unknown
/**
 * N/A
 * [unknown]
 */
data class Team(
        val unknown: Any?
)