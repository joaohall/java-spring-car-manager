package com.example.car_manager_system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class HelloControler {
    @GetMapping("/hello")
    public String hello(){
        return "Olá mundo! Cheguei ao Spring Boot";
    }
}