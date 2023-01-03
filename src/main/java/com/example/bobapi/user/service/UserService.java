package com.example.bobapi.user.service;

import com.example.bobapi.user.mapper.UserRepository;
import com.example.bobapi.user.vo.SignupRequestVo;
import com.example.bobapi.user.vo.SignupResultVo;
import com.example.bobapi.util.Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRepository userRepository;

    public SignupResultVo signup(SignupRequestVo signupRequestVo){
        try{
            String loremText = Utils.getLoremText(10);
            signupRequestVo.setUserNick(loremText);
            SignupResultVo pUserInfoIns = userRepository.pUserInfoIns(signupRequestVo);
            return pUserInfoIns;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
