package com.example.screen_accounts.navigation.nested_navigation

import com.example.screen_accounts.navigation.AccountDetailsScreen
import com.example.screen_accounts.presentation.details.ui.AccountDetailsLoadModel
import ru.terrakok.cicerone.android.support.SupportAppScreen
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class AccountsDirectionsImpl @Inject constructor() : AccountsDirections {

    override fun toAccountDetails(loadModel: AccountDetailsLoadModel): SupportAppScreen {
        return AccountDetailsScreen(loadModel)
    }
}
