package com.example.feature_accounts.di

import com.example.core_utils.di.base.component.DIComponent
import com.example.feature_accounts.di.module.AccountModule
import com.example.feature_accounts.domain.AllAccountsCase
import com.example.feature_accounts.domain.ByIdAccountCase
import com.example.feature_accounts.domain.DepositAccountsCase
import com.example.feature_accounts.domain.LoanAccountsCase
import dagger.Component

/**
 * @author a.khodanovich
 */
@Component(
    modules = [
        AccountModule::class
    ]
)
interface AccountComponent : DIComponent {

    val allAccountsCase : AllAccountsCase

    val byIdAccountCase: ByIdAccountCase

    val depositAccountsCase: DepositAccountsCase

    val loanAccountsCase: LoanAccountsCase

}
