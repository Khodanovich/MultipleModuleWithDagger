package com.example.feature_accounts.di

import com.example.core_utils.di.app.AppComponent
import com.example.core_utils.di.base.component.DIComponent
import com.example.feature_accounts.di.module.AccountDaoModule
import com.example.feature_accounts.di.module.AccountDbCreatorModule
import com.example.feature_accounts.di.module.AccountModule
import com.example.feature_accounts.domain.AllAccountsCase
import com.example.feature_accounts.domain.ByIdAccountCase
import com.example.feature_accounts.domain.DepositAccountsCase
import com.example.feature_accounts.domain.LoanAccountsCase
import dagger.Component

/**
 * @author a.khodanovich
 */
interface AccountComponent : DIComponent {

    val allAccountsCase: AllAccountsCase

    val byIdAccountCase: ByIdAccountCase

    val depositAccountsCase: DepositAccountsCase

    val loanAccountsCase: LoanAccountsCase

}

@Component(
    dependencies = [
        AppComponent::class
    ],
    modules = [
        AccountModule::class,
        AccountDbCreatorModule::class,
        AccountDaoModule::class
    ]
)
internal interface AccountComponentImpl : AccountComponent
