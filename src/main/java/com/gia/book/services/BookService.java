package com.gia.book.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gia.book.models.BookModel;
import com.gia.book.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    	
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<BookModel> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public BookModel createBook(BookModel b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public BookModel findBook(Long id) {
        Optional<BookModel> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	public BookModel updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		BookModel book = new BookModel(title, desc, lang, numOfPages);
		book.setId(id);
		bookRepository.save(book);
		return null;
	}
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}
}
