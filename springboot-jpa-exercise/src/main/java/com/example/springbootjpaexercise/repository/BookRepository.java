package com.example.springbootjpaexercise.repository;

import com.example.springbootjpaexercise.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
