package com.example.demomvc.service;

import com.example.demomvc.model.Emp;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmpServiceImpl implements EmpService {
    Map<String, Emp> empMap = new HashMap<>();

    @Override
    public boolean create(Emp emp) {
        empMap.put(emp.getId().toString(), emp);
        return true;
    }

    @Override
    public Collection<Emp> getAll() {
        return empMap.values();
    }
}
