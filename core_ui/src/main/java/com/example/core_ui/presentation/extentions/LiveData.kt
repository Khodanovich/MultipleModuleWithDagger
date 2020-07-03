package com.example.core_ui.presentation.extentions

import androidx.lifecycle.MutableLiveData

/**
 * @author a.khodanovich
 */
inline fun <reified T> mutableLiveData(startValue: T): Lazy<MutableLiveData<T>> = lazy {
    MutableLiveData<T>(startValue)
}
