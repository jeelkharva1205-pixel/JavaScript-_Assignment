package com.assignment.Book_Management.controller;
import com.assignment.Book_Management.dto.BookResponseDto;
import com.assignment.Book_Management.entity.Books;
import com.assignment.Book_Management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/list")
    public ResponseEntity<List<BookResponseDto>> getAllBooks() {
        try {
            return ResponseEntity.ok(bookService.getAllBooks());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDto> getBookById(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(bookService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/")
    public ResponseEntity<BookResponseDto> saveBook(@RequestBody Books book) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(bookService.saveBook(book));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/")
    public ResponseEntity<BookResponseDto> updateBook(@RequestBody Books book) {
        try {
            return ResponseEntity.ok(bookService.updateBook(book));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/")
    public ResponseEntity<Void> deleteBook(@RequestBody Books book) {
        try {
            bookService.deleteBook(book);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/byAuthor")
    public ResponseEntity<List<BookResponseDto>> getBooksByAuthor(@RequestParam(value = "author") String author) {
        try {
            return ResponseEntity.ok(bookService.getAllBooksByAuthor(author));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

