package com.example.feature_accounts.domain

import com.example.feature_accounts.domain.model.Account
import com.example.feature_accounts.domain.repository.AccountRepository
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class LoanAccountsCaseImpl @Inject constructor(

    private val accountRepository: AccountRepository

) : LoanAccountsCase {

    override fun execute(): List<Account> = accountRepository.getAll()
        .filter { it.type == AccountType.TYPE_LOAN }

}
