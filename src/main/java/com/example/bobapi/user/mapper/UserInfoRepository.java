package com.example.bobapi.user.mapper;

import com.example.bobapi.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserInfoRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserId(String userId);

}
