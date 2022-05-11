package com.example.springjpademo.dao;

import com.example.springjpademo.utils.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
