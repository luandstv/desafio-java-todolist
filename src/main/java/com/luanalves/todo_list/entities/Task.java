package com.luanalves.todo_list.entities;

import jakarta.persistence.*;

import java.util.Objects;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}


