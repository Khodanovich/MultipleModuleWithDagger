package com.example.feature_accounts.domain

import com.example.feature_accounts.domain.model.Account
import com.example.feature_accounts.domain.repository.AccountRepository
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class ByIdAccountCaseImpl @Inject constructor(

    private val accountRepository: AccountRepository

) : ByIdAccountCase {

    override fun execute(id: Long): Account = accountRepository.getById(id)


}
