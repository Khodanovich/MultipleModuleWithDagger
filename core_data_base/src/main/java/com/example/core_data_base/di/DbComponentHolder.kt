package com.example.core_data_base.di

import com.example.core_utils.di.app.AppComponentHolder
import com.example.core_utils.di.base.holder.ComponentHolder

/**
 * @author a.khodanovich
 */
object DbComponentHolder : ComponentHolder<DbComponent>() {

    override fun build(): DbComponent = DaggerDbComponent
        .builder()
        .appComponent(AppComponentHolder.get())
        .build()

}

