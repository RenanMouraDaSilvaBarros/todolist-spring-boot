package com.spring.todo.todolistspringboot.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

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

    @NotNull(message="Todo não pode ser null")
    private String todo;

    @NotNull(message="Description não pode ser null")
    private String description;

    @NotNull(message="Completed não pode ser null")
    private Boolean completed;

    private Date createdAt;

    private Date updatedAt;
}
