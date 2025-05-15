package com.kon.service;

import com.kon.entity.TodoItem;
import com.kon.mapper.TodoItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class TodoItemService {
    @Autowired
    private TodoItemMapper todoItemMapper;

    public void addTodoItem(TodoItem todoItem) {
//        todoItem.setCreateAt(LocalDateTime.now());
//        todoItem.setUpdateAt(LocalDateTime.now());
        todoItemMapper.insertTodoItem(todoItem);
    }

    public TodoItem getTodoItem(Long id) {
        return todoItemMapper.selectTodoItemById(id);
    }

    public List<TodoItem> getTodoItemsByUserId(String userId) {
        return todoItemMapper.selectTodoItemsByUserId(userId);
    }

    public void updateTodoItem(TodoItem todoItem) {
//        todoItem.setUpdateAt(LocalDateTime.now());
        todoItemMapper.updateTodoItem(todoItem);
    }

    public void deleteTodoItem(Long id) {
        todoItemMapper.deleteTodoItem(id);
    }
}
