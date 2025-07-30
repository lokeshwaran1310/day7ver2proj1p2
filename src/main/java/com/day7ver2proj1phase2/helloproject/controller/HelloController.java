package com.day7ver2proj1phase2.helloproject.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hellomessage(){
        return "Hello from Spring Boot!";
    }

}
