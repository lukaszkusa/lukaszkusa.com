package com.example.demo.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class User {
    protected String name;
    protected String lastName;
    protected String email;
    protected String city;
    protected String phone;
    @Column(length = 900)
    protected String about;


    protected String github;
    protected String linkedin;
    protected String skype;

    public User() {
    }

}
