package com.example.screen_profile.presentation.ui

import com.example.core_ui.presentation.di.UIComponent
import com.example.core_ui.presentation.extentions.injectViewModel
import com.example.core_ui.presentation.ui.base.BaseActivity
import com.example.screen_profile.R
import com.example.screen_profile.di.ProfileScreenComponentHolder
import com.example.screen_profile.presentation.vm.ProfileViewModel

/**
 * @author a.khodanovich
 */
class ProfileActivity : BaseActivity<ProfileViewModel>() {

    override val viewModel: ProfileViewModel by injectViewModel()
    override var diComponent: UIComponent = ProfileScreenComponentHolder.get()
    override val layoutId = R.layout.activity_profile
}
