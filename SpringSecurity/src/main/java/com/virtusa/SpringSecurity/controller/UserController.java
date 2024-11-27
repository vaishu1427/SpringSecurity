package com.virtusa.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String getMessage(){
        return "Anyway it's gonna be hard. Let's face it.";
    }
}
