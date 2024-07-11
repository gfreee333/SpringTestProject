package com.project.springproject.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.LocalDate;
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private LocalDate dateOfBirth;
    @Transient
    private int age;
}
