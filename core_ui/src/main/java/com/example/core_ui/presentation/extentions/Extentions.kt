package com.example.core_ui.presentation.extentions

import androidx.lifecycle.ViewModelProviders
import com.example.core_ui.presentation.ui.base.BaseActivity
import com.example.core_ui.presentation.ui.base.BaseViewModel

/**
 * @author a.khodanovich
 */

inline fun <reified T : BaseViewModel> BaseActivity<T>.injectViewModel(
    crossinline scope: () -> BaseActivity<T> = {this}
): Lazy<T> = lazy{
    ViewModelProviders.of(scope(), viewModelFactory)[T::class.java]
}
