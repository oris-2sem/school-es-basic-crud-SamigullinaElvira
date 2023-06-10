package com.example.schoolesbasiccrud.repositories;

import com.example.schoolesbasiccrud.models.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<Timetable, Long> {
}
