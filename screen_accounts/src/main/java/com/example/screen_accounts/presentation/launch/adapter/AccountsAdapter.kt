package com.example.screen_accounts.presentation.launch.adapter

import com.example.core_ui.presentation.field_adapter.FieldAdapter
import com.example.core_ui.presentation.field_adapter.FieldViewHolder
import com.example.screen_accounts.BR
import com.example.screen_accounts.R
import com.example.screen_accounts.presentation.launch.AccountUiModel
import com.example.screen_accounts.presentation.launch.DepositUIModel
import com.example.screen_accounts.presentation.launch.LoanUiModel

/**
 * @author a.khodanovich
 */
class AccountsAdapter : FieldAdapter<AccountUiModel>() {

    init {
        layouter.add(DepositUIModel::class.java, R.layout.item_deposit) { FieldViewHolder(it, BR.depositUiModel) }
        layouter.add(LoanUiModel::class.java, R.layout.item_loan) { FieldViewHolder(it, BR.loanUiModel) }
    }
}
