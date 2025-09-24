package com.example.demo2.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class testController {

    @GetMapping("/test")
    public String getMethodName() {
        return "workingt1-t2-t3-t4-t5-t6";
    }

    @GetMapping("/test2")
    public String getMethodName1() {
        return "working2(feature/t1)";
    }
    
    
    
}
