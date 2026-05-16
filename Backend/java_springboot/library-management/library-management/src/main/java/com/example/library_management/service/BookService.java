package com.example.library_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.library_management.model.Book;
import com.example.library_management.model.Author;
import com.example.library_management.repository.BookRepository;
import com.example.library_management.repository.AuthorRepository;
import com.example.library_management.dto.BookRequestDTO;
import com.example.library_management.dto.BookResponseDTO;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    @Autowired
    private AuthorRepository authorRepo;

    // ➕ Add Book
    public BookResponseDTO addBook(BookRequestDTO dto) {

        Author author = authorRepo.findById(dto.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author not found"));

        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setPrice(dto.getPrice());
        book.setCategory(dto.getCategory());
        book.setFormat(dto.getFormat());
        book.setPublishDate(dto.getPublishDate());
        book.setTags(dto.getTags());
        book.setAuthor(author);

        Book savedBook = repo.save(book);

        return convertToDTO(savedBook);
    }

    // 📄 Get All Books
    public List<BookResponseDTO> getAllBooks() {
        return repo.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // 🔍 Get Book by ID
    public BookResponseDTO getBookById(Long id) {
        Book book = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        return convertToDTO(book);
    }

    // ✏️ Update Book
    public BookResponseDTO updateBook(Long id, BookRequestDTO dto) {

        Book book = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        Author author = authorRepo.findById(dto.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author not found"));

        book.setTitle(dto.getTitle());
        book.setPrice(dto.getPrice());
        book.setCategory(dto.getCategory());
        book.setFormat(dto.getFormat());
        book.setPublishDate(dto.getPublishDate());
        book.setTags(dto.getTags());
        book.setAuthor(author);

        Book updatedBook = repo.save(book);

        return convertToDTO(updatedBook);
    }

    // ❌ Delete Book
    public void deleteBook(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Book not found");
        }
        repo.deleteById(id);
    }

    // 🔍 Search Books
    public List<BookResponseDTO> searchBooks(String keyword) {
        return repo.findByTitleContaining(keyword)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // 🔁 Convert Entity → DTO
    private BookResponseDTO convertToDTO(Book book) {

        if (book == null) return null;

        BookResponseDTO dto = new BookResponseDTO();

        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setPrice(book.getPrice());
        dto.setCategory(book.getCategory());
        dto.setFormat(book.getFormat());
        dto.setPublishDate(book.getPublishDate());
        dto.setTags(book.getTags());

        if (book.getAuthor() != null) {
            dto.setAuthorName(book.getAuthor().getName());
        }

        return dto;
    }
}