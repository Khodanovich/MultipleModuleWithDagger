package com.example.screen_accounts.presentation.details.vm

import com.example.core_ui.presentation.extentions.injectedLoadModel
import com.example.core_ui.presentation.ui.base.BaseViewModel
import com.example.screen_accounts.presentation.details.ui.AccountDetailsLoadModel
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class AccountDetailsViewModel @Inject constructor() : BaseViewModel(){

    private val loadModel: AccountDetailsLoadModel by injectedLoadModel()

    override fun onViewCreated() {
        super.onViewCreated()

        println(loadModel.id)
    }

}
