package com.project.springproject.service.impl;

import com.project.springproject.model.Student;
import com.project.springproject.repository.MemoryStudent;
import com.project.springproject.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Primary
public class MemoryStudentService implements StudentService {
    private final MemoryStudent repository;
    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
        // Реализуем хранение данных в памяти приложения
        //return List.of(Student.builder().firstName("Anna").lastName("Koletaeva").age(21).email("koletaeva@gmail.com").build(),
        //        Student.builder().firstName("Ivan").lastName("Chuha").age(21).email("chuh@gmail.com").build()
        //);
    }
    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }
    @Override
    public Student findEmail(String email) {
        return repository.findEmail(email);
    }
    @Override
    public void deleteStudent(String email) {
    repository.deleteStudent(email);
    }
    @Override
    public Student uppdateStudent(Student student) {
        return repository.uppdateStudent(student);
    }
}
