package com.example.employee_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_backend.model.Employee;
import com.example.employee_backend.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // CREATE
    public Employee saveEmployee(Employee emp) {
        return repository.save(emp);
    }

    // READ ALL
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // READ BY ID
    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    // UPDATE
    public Employee updateEmployee(int id, Employee emp) {
        Employee existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(emp.getName());
            existing.setEmail(emp.getEmail());
            existing.setDepartment(emp.getDepartment());
            return repository.save(existing);
        }
        return null;
    }

    // DELETE
    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}