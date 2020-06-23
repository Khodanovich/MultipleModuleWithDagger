package com.example.feature_accounts.di

import com.example.core_utils.di.app.AppComponentHolder
import com.example.core_utils.di.base.holder.ComponentHolder

/**
 * @author a.khodanovich
 */
object AccountComponentHolder : ComponentHolder<AccountComponent>() {

    override fun build(): AccountComponent = DaggerAccountComponentImpl
        .builder()
        .appComponent(AppComponentHolder.get())
        .build()

}
