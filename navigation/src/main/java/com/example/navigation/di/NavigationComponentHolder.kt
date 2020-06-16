package com.example.navigation.di

import com.example.core_utils.di.base.holder.DataComponentHolder

/**
 * @author a.khodanovich
 */
object NavigationComponentHolder : DataComponentHolder<NavigationComponent, NavigationConfig>() {

    override fun build(data: NavigationConfig) = DaggerNavigationComponent.builder()
        .directionsModule(DirectionsModule(data.globalDirections))
        .ciceroneModule(CiceroneModule(data.cicerone))
        .build()

}
