package com.euronet.main.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import net.bytebuddy.asm.Advice.Local;

import org.springframework.jdbc.core.RowMapper;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.domain.BookIssueDetails;
import com.euronet.main.domain.MemberDetails;

public class BookIssueDetailsMapper implements RowMapper<BookIssueDetails> {

	@Override
	public BookIssueDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int bookissuecode = rs.getInt("issue_serial_number");
	    LocalDate issuedate = rs.getDate("issue_date").toLocalDate();
	    LocalDate returndate = rs.getDate("return_date").toLocalDate();
	    
	    int bookcode = rs.getInt("book_code");
		String title = rs.getString("title");
		String auther = rs.getString("auther");
		double price =rs.getDouble("price");
		boolean isIssuable = rs.getBoolean("is_issuable");
		BookDetails bookDetails =new BookDetails(bookcode, title, auther, price, isIssuable);
		
		int membercode = rs.getInt("member_code");
		String firstname = rs.getString("first_name");
		String lastname = rs.getString("last_name");
		String membertype = rs.getString("member_type");
		int bookissuecount = rs.getInt("book_issue_count");
		
		MemberDetails memberDetails = new MemberDetails(membercode, firstname, lastname, membertype, bookissuecount);
	    
		BookIssueDetails bookIssueDetails = new BookIssueDetails(bookissuecode, issuedate, returndate, bookDetails, memberDetails);
		
		return bookIssueDetails;
	}

}
