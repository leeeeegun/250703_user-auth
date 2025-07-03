package com.example.userauthapi.dto;

import com.example.userauthapi.entity.User;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Getter
@ToString
public class UserResponse {
    private final Long id;
    private final String email;
    private final String username;

    public UserResponse(Long id, String email, String username) {
        this.id = id;
        this.email = email;
        this.username = username;
    }

    public static UserResponse from(User user) {
        UserResponse userResponse = new UserResponse(user.getId(), user.getEmail(), user.getUsername());
        System.out.println(userResponse.toString());
        log.info("유저 리스폰 정보 {}",userResponse.toString());
        return userResponse;
    }
}