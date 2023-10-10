package com.example.bookauthordemo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    private String title;
    private String isbn;
    private String publisher;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBook;

    public Book() {
    }

    public Book(String title, String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }
}
