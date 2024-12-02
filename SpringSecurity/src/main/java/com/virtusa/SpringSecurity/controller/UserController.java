package com.virtusa.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String getMessage(HttpServletRequest request) {
        return "Anyway it's gonna be hard. Let's face it. "+ request.getSession().getId();
    }

    @GetMapping("/user")
    public String getMessage1(HttpSession session) {
        return "Hi "+ session.getId();
    }
}
