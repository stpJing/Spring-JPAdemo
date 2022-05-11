package com.example.springjpademo.dao;

import com.example.springjpademo.utils.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
