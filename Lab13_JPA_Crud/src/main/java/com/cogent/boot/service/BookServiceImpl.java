package com.cogent.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.boot.pojo.Book;
import com.cogent.boot.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepo bookRepo;
	
	
	@Override
	public void addBook(Book book) {
		bookRepo.save(book);
	}

	@Override
	public void deleteBookById(Long bookId) {
		bookRepo.deleteById(bookId);
	}

	@Override
	public Book getBookById(Long bookId) {
		return bookRepo.getById(bookId);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	
/// STILL PENDING
	@Override
	public void updateBookById(Long bookId, Book book) {
		//bookRepo.updateById(bookId, book);
	}

}
