package com.example.core_ui.presentation.di

import com.example.core_ui.presentation.ui.view_model_factory.BaseViewModelFactory
import com.example.core_utils.di.base.component.DIComponent

/**
 * @author a.khodanovich
 */
interface UIComponent : DIComponent {

    val viewModelFactory: BaseViewModelFactory

}
