package com.kon.mapper;

import com.kon.entity.TodoItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoItemMapper {
    void insertTodoItem(TodoItem todoItem);
    TodoItem selectTodoItemById(Long id);
    List<TodoItem> selectTodoItemsByUserId(String userId);
    void updateTodoItem(TodoItem todoItem);
    void deleteTodoItem(Long id);
}
