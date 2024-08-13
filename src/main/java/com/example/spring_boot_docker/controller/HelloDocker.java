package com.example.spring_boot_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Docker !";
    }
}
