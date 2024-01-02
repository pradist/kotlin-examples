package pradist.tutorials.springboot.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `Should provide a collection of banks`() {
        val banks = mockDataSource.getBanks()

        assertThat(banks).isNotEmpty()
    }
}