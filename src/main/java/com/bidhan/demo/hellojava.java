package com.bidhan.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class hellojava {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
    
    
}
