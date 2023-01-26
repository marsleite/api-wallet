package com.example.wallet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories
@SpringBootApplication
class WalletApplication

fun main(args: Array<String>) {
    runApplication<WalletApplication>(*args)
}
