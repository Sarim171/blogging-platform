package com.blogging_platform.services

import com.blogging_platform.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (private val userRepository: UserRepository) {
}