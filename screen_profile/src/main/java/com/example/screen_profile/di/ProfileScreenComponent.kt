package com.example.screen_profile.di

import com.example.core_ui.presentation.di.UIComponent
import com.example.screen_profile.di.module.ProfileDomainModule
import com.example.screen_profile.di.module.ProfileScreenModule
import dagger.Component

/**
 * @author a.khodanovich
 */
@Component(
    modules = [
        ProfileScreenModule::class,
        ProfileDomainModule::class
    ]
)
internal interface ProfileScreenComponent : UIComponent
