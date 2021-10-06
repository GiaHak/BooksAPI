package com.gia.book.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gia.book.models.BookModel;
import com.gia.book.services.BookService;

@Controller
public class BookController {
    private final BookService bookService;
    
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
        List<BookModel> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }
    @RequestMapping("/books/show/{Id}")
    public String show(Model model, @PathVariable("Id")Long Id) {
    	 BookModel book = bookService.findBook(Id);
         model.addAttribute("book", book);
    	return "show.jsp";
    }
}
