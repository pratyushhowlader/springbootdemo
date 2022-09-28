package com.example.springbootdemo.model;

import lombok.*;

import javax.annotation.security.RolesAllowed;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private int id;
    private String name;


}
