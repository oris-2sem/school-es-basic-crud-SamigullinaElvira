package com.example.schoolesbasiccrud.repositories;

import com.example.schoolesbasiccrud.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
