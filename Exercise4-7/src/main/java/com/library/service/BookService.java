package com.library.service;

import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;
@Service
public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        System.out.println("Service is performed.");
    }
}

