package com.example.library_management.model;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;   // 🔥 must be "name"

    private String email;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Book> books;
    // ✅ getters

    public Long getId() {
        return id;
    }

    public String getName() {   // 🔥 REQUIRED
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Book> getBooks() {
        return books;
    }

    // ✅ setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {   // 🔥 REQUIRED
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}