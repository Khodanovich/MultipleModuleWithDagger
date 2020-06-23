package com.example.feature_accounts.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.feature_accounts.data.db.entity.AccountEntity

/**
 * @author a.khodanovich
 */
@Dao
internal interface AccountDao {

    @Query("SELECT * FROM account")
    fun getAll(): List<AccountEntity>

    @Insert
    fun insert(accountEntity: AccountEntity)

}
