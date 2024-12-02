package com.virtusa.SpringSecurity.controller;

import com.virtusa.SpringSecurity.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private List<User> users = new ArrayList<>(List.of(
            new User(1,"Vaishu","Developer"),
            new User(2,"Ammu","Tester")
    ));

    @GetMapping("/")
    public String getMessage(HttpServletRequest request) {
        return "Anyway it's gonna be hard. Let's face it. "+ request.getSession().getId();
    }

    @GetMapping("/user")
    public String getMessage1(HttpSession session) {
        return "Hi "+ session.getId();
    }

    @GetMapping("/getListOfusers")
    public List<User> getListOfUsers(){
        return users;
    }

    @PostMapping("/addUser")
    public List<User> addUser(@RequestBody User user){
        users.add(user);
        return users;
    }
}
