package com.day7ver2proj1phase2.helloproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/info")
    public String information(){
    return "This is a simple Spring Boot project demo.";
    }
}
