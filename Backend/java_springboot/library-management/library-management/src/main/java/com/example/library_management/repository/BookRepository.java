package com.example.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library_management.model.Book;  // ✅ FIXED
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContaining(String keyword);

    List<Book> findByCategory(String category);
}