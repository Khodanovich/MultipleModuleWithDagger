package com.example.screen_accounts.navigation

import android.content.Context
import android.content.Intent
import com.example.core_ui.presentation.extentions.createActivityIntent
import com.example.screen_accounts.presentation.details.ui.AccountDetailsActivity
import com.example.screen_accounts.presentation.details.ui.AccountDetailsLoadModel
import ru.terrakok.cicerone.android.support.SupportAppScreen

/**
 * @author a.khodanovich
 */
internal class AccountDetailsScreen(

    private val loadModel: AccountDetailsLoadModel

): SupportAppScreen(){

    override fun getActivityIntent(context: Context): Intent? {
        return createActivityIntent<AccountDetailsActivity>(context, loadModel)
    }
}
