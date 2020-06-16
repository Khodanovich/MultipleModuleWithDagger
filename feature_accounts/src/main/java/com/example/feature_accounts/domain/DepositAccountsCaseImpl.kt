package com.example.feature_accounts.domain

import com.example.feature_accounts.domain.model.Account
import com.example.feature_accounts.domain.repository.AccountRepository
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class DepositAccountsCaseImpl @Inject constructor(

    private val  accountRepository: AccountRepository

) : DepositAccountsCase {

    override fun execute(): List<Account> = accountRepository.getAll()
        .filter { it.type == AccountType.TYPE_DEPOSIT }

}
