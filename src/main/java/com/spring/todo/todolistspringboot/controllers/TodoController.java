package com.spring.todo.todolistspringboot.controllers;

import com.spring.todo.todolistspringboot.dto.TodoDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    
    @PostMapping("/todos")
    public void createTodo(@RequestBody TodoDTO todoDTO){
        System.out.println(todoDTO.toString());
    }


    @GetMapping("/todos")
    public void getAllTodos(){
        System.out.println("");
    }


    @GetMapping("/todos/{id}")
    public void getTodoById(@PathVariable String id){
        System.out.println(id);
    }


    @PutMapping("/todos/{id}")
    public void update(@PathVariable String id, @RequestBody TodoDTO todoDTO){
        System.out.println(id);
        System.out.println(todoDTO);
    }


    @DeleteMapping("/todos/{id}")
    public void deleteTodoById(@PathVariable String id){
        System.out.println(id);
    }

}
