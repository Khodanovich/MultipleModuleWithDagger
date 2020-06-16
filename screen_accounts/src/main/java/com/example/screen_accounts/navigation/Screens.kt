package com.example.screen_accounts.navigation

import android.content.Context
import android.content.Intent
import com.example.screen_accounts.presentation.details.ui.AccountDetailsActivity
import ru.terrakok.cicerone.android.support.SupportAppScreen

/**
 * @author a.khodanovich
 */
internal class AccountDetailsScreen(val id: Long): SupportAppScreen(){

    override fun getActivityIntent(context: Context): Intent? {
        return AccountDetailsActivity.newIntent(context, id)
    }

}
