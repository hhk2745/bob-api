package com.example.bobapi.user.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestVo {
    private String userId;
    private String userPw;
}
