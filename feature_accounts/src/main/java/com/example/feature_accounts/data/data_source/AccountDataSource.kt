package com.example.feature_accounts.data.data_source

import com.example.feature_accounts.data.model.AccountNet
import com.example.feature_accounts.domain.AccountType.TYPE_DEPOSIT
import com.example.feature_accounts.domain.AccountType.TYPE_LOAN
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class AccountDataSource @Inject constructor() {

    fun getAll() = listOf(

        AccountNet(
            id = 0,
            number = "000000000000001",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 1,
            number = "000000000000002",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 2,
            number = "000000000000003",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 3,
            number = "000000000000004",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 4,
            number = "000000000000005",
            type = TYPE_LOAN
        )
    )
}
