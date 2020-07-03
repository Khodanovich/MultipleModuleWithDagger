package com.example.screen_accounts.presentation.launch.mapper

import com.example.feature_accounts.domain.AccountType.TYPE_DEPOSIT
import com.example.feature_accounts.domain.AccountType.TYPE_LOAN
import com.example.feature_accounts.domain.model.Account
import com.example.screen_accounts.R
import com.example.screen_accounts.presentation.launch.AccountUiModel
import com.example.screen_accounts.presentation.launch.DepositUIModel
import com.example.screen_accounts.presentation.launch.LoanUiModel
import java.lang.IllegalArgumentException
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
class AccountToUiModelMapper @Inject constructor() {

    fun invoke(account: Account, onClickListener: (AccountUiModel) -> Unit): AccountUiModel {

        return when (account.type) {
            TYPE_DEPOSIT -> DepositUIModel(
                id = account.id,
                name = "Deposit - ${account.number}",
                icon = R.drawable.ic_deposit,
                onClickListener = onClickListener
            )
            TYPE_LOAN -> LoanUiModel(
                id = account.id,
                name = "Loan - ${account.number}",
                icon = R.drawable.ic_loan,
                onClickListener = onClickListener
            )
            else -> throw IllegalArgumentException()
        }
    }
}
