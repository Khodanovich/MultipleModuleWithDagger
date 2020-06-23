package com.example.screen_profile.di.module

import com.example.screen_profile.data.db.ProfileInfoDbCreator
import dagger.Module

/**
 * @author a.khodanovich
 */
@Module
internal interface ProfileInfoDbCreatorModule {

    val profileInfoDbCreator: ProfileInfoDbCreator

}
