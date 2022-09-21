package com.example.springbootdemo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student getStudentByName(String name);
}
