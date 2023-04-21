package com.poc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetMeNowApplication {

    @GetMapping("/greet")
    public String sayHello(){
        Return "Hello Dear! How are you ?";
    }
}
