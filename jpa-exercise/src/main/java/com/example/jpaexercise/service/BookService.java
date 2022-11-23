package com.example.jpaexercise.service;

import com.example.jpaexercise.domain.Book;
import com.example.jpaexercise.dto.BookResponse;
import com.example.jpaexercise.repository.AuthorRepository;
import com.example.jpaexercise.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public List<BookResponse> findBooks(Pageable pageable){
        Page<Book> books = bookRepository.findAll(pageable);
        List<BookResponse> bookResponse = books.stream()
                .map( book ->
                        BookResponse.of(book)
                ).collect(Collectors.toList());
        return bookResponse;
    }


}
