package com.example.screen_accounts.navigation.nested_navigation

import com.example.screen_accounts.presentation.details.ui.AccountDetailsLoadModel
import ru.terrakok.cicerone.android.support.SupportAppScreen

/**
 * @author a.khodanovich
 */
interface AccountsDirections {

    fun toAccountDetails(loadModel: AccountDetailsLoadModel): SupportAppScreen

}
