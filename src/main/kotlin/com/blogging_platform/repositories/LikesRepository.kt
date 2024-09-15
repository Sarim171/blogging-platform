package com.blogging_platform.repositories

import com.blogging_platform.entities.Likes
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LikesRepository : JpaRepository<Likes, Long>