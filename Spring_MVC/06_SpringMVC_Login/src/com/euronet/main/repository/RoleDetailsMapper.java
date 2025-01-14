package com.euronet.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.euronet.main.domain.RoleDetails;

public class RoleDetailsMapper implements RowMapper<RoleDetails> {

	@Override
	public RoleDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int roleId = rs.getInt("role_id");
		String roleName =rs.getString("role_name");
		String rolePage =rs.getString("role_page");
		return new RoleDetails(roleId, roleName, rolePage);
	}

}
