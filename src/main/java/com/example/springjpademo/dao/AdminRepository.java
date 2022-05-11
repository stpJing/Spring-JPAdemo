package com.example.springjpademo.dao;

import com.example.springjpademo.utils.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
