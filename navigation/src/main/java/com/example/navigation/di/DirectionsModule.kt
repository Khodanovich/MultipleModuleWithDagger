package com.example.navigation.di

import com.example.navigation.directions.Directions
import dagger.Module
import dagger.Provides

/**
 * @author a.khodanovich
 */

@Module
internal class DirectionsModule constructor(private val directions: Directions) {

    @Provides
    fun provideDirections() = directions

}
