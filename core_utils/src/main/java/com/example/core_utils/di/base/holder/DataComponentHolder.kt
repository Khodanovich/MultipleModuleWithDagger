package com.example.core_utils.di.base.holder

import com.example.core_utils.di.base.component.DIComponent

/**
 * @author a.khodanovich
 */
abstract class DataComponentHolder<Component : DIComponent, Data: Any> : BaseComponentHolder<Component> {

    private var component: Component? = null

    private lateinit var data: Data

    override fun get(): Component {
        return if (component == null) {
            create(data)
        } else {
            component!!
        }
    }

    fun create(data: Data): Component {
        this.data = data
        return build(data)
    }

    override fun clear() {
        component = null
    }

    protected abstract fun build(data: Data): Component

}
