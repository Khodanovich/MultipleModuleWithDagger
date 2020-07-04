package com.example.screen_accounts.di

import com.example.core_utils.di.base.component.DIComponent
import com.example.navigation.di.NavigationComponent
import com.example.navigation.directions.GlobalDirections
import com.example.screen_accounts.di.module.AccountsNavigationModule
import com.example.screen_accounts.navigation.nested_navigation.AccountsDirections
import dagger.Component
import ru.terrakok.cicerone.Router

/**
 * @author a.khodanovich
 */
@Component(
    dependencies = [
        NavigationComponent::class
    ],
    modules = [
        AccountsNavigationModule::class
    ]
)
internal interface AccountsNavigationComponent : DIComponent {

    val router: Router

    val globalDirections: GlobalDirections

    val accountsDirections: AccountsDirections
}
