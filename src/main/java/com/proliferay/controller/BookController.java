package com.proliferay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proliferay.model.Book;
import com.proliferay.service.BookService;

@Controller 

public class BookController {   
	
	
	@Autowired
	private BookService bookService;

	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("bookService=============>"+bookService); 
		
		Book book = new Book();
		book.setAuthorName("Hamidul Islam");
		book.setBookTitle("Pro Liferay");
		book.setBookPrice(100);
		book.setIsbn(200);
		book.setBookDescription("Sample Book"); 
		bookService.addBook(book);
		
		return "home";
	}
}
