package pradist.tutorials.springboot.datasource

import pradist.tutorials.springboot.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

}