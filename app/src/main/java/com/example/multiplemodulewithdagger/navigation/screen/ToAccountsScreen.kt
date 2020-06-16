package com.example.multiplemodulewithdagger.navigation.screen

import android.content.Context
import android.content.Intent
import com.example.screen_accounts.presentation.launch.ui.AccountsScreenActivity
import ru.terrakok.cicerone.android.support.SupportAppScreen

/**
 * @author a.khodanovich
 */
internal object ToAccountsScreen : SupportAppScreen() {

    override fun getActivityIntent(context: Context): Intent? {
        return AccountsScreenActivity.newInstance(context)
    }
}
