package com.example.screen_accounts.presentation.details.ui

import com.example.core_ui.presentation.di.UIComponent
import com.example.core_ui.presentation.extentions.injectViewModel
import com.example.core_ui.presentation.ui.base.BaseActivity
import com.example.screen_accounts.R
import com.example.screen_accounts.presentation.details.di.AccountDetailsScreenComponentHolder
import com.example.screen_accounts.presentation.details.vm.AccountDetailsViewModel

/**
 * @author a.khodanovich
 */
internal class AccountDetailsActivity : BaseActivity<AccountDetailsViewModel>() {

    override val viewModel: AccountDetailsViewModel by injectViewModel()
    override var diComponent: UIComponent = AccountDetailsScreenComponentHolder.get()
    override val layoutId = R.layout.activity_account_details
}
