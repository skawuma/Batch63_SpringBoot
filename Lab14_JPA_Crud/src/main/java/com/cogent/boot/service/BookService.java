package com.cogent.boot.service;

import java.util.List;

import com.cogent.boot.pojo.Book;

public interface BookService {
	public void addBook(Book book);
	public void deleteBookById(Long bookId);
	public Book getBookById(Long bookId);
	public List<Book> getAllBooks();
	public void updateBookById(Long bookId, Book book);
}
