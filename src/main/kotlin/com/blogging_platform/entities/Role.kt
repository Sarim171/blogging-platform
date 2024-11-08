package com.blogging_platform.entities

import jakarta.persistence.*
import org.springframework.security.core.GrantedAuthority

@Entity
@Table(name = "roles")
class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Enumerated(EnumType.STRING)
    var roleName: RoleName
) : GrantedAuthority {
    override fun getAuthority() = roleName.name
}