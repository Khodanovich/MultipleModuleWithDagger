package com.example.core_ui.presentation.ui.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import com.example.core_ui.presentation.ui.load_model_holder.LoadModelHolder
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
abstract class BaseViewModel : ViewModel(), LifecycleObserver {

    @Inject
    lateinit var loadModelHolder: LoadModelHolder

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    open fun onCreate(){}

}
