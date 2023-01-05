package com.example.bobapi.user;

import com.example.bobapi.security.JwtTokenProvider;
import com.example.bobapi.security.MemberService;
import com.example.bobapi.security.TokenInfo;
import com.example.bobapi.user.mapper.UserInfoRepository;
import com.example.bobapi.user.service.UserService;
import com.example.bobapi.user.vo.SignupRequestVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final MemberService memberService;

    private final UserService userService;
    private final UserInfoRepository userInfoRepository;
    private final JwtTokenProvider jwtTokenProvider;

    @PostMapping("")
    public Object signup(@RequestBody SignupRequestVo signupRequestVo){
        return userService.signup(signupRequestVo);
    }

    @PostMapping("/login")
    public TokenInfo login(@RequestBody Map<String, String> user) {
        TokenInfo tokenInfo = memberService.login(user.get("userid"), user.get("password"));
        Cookie cookie = new Cookie("bob_refresh", tokenInfo.getRefreshToken());
        cookie.setMaxAge(60 * 60 * 24);
        return tokenInfo;
    }

}
