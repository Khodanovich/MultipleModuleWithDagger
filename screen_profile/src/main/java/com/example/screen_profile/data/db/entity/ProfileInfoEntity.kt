package com.example.screen_profile.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author a.khodanovich
 */
@Entity(tableName = "profile_info")
internal class ProfileInfoEntity(

    @PrimaryKey
    val id: Long?,

    val firstNAme: String,

    val secondName: String,

    val lastNAme: String,

    val phoneNumber: String,

    val email: String,

    val address: String,

    val fullname: String
)
