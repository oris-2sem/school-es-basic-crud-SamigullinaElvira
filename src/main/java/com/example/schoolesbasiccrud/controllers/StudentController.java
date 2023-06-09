package com.example.schoolesbasiccrud.controllers;

import com.example.schoolesbasiccrud.models.Student;
import com.example.schoolesbasiccrud.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student st = studentRepository.save(student);

        return ResponseEntity.of(Optional.of(st));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        return ResponseEntity.of(studentRepository.findById(id));
    }
}
