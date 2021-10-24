package com.training.demo.service;

import com.training.demo.model.Emp;

import java.util.List;

public interface EmpService {

    Emp getEmp(String name, int age, Double salary);
    List<Emp> getAllEmps();
}
