package com.spring.todo.todolistspringboot.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.spring.todo.todolistspringboot.dto.TodoDTO;
import com.spring.todo.todolistspringboot.exception.TodoException;
import com.spring.todo.todolistspringboot.interfaces.ITodoService;
import com.spring.todo.todolistspringboot.model.Todo;
import com.spring.todo.todolistspringboot.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

public class TodoServiceImpl implements ITodoService {

    @Autowired
    private TodoRepository repository;

    @Override
    public List<Todo> getAllTodos() {
        return repository.findAll();
    }

    @Override
    public Todo getTodoById(String id) {

        Optional<Todo> optional = repository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }

        throw new TodoException(HttpStatus.NOT_FOUND, "TODO não encontrado!");
    }
    

    @Override
    public String createTodo(TodoDTO todo) {
        boolean todoIsPresnt = repository.findByTodo(todo.getTodo()).isPresent();

        if(todoIsPresnt){
            throw new TodoException(HttpStatus.CONFLICT, "TODO já existente!");
        }

        Todo save = new Todo(null, todo.getTodo(), todo.getDescription(), 
                                todo.getCompleted(), new Date(), new Date());

        return repository.save(save).getId();
    }


    @Override
    public Todo updateTodo(String id, TodoDTO todo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteTodoById(String id) {
        // TODO Auto-generated method stub

    }

}
