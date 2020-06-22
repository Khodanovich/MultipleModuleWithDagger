package com.example.core_data_base.accpunts.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.core_data_base.accpunts.entity.AccountEntity

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
