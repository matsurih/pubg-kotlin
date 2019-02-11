[![CircleCI](https://circleci.com/gh/matsurihime/pubg-kotlin/tree/master.svg?style=shield&circle-token=97d4d09eb0b8a86c1d65a3b3e4752a3bc0fddb05)](https://circleci.com/gh/matsurihime/pubg-kotlin/tree/master)

# pubg-kotlin
PUBG API wrapper for Kotlin
(ref. https://developer.playbattlegrounds.com/?loc=en)

listed on [official developpers site](https://documentation.pubg.com/en/community-sdks.html) as one of community SDKs. 

# usage
Clone this repository and..

```kotlin
const val apiKey: String = "PUT YOUR API KEY HERE"
val pubgKotlin: PubgKotlin = PubgKotlin(apiKey)  // instantiate here with your api key
val status: Result<Status> = pubgKotlin.getStatus()  // and others
```
