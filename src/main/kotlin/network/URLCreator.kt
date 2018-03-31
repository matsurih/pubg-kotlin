package network

class URLCreator{

    var baseUrl = ""
    private val queries = mutableMapOf<String, Any>()

    fun create(): String{
        return baseUrl + query()
    }

    fun sortedBy(sortKey: String, isDesc: Boolean = false): URLCreator{
        queries["sort"] = if(isDesc) "-" else "" + sortKey
        return this
    }

    private fun query(): String{
        var queryString = "?"
        if (this.queries.isEmpty()){
            return ""
        }
        this.queries.forEach { key, value ->
           queryString = "$queryString&$key=$value"
        }
        return queryString
    }

}