package com.kon.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// 사용자
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String nickname;
    private int age;
}
