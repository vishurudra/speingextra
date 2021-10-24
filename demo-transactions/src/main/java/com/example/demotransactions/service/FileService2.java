package com.example.demotransactions.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;

@Service
public class FileService2 {

    @Transactional(rollbackFor = IOException.class,propagation = Propagation.REQUIRED)
    public boolean perform() throws IOException {
        File file = new File("C://springboot//2.txt");
        try {
            if(file.exists())
                throw  new IOException();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return true;
    }
}
