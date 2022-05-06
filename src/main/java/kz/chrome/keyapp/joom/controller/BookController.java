package kz.chrome.keyapp.joom.controller;

import kz.chrome.keyapp.joom.model.book;
import kz.chrome.keyapp.joom.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("books")
    public List<book> getAll() {
        return bookRepository.findAll();
    }
}
