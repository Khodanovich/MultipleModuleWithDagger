package com.example.screen_profile.presentation.vm

import com.example.core_ui.presentation.ui.base.BaseViewModel
import com.example.screen_profile.domain.ProfileInfoCase
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
class ProfileViewModel @Inject constructor(

    private val profileInfoCase: ProfileInfoCase

) : BaseViewModel() {

    override fun onViewCreated() {

        println(profileInfoCase.execute())

    }
}
