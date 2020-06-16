package com.example.core_ui.presentation.ui.base

import androidx.lifecycle.ViewModel

/**
 * @author a.khodanovich
 */
abstract class BaseViewModel : ViewModel() {

    open fun onViewCreated(){}

}
