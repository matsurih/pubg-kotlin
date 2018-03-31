package model

/**
 * Asset objects contain a URL string that links to a telemetry.json file,
 * which will contain an array of event objects that provide further insight into a match.
 *
 * [type]: asset
 * [id]: Asset ID
 * [attributes]: AssetAttributes Object
 */
data class Asset(
        val type: String,
        val id: String,
        val attributes: AssetAttributes?
)

/**
 * [URL]: Link to the telemetry.json file
 * [createdAt]: Time of telemetry creation
 * [description]: N/A
 * [name]: Telemetry
 */
data class AssetAttributes(
        val URL: String,
        val createdAt: String,
        val description: String,
        val name: String
)