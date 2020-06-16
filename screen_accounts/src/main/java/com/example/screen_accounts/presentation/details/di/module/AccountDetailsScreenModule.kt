package com.example.screen_accounts.presentation.details.di.module

import androidx.lifecycle.ViewModel
import com.example.core_ui.presentation.di.ViewModelKey
import com.example.screen_accounts.presentation.details.vm.AccountDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * @author a.khodanovich
 */
@Module
abstract class AccountDetailsScreenModule {

    @Binds
    @IntoMap
    @ViewModelKey(AccountDetailsViewModel::class)
    internal abstract fun bindViewModel(viewModel: AccountDetailsViewModel): ViewModel
}
