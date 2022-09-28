package com.example.springbootdemo;

import com.example.springbootdemo.model.Student;
import com.example.springbootdemo.model.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.BDDAssertions.then;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentClassTest {
    @Autowired
private  StudentRepo studentRepo;

    @Test
    public void testStudent(){
        assert (true);
        Student studentSave = studentRepo.save(Student.builder().id(1).name("prasun").build());
        Student student = studentRepo.getStudentByName("prasun");
        then(student.getId()).isNotNull();
        then(student.getName()).isEqualTo(studentSave.getName());
        /*Student student = studentRepo.getStudentByName("prasun");
        System.out.println(student);
        then(student.getId()).isNotNull();
        then(student.getName()).isEqualTo(studentSave.getName("prasun"));*/

    }

}
