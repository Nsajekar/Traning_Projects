package com.euronet.main.service;

import java.util.List;

import com.euronet.main.domain.BookDetails;

public class BookDetailsService implements BookDetailsServiceInterface {

	@Override
	public boolean addNewBookDetails(BookDetails bookDetails) {
		return false;
	}

	@Override
	public BookDetails getBookDetailsByBookCode(int bookcode) {
		// TODO Auto-generated method stub
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
