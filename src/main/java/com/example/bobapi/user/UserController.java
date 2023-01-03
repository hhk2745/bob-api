package com.example.bobapi.user;

import com.example.bobapi.user.service.UserService;
import com.example.bobapi.user.vo.SignupRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("")
    public Object signup(@RequestBody SignupRequestVo signupRequestVo){
        return userService.signup(signupRequestVo);
    }
}
