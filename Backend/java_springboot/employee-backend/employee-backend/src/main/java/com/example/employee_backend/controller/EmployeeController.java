package com.example.employee_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employee_backend.model.Employee;
import com.example.employee_backend.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // CREATE
    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        return service.saveEmployee(emp);
    }

    // READ ALL
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
        return service.updateEmployee(id, emp);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
    }
}