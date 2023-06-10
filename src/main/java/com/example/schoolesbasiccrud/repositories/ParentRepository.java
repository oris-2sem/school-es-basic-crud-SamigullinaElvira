package com.example.schoolesbasiccrud.repositories;

import com.example.schoolesbasiccrud.models.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
