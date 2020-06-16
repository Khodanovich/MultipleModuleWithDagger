package com.example.core_utils.di.base.holder

import com.example.core_utils.di.base.component.DIComponent

/**
 * @author a.khodanovich
 */
abstract class ComponentHolder<T: DIComponent> : BaseComponentHolder<T> {

    private var component: T? = null

    override fun get(): T {
        return if(component == null){
            create()
        } else {
            component!!
        }
    }

    protected fun create() = build()

    protected abstract fun build(): T

    override fun clear() {
        component = null
    }

}
