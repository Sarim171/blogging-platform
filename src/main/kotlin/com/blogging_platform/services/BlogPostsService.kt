package com.blogging_platform.services

import com.blogging_platform.repositories.BlogPostsRepository
import org.springframework.stereotype.Service

@Service
class BlogPostsService(private val blogPostsRepository: BlogPostsRepository) {

}