package io.github.matsurhime.pubgkotlin
import io.github.matsurhime.pubgkotlin.network.HttpClient
import io.github.matsurhime.pubgkotlin.network.PUBGService
import io.github.matsurhime.pubgkotlin.util.TelemetryParser
import java.io.IOException

fun main(args: Array<String>){
    Main().start()
}

class Main{
    lateinit var service: PUBGService
    fun start(){
        if (!::service.isInitialized){
            service = HttpClient().service
        }
        try{
            val response = service.checkStatus().execute()
            if(response.isSuccessful){
                print(response.body())
            }else{
                print("failed")
            }

        }catch(e: IOException ){
            e.printStackTrace()
        }
    }

    fun startTelemetry(){
        if (!::service.isInitialized){
            service = HttpClient().service
        }
        try{
            val response = service.getTelemetry().execute()
            if(response.isSuccessful){
                print(TelemetryParser.parse(response.body()))
            }else{
                print("failed")
            }

        }catch(e: IOException ){
            e.printStackTrace()
        }
    }



}