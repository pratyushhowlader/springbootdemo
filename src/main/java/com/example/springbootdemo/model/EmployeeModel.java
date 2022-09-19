package com.example.springbootdemo.model;

import javax.persistence.*;

@Entity(name="Employee")
public class EmployeeModel {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    /*@Column(name="first_name")*/
    String firstName;
   /* @Column(name="last_name")*/
    String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="emp_add",referencedColumnName = "id")
    Address address;


}
