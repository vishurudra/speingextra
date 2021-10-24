package com.example.demotransactions.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;

@Service
public class FileService1 {

    @Transactional(rollbackFor = IOException.class,propagation = Propagation.REQUIRED)
    public boolean perform() throws IOException {
        File file = new File("C://springboot//1.txt");
        try {

            file.createNewFile();
        } catch (IOException e) { e.printStackTrace();
            throw e;
        }
        return true;
    }
}
