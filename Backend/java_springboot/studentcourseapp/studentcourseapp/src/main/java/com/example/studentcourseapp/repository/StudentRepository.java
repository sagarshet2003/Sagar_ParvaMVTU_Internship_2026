package com.example.studentcourseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentcourseapp.model.Student;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByNameContainingIgnoreCase(String keyword);

}