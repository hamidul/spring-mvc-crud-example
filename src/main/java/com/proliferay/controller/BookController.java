package com.proliferay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proliferay.service.BookService;

@Controller 

public class BookController {   
	
	
	@Autowired
	private BookService bookService;

	@RequestMapping("/")
	public String showHomePage() {
		return "home";
	}
}
