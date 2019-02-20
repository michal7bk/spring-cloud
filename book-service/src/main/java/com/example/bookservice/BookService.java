package com.example.bookservice;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    private List<Book> bookList = Arrays.asList(
            new Book(1L, "Baeldung goes to the market", "Tim Schimandle"),
            new Book(2L, "Baeldung goes to the park", "Slavisa")
    );

    List<Book> getBookList() {
        return bookList;
    }

    Book getBookById(Long bookId) {
        return bookList.stream().filter(b -> b.getId().equals(bookId)).findFirst().orElse(null);

    }

}
