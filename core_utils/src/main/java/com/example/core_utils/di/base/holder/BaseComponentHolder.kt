package com.example.core_utils.di.base.holder

import com.example.core_utils.di.base.component.DIComponent

/**
 * @author a.khodanovich
 */
interface BaseComponentHolder<Component : DIComponent> {

    fun get(): Component

    fun clear()

}
