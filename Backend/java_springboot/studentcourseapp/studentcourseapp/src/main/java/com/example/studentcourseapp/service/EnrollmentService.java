package com.example.studentcourseapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.studentcourseapp.model.Enrollment;
import com.example.studentcourseapp.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository repo;

    public List<Enrollment> getAllEnrollments() {
        return repo.findAll();
    }

    public void saveEnrollment(Enrollment enrollment) {
        repo.save(enrollment);
    }
}