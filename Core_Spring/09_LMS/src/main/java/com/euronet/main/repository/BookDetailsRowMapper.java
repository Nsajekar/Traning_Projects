package com.euronet.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.euronet.main.domain.BookDetails;

public class BookDetailsRowMapper implements RowMapper<BookDetails> {

	@Override
	public BookDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int bookcode = rs.getInt("book_code");
		String title = rs.getString("title");
		String auther = rs.getString("auther");
		double price =rs.getDouble("price");
		boolean isIssuable = rs.getBoolean("is_issuable");
		return new BookDetails(bookcode, title, auther, price, isIssuable);
	}

}
