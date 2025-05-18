package com.luanalves.todo_list.service;

import com.luanalves.todo_list.entities.User;
import com.luanalves.todo_list.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public List<User> listAll(){
        return repository.findAll();
    }
}
