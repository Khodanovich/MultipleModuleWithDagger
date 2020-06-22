package com.example.feature_accounts.di.module

import com.example.feature_accounts.data.AccountRepositoryImpl
import com.example.feature_accounts.data.data_source.AccountDataSource
import com.example.feature_accounts.data.mapper.ToAccountDomainMapper
import com.example.feature_accounts.domain.*
import com.example.feature_accounts.domain.AllAccountsCaseImpl
import com.example.feature_accounts.domain.ByIdAccountCaseImpl
import com.example.feature_accounts.domain.LoanAccountsCaseImpl
import com.example.feature_accounts.domain.repository.AccountRepository
import dagger.Binds
import dagger.Module
import dagger.Reusable
import javax.inject.Singleton

/**
 * @author a.khodanovich
 */
@Module
internal interface AccountModule {

    val accountDataSource: AccountDataSource

    val toAccountDomainMapper: ToAccountDomainMapper

    @Binds
    @Reusable
    fun bindAccountRepository(impl: AccountRepositoryImpl): AccountRepository

    @Binds
    fun bindAllAccountCase(impl: AllAccountsCaseImpl): AllAccountsCase

    @Binds
    fun bindByIdAccountCase(impl: ByIdAccountCaseImpl): ByIdAccountCase

    @Binds
    fun bindLoanAccountsCase(impl: LoanAccountsCaseImpl): LoanAccountsCase

    @Binds
    fun bindDepositAccountsCaseImpl(impl: DepositAccountsCaseImpl): DepositAccountsCase

}
