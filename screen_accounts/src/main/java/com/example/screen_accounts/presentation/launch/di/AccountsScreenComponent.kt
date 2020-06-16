package com.example.screen_accounts.presentation.launch.di

import com.example.core_ui.presentation.di.UIComponent
import com.example.feature_accounts.di.AccountComponent
import com.example.navigation.di.NavigationComponent
import com.example.screen_accounts.presentation.launch.di.module.AccountsPresentationModule
import dagger.Component

/**
 * @author a.khodanovich
 */
@Component(
    dependencies = [
        NavigationComponent::class,
        AccountComponent::class
    ],
    modules = [
        AccountsPresentationModule::class
    ]
)
internal interface AccountsScreenComponent : UIComponent
