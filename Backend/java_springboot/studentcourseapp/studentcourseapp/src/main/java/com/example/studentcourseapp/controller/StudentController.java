package com.example.studentcourseapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.studentcourseapp.model.Student;
import com.example.studentcourseapp.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    // Show all students
    @GetMapping("/")
    public String viewHome(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "index";
    }

    // Show add form
    @GetMapping("/add")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    // Save student
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        service.saveStudent(student);
        return "redirect:/";
    }

    // Delete student
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
        return "redirect:/";
    }
    
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Student student = service.getStudentById(id);
        model.addAttribute("student", student);
        return "edit-student";
    }
    
    @GetMapping("/search")
    public String searchStudent(@RequestParam String keyword, Model model) {
        model.addAttribute("students", service.search(keyword));
        return "index";
    }
    
}
