package pradist.tutorials.springboot.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import pradist.tutorials.springboot.datasource.BankDataSource

class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        bankService.getBanks()

        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}