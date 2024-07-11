package com.project.springproject.service.impl;

import com.project.springproject.model.Student;
import com.project.springproject.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService implements com.project.springproject.service.StudentService {
    private final StudentRepository repository;
    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);
    }

    @Override
    public Student uppdateStudent(Student student) {
        return repository.save(student);
    }
}
