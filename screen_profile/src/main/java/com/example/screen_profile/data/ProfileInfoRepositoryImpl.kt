package com.example.screen_profile.data

import com.example.screen_profile.data.data_source.ProfileInfoDataSource
import com.example.screen_profile.data.db.dao.ProfileInfoDao
import com.example.screen_profile.data.db.entity.ProfileInfoEntity
import com.example.screen_profile.domain.model.ProfileInfo
import com.example.screen_profile.domain.repository.ProfileInfoRepository
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class ProfileInfoRepositoryImpl @Inject constructor(

    private val dataSource: ProfileInfoDataSource,
    private val profileInfoDao: ProfileInfoDao

) : ProfileInfoRepository {

    init {
        Thread(Runnable {
            if(profileInfoDao.getAll().isEmpty()){
                for (i in 1..10000){
                    val profileInfoEntity = ProfileInfoEntity(
                        id = null,
                        firstNAme = "firstNAme$i",
                        secondName = "secondName$i",
                        lastNAme = "lastNAme$i",
                        phoneNumber = "phoneNumber$i",
                        email = "email$i",
                        address = "address$i",
                        fullname = "fullname$i"
                    )
                    profileInfoDao.insert(profileInfoEntity)
                }
            }
        }).start()
    }

    override fun getProfileInfo(): ProfileInfo {

        return with(dataSource.getProfileInfo()){
            return@with ProfileInfo(
                name = this.name.orEmpty(),
                age = this.age ?: -1
            )
        }
    }
}
