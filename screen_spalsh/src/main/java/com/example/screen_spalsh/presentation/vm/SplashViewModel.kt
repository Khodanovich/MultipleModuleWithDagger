package com.example.screen_spalsh.presentation.vm

import com.example.core_ui.presentation.ui.base.BaseViewModel
import com.example.navigation.directions.Directions
import ru.terrakok.cicerone.Router
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
class SplashViewModel @Inject constructor(

    private val router: Router,
    private val directions: Directions

) : BaseViewModel() {

    override fun onViewCreated() {
        router.navigateTo(directions.toAccounts())
    }

}
