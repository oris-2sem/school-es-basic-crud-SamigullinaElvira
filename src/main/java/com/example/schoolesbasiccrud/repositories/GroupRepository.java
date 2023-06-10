package com.example.schoolesbasiccrud.repositories;

import com.example.schoolesbasiccrud.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
