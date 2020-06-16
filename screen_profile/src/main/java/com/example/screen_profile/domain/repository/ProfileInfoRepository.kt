package com.example.screen_profile.domain.repository

import com.example.screen_profile.domain.model.ProfileInfo

/**
 * @author a.khodanovich
 */
internal interface ProfileInfoRepository {

    fun getProfileInfo(): ProfileInfo

}
