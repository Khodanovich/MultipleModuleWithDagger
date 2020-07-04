package com.example.screen_accounts.presentation.launch.vm

import com.example.core_ui.presentation.ui.base.BaseViewModel
import com.example.feature_accounts.domain.AllAccountsCase
import com.example.feature_accounts.domain.ByIdAccountCase
import com.example.feature_accounts.domain.DepositAccountsCase
import com.example.feature_accounts.domain.LoanAccountsCase
import com.example.navigation.directions.GlobalDirections
import com.example.screen_accounts.navigation.nested_navigation.AccountsDirections
import com.example.screen_accounts.presentation.details.ui.AccountDetailsLoadModel
import com.example.screen_accounts.presentation.launch.AccountUiModel
import com.example.screen_accounts.presentation.launch.adapter.AccountsAdapter
import com.example.screen_accounts.presentation.launch.mapper.AccountToUiModelMapper
import ru.terrakok.cicerone.Router
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
class AccountViewModel @Inject constructor(

    private val allAccountsCase: AllAccountsCase,
    private val byIdAccountCase: ByIdAccountCase,
    private val depositAccountsCase: DepositAccountsCase,
    private val loanAccountsCase: LoanAccountsCase,
    private val router: Router,
    private val globalDirections: GlobalDirections,
    private val accountsDirections: AccountsDirections,
    private val accountToUIModelMapper: AccountToUiModelMapper

) : BaseViewModel() {

    val text = "ACCOUNT"

    val accountsAdapter = AccountsAdapter()

    override fun onCreate() {
        super.onCreate()

        println(byIdAccountCase.execute(1))

        println(depositAccountsCase.execute())

        println(loanAccountsCase.execute())

        val accounts = allAccountsCase.execute()
            .map { accountToUIModelMapper.invoke(it) { navigateToAccountDetailsScreen(it) } }

        accountsAdapter.setData(accounts)
    }

    private fun navigateToAccountDetailsScreen(accountUiModel: AccountUiModel) {
        router.navigateTo(
            accountsDirections.toAccountDetails(
                loadModel = AccountDetailsLoadModel(
                    id = accountUiModel.id
                )
            )
        )
    }

    fun onToProfileInfoClicked() {
        router.navigateTo(globalDirections.toProfile())
    }
}
