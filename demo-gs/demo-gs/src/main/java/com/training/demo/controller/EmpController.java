package com.training.demo.controller;

import com.training.demo.model.Emp;
import com.training.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController {


    @Autowired
    EmpService empService;

    @GetMapping(value = "/getemp")
    public Emp getEmp(@RequestParam String name, @RequestParam int age, @RequestParam Double salary) {
        return  empService.getEmp(name,age,salary);
    }


    @GetMapping(value = "/listemps")
    public List<Emp> listEmps() {
        return  empService.getAllEmps();
    }
}
