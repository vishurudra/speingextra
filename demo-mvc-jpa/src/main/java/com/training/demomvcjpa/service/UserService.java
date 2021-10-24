package com.training.demomvcjpa.service;

import com.training.demomvcjpa.entity.User;
import com.training.demomvcjpa.model.UserDto;

import java.util.List;

public interface UserService {

    boolean saveUser(UserDto user);

    List<UserDto> getAll();
}
