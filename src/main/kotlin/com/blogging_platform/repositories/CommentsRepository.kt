package com.blogging_platform.repositories

import com.blogging_platform.entities.Comments
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentsRepository : JpaRepository<Comments, Long>