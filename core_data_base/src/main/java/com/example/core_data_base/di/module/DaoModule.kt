package com.example.core_data_base.di.module

import com.example.core_data_base.db.DbCreator
import dagger.Module
import dagger.Provides

/**
 * @author a.khodanovich
 */
@Module
internal class DaoModule {

    @Provides
    fun provideAccountDao(dbCreator: DbCreator) = dbCreator.get().getAccountDao()

    @Provides
    fun provideProfileInfoDao(dbCreator: DbCreator) = dbCreator.get().getProfileInfoDao()

}
