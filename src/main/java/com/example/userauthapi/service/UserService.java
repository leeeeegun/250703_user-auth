package com.example.userauthapi.service;

import com.example.userauthapi.dto.UserResponse;
import com.example.userauthapi.entity.User;

public interface UserService {
    User createUser(User user);

    UserResponse getUserByEmail(String email);
    UserResponse getUserByUsername(String username);
}