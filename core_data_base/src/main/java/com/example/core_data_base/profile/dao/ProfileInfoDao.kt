package com.example.core_data_base.profile.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.core_data_base.profile.entity.ProfileInfoEntity

/**
 * @author a.khodanovich
 */
@Dao
interface ProfileInfoDao {

    @Query("SELECT * FROM profile_info")
    fun getAll(): List<ProfileInfoEntity>

    @Insert
    fun insert(profileInfoEntity: ProfileInfoEntity)

}
