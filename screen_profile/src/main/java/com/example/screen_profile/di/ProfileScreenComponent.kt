package com.example.screen_profile.di

import com.example.core_ui.presentation.di.UIComponent
import com.example.core_utils.di.app.AppComponent
import com.example.screen_profile.di.module.ProfileInfoDaoModule
import com.example.screen_profile.di.module.ProfileDomainModule
import com.example.screen_profile.di.module.ProfileInfoDbCreatorModule
import com.example.screen_profile.di.module.ProfileScreenModule
import dagger.Component

/**
 * @author a.khodanovich
 */
@Component(
    dependencies = [
        AppComponent::class
    ],
    modules = [
        ProfileScreenModule::class,
        ProfileDomainModule::class,
        ProfileInfoDaoModule::class,
        ProfileInfoDbCreatorModule::class
    ]
)
internal interface ProfileScreenComponent : UIComponent
