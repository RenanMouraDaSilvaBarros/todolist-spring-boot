package com.spring.todo.todolistspringboot.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {

    private String todo;

    private String description;

    private Boolean completed;

    private Date createdAt;

    private Date updatedAt;
}
