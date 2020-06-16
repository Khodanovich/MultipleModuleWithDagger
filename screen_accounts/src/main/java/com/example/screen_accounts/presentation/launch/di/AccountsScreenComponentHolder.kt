package com.example.screen_accounts.presentation.launch.di

import com.example.core_utils.di.base.holder.ComponentHolder
import com.example.feature_accounts.di.AccountComponentHolder
import com.example.navigation.di.NavigationComponentHolder

/**
 * @author a.khodanovich
 */
internal object AccountsScreenComponentHolder : ComponentHolder<AccountsScreenComponent>() {

    override fun build(): AccountsScreenComponent = DaggerAccountsScreenComponent
        .builder()
        .navigationComponent(NavigationComponentHolder.get())
        .accountComponent(AccountComponentHolder.get())
        .build()
}
