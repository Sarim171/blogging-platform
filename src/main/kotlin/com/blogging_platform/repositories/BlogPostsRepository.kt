package com.blogging_platform.repositories

import com.blogging_platform.entities.BlogPosts
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BlogPostsRepository : JpaRepository<BlogPosts,Long>