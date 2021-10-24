package com.training.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @GetMapping(value = "/welcome")
    public String welcome(){
        return " Welcome to the world of microservices with bSpring boot";
    }

    @GetMapping(value = "/hellouser")
    public  String helloUser(@RequestParam String user){
        return "Hello "+user;
    }
    @GetMapping(value = "/sum")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b){
        return a+b;
    }

}
