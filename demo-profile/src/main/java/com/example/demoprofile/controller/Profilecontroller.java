package com.example.demoprofile.controller;

import com.example.demoprofile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Profilecontroller {

    @Autowired
    ProfileService profileService;

    @GetMapping("/")
    public String hello(){
        return "Hello   "+profileService.getProfile();
    }
}
