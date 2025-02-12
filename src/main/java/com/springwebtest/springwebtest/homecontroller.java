package com.springwebtest.springwebtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
    @RequestMapping("/")
    public String greet(){
        return "Hi!, This is Surya Teja";
    }
    @RequestMapping("/about")
    public String about(){
        return "Hi!, This is about Surya Teja";
    }
}
