package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.BookDetails;

public class BookDetailsRepository implements BookDetailsRepositoryInterface {

	@Override
	public boolean addNewBookDetails(BookDetails bookDetails) {
		return false;
	}

	@Override
	public BookDetails getBookDetailsByBookCode(int bookcode) {
		return null;
	}

	@Override
	public boolean updateIssueStatusByBookCode(BookDetails bookDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookDetails> getallBookDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
