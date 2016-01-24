package com.proliferay.service;

import java.util.List;

import com.proliferay.model.Book;

public interface BookService { 
	Book findById(int bookId);

	List<Book> findAllBooks();

	void addBook(Book book);

	void deleteBook(int bookId);
}
