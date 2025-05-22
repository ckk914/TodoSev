package com.kon.mapper;

import com.kon.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertUser(User user);           // 회원가입
    User selectUserById(String id);       // ID로 사용자 조회
    User selectUserByUsername(String username); // username으로 사용자 조회 (중복 체크 등)
}