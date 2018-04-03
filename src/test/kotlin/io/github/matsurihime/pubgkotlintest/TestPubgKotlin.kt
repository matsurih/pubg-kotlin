package io.github.matsurihime.pubgkotlintest

import io.github.matsurhime.pubgkotlin.PubgKotlin

fun main(args: Array<String>){
    val apiKey = System.getenv("PUBG_API_KEY")
    if(apiKey.isNullOrBlank()){
        print("Please set env key")
    }else{
        val pubgKotlin = PubgKotlin(apiKey)
        print(pubgKotlin.getApiStatus())
    }

}
