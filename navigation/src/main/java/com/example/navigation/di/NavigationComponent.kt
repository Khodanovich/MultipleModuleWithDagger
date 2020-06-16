package com.example.navigation.di

import com.example.core_utils.di.base.component.DIComponent
import com.example.navigation.directions.GlobalDirections
import dagger.Component
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

/**
 * @author a.khodanovich
 */

@Component(
    modules = [
        DirectionsModule::class,
        CiceroneModule::class
    ]
)
interface NavigationComponent : DIComponent {

    val globalDirections: GlobalDirections

    val navigatorHolder: NavigatorHolder

    val router: Router

}
