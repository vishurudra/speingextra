package com.example.demoprofile.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(value = "env",havingValue = "dev")
@Service
public class DevServiceImpl implements ProfileService {
    @Override
    public String getProfile() {
        return "DEV env";
    }
}
