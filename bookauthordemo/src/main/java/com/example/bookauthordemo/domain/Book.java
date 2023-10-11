package com.example.bookauthordemo.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    private String title;
    private String isbn;
    @ManyToOne
    private Publisher publisher;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBook;

    @ManyToMany
    @JoinTable(name= "author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id"))
    private Set<Author> authors = new HashSet<>();

    public Book() {
    }




    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;

    }
}
