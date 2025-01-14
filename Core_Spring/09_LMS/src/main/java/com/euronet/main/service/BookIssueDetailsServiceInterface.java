package com.euronet.main.service;

import java.util.List;

import com.euronet.main.domain.BookIssueDetails;

public interface BookIssueDetailsServiceInterface {
boolean issueNewBook(BookIssueDetails  bookIssueDetails);
	
	List<BookIssueDetails> getAllIssueDetails();
}
