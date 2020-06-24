package com.example.core_ui.presentation.ui.base

import androidx.lifecycle.ViewModel
import com.example.core_ui.presentation.ui.load_model_holder.LoadModelHolder
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
abstract class BaseViewModel : ViewModel() {

    @Inject
    lateinit var loadModelHolder: LoadModelHolder

    open fun onViewCreated(){}

}
