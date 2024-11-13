package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "todoList";
    }

    @GetMapping("/api/vi/user")
    public String userId() {
        return "82272688";
    }
}
