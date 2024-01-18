package com.example.CRUD.controller;

import com.example.CRUD.entitty.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable; // Added import for @PathVariable
@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private List<Book> books;
    
    @GetMapping
    public String listBook(Model model) {
        model.addAttribute("books", books);
        return "book/list";
    }
    
    @GetMapping("/add")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "book/add";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute Book book) {
        books.add(book);
        return "redirect:/books";
    }
    
    @GetMapping("/edit/{id}")
    public String editBook(@ModelAttribute Book book, @PathVariable Long id, Model model) {
        model.addAttribute("book", books.get(id.intValue()));
        return "book/edit";
    }
    @PostMapping("/edit")
    public String editBook(@ModelAttribute Book book) {
        books.set(book.getId(), book);
        return "redirect:/books";
    }
    
    
    
        
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        books.remove(id.intValue());
        return "redirect:/books";

    }
    
}
        
    
