package com.example.springbootjpaexercise.repository;

import com.example.springbootjpaexercise.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
