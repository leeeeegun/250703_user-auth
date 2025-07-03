package com.example.userauthapi.dto;

import com.example.userauthapi.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRegisterRequest {
    private String email;
    private String password;
    private String username;

    public User toEntity() {
        return User.builder()
                .email(this.email)
                .username(this.username)
                .password(this.password)
                .build();
    }
}
