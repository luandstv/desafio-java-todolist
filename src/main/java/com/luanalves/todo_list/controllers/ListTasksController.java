package com.luanalves.todo_list.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ListTasksController {

    @GetMapping("/tasks")
    public String helloWorld(){
        return "hello, world! sera que agora vai?";
    }
}
