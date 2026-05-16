package com.example.library_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.library_management.model.Author;
import com.example.library_management.repository.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repo;

    // ➕ Add Author
    public Author addAuthor(Author author) {
        return repo.save(author);
    }

    // 📄 Get All Authors
    public List<Author> getAllAuthors() {
        return repo.findAll();
    }

    // 🔍 Get Author by ID
    public Author getAuthorById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // ❌ Delete Author
    public void deleteAuthor(Long id) {
        repo.deleteById(id);
    }
}
