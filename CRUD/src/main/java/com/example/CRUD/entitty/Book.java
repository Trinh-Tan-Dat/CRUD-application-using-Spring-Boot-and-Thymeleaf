package com.example.CRUD.entitty;

import lombok.Data;
@Data
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;    

    public Book() {
    }
    public Book(int id, String title, String author, String publisher, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Book id(int id) {
        this.id = id;
        return this;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Book title(String title) {
        this.title = title;
        return this;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Book author(String author) {
        this.author = author;
        return this;
    }
    public String getPublisher() {
        return publisher;
    }  
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Book publisher(String publisher) {
        this.publisher = publisher;
        return this;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Book isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", author='" + getAuthor() + "'" +
            ", publisher='" + getPublisher() + "'" +
            ", isbn='" + getIsbn() + "'" +
            "}";
    }
    

}
