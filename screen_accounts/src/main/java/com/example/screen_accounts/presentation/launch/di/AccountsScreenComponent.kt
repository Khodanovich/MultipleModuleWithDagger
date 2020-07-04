package com.example.screen_accounts.presentation.launch.di

import com.example.core_ui.presentation.di.UIComponent
import com.example.feature_accounts.di.AccountComponent
import com.example.screen_accounts.di.AccountsNavigationComponent
import com.example.screen_accounts.presentation.launch.di.module.AccountsScreenModule
import dagger.Component

/**
 * @author a.khodanovich
 */
@Component(
    dependencies = [
        AccountsNavigationComponent::class,
        AccountComponent::class
    ],
    modules = [
        AccountsScreenModule::class
    ]
)
internal interface AccountsScreenComponent : UIComponent
