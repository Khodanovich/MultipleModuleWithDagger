package com.example.navigation.di

import com.example.navigation.directions.GlobalDirections
import dagger.Module
import dagger.Provides
import dagger.Reusable

/**
 * @author a.khodanovich
 */

@Module
internal class DirectionsModule constructor(private val globalDirections: GlobalDirections) {

    @Reusable
    @Provides
    fun provideDirections() = globalDirections

}
