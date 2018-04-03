package io.github.matsurhime.pubgkotlin.util

import io.github.matsurhime.pubgkotlin.enums.Log
import io.github.matsurhime.pubgkotlin.model.telemetry.event.*

class TelemetryParser{
    companion object {
        fun parse(results: List<Event>?): List<Any>?{
            results?: return null
            val ret = mutableListOf<Any>()
            for(result in results){
                when(result._T){
                    Log.LogCarePackageLand.name -> {
                        ret.add(
                                LogCarePackageLand(
                                        ItemPackage = result.itemPackage,
                                        _V = result._V, 
                                        _D = result._D, 
                                        _T = result._T, 
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogCarePackageSpawn.name -> {
                        ret.add(
                                LogCarePackageSpawn(
                                        ItemPackage = result.itemPackage,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogGameStatePeriodic.name -> {
                        ret.add(
                                LogGameStatePeriodic(
                                        GameState = result.gameState,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogItemAttach.name -> {
                        ret.add(
                                LogItemAttach(
                                        Character = result.character,
                                        ChildItem = result.childItem,
                                        ParentItem = result.parentItem,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogItemDetach.name -> {
                        ret.add(
                                LogItemDetach(
                                        Character = result.character,
                                        ChildItem = result.childItem,
                                        ParentItem = result.parentItem,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogItemDrop.name -> {
                        ret.add(
                                LogItemDrop(
                                        Character = result.character,
                                        Item = result.item,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogItemEquip.name -> {
                        ret.add(
                                LogItemEquip(
                                        Character = result.character,
                                        Item = result.item,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogItemPickup.name -> {
                        ret.add(
                                LogItemPickup(
                                        character = result.character,
                                        item = result.item,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogItemUnequip.name -> {
                        ret.add(
                                LogItemUnequip(
                                        Character = result.character,
                                        Item = result.item,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogItemUse.name -> {
                        ret.add(
                                LogItemUse(
                                        Character = result.character,
                                        Item = result.item,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogMatchDefinition.name -> {
                        ret.add(
                                LogMatchDefinition(
                                        MatchId = result.matchId,
                                        PingQuality = result.pingQuality,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogMatchEnd.name -> {
                        ret.add(
                                LogMatchEnd(
                                        Characters = result.characters,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogMatchStart.name -> {
                        ret.add(
                                LogMatchStart(
                                        Characters = result.characters,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogPlayerAttack.name -> {
                        ret.add(
                                LogPlayerAttack(
                                        AttackId = result.attackId,
                                        Attacker = result.attacker,
                                        AttackType = result.attackType,
                                        Vehicle = result.vehicle,
                                        Weapon = result.weapon,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogPlayerCreate.name -> {
                        ret.add(
                                LogPlayerCreate(
                                        Character = result.character,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogPlayerKill.name -> {
                        ret.add(
                                LogPlayerKill(
                                        AttackId = result.attackId,
                                        Distance = result.distance,
                                        Killer = result.killer,
                                        DamageCauserName = result.damageCauserName,
                                        DamageTypeCategory = result.damageTypeCategory,
                                        Victim = result.victim,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogPlayerLogin.name -> {
                        ret.add(
                                LogPlayerLogin(
                                        AccountId = result.accountId,
                                        ErrorMessage = result.errorMessage,
                                        Result = result.result,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogPlayerLogout.name -> {
                        ret.add(
                                LogPlayerLogout(
                                        AccountId = result.accountId,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogPlayerPosition.name -> {
                        ret.add(
                                LogPlayerPosition(
                                        Character = result.character,
                                        ElapsedTime = result.elapsedTime,
                                        NumAlivePlayers = result.numAlivePlayers,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogPlayerTakeDamage.name -> {
                        ret.add(
                                LogPlayerTakeDamage(
                                        Attacker = result.attacker,
                                        AttackId = result.attackId,
                                        Damage = result.damage,
                                        DamageReason = result.damageReason,
                                        DamageCauserName = result.damageCauserName,
                                        DamageTypeCategory = result.damageTypeCategory,
                                        Victim = result.victim,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogVehicleDestroy.name -> {
                        ret.add(
                                LogVehicleDestroy(
                                        Attacker = result.attacker,
                                        AttackId = result.attackId,
                                        Distance = result.distance,
                                        Vehicle = result.vehicle,
                                        DamageCauserName = result.damageCauserName,
                                        DamageTypeCategory = result.damageTypeCategory,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    Log.LogVehicleRide.name -> {
                        ret.add(
                                LogVehicleRide(
                                        Character = result.character,
                                        Vehicle = result.vehicle,
                                        _V = result._V,
                                        _D = result._D,
                                        _T = result._T,
                                        _U = result._U
                                )
                        )
                    }
                    
                }
            }
            return ret
        }
    }
}