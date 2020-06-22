package com.example.core_data_base.accounts.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.core_data_base.accounts.entity.AccountEntity

/**
 * @author a.khodanovich
 */
@Dao
interface AccountDao {

    @Query("SELECT * FROM account")
    fun getAll(): List<AccountEntity>

    @Insert
    fun insert(accountEntity: AccountEntity)

}
