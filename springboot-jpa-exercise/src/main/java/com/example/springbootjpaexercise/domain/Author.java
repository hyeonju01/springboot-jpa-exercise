package com.example.springbootjpaexercise.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    private Long id; //book entity의 authorId와 매핑될 필드
    private String name;

}