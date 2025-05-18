package com.luanalves.todo_list.controllers;

import com.luanalves.todo_list.entities.Task;
import com.luanalves.todo_list.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TasksController {

    private final TaskService service;

    public TasksController(TaskService service){
        this.service = service;
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> findAll () {
        List<Task> tasks = service.listAll();
        return ResponseEntity.ok(tasks);
    }
}
