package com.spring.todo.todolistspringboot.controllers;

import com.spring.todo.todolistspringboot.dto.TodoDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    
    @PostMapping("/todos")
    public void createTodo(TodoDTO todoDTO){
        System.out.println(todoDTO.toString());
    }


    @GetMapping("/todos")
    public void getAllTodos(){
        System.out.println("");
    }


    @GetMapping("/todos/{id}")
    public void getTodoById(String id){
        System.out.println(id);
    }


    @PutMapping("/todos/{id}")
    public void update(String id, TodoDTO todoDTO){

    }


    @DeleteMapping("/todos/{id}")
    public void deleteTodoById(String id){
        System.out.println(id);
    }

}
