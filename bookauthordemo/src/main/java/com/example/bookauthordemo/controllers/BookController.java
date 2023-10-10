package com.example.bookauthordemo.controllers;

import com.example.bookauthordemo.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    private final IBookService iBookService;
    @Autowired
    public BookController(IBookService iBookService) {
        this.iBookService = iBookService;
    }

    @GetMapping("/books")
    public String getBooks() {
        return "somos el mejor equipo C-14";
    }
}
