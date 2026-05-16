package com.example.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library_management.model.Author;  // ✅ FIXED

public interface AuthorRepository extends JpaRepository<Author, Long> {

}