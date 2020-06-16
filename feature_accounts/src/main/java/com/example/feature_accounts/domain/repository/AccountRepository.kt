package com.example.feature_accounts.domain.repository

import com.example.feature_accounts.domain.model.Account

/**
 * @author a.khodanovich
 */
internal interface AccountRepository {

    fun getAll(): List<Account>

    fun getById(id: Long): Account

}
