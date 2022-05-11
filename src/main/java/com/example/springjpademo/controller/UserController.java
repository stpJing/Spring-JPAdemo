package com.example.springjpademo.controller;

import com.example.springjpademo.dao.AdminRepository;
import com.example.springjpademo.dao.UserRepository;
import com.example.springjpademo.utils.Admin;
import com.example.springjpademo.utils.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        return userRepository.findById(id).orElseGet(User::new);
    }
    @PostMapping()
    public User save(@RequestBody User user){
        return userRepository.saveAndFlush(user);
    }
}
