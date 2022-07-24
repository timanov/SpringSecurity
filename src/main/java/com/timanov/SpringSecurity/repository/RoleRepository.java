package com.timanov.SpringSecurity.repository;

import com.timanov.SpringSecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
