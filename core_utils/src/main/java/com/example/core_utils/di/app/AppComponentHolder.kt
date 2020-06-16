package com.example.core_utils.di.app

import android.content.Context
import com.example.core_utils.di.app.module.ContextModule
import com.example.core_utils.di.base.holder.DataComponentHolder

/**
 * @author a.khodanovich
 */

object AppComponentHolder : DataComponentHolder<AppComponent, Context>() {

    override fun build(data: Context): AppComponent = DaggerAppComponent.builder()
        .contextModule(ContextModule(data))
        .build()

}


