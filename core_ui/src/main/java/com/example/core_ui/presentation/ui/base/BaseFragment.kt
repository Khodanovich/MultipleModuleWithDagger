package com.example.core_ui.presentation.ui.base

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
abstract class BaseFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    abstract var viewModel: BaseViewModel

}
