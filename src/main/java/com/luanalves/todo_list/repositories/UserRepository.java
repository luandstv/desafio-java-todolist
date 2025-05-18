package com.luanalves.todo_list.repositories;

import com.luanalves.todo_list.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
