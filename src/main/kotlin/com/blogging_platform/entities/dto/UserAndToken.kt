package com.blogging_platform.entities.dto

import com.blogging_platform.entities.User

data class UserAndToken (
    val user: User,
    val token: String
)