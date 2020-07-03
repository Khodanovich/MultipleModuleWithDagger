package com.example.screen_splash.di

import com.example.core_utils.di.base.holder.ComponentHolder
import com.example.navigation.di.NavigationComponentHolder

/**
 * @author a.khodanovich
 */
internal object SplashScreenComponentHolder : ComponentHolder<SplashScreenComponent>() {

    override fun build(): SplashScreenComponent = DaggerSplashScreenComponent
        .builder()
        .navigationComponent(NavigationComponentHolder.get())
        .build()
}
