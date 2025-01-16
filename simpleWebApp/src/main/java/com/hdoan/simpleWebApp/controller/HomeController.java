package com.hdoan.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println("Im here...");
        return "Welcome to Telusko!";
    }

    @RequestMapping("/about")
    public String about(){
        return "We dont teach, we Educate!!";
    }
}
