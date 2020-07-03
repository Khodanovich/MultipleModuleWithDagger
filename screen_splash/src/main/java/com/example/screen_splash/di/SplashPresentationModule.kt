package com.example.screen_splash.di

import androidx.lifecycle.ViewModel
import com.example.core_ui.presentation.di.ViewModelKey
import com.example.screen_splash.presentation.vm.SplashViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * @author a.khodanovich
 */
@Module
internal abstract class SplashPresentationModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    internal abstract fun demoViewModel(viewModel: SplashViewModel): ViewModel

}
