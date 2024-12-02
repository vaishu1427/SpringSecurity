package com.virtusa.SpringSecurity.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int id;
    private String name;
    private String designation;

    public User(int id, String name, String designation) {
        this.name = name;
        this.designation = designation;
        this.id = id;
    }


}
