package com.project.springproject.repository;

import com.project.springproject.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class MemoryStudent {
    private final List<Student> STUDENTS = new ArrayList<>();

    public List<Student> findAllStudent() {
        return STUDENTS;
    }
    public Student saveStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }
    public Student findEmail(String email) {
        return STUDENTS.stream().filter(element -> element.getEmail().equals(email)).
                findFirst().orElse(null);
    }

    public void deleteStudent(String email) {
    var student = findEmail(email);
    if(student != null){
        STUDENTS.remove(student);
    }
    }

    public Student uppdateStudent(Student student) {
        var studentIndex = IntStream.range(0,STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst().orElse(-1);
        if(studentIndex > -1){
            STUDENTS.set(studentIndex,student);
            return student;
        }
        return null;
    }
}
