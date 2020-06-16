package com.example.core_utils.di.app.module

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * @author a.khodanovich
 */

@Module
internal class ContextModule(private val context: Context) {

    @Provides
    fun provideContext() = context

}
