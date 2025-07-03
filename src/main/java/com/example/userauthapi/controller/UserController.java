package com.example.userauthapi.controller;

import com.example.userauthapi.dto.UserRegisterRequest;
import com.example.userauthapi.dto.UserResponse;
import com.example.userauthapi.entity.User;
import com.example.userauthapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 이메일로 유저 조회
    @GetMapping("/email")
    public UserResponse getUserByEmail(@RequestParam String email) {
        return userService.getUserByEmail(email);
    }

    // 유저네임으로 유저 조회
    @GetMapping("/username")
    public UserResponse getUserByUsername(@RequestParam String username) {
        return userService.getUserByUsername(username);
    }

    // 회원 가입 (User 등록)
    @PostMapping("/signup")
    public UserResponse signup(@RequestBody UserRegisterRequest request) {
        User savedUser = userService.createUser(request.toEntity());
        return UserResponse.from(savedUser);
    }

    // 회원 가입 (User 등록)
//    @PostMapping("/signup")
//    public User signup(@RequestBody UserRegisterRequest request) {
//        User savedUser = userService.createUser(request.toEntity());
//        return savedUser;
//    }
}
