package com.example.screen_accounts.presentation.launch

import androidx.annotation.DrawableRes

/**
 * @author a.khodanovich
 */
sealed class AccountUiModel(
    open val id: Long,
    open val onClickListener: (AccountUiModel) -> Unit
)

internal data class LoanUiModel(

    override val id: Long,
    val name: String,
    @DrawableRes val icon: Int,
    override val onClickListener: (AccountUiModel) -> Unit

) : AccountUiModel(id, onClickListener)

internal data class DepositUIModel(

    override val id: Long,
    val name: String,
    @DrawableRes val icon: Int,
    override val onClickListener: (AccountUiModel) -> Unit

) : AccountUiModel(id, onClickListener)
