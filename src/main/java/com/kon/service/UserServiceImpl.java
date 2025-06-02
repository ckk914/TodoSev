package com.kon.service;

import com.kon.entity.User;
import com.kon.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public void registerUser(User user) {
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
