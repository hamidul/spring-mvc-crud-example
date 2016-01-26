package com.proliferay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;  

import com.proliferay.model.Book;
import com.proliferay.service.BookService;  
 
@Controller 

public class BookController {          
	
	@Autowired
	private BookService bookService;      

	@RequestMapping("/")
	public String showHomePage(Model model) {
		List<Book> bookList = bookService.findAllBooks();
		model.addAttribute("bookList",bookList);
		return "home";
	}
	
	@RequestMapping(value="/addBook.htm",method=RequestMethod.GET)
	public String viewAddBookPage(Model model) {
		model.addAttribute("command",new Book());  
		return "add_book";
	}
	
	@RequestMapping(value="/addBook.htm",method=RequestMethod.POST)
	public ModelAndView addBook(@ModelAttribute Book book) {
		bookService.addBook(book);
		return new ModelAndView("redirect:/"); 
	}
	
	@RequestMapping(value="/deleteBook/{id}",method=RequestMethod.GET)
	public ModelAndView deleteBook(@PathVariable("id") int bookId) {
		bookService.deleteBook(bookId);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/viewEditPage/{id}",method=RequestMethod.GET)
	public String viewEditPage(@PathVariable("id") int bookId,Model model) { 
		Book book = bookService.findById(bookId);
		
		model.addAttribute("command",book);
		return "edit_book";
	}
	
	@RequestMapping(value="/editBook.htm",method=RequestMethod.POST)
	public ModelAndView editBook(@ModelAttribute Book book) {
		bookService.updateBook(book);
		return new ModelAndView("redirect:/");
	}
}
