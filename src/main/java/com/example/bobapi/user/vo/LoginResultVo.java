package com.example.bobapi.user.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResultVo {
    private String userNo;
    private String userId;
    private String userPw;
    private String userNick;
}
