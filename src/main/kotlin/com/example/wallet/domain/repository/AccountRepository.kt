package com.example.wallet.domain.repository

import com.example.wallet.domain.entity.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository: JpaRepository<Account, Long> {
}