package com.example.feature_accounts.data

import com.example.feature_accounts.data.data_source.AccountDataSource
import com.example.feature_accounts.data.db.dao.AccountDao
import com.example.feature_accounts.data.db.entity.AccountEntity
import com.example.feature_accounts.data.mapper.ToAccountDomainMapper
import com.example.feature_accounts.domain.model.Account
import com.example.feature_accounts.domain.repository.AccountRepository
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
internal class AccountRepositoryImpl @Inject constructor(

    private val dataSource: AccountDataSource,
    private val mapper: ToAccountDomainMapper,
    private val accountDao: AccountDao

) : AccountRepository {

    init {
        Thread(Runnable {
            if(accountDao.getAll().isEmpty()){
                for (i in 1..10000){
                    val account = AccountEntity(
                        primaryKey = null,
                        number = "Number$i",
                        type = "type$i",
                        owner = "owner$i",
                        bic = "bic$i",
                        amount = "$i"
                    )
                    accountDao.insert(account)
                }
            }
        }).start()
    }

    override fun getAll(): List<Account> {
        return dataSource.getAll()
            .map(mapper)
    }

    override fun getById(id: Long): Account {
        return dataSource.getAll()
            .filter { it.id == id }
            .map(mapper)
            .firstOrNull() ?: error("Not found")
    }
}
