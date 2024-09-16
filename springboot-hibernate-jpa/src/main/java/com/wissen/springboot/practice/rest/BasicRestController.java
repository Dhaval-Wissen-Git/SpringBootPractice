package com.wissen.springboot.practice.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @Value("${message.hello}")
    private String hello;

    @Value("${message.bye}")
    private String bye;

    @GetMapping("/")
    public String HelloWorld() {
        return hello;
    }

    @GetMapping("/quit")
    public String Quit() {
        return "Have a nice day.  " + bye;
    }
}
