package com.example.demoprofile.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(value = "env",havingValue = "qa")
@Service
public class QAServiceImpl implements ProfileService {
    @Override
    public String getProfile() {
        return "qa env";
    }
}
