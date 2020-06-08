package com.social.controller;

import com.social.entities.Admin;
import com.social.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @CrossOrigin()
    @GetMapping("/admins/{username}")
    public Admin find(@PathVariable String username) {
        return adminService.find(username);
    }


    @CrossOrigin()
    @GetMapping("/admin/{id}")
    public Admin find(@PathVariable int id) {
        return adminService.find(id);
    }

    @CrossOrigin()
    @PutMapping("/admins/{username}")
    public Admin update(@PathVariable(name = "username") String username , @RequestBody Admin admin)   {
        return adminService.update(username, admin);
    }
    @CrossOrigin()
    @PutMapping("/admin/{id}")
    public Admin update(@PathVariable(name = "id") int id , @RequestBody Admin admin)   {
        return adminService.update(id, admin);
    }


    @CrossOrigin()
    @GetMapping("/admins")
    public List<Admin> GetAdmin(){
        return adminService.GetAdmin();}


}
