package com.kon.controller;

import com.kon.entity.User;
import com.kon.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    // 회원가입
    @PostMapping("/register")
    public void insertUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    // 사용자 정보 조회
    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        User user = userService.getUserById(id);
        log.debug("조회된 사용자: {}", user);
        return user;
    }
}
