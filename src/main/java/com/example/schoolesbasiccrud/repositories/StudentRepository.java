package com.example.schoolesbasiccrud.repositories;

import com.example.schoolesbasiccrud.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
