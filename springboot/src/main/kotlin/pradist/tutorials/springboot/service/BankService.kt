package pradist.tutorials.springboot.service

import org.springframework.stereotype.Service
import pradist.tutorials.springboot.datasource.BankDataSource
import pradist.tutorials.springboot.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)


}
