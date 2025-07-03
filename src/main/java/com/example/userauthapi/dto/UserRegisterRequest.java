package com.example.userauthapi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRegisterRequest {
    private String emil;
    private String password;
    private String username;
}
