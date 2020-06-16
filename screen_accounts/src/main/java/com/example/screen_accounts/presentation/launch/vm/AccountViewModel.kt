package com.example.screen_accounts.presentation.launch.vm

import com.example.core_ui.presentation.ui.base.BaseViewModel
import com.example.feature_accounts.domain.AllAccountsCase
import com.example.feature_accounts.domain.ByIdAccountCase
import com.example.feature_accounts.domain.DepositAccountsCase
import com.example.feature_accounts.domain.LoanAccountsCase
import com.example.screen_accounts.navigation.AccountDetailsScreen
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
    private val router: Router

) : BaseViewModel() {

    override fun onViewCreated() {

        println(allAccountsCase.execute())

        println(byIdAccountCase.execute(1))

        println(depositAccountsCase.execute())

        println(loanAccountsCase.execute())
    }

    fun onToDetailsButtonClicked() {
        router.navigateTo(AccountDetailsScreen(1))
    }
}
