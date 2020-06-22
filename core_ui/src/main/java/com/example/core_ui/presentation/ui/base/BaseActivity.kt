package com.example.core_ui.presentation.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.example.core_ui.presentation.di.UIComponent
import com.example.core_ui.presentation.ui.view_model_factory.BaseViewModelFactory
import com.example.navigation.di.NavigationComponentHolder
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command

/**
 * @author a.khodanovich
 */
abstract class BaseActivity<ViewModel : BaseViewModel> : AppCompatActivity() {

    protected abstract val viewModel: ViewModel

    protected abstract var diComponent: UIComponent

    lateinit var viewModelFactory: BaseViewModelFactory

    protected abstract val layoutId: Int

    private val navigator = SupportAppNavigator(this, 0)

    //Эксперементальное время
    var start: Long = 0
    var end: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        start = System.currentTimeMillis()
        viewModelFactory = createViewModelFactory()


        super.onCreate(savedInstanceState)

        setContentView(layoutId)

        viewModel.onViewCreated()

        end = System.currentTimeMillis()
    }

    private fun createViewModelFactory() = with(diComponent){

        return@with viewModelFactory
    }

    override fun onResume() {
        super.onResume()

        NavigationComponentHolder.get().navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()

        NavigationComponentHolder.get().navigatorHolder.removeNavigator()
    }

}
