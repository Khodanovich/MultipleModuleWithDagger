package com.example.navigation.di

import com.example.navigation.directions.Directions
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

/**
 * @author a.khodanovich
 */
class NavigationConfig(
    val directions: Directions,
    val cicerone: Cicerone<Router>
)
