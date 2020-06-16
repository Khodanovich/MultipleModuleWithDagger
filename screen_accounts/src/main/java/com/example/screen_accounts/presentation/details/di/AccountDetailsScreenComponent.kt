package com.example.screen_accounts.presentation.details.di

import com.example.core_ui.presentation.di.UIComponent
import com.example.screen_accounts.presentation.details.di.module.AccountDetailsScreenModule
import dagger.Component

/**
 * @author a.khodanovich
 */
@Component(
    modules = [
        AccountDetailsScreenModule::class
    ]
)
internal interface AccountDetailsScreenComponent : UIComponent
