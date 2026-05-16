package com.example.employee_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employee_backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}