package com.example.feature_accounts.data.mapper

import com.example.feature_accounts.data.model.AccountNet
import com.example.feature_accounts.domain.model.Account
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class ToAccountDomainMapper @Inject constructor() : (AccountNet) -> Account {

    override fun invoke(accountNet: AccountNet): Account {
        return Account(
            id = accountNet.id ?: -1,
            number = accountNet.number.orEmpty(),
            type = accountNet.type.orEmpty()
        )
    }
}
