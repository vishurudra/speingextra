package com.training.demo.service;

import com.training.demo.model.Emp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpServiceImpl implements  EmpService{
    @Override
    public Emp getEmp(String name, int age, Double salary) {
        Emp emp = new Emp();
        emp.setAge(age);
        emp.setName(name);
        emp.setSalary(salary);


        return emp;
    }

    @Override
    public List<Emp> getAllEmps() {
        List<Emp> empList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Emp emp = new Emp();
            emp.setAge(i);
            emp.setName("i" + i);
            emp.setSalary(i * 10.0);
            empList.add(emp);

        }

        return empList;    }
}
