package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.BookDetails;



public interface BookDetailsRepositoryInterface {

	BookDetails addNewBook(BookDetails bookdetails);

	BookDetails updateBookByBookId(BookDetails bookdetails);

	BookDetails getBookByBookId(int bookId);

	boolean deleteBookByBookId(int bookId);

	List<BookDetails> getAllBooks();
}
