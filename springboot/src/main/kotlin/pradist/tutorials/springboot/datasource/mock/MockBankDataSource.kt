package pradist.tutorials.springboot.datasource.mock

import org.springframework.stereotype.Repository
import pradist.tutorials.springboot.datasource.BankDataSource
import pradist.tutorials.springboot.model.Bank

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
        Bank("12345", 3.14, 16),
        Bank("101010", 17.0, 0),
        Bank("54321", 0.0, 100))
    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull() { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
}