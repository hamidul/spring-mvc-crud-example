package com.proliferay.dao;

import java.util.List;

import com.proliferay.model.Book;

public interface BookDao {

	Book findById(int bookId);

	List<Book> findAllBooks();

	void addBook(Book book);

	void deleteBook(int bookId);
	
	void updateBook(Book book);

}
