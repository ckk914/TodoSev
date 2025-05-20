package com.kon.controller;

import com.kon.entity.TodoItem;
import com.kon.service.TodoItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoItemController {
    @Autowired
    private TodoItemService todoItemService;
    //Write
    @PostMapping
    public void createTodo(@RequestBody TodoItem todoItem) {
        todoItemService.addTodoItem(todoItem);
    }
    //1개 조회
    @GetMapping("/{id}")
    public TodoItem getTodo(@PathVariable Long id) {
        return todoItemService.getTodoItem(id);
    }
    //여러개 조회
    @GetMapping("/user/{userId}")
    public List<TodoItem> getTodosByUser(@PathVariable String userId) {
        return todoItemService.getTodoItemsByUserId(userId);
    }
    //update
    @PutMapping("/{id}")
    public void updateTodo(@PathVariable Long id, @RequestBody TodoItem todoItem) {
        todoItem.setId(id);
        todoItemService.updateTodoItem(todoItem);
    }
    //delete
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoItemService.deleteTodoItem(id);
    }
}
