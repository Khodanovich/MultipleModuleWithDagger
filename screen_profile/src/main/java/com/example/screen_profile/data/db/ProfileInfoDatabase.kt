package com.example.screen_profile.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.screen_profile.data.db.dao.ProfileInfoDao
import com.example.screen_profile.data.db.entity.ProfileInfoEntity

/**
 * @author a.khodanovich
 */
@Database(
    entities = [
        ProfileInfoEntity::class
    ],
    version = 1
)
internal abstract class ProfileInfoDatabase  : RoomDatabase() {

    abstract fun getProfileInfoDao(): ProfileInfoDao

}
