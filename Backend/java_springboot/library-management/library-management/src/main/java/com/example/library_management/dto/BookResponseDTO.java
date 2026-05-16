package com.example.library_management.dto;

import java.time.LocalDate;
import java.util.List;

public class BookResponseDTO {

    private Long id;
    private String title;
    private double price;
    private LocalDate publishDate;
    private String category;
    private String format;
    private List<String> tags;
    private String authorName;

    // ✅ GETTERS

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

    public String getAuthorName() {
        return authorName;
    }

    // ✅ SETTERS

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

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}