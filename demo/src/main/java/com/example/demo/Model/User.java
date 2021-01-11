package com.example.demo.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
