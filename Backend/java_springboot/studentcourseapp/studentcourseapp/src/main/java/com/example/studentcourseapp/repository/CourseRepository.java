package com.example.studentcourseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentcourseapp.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}