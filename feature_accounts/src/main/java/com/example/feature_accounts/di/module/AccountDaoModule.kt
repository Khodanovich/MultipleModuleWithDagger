package com.example.feature_accounts.di.module

import com.example.feature_accounts.data.db.creator.AccountDbCreator
import dagger.Module
import dagger.Provides

/**
 * @author a.khodanovich
 */
@Module
internal class AccountDaoModule {

    @Provides
    fun provideAccountDao(accountDbCreator: AccountDbCreator) =
        accountDbCreator.get().getAccountDao()

}
