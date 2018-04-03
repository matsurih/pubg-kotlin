package io.github.matsurhime.pubgkotlin.model

data class Player(
        val type: String,
        val id: String,
        val attributes: PlayerAttributes,
        val relationships: PlayerRelationships,
        val links: Links
)

data class PlayerAttributes(
        val name: String,
        val shardId: String,
        val createdAt: String,
        val patchVersion: String,
        val titleId: String
)

data class PlayerRelationships(
        val assets: PlayerRelationshipsAssets,
        val matches: PlayerRelationshipsMatches

)

data class PlayerRelationshipsAssets(
        val data: Any?
)

data class PlayerRelationshipsMatches(
        val data: List<MatchId>
)

data class MatchId(
        val id: String,
        val type: String
)