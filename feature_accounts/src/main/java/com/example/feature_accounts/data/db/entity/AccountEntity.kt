package com.example.feature_accounts.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author a.khodanovich
 */
@Entity(tableName = "account")
internal data class AccountEntity(

    @PrimaryKey
    val primaryKey: Long?,

    val number: String,

    val type: String,

    val owner: String,

    val bic: String,

    val amount: String

)
