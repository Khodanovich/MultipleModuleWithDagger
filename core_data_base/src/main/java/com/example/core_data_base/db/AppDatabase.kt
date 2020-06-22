package com.example.core_data_base.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core_data_base.accounts.dao.AccountDao
import com.example.core_data_base.accounts.entity.AccountEntity
import com.example.core_data_base.profile.dao.ProfileInfoDao
import com.example.core_data_base.profile.entity.ProfileInfoEntity

/**
 * @author a.khodanovich
 */
@Database(
    entities = [
        AccountEntity::class,
        ProfileInfoEntity::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getAccountDao(): AccountDao

    abstract fun getProfileInfoDao(): ProfileInfoDao
}
