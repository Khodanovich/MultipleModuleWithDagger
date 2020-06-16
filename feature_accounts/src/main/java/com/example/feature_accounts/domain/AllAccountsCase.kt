package com.example.feature_accounts.domain

import com.example.feature_accounts.domain.model.Account

/**
 * @author a.khodanovich
 */
interface AllAccountsCase {

    fun execute(): List<Account>

}
