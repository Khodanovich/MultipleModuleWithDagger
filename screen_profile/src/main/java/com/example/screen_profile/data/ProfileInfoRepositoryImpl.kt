package com.example.screen_profile.data

import com.example.screen_profile.data.data_source.ProfileInfoDataSource
import com.example.screen_profile.domain.model.ProfileInfo
import com.example.screen_profile.domain.repository.ProfileInfoRepository
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class ProfileInfoRepositoryImpl @Inject constructor(

    private val dataSource: ProfileInfoDataSource

) : ProfileInfoRepository {

    override fun getProfileInfo(): ProfileInfo {

        return with(dataSource.getProfileInfo()){
            return@with ProfileInfo(
                name = this.name.orEmpty(),
                age = this.age ?: -1
            )
        }
    }
}
