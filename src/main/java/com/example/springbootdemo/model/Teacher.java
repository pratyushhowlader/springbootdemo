package com.example.springbootdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Teacher {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "teacher")
    List<Courses> courseList;
}
