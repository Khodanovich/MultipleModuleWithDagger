package com.example.screen_splash.di

import com.example.core_ui.presentation.di.UIComponent
import com.example.navigation.di.NavigationComponent
import dagger.Component

/**
 * @author a.khodanovich
 */
@Component(
    dependencies = [
        NavigationComponent::class
    ],
    modules = [
        SplashPresentationModule::class
    ]
)
internal interface SplashScreenComponent : UIComponent
