package com.blogging_platform.repositories

import com.blogging_platform.entities.Role
import com.blogging_platform.entities.RoleName
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role,Long>{
    fun existsByRoleName(roleName: RoleName): Boolean
    fun findByRoleName(roleName: RoleName): Role?
}