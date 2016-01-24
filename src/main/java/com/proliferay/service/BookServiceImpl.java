package com.proliferay.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proliferay.dao.BookDao;
import com.proliferay.model.Book;

@Service
public class BookServiceImpl implements BookService { 

	@Autowired
	private BookDao bookDao;

	@Override
	public Book findById(int bookId) {

		return bookDao.findById(bookId);
	}

	@Override
	public List<Book> findAllBooks() {
		return bookDao.findAllBooks();
	}

	@Override
	@Transactional
	public void addBook(Book book) {
		bookDao.addBook(book);

	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);

	}

}
