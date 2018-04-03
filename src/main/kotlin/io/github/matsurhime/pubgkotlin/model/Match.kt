package io.github.matsurhime.pubgkotlin.model

// 1st Level Object
/**
 * Match objects contain the results of a completed match
 * such as the game mode played, duration, and which players participated
 */
data class Match(
        val type: String,
        val id: String,
        val attributes: MatchAttributes,
        val relationships: MatchRelationships,
        val links: MatchLinks
)

// 2nd Level Object
/**
 * [stats]: N/A
 * [tags]: N/A
 */
data class MatchAttributes(
        val createdAt: String,
        val duration: Int,
        val gameMode: String,
        val patchVersion: String,
        val sharedId: String,
        val stats: Any?,  // null
        val tags: Any?,  // null
        val tagId: String
)

/**
 * [rounds]: N/A
 * [spectators]: N/A
 */
data class MatchRelationships(
        val assets: Data<List<MatchAssetsData>>?,
        val rosters: Data<List<MatchRelationshipRosters>>?,
        val rounds: Data<List<Any>>?,
        val spectators: Data<List<Any>>?
)

data class MatchAssetsData(
        val type: String,
        val id: String
)

data class MatchRelationshipRosters(
        val type: String,
        val id: String
)

data class MatchLinks(
        val schema: String?,
        val self: String?
)

// 3rd Level Object