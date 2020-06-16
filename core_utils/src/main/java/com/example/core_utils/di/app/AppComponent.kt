package com.example.core_utils.di.app

import android.content.Context
import com.example.core_utils.di.app.module.ContextModule
import com.example.core_utils.di.base.component.DIComponent
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

/**
 * @author a.khodanovich
 */

@Component(
    modules = [
        ContextModule::class
    ]
)
interface AppComponent : DIComponent{

     val context: Context

}
