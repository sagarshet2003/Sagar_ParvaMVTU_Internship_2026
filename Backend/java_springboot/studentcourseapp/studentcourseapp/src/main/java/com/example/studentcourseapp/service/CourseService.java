package com.example.studentcourseapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.studentcourseapp.model.Course;
import com.example.studentcourseapp.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    public void saveCourse(Course course) {
        repo.save(course);
    }
}