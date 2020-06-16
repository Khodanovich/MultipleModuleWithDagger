package com.example.screen_profile.di.module

import androidx.lifecycle.ViewModel
import com.example.core_ui.presentation.di.ViewModelKey
import com.example.screen_profile.presentation.vm.ProfileViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * @author a.khodanovich
 */
@Module
internal abstract class ProfileScreenModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindProfileViewModel(viewModel: ProfileViewModel): ViewModel

}
