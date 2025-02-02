package com.euronet.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.euronet.main.domain.MemberDetails;

public class MemberDetailsRowMapper implements RowMapper<MemberDetails> {

	@Override
	public MemberDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		int membercode = rs.getInt("member_code");
		String firstname = rs.getString("first_name");
		String lastname = rs.getString("last_name");
		String membertype = rs.getString("member_type");
		int bookissuecount = rs.getInt("book_issue_count");
		
		return new MemberDetails(membercode, firstname, lastname, membertype,
				bookissuecount);
	}

}
