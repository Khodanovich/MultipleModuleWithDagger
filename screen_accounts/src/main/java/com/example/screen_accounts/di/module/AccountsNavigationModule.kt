package com.example.screen_accounts.di.module

import com.example.screen_accounts.navigation.nested_navigation.AccountsDirectionsImpl
import com.example.screen_accounts.navigation.nested_navigation.AccountsDirections
import dagger.Binds
import dagger.Module
import dagger.Reusable

/**
 * @author a.khodanovich
 */
@Module
internal interface AccountsNavigationModule {

    @Reusable
    @Binds
    fun bindDirections(impl: AccountsDirectionsImpl): AccountsDirections

}
