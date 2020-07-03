package com.example.screen_splash.presentation.ui

import com.example.core_ui.presentation.di.UIComponent
import com.example.core_ui.presentation.extentions.injectViewModel
import com.example.core_ui.presentation.ui.base.BaseActivity
import com.example.screen_splash.di.SplashScreenComponentHolder
import com.example.screen_splash.presentation.vm.SplashViewModel
import com.example.screen_splash.BR
import com.example.screen_splash.R

/**
 * @author a.khodanovich
 */
class SplashActivity : BaseActivity<SplashViewModel>(){

    override val viewModel: SplashViewModel by injectViewModel()
    override val layoutId = R.layout.activity_splash
    override val dataBindingVariable: Int = BR.viewModel
    override fun createDiComponent(): UIComponent = SplashScreenComponentHolder.get()
}
