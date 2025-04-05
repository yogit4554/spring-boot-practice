package com.yogi.simpleWebApp.controller;

import com.yogi.simpleWebApp.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to 8080 port!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is about page";
    }

}


// if you want to use controller annotation then you need to add @RequestBody along with @RequestMapping