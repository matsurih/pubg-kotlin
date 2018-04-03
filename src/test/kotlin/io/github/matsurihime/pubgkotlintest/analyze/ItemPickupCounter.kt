package io.github.matsurihime.pubgkotlintest.analyze

import io.github.matsurhime.pubgkotlin.model.telemetry.event.LogItemPickup

class ItemPickupCounter(private val eventList: List<Any>){
    fun select(userName: String? = null): MutableMap<String, Int>{
        val ret: MutableMap<String, Int> = mutableMapOf()
        for(event in eventList){
            if(event is LogItemPickup){
                if(userName != null && event.character?.name != userName){
                    continue
                }
                if(event.item == null){
                    println(event)
                    continue
                }
                if(ret.containsKey(event.item?.itemId)){
                    ret[event.item!!.itemId] =  ret[event.item?.itemId]!!.plus(1)
                }else{
                    ret[event.item!!.itemId] =  1
                }
            }
        }
        return ret
    }
}