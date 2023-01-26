package com.example.wallet.domain.entity

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Account(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val accountId: Long,
    val balance: BigDecimal
)