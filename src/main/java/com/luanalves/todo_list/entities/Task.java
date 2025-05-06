package com.luanalves.todo_list.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Boolean completed;

    public Task() {
    }
    public Task(Long id, String title, String description, Boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    // poderia utilizar do lombok e passar os 
    // @NoArgsConstructor
    // @AllArgsConstructor
    // annotations acima para nao precisar descrever os construtores

}


