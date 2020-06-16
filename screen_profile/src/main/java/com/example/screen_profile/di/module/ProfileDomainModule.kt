package com.example.screen_profile.di.module

import com.example.screen_profile.data.ProfileInfoRepositoryImpl
import com.example.screen_profile.data.data_source.ProfileInfoDataSource
import com.example.screen_profile.domain.ProfileInfoCase
import com.example.screen_profile.domain.ProfileInfoCaseImpl
import com.example.screen_profile.domain.repository.ProfileInfoRepository
import dagger.Binds
import dagger.Module

/**
 * @author a.khodanovich
 */
@Module
internal interface ProfileDomainModule {

    val dataSource: ProfileInfoDataSource

    @Binds
    fun bindProfileInfoRepository(impl: ProfileInfoRepositoryImpl): ProfileInfoRepository

    @Binds
    fun bindProfileInfoCase(impl: ProfileInfoCaseImpl): ProfileInfoCase

}
