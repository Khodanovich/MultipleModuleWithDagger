package com.example.screen_spalsh.presentation.ui

import com.example.core_ui.presentation.di.UIComponent
import com.example.core_ui.presentation.extentions.injectViewModel
import com.example.core_ui.presentation.ui.base.BaseActivity
import com.example.screen_spalsh.R
import com.example.screen_spalsh.di.SplashScreenComponentHolder
import com.example.screen_spalsh.presentation.vm.SplashViewModel

/**
 * @author a.khodanovich
 */
class SplashActivity : BaseActivity<SplashViewModel>(){

    override val viewModel: SplashViewModel by injectViewModel()
    override val layoutId = R.layout.activity_splash
    override fun createDiComponent(): UIComponent = SplashScreenComponentHolder.get()
}
