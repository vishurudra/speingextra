package com.training.demomvcjpa.controller;

import com.training.demomvcjpa.model.UserDto;
import com.training.demomvcjpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/saveuser")
    public boolean saveUser(@RequestParam String userId, @RequestParam Double salary,
                            @RequestParam int age,
                            @RequestParam String name) {
        return userService.saveUser(new UserDto(userId, salary, age, name));
    }

    @GetMapping(value = "/listall")
    public List<UserDto> listAll() {
        return userService.getAll();
    }
}
