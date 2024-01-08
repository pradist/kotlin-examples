package pradist.tutorials.springboot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pradist.tutorials.springboot.model.Bank
import pradist.tutorials.springboot.service.BankService

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {

    @GetMapping
    fun getBanks(): String = "Working!"
}