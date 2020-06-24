package com.example.core_ui.presentation.extentions

import android.os.Parcelable
import com.example.core_ui.presentation.ui.base.BaseViewModel
import java.lang.IllegalArgumentException

/**
 * @author a.khodanovich
 */
inline fun <reified T : Parcelable> BaseViewModel.injectedLoadModel(): Lazy<T> = lazy {

    val arg = this.loadModelHolder.loadModel
        ?: throw IllegalArgumentException("Load model not found")

    arg as T
}
