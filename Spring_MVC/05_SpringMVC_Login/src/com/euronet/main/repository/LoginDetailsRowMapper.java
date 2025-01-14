package com.euronet.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.euronet.main.domain.LoginDetails;

public class LoginDetailsRowMapper implements RowMapper<LoginDetails> {

	@Override
	public LoginDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int loginId = rs.getInt("login_id");
		String loginUserName = rs.getString("login_username");
		String loginPassword = rs.getString("login_password");
		String loginPage = rs.getString("login_page");
      LoginDetails details = new LoginDetails(loginId, loginUserName, loginPassword, loginPage);
		return details;
	}

}
