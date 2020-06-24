package com.example.core_ui.presentation.extentions

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.ViewModelProviders
import com.example.core_ui.presentation.ui.base.BaseActivity
import com.example.core_ui.presentation.ui.base.BaseViewModel

/**
 * @author a.khodanovich
 */

const val LOAD_MODEL_ARG = "loadModel"
const val LOAD_MODEL_BUNDLE_INTENT_ARG = "bundleIntentArg"

inline fun <reified T> createActivityIntent(context: Context, loadModel: Parcelable): Intent {

    val bundle = Bundle().apply {
        putParcelable(LOAD_MODEL_ARG, loadModel)
    }

    val intent = Intent(context, T::class.java)
        .apply {
            putExtra(LOAD_MODEL_BUNDLE_INTENT_ARG, bundle)
        }

    return intent
}

inline fun <reified T> createActivityIntent(context: Context): Intent {

    return Intent(context, T::class.java)
}

inline fun <reified T : BaseViewModel> BaseActivity<T>.injectViewModel(

    crossinline scope: () -> BaseActivity<T> = { this }

): Lazy<T> = lazy {

    ViewModelProviders.of(scope(), viewModelFactory)[T::class.java]
}
