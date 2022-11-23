package com.example.springbootjpaexercise.service;

import com.example.springbootjpaexercise.controller.BookRestController;
import com.example.springbootjpaexercise.domain.Author;
import com.example.springbootjpaexercise.domain.Book;
import com.example.springbootjpaexercise.dto.BookResponse;
import com.example.springbootjpaexercise.repository.AuthorRepository;
import com.example.springbootjpaexercise.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    // mapping 구현하기
    public List<BookResponse> findBooks(Pageable pageable) {
        //pageable 객체를 받아 paging하여 findAll query를 실행한다. (기본값= 20)
        Page<Book> books = bookRepository.findAll(pageable);
        //stream bookresponse dto로 바꾸는 과정이다. Of, toentity 작업과 동일하다.
        //맵핑 사용하지 않아서 book의 authorid로 매번 findbyid를 한다. 좋지 않은 구조.
        List<BookResponse> bookResponses = books.stream()
                .map(book -> {
                    Optional<Author> optionalAuthor = authorRepository.findById(book.getAuthorId());
                    return BookResponse.of(book, optionalAuthor.get().getName());
                }).collect(Collectors.toList()); //book을 모아서 리스트로 작성한다.
        return bookResponses;
    }
}
