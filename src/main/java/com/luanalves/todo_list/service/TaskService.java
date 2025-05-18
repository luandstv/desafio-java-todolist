package com.luanalves.todo_list.service;

import com.luanalves.todo_list.entities.Task;
import com.luanalves.todo_list.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> listAll(){
        return taskRepository.findAll();
    }
}
