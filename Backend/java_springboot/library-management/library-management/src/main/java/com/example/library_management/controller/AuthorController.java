package com.example.library_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.library_management.model.Author;
import com.example.library_management.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService service;

    // ➕ Add Author
    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return service.addAuthor(author);
    }

    // 📄 Get All Authors
    @GetMapping
    public List<Author> getAuthors() {
        return service.getAllAuthors();
    }

    // 🔍 Get Author by ID
    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return service.getAuthorById(id);
    }

    // ❌ Delete Author
    @DeleteMapping("/{id}")
    public String deleteAuthor(@PathVariable Long id) {
        service.deleteAuthor(id);
        return "Author deleted successfully";
    }
}