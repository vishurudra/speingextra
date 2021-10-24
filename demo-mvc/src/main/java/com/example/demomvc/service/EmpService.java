package com.example.demomvc.service;

import com.example.demomvc.model.Emp;

import java.util.Collection;

public interface EmpService {

    boolean create(Emp emp);

    Collection<Emp> getAll();
}
