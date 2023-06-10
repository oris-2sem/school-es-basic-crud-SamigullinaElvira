package com.example.schoolesbasiccrud.repositories;

import com.example.schoolesbasiccrud.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
