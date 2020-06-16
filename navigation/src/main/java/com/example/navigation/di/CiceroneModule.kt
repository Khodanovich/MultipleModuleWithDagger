package com.example.navigation.di

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

/**
 * @author a.khodanovich
 */
@Module
internal class CiceroneModule constructor(private val cicerone: Cicerone<Router>) {

    @Provides
    fun provideNavigatorHolder() = cicerone.navigatorHolder

    @Provides
    fun provideRouter() = cicerone.router

}
