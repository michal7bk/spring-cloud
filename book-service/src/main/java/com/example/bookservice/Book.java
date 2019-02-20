package com.example.bookservice;

public class Book {
    private Long id;
    private String author;
    private String tittle;

    public Book(Long id, String tittle, String author) {
        this.id = id;
        this.author = author;
        this.tittle = tittle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
