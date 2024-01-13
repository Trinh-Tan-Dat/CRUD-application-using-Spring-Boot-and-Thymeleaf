package com.example.CRUD;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.CRUD.entitty.Book;
import java.util.ArrayList;
import java.util.List;
@Configuration
public class AppConfig {
    @Bean
    public List<Book> getBook(){
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1);
        book1.setTitle("The Hobbit");
        book1.setAuthor("J.R.R. Tolkien");
        book1.setPublisher("George Allen & Unwin");
        book1.setIsbn("978-0261102217");
        books.add(book1);

        Book book2 = new Book();
        book2.setId(2);
        book2.setTitle("The Fellowship of the Ring");
        book2.setAuthor("J.R.R. Tolkien");
        book2.setPublisher("George Allen & Unwin");
        book2.setIsbn("978-0261102354");
        books.add(book2);

        Book book3 = new Book();
        book3.setId(3);
        book3.setTitle("The Two Towers");
        book3.setAuthor("J.R.R. Tolkien");
        book3.setPublisher("George Allen & Unwin");
        book3.setIsbn("978-0261102361");
        books.add(book3);

        return books;
    }
}
