package com.example.groupproject.controller;

import com.example.groupproject.entity.User;
import com.example.groupproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUsers(){
        userService.initRolesAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user){
       return userService.registerNewUser(user);

    }
    @GetMapping({"/admin"})
    public String forAdmin(){
        return "This URL is only accessible to Admin";
    }

    @GetMapping({"/user"})
    public String forUser(){
        return "This URL is only accessible to the User";
    }

    @GetMapping({"/merchant"})
    public String forMerchant(){
        return "This URL is only accessible to the Merchant";
    }
}
