package com.example.library_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.library_management.service.BookService;
import com.example.library_management.dto.BookRequestDTO;
import com.example.library_management.dto.BookResponseDTO;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    // ➕ Add Book (DTO)
    @PostMapping
    public BookResponseDTO addBook(@RequestBody BookRequestDTO dto) {
        return service.addBook(dto);
    }

    // 📄 Get All Books (DTO)
    @GetMapping
    public List<BookResponseDTO> getBooks() {
        return service.getAllBooks();
    }

    // 🔍 Get Book by ID (DTO)
    @GetMapping("/{id}")
    public BookResponseDTO getBook(@PathVariable Long id) {
        return service.getBookById(id);
    }

    // ✏️ Update Book (DTO)
    @PutMapping("/{id}")
    public BookResponseDTO updateBook(@PathVariable Long id, @RequestBody BookRequestDTO dto) {
        return service.updateBook(id, dto);
    }

    // ❌ Delete Book
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
        return "Book deleted successfully";
    }

    // 🔍 Search Books (DTO)
    @GetMapping("/search")
    public List<BookResponseDTO> searchBooks(@RequestParam String keyword) {
        return service.searchBooks(keyword);
    }
}