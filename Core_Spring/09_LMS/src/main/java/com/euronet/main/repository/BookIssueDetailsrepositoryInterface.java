package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.BookIssueDetails;

public interface BookIssueDetailsrepositoryInterface {

	boolean issueNewBook(BookIssueDetails  bookIssueDetails);
	
	List<BookIssueDetails> getAllIssueDetails();
	
}
