package com.kon.entity;

import lombok.Data;

import java.time.LocalDateTime;

//to-do list 설계
@Data
public class TodoItem {
    private Long id;
    private String userId; //User와 연관관계 (FK)
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
