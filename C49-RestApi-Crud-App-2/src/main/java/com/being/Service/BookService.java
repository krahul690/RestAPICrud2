package com.being.Service;

import java.util.List;

import com.being.Entity.Book;

public interface BookService {

	public String upsartBook(Book book);
	public List<Book> getAllBooks();
//	public String updateBook(Book book);
	public String deleteBook(Integer bookId);
}
