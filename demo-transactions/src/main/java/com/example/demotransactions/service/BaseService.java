package com.example.demotransactions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class BaseService {

    @Autowired
    FileService1 fileService1;

    @Autowired
    FileService2 fileService2;

    @Transactional(rollbackFor = IOException.class,
            propagation = Propagation.REQUIRED)
    public  void perform() throws IOException {
        fileService1.perform();
        fileService2.perform();

    }
}
