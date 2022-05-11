package com.example.springjpademo.controller;

import com.example.springjpademo.dao.RoleRepository;
import com.example.springjpademo.dao.UserRepository;
import com.example.springjpademo.utils.Role;
import com.example.springjpademo.utils.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleRepository roleRepository;
    @GetMapping("/{id}")
    public Role getById(@PathVariable Integer id){
        return roleRepository.findById(id).orElseGet(Role::new);
    }
    @PostMapping()
    public Role save(@RequestBody Role role){
        return roleRepository.saveAndFlush(role);
    }
}
