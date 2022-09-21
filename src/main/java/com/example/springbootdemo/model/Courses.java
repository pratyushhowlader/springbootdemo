package com.example.springbootdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Courses {
    @Id
    private int id1;
    private String title;
    @ManyToOne
    @JoinColumn(name = "techer_id",referencedColumnName = "id")
    Teacher teacher;
}
