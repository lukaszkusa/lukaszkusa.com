package com.example.demo.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    @OrderBy
    protected Set schools = new HashSet<School>();

    public User() {
    }

}
