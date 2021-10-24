package com.example.demomvc.controllers;

import com.example.demomvc.model.Emp;
import com.example.demomvc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/listemp")
    public Collection<Emp> listAll(){
        return empService.getAll();
    }

    @PostMapping("/createemp")
    public  boolean create(@RequestBody Emp emp){
        return empService.create(emp);
    }
}
