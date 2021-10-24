package com.training.demomvcjpa.service;

import com.training.demomvcjpa.entity.User;
import com.training.demomvcjpa.model.UserDto;
import com.training.demomvcjpa.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public boolean saveUser(UserDto user) {
        User entity = new User();
        entity.setUserId(user.getUserId());
        entity.setAge(user.getAge());
        entity.setName(user.getName());
        entity.setSalary(user.getSalary());
        User stored =userRepository.save(entity);
        return true;
    }

    @Override
    public List<UserDto> getAll() {
        List<UserDto> userDtos = new ArrayList<>();
        userRepository.findAll().forEach(
                entity->{UserDto userDto = new UserDto
                        (entity.getUserId(), entity.getSalary(), entity.getAge(), entity.getName());
                    userDtos.add(userDto);});;
        return userDtos;
    }
}
