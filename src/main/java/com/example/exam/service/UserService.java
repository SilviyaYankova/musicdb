package com.example.exam.service;

import com.example.exam.model.entity.UserEntity;
import com.example.exam.model.service.UserServiceModel;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findUserByUsernameAndPassword(String username, String password);

    UserEntity findById(Long id);
}
