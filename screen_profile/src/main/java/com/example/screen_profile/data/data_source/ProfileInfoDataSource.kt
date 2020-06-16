package com.example.screen_profile.data.data_source

import com.example.screen_profile.data.model.ProfileInfoNet
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class ProfileInfoDataSource @Inject constructor() {

    fun getProfileInfo() =
        ProfileInfoNet(
            name = "Васек",
            age = 54
        )
}
