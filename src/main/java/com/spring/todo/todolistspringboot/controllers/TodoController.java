package com.spring.todo.todolistspringboot.controllers;

import java.util.List;

import com.spring.todo.todolistspringboot.dto.TodoDTO;
import com.spring.todo.todolistspringboot.interfaces.ITodoService;
import com.spring.todo.todolistspringboot.model.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private ITodoService service;
    
    @PostMapping("/todos")
    @ResponseStatus(HttpStatus.CREATED)
    public String createTodo(@RequestBody TodoDTO todoDTO){
        return service.createTodo(todoDTO);
    }


    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return service.getAllTodos();
    }


    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable String id){
        return service.getTodoById(id);
    }


    @PutMapping("/todos/{id}")
    public Todo update(@PathVariable String id, @RequestBody TodoDTO todoDTO){
        return service.updateTodo(id, todoDTO);
    }


    @DeleteMapping("/todos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTodoById(@PathVariable String id){
        service.deleteTodoById(id);
    }

}
