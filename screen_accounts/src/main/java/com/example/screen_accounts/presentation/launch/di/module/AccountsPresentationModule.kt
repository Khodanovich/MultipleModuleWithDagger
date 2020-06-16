package com.example.screen_accounts.presentation.launch.di.module

import androidx.lifecycle.ViewModel
import com.example.core_ui.presentation.di.ViewModelKey
import com.example.screen_accounts.presentation.launch.vm.AccountViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * @author a.khodanovich
 */
@Module
internal abstract class AccountsPresentationModule {

    @Binds
    @IntoMap
    @ViewModelKey(AccountViewModel::class)
    internal abstract fun bindViewModel(viewModel: AccountViewModel): ViewModel

}
