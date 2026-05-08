package com.assignment.Book_Management.service.impl;
import com.assignment.Book_Management.dto.BookResponseDto;
import com.assignment.Book_Management.entity.Books;
import com.assignment.Book_Management.repository.BookRepository;
import com.assignment.Book_Management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceimpl implements BookService {

    @Autowired
   BookRepository bookrepo;

    @Override
    public BookResponseDto findById(Long id) {
        Optional <Books> book = bookrepo.findById(id);
        return maptoDto(book.get());
    }

    @Override
    public BookResponseDto saveBook(Books book) {
       Books savedBook = bookrepo.save(book);
        return maptoDto(savedBook);
    }

    @Override
    public BookResponseDto updateBook(Books book) {
        Books updatedBook = bookrepo.save(book);
        return maptoDto(updatedBook);
    }

    @Override
    public void deleteBook(Books book) {
        bookrepo.delete(book);
    }

    @Override
    public List<BookResponseDto> getAllBooks() {
        List<Books> books = bookrepo.findAll();
        List<BookResponseDto> bookList = new ArrayList<>();
        for (Books book : books) {
            bookList.add(maptoDto(book));
        }
        return bookList;
    }

    @Override
    public List<BookResponseDto> getAllBooksByAuthor(String author) {
//      List<Books> books = bookrepo.findBookByAuthorName(author);
//       List<Books> books = bookrepo.findBookByAuthor(author);
      List<Books> books = bookrepo.findByAuthor(author);
        List<BookResponseDto> bookList = new ArrayList<>();
        for (Books book : books) {
            bookList.add(maptoDto(book));
        }
        return bookList;
    }

    private BookResponseDto maptoDto(Books book) {
        BookResponseDto dto = new BookResponseDto();

        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setPublishYear(book.getPublishYear());

        return dto;
    }
}


