package com.spring.todo.todolistspringboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TodoException extends ResponseStatusException {

    private static final long serialVersionUID = 1L;

    public TodoException(HttpStatus status, String menssage) {
        super(status, menssage);
    }

}