package com.luanalves.todo_list.controllers;

import com.luanalves.todo_list.entities.User;
import com.luanalves.todo_list.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> findAll(){
        List<User> users = service.listAll();
        return ResponseEntity.ok(users);
    }
}
