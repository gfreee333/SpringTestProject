package com.project.springproject.service;

import com.project.springproject.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findEmail(String email);
    void deleteStudent(String email);
    Student uppdateStudent(Student student);

}
