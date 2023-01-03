package com.example.bobapi.user.mapper;

import com.example.bobapi.user.vo.SignupRequestVo;
import com.example.bobapi.user.vo.SignupResultVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    SignupResultVo pUserInfoIns(SignupRequestVo signupRequestVo);
}
