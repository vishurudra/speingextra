package com.training.demomvcjpa.model;

import lombok.Data;

@Data
public class UserDto {
    public UserDto(String userId, Double salary, Integer age, String name) {
        this.userId = userId;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }
    public  UserDto(){

    }

    String userId;
    Double salary;
    Integer age;
    String name;
}
