package com.example.screen_profile.domain

import com.example.screen_profile.domain.model.ProfileInfo
import com.example.screen_profile.domain.repository.ProfileInfoRepository
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class ProfileInfoCaseImpl @Inject constructor(

    private val profileInfoRepository: ProfileInfoRepository

) : ProfileInfoCase {

    override fun execute(): ProfileInfo {
        return profileInfoRepository.getProfileInfo()
    }

}
