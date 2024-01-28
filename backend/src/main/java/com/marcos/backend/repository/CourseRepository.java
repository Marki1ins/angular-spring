package com.marcos.backend.repository;

import org.springframework.stereotype.Repository;

import com.marcos.backend.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
