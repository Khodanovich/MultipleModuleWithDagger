package com.example.screen_profile.di.module

import com.example.screen_profile.data.db.ProfileInfoDbCreator
import dagger.Module
import dagger.Provides

/**
 * @author a.khodanovich
 */
@Module
internal class ProfileInfoDaoModule {

    @Provides
    fun provideProfileInfoDao(profileInfoDbCreator: ProfileInfoDbCreator) =
        profileInfoDbCreator.get().getProfileInfoDao()

}
