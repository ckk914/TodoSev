package com.kon.service;

import com.kon.entity.User;

public interface UserService {
    void insertUser(User user);
    User getUserById(String id);
    User getUserByUsername(String username);
}