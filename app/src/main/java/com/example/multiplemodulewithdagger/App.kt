package com.example.multiplemodulewithdagger

import android.app.Application
import com.example.core_utils.di.app.AppComponentHolder
import com.example.multiplemodulewithdagger.navigation.direction.GlobalDirectionsImpl
import com.example.navigation.di.NavigationComponentHolder
import com.example.navigation.di.NavigationConfig
import ru.terrakok.cicerone.Cicerone

/**
 * @author a.khodanovich
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initAppComponent()
        initNavigationComponent()
    }

    private fun initAppComponent() {
        AppComponentHolder.create(applicationContext)
    }

    private fun initNavigationComponent() {
        NavigationComponentHolder.create(
            NavigationConfig(
                globalDirections = GlobalDirectionsImpl(),
                cicerone = Cicerone.create()
            )
        )
    }
}
