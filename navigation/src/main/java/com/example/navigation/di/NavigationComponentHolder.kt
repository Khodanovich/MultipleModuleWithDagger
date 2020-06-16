package com.example.navigation.di

import com.example.core_utils.di.base.holder.DataComponentHolder
import com.example.navigation.directions.Directions

/**
 * @author a.khodanovich
 */
object NavigationComponentHolder : DataComponentHolder<NavigationComponent, NavigationConfig>() {

    override fun build(data: NavigationConfig) = DaggerNavigationComponent.builder()
        .directionsModule(DirectionsModule(data.directions))
        .ciceroneModule(CiceroneModule(data.cicerone))
        .build()

}
