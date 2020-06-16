package com.example.screen_profile.di

import com.example.core_utils.di.base.holder.ComponentHolder

/**
 * @author a.khodanovich
 */
internal object ProfileScreenComponentHolder : ComponentHolder<ProfileScreenComponent>() {

    override fun build(): ProfileScreenComponent = DaggerProfileScreenComponent.create()

}
