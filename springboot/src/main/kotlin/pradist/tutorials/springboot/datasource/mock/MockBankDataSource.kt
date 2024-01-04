package pradist.tutorials.springboot.datasource.mock

import org.springframework.stereotype.Repository
import pradist.tutorials.springboot.datasource.BankDataSource
import pradist.tutorials.springboot.model.Bank

@Repository
class MockBankDataSource: BankDataSource {

    override fun retrieveBanks(): Collection<Bank> {
        return listOf(Bank("12345", 3.14, 16))
    }
}