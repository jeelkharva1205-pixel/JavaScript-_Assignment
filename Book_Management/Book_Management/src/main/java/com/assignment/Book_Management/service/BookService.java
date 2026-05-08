package com.assignment.Book_Management.service;

import com.assignment.Book_Management.dto.BookResponseDto;
import com.assignment.Book_Management.entity.Books;

import java.util.List;

public interface BookService {

    BookResponseDto findById(Long id);

    BookResponseDto saveBook(Books book);

    BookResponseDto updateBook(Books book);

    void deleteBook(Books book);

    List<BookResponseDto> getAllBooks();

    List<BookResponseDto> getAllBooksByAuthor(String author);
}

