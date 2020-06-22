package com.example.core_data_base.accpunts.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author a.khodanovich
 */
@Entity(tableName = "account")
data class AccountEntity(
    @PrimaryKey
    val primaryKey: Long?,

    val number: String,

    val type: String,

    val owner: String,

    val bic: String,

    val amount: String

)
