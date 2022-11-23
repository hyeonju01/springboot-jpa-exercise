package com.example.jpaexercise.repository;

import com.example.jpaexercise.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
