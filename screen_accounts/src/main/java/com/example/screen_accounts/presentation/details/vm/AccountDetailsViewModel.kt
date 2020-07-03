package com.example.screen_accounts.presentation.details.vm

import com.example.core_ui.presentation.extentions.injectedLoadModel
import com.example.core_ui.presentation.extentions.mutableLiveData
import com.example.core_ui.presentation.ui.base.BaseViewModel
import com.example.screen_accounts.presentation.details.ui.AccountDetailsLoadModel
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class AccountDetailsViewModel @Inject constructor() : BaseViewModel(){

    private val loadModel: AccountDetailsLoadModel by injectedLoadModel()

    val text by mutableLiveData("")

    override fun onCreate() {
        super.onCreate()

        text.value = "Account ID - ${loadModel.id}"
    }
}
