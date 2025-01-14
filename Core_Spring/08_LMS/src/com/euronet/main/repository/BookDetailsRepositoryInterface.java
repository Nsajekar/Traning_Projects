package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.BookDetails;

public interface BookDetailsRepositoryInterface {
	
	boolean addNewBookDetails(BookDetails bookDetails);

	BookDetails getBookDetailsByBookCode(int bookcode);

	boolean updateIssueStatusByBookCode(BookDetails bookDetails);
	
	List<BookDetails> getallBookDetails();

}
