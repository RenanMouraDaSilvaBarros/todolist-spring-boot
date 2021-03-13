package com.spring.todo.todolistspringboot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todos")
public class Todo {
    @Id
    private String id;

    private String todo;

    private String description;

    private Boolean completed;

    private Date createdAt;

    private Date updatedAt;
}
