package com.example.bobapi.user.mapper;

import com.example.bobapi.user.vo.SignupRequestVo;
import com.example.bobapi.user.vo.SignupResultVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {

    @Select("CALL db_bob.p_user_info_ins(#{email}, #{password}, #{userNick})")
    SignupResultVo pUserInfoIns(SignupRequestVo signupRequestVo);

}
