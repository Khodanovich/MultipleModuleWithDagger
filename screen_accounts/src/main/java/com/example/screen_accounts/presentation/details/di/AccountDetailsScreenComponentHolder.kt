package com.example.screen_accounts.presentation.details.di

import com.example.core_utils.di.base.holder.ComponentHolder

/**
 * @author a.khodanovich
 */
internal object AccountDetailsScreenComponentHolder : ComponentHolder<AccountDetailsScreenComponent>() {

    override fun build(): AccountDetailsScreenComponent = DaggerAccountDetailsScreenComponent.create()

}
