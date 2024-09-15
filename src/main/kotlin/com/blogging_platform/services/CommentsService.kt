package com.blogging_platform.services

import com.blogging_platform.repositories.CommentsRepository
import org.springframework.stereotype.Service

@Service
class CommentsService (private val commentsRepository: CommentsRepository) {

}