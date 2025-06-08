package com.kon.service;

import com.kon.entity.User;
import com.kon.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        log.debug("Impl실행");
        userMapper.insertUser(user);
    }

    @Override
    public User getUserById(String id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }
}
