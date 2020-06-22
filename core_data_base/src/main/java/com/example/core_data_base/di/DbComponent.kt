package com.example.core_data_base.di

import com.example.core_data_base.accounts.dao.AccountDao
import com.example.core_data_base.di.module.DaoModule
import com.example.core_data_base.di.module.DbCreatorModule
import com.example.core_data_base.profile.dao.ProfileInfoDao
import com.example.core_utils.di.app.AppComponent
import com.example.core_utils.di.base.component.DIComponent
import dagger.Component

/**
 * @author a.khodanovich
 */
@Component(
    dependencies = [
        AppComponent::class
    ],
    modules = [
        DaoModule::class,
        DbCreatorModule::class
    ]
)
interface DbComponent : DIComponent {

    val accountDao: AccountDao

    val profileInfoDao: ProfileInfoDao

}
