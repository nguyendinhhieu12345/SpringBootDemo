package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// thông báo đây là controller để map api của class này
@RestController
public class HelloSpringBootApplication {
    @GetMapping("/hello")
    String sayHello() {
        return "Hello world!";
    }
}
