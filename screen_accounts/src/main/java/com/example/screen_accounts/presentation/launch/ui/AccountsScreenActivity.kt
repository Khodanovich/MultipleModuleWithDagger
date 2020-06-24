package com.example.screen_accounts.presentation.launch.ui

import android.os.Bundle
import com.example.core_ui.presentation.di.UIComponent
import com.example.core_ui.presentation.extentions.injectViewModel
import com.example.core_ui.presentation.ui.base.BaseActivity
import com.example.screen_accounts.R
import com.example.screen_accounts.presentation.launch.di.AccountsScreenComponentHolder
import com.example.screen_accounts.presentation.launch.vm.AccountViewModel
import kotlinx.android.synthetic.main.activity_account.*

/**
 * @author a.khodanovich
 */
class AccountsScreenActivity : BaseActivity<AccountViewModel>() {

    override val viewModel: AccountViewModel by injectViewModel()
    override var diComponent: UIComponent = AccountsScreenComponentHolder.get()
    override val layoutId = R.layout.activity_account

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        toDetailsButton.setOnClickListener { viewModel.onToDetailsButtonClicked() }

        toProfileButton.setOnClickListener { viewModel.onToProfileInfoClicked() }
    }
}
