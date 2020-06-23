package com.example.feature_accounts.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.feature_accounts.data.db.dao.AccountDao
import com.example.feature_accounts.data.db.entity.AccountEntity

/**
 * @author a.khodanovich
 */
@Database(
    entities = [
        AccountEntity::class
    ],
    version = 1
)
internal abstract class AccountDatabase : RoomDatabase() {

    abstract fun getAccountDao(): AccountDao

}
