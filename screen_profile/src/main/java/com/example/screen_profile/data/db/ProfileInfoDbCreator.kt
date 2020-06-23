package com.example.screen_profile.data.db

import android.content.Context
import androidx.room.Room
import net.sqlcipher.database.SupportFactory
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class ProfileInfoDbCreator @Inject constructor(private val context: Context) {

    private val db = Room.databaseBuilder(context, ProfileInfoDatabase::class.java, "test_one_app_one_database_profile_info")
        .openHelperFactory(SupportFactory("fdr455gdvdve565dfv0dv_9gb97hjhsvgvufvugj32".toByteArray()))
        .build()

    fun get() = db

}
