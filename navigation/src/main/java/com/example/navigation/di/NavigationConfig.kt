package com.example.navigation.di

import com.example.navigation.directions.GlobalDirections
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

/**
 * @author a.khodanovich
 */
class NavigationConfig(
    val globalDirections: GlobalDirections,
    val cicerone: Cicerone<Router>
)
