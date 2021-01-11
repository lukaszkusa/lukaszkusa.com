package com.example.demo.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    protected String name;
    protected String speciality;
    protected String direction;
    protected String diplomaWork;
    protected String degree;
    protected String startDate;
    protected String endDate;

    public School() {
    }
}
