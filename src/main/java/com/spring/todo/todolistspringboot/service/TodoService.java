package com.spring.todo.todolistspringboot.service;

import java.util.List;

import com.spring.todo.todolistspringboot.model.TodoDTO;

public interface TodoService {

    public List<TodoDTO> getAllTodos();

    public TodoDTO getSingleTodo(String id);

    public void createTodo(TodoDTO todo);

    public void updateTodo(String id, TodoDTO todo);

    public void deleteTodoById(String id);
}
