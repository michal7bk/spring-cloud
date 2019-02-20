package com.example.bookservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")

public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<Book> findAllBooks() {
        return bookService.getBookList();
    }


    @GetMapping("/{bookId}")
    public Book findBook(@PathVariable Long bookId) {
        return bookService.getBookById(bookId);
    }


}
