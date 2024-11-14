package com.being.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.being.Entity.Book;
import com.being.Repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookrep;

	public BookServiceImpl(BookRepository bookrep) {
		this.bookrep = bookrep;
	}

	/*
	 * @Override public String upsartBook(Book book) { bookrep.save(book); if
	 * (book.getBookID() == null) { return "Record Inserted"; } return
	 * "Record Updated"; }
	 */
	/*
	 * public String upsartBook(Book book) { boolean isNew = (book.getBookID() ==
	 * null); // Check if ID is null to determine if it's a new record
	 * bookrep.save(book); // Save the book (will insert if new, update if exists)
	 * return isNew ? "Record Inserted" : "Record Updated"; }
	 */

	@Override
	public String upsartBook(Book book) {
		boolean exists = (book.getBookID() != null && bookrep.existsById(book.getBookID())); // Check if record exists
		bookrep.save(book); // Save the book (JPA will handle insert or update as needed)
		return exists ? "Record Updated" : "Record Inserted";
	}

	@Override
	public List<Book> getAllBooks() {
		return bookrep.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		bookrep.deleteById(bookId);
		return "Book Deleted";
	}

}
