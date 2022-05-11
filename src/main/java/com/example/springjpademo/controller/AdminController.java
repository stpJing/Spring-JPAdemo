package com.example.springjpademo.controller;


import com.example.springjpademo.dao.AdminRepository;
import com.example.springjpademo.utils.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminRepository adminRepository;
    @GetMapping("/{id}")
    public Admin getById(@PathVariable Integer id){
        return adminRepository.findById(id).orElseGet(Admin::new);
    }

    @PostMapping()
    public Admin save(@RequestBody Admin admin){
        return adminRepository.saveAndFlush(admin);
    }
}
