package com.example.studentcourseapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.studentcourseapp.model.Student;
import com.example.studentcourseapp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public void saveStudent(Student student) {
        repo.save(student);
    }

    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
    
    public List<Student> search(String keyword) {
        return repo.findByNameContainingIgnoreCase(keyword);
    }
}