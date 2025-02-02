package com.euronet.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.euronet.main.domain.BookDetails;

@Repository
// Act as a @Component
public class BookDetailsRepository implements BookDetailsRepositoryInterface {
	@Autowired
	private JdbcTemplate jdbctemplet;
	
	private static final String ADD_NEW_BOOK_DETAILS = 
			"insert into book_details(title,auther,price,is_issuable) values (?,?,?,?)";
	
	private static final String GET_SINGLE_BOOK_BY_BOOK_CODE = 
			"select * from book_details where book_code = ? ";
	
	private static final String UPDATE_ISSUE_STATUS_BY_BOOK_CODE = 
			"update  book_details set is_issuable = ? where book_code =? ";
	
	private static final String GET_ALL_BOOK_DETAILS = 
			"select * from book_details";

	@Override
	public boolean addNewBookDetails(BookDetails bookDetails) {
		Object [] params = {bookDetails.getTitle(),bookDetails.getAuthor(),bookDetails.getPrice(),bookDetails.isIssueable()};
		int count = jdbctemplet.update(ADD_NEW_BOOK_DETAILS, params);
		if(count>0){
			return true;
		}
		return false;
	}

	@Override
	public BookDetails getBookDetailsByBookCode(int bookcode) {
		BookDetails bookDetails = jdbctemplet.queryForObject(GET_SINGLE_BOOK_BY_BOOK_CODE, new BookDetailsRowMapper(), bookcode);
				return bookDetails;
	}

	@Override
	public boolean updateIssueStatusByBookCode(BookDetails bookDetails) {
		Object [] params = {bookDetails.isIssueable(),bookDetails.getBookCode()};
		int count = jdbctemplet.update(UPDATE_ISSUE_STATUS_BY_BOOK_CODE, params);
		if(count > 0){
			return true;
		}
		return false;
	}

	@Override
	public List<BookDetails> getallBookDetails() {
		List<BookDetails> allbooks = jdbctemplet.query(GET_ALL_BOOK_DETAILS, new BookDetailsRowMapper());
		return allbooks;
	}

}
