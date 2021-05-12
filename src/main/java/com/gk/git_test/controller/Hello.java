package com.gk.git_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(){
        Test test = new Test();
        test.setAge(10);
        System.out.println(test.toString());
        return "hello java11";
    }
}
