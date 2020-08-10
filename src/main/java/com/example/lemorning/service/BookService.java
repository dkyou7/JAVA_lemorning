package com.example.lemorning.service;

import com.example.lemorning.domain.Book;
import com.example.lemorning.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public List<Book> getBookList() {
        return bookRepository.findAll();
    }
}
