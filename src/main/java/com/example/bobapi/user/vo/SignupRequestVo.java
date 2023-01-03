package com.example.bobapi.user.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignupRequestVo {
    private String email;
    private String password;
    private String userNick;
}
