package com.itheima.springproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello") // http://localhost:8080/hello
    public String hello(){
        System.out.println("Hello Spring");
        return "success";
    }
}
