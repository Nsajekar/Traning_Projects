package com.euronet.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.euronet.main.domain.MemberDetails;
import com.euronet.main.domain.RoleDetails;

public class MemberDetailsRowMapper implements RowMapper<MemberDetails> {

	@Override
	public MemberDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int memberId = rs.getInt("member_code");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		int roleId = rs.getInt("role_id");
		int bookIssuedCount = rs.getInt("book_issue_count");
		boolean approvalStatus = rs.getBoolean("approval_Status");
		String username = rs.getString("user_name");
		String password = rs.getString("pass_word");
		RoleDetails roleDetails = new RoleDetails();
		roleDetails.setRoleId(roleId);
		return new MemberDetails(memberId, firstName, lastName, roleDetails,
				bookIssuedCount, approvalStatus, username, password);
	}

}
