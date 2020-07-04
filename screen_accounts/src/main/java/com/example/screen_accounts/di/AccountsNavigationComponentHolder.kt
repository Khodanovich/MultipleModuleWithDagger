package com.example.screen_accounts.di

import com.example.core_utils.di.base.holder.ComponentHolder
import com.example.navigation.di.NavigationComponentHolder

/**
 * @author a.khodanovich
 */
internal object AccountsNavigationComponentHolder : ComponentHolder<AccountsNavigationComponent>() {

    override fun build(): AccountsNavigationComponent {
        return DaggerAccountsNavigationComponent.builder()
            .navigationComponent(NavigationComponentHolder.get())
            .build()
    }
}
