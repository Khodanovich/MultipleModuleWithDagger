package com.example.screen_accounts.presentation.launch.ui

import com.example.core_ui.presentation.di.UIComponent
import com.example.core_ui.presentation.extentions.injectViewModel
import com.example.core_ui.presentation.ui.base.BaseActivity
import com.example.screen_accounts.BR
import com.example.screen_accounts.R
import com.example.screen_accounts.presentation.launch.di.AccountsScreenComponentHolder
import com.example.screen_accounts.presentation.launch.vm.AccountViewModel

/**
 * @author a.khodanovich
 */
class AccountsScreenActivity : BaseActivity<AccountViewModel>() {

    override val viewModel: AccountViewModel by injectViewModel()
    override val layoutId = R.layout.activity_account
    override val dataBindingVariable: Int = BR.viewModel
    override fun createDiComponent(): UIComponent = AccountsScreenComponentHolder.get()
}
