package com.example.studentcourseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentcourseapp.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {
}