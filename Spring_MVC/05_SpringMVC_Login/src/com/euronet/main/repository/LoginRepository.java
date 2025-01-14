package com.euronet.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.euronet.main.domain.LoginDetails;

@Repository
public class LoginRepository implements LoginRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplet;

	private static final String GET_ALL_LOGIN_DETAILS = "select * from login_details";

	@Override
	public List<LoginDetails> getLoginDetails() {
		List<LoginDetails> allbooks = jdbcTemplet.query(GET_ALL_LOGIN_DETAILS,
				new LoginDetailsRowMapper());
		return allbooks;
	}

}
