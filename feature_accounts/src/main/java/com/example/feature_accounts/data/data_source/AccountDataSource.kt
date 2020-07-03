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
        ),
        AccountNet(
            id = 5,
            number = "000000000000006",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 6,
            number = "000000000000007",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 7,
            number = "000000000000008",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 8,
            number = "000000000000009",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 9,
            number = "000000000000010",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 10,
            number = "000000000000011",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 11,
            number = "000000000000012",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 12,
            number = "000000000000013",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 13,
            number = "000000000000014",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 14,
            number = "000000000000015",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 15,
            number = "000000000000016",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 16,
            number = "000000000000017",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 17,
            number = "000000000000018",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 18,
            number = "000000000000019",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 19,
            number = "000000000000020",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 20,
            number = "000000000000021",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 21,
            number = "000000000000022",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 22,
            number = "000000000000023",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 23,
            number = "000000000000024",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 24,
            number = "000000000000025",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 25,
            number = "000000000000026",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 26,
            number = "000000000000027",
            type = TYPE_DEPOSIT
        ),
        AccountNet(
            id = 27,
            number = "000000000000028",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 28,
            number = "000000000000029",
            type = TYPE_LOAN
        ),
        AccountNet(
            id = 29,
            number = "000000000000030",
            type = TYPE_LOAN
        )
    )
}
