package com.example.core_data_base.db

import android.content.Context
import androidx.room.Room
import net.sqlcipher.database.SupportFactory
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class DbCreator @Inject constructor(private val context: Context) {

    private val db = Room.databaseBuilder(context, AppDatabase::class.java, "test_one_app_one_database")
        .openHelperFactory(SupportFactory("fdr455gdvdve565dfv0dv_9gb97hjhsvgvufvugj32".toByteArray()))
        .build()

    fun get() = db

}
