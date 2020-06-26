package com.example.core_ui.presentation.ui.base

import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import com.example.core_ui.presentation.di.UIComponent
import com.example.core_ui.presentation.extentions.LOAD_MODEL_ARG
import com.example.core_ui.presentation.extentions.LOAD_MODEL_BUNDLE_INTENT_ARG
import com.example.core_ui.presentation.ui.view_model_factory.BaseViewModelFactory
import com.example.navigation.di.NavigationComponentHolder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import kotlin.coroutines.CoroutineContext

/**
 * @author a.khodanovich
 */
abstract class BaseActivity<ViewModel : BaseViewModel> : AppCompatActivity(), CoroutineScope {

    protected abstract val viewModel: ViewModel

    val viewModelFactory: BaseViewModelFactory by lazy { createViewModelFactory() }

    protected abstract val layoutId: Int

    private val navigator = SupportAppNavigator(this, 0)

    final override val coroutineContext: CoroutineContext = Dispatchers.Main

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(layoutId)

        lifecycle.addObserver(viewModel)
    }

    private fun createViewModelFactory() = with(createDiComponent()) {

        val bundle: Bundle? = intent?.getBundleExtra(LOAD_MODEL_BUNDLE_INTENT_ARG)
        val loadModel = bundle?.getParcelable<Parcelable>(LOAD_MODEL_ARG)
        loadModelHolder.loadModel = loadModel

        return@with viewModelFactory
    }

    protected abstract fun createDiComponent(): UIComponent

    override fun onResume() {
        super.onResume()

        NavigationComponentHolder.get().navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()

        NavigationComponentHolder.get().navigatorHolder.removeNavigator()
    }

    override fun onDestroy() {
        super.onDestroy()

        lifecycle.removeObserver(viewModel)
    }

}
