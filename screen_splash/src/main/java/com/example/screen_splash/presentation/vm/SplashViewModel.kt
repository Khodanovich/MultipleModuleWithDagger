package com.example.screen_splash.presentation.vm

import com.example.core_ui.presentation.ui.base.BaseViewModel
import com.example.navigation.directions.GlobalDirections
import ru.terrakok.cicerone.Router
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
class SplashViewModel @Inject constructor(

    private val router: Router,
    private val globalDirections: GlobalDirections

) : BaseViewModel() {

    val text = "SPLASH"

    override fun onCreate() {
        router.navigateTo(globalDirections.toAccounts())
    }

}
