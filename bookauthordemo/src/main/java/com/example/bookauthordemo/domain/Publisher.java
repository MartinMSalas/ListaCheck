package com.example.bookauthordemo.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String publisherName;

    private String city;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();
}
