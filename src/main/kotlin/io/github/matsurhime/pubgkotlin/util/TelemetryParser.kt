package io.github.matsurhime.pubgkotlin.util

import io.github.matsurhime.pubgkotlin.enums.Log
import io.github.matsurhime.pubgkotlin.model.telemetry.event.*

class TelemetryParser{
    companion object {
        fun parse(results: List<Event>?): List<Any>?{
            if (results == null){
                return null
            }
            val ret = mutableListOf<Any>()
            for(result in results){
                when(result._T){
                    Log.LogCarePackageLand.name -> {
                        ret.add(
                                LogCarePackageLand(
                                        ItemPackage = result.ItemPackage!!,
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
                                        ItemPackage = result.ItemPackage!!,
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
                                        GameState = result.GameState!!,
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
                                        Character = result.Character!!,
                                        ChildItem = result.ChildItem!!,
                                        ParentItem = result.ParentItem!!,
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
                                        Character = result.Character!!,
                                        ChildItem = result.ChildItem!!,
                                        ParentItem = result.ParentItem!!,
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
                                        Character = result.Character!!,
                                        Item = result.Item!!,
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
                                        Character = result.Character!!,
                                        Item = result.Item!!,
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
                                        Character = result.Character!!,
                                        Item = result.Item!!,
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
                                        Character = result.Character!!,
                                        Item = result.Item!!,
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
                                        Character = result.Character!!,
                                        Item = result.Item!!,
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
                                        MatchId = result.MatchId!!,
                                        PingQuality = result.PingQuality,
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
                                        Characters = result.Characters!!,
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
                                        Characters = result.Characters!!,
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
                                        AttackId = result.AttackId!!,
                                        Attacker = result.Attacker!!,
                                        AttackType = result.AttackType!!,
                                        Vehicle = result.Vehicle!!,
                                        Weapon = result.Weapon!!,
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
                                        Character = result.Character!!,
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
                                        AttackId = result.AttackId!!,
                                        Distance = result.Distance!!,
                                        Killer = result.Killer!!,
                                        DamageCauserName = result.DamageCauserName!!,
                                        DamageTypeCategory = result.DamageTypeCategory!!,
                                        Victim = result.Victim!!,
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
                                        AccountId = result.AccountId!!,
                                        ErrorMessage = result.ErrorMessage!!,
                                        Result = result.Result!!,
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
                                        AccountId = result.AccountId!!,
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
                                        Character = result.Character!!,
                                        ElapsedTime = result.ElapsedTime!!,
                                        NumAlivePlayers = result.NumAlivePlayers!!,
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
                                        Attacker = result.Attacker!!,
                                        AttackId = result.AttackId!!,
                                        Damage = result.Damage!!,
                                        DamageReason = result.DamageReason!!,
                                        DamageCauserName = result.DamageCauserName!!,
                                        DamageTypeCategory = result.DamageTypeCategory!!,
                                        Victim = result.Victim!!,
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
                                        Attacker = result.Attacker!!,
                                        AttackId = result.AttackId!!,
                                        Distance = result.Distance!!,
                                        Vehicle = result.Vehicle!!,
                                        DamageCauserName = result.DamageCauserName!!,
                                        DamageTypeCategory = result.DamageTypeCategory!!,
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
                                        Character = result.Character!!,
                                        Vehicle = result.Vehicle!!,
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