package com.luanalves.todo_list.repositories;

import com.luanalves.todo_list.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
