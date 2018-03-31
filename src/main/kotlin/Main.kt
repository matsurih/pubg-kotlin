import network.HttpClient
import network.PUBGService
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
                print(response.body()?.data.toString())
            }else{
                print("failed")
            }

        }catch(e: IOException ){
            e.printStackTrace()
        }
    }



}