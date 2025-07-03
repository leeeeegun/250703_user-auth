package com.example.userauthapi.service;

import com.example.userauthapi.entity.User;

public interface UserService {
    User getUserByEmail(String email);
    User getUserByUsername(String username);

    // 회원 가입용
    User createUser(User user);
}
