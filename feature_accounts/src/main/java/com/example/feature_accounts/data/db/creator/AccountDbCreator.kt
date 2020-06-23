package com.example.feature_accounts.data.db.creator

import android.content.Context
import androidx.room.Room
import com.example.feature_accounts.data.db.AccountDatabase
import net.sqlcipher.database.SupportFactory
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class AccountDbCreator @Inject constructor(private val context: Context) {

    private val db = Room.databaseBuilder(context, AccountDatabase::class.java, "test_one_feature_module_one_database")
        .openHelperFactory(SupportFactory("fdr455gdvdve565dfv0dv_9gb97hjhsvgvufvugj32".toByteArray()))
        .build()

    fun get() = db
}
