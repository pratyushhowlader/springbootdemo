package com.example.springbootdemo;

import com.example.springbootdemo.model.Student;
import com.example.springbootdemo.model.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.BDDAssertions.then;

@DataJpaTest
public class StudentClassTest {
    private final StudentRepo StudentRepo;

    public StudentClassTest(com.example.springbootdemo.model.StudentRepo studentRepo) {
        StudentRepo = studentRepo;
    }

    @Test
    void testStudent(){
        Student studentSave = StudentRepo.save(new Student(1,"prasun"));
        Student student = StudentRepo.getStudentByName("prasun");

        then(student.getId()).isNotNull();
        /*then(student.getName()).isEqualTo(studentSave.getName("prasun"));*/

    }

}
