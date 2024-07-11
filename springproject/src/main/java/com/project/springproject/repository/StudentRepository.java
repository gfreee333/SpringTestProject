package com.project.springproject.repository;

import com.project.springproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository присваивается автоматически благодаря наследуемости
public interface StudentRepository extends JpaRepository<Student, Long> {
void deleteByEmail (String string);
Student findByEmail(String string);
}
