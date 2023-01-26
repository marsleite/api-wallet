package com.example.wallet.domain.repository

import com.example.wallet.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}