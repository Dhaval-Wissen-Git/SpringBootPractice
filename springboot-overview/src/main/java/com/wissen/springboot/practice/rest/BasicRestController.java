package com.wissen.springboot.practice.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @GetMapping("/")
    public String HelloWorld() {
        return "Hello World";
    }
}
