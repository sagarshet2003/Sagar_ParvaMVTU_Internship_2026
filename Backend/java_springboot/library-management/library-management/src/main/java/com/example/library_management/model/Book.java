package com.example.library_management.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private double price;
    private LocalDate publishDate;

    private String category;
    private String format;

    @ElementCollection
    private List<String> tags;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonBackReference
    private Author author;

    // ✅ GETTERS AND SETTERS (VERY IMPORTANT)

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getCategory() {
        return category;
    }

    public String getFormat() {
        return format;
    }

    public List<String> getTags() {
        return tags;
    }

    public Author getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}