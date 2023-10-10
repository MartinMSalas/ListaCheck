package com.example.bookauthordemo.services;

import com.example.bookauthordemo.domain.Book;

public interface IBookService {
    Iterable<Book> findAll();
}
