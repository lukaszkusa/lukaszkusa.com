package com.example.demo.Model;

import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    protected String position;
    protected String company;
    protected String city;

    protected String startDate;
    protected String startEnd;

    public Work() {
    }

    @ElementCollection
    @BatchSize(size = 10)
    protected List<String> responsibilities = new ArrayList<>();

}
