package com.example.demo2.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class testController {

    @GetMapping("/test")
    public String getMethodName() {
        return "working";
    }

    @GetMapping("/test2")
    public String getMethodName1() {
        return "working2";
    }
    
    
    
}
