package com.example.multiplemodulewithdagger.navigation.direction

import com.example.multiplemodulewithdagger.navigation.screen.ToAccountsScreen
import com.example.multiplemodulewithdagger.navigation.screen.ToProfileScreen
import com.example.navigation.directions.GlobalDirections

/**
 * @author a.khodanovich
 */
internal class GlobalDirectionsImpl : GlobalDirections {

    override fun toAccounts() = ToAccountsScreen

    override fun toProfile() = ToProfileScreen

}
