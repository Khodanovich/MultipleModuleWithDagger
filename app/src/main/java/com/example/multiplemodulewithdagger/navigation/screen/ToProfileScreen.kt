package com.example.multiplemodulewithdagger.navigation.screen

import android.content.Context
import android.content.Intent
import com.example.core_ui.presentation.extentions.createActivityIntent
import com.example.screen_profile.presentation.ui.ProfileActivity
import ru.terrakok.cicerone.android.support.SupportAppScreen

/**
 * @author a.khodanovich
 */
object ToProfileScreen : SupportAppScreen() {

    override fun getActivityIntent(context: Context): Intent? {
        return createActivityIntent<ProfileActivity>(context)
    }
}
