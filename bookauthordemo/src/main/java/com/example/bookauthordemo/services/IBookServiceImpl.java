package com.example.bookauthordemo.services;

import com.example.bookauthordemo.domain.Book;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl implements IBookService {
    @Override
    public Iterable<Book> findAll() {
        return null;
    }
}
