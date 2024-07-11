package com.project.springproject.controller;

import com.project.springproject.model.Student;
import com.project.springproject.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/student")// принимает строку в качестве параметра
public class StudentController {
    private final StudentService service;
    @GetMapping
    public List<Student> findAllStudent(){
        return service.findAllStudent();
    }
    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    };
    @GetMapping("/(email)")
    public Student findEmail(@PathVariable() String email){
        return service.findEmail(email);
    };
    @DeleteMapping("delete_student/(email)")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    };
    @PutMapping("update_student")
    public Student uppdateStudent(@RequestBody Student student){
        return service.uppdateStudent(student);
    };
}
