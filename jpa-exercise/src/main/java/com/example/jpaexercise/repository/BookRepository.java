package com.example.jpaexercise.repository;

import com.example.jpaexercise.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, Long> {
}
