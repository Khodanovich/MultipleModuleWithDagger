package com.example.core_data_base.di.module

import com.example.core_data_base.db.DbCreator
import dagger.Module

/**
 * @author a.khodanovich
 */
@Module
internal interface DbCreatorModule {

    val dbCreator: DbCreator

}
