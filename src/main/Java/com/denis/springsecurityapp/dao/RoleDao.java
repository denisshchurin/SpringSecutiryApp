package com.denis.springsecurityapp.dao;

import com.denis.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
