package com.example.screen_profile.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.screen_profile.data.db.entity.ProfileInfoEntity

/**
 * @author a.khodanovich
 */
@Dao
internal interface ProfileInfoDao {

    @Query("SELECT * FROM profile_info")
    fun getAll(): List<ProfileInfoEntity>

    @Insert
    fun insert(profileInfoEntity: ProfileInfoEntity)

}
