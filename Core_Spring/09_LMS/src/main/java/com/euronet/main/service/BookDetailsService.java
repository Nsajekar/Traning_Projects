package com.euronet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.repository.BookDetailsRepositoryInterface;

@Service
// Act as a Component
public class BookDetailsService implements BookDetailsServiceInterface {

	@Autowired
	private BookDetailsRepositoryInterface bookDetailsRepositoryInterface;

	@Override
	public boolean addNewBookDetails(BookDetails bookDetails) {
		return bookDetailsRepositoryInterface.addNewBookDetails(bookDetails);
	}

	@Override
	public BookDetails getBookDetailsByBookCode(int bookcode) {
		return bookDetailsRepositoryInterface
				.getBookDetailsByBookCode(bookcode);
	}

	@Override
	public boolean updateIssueStatusByBookCode(BookDetails bookDetails) {
		return bookDetailsRepositoryInterface
				.updateIssueStatusByBookCode(bookDetails);
	}

	@Override
	public List<BookDetails> getallBookDetails() {
		return bookDetailsRepositoryInterface.getallBookDetails();
	}

}
