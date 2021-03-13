package com.spring.todo.todolistspringboot.interfaces;

import java.util.List;

import com.spring.todo.todolistspringboot.dto.TodoDTO;
import com.spring.todo.todolistspringboot.model.Todo;


public interface TodoService {

    public List<Todo> getAllTodos();

    public Todo getTodoById(String id);

    public String createTodo(TodoDTO todo);

    public Todo updateTodo(String id, TodoDTO todo);

    public void deleteTodoById(String id);
}
