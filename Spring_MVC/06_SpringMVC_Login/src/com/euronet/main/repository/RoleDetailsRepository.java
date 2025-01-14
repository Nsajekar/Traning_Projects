package com.euronet.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.euronet.main.domain.RoleDetails;

@Repository
public class RoleDetailsRepository implements RoleDetailsRepositoryInterface {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String GET_ROLE_DETAILS_BY_ROLE_ID= "select * from role_details where role_id=? ";
	private static final String GET_ALL_ROLE_DETAILS = "select * from role_details";
	private static final String GET_ROLE_DETAILS_BY_ROLE_NAME= "select * from role_details where role_name=? ";


	@Override
	public List<RoleDetails> getAllRoles() {
		List<RoleDetails> allRoles = jdbcTemplate.query(GET_ALL_ROLE_DETAILS,
				new RoleDetailsMapper());
		return allRoles;

	}

	@Override
	public RoleDetails getRoleByRoleId(int roleId) {
		RoleDetails details = jdbcTemplate.queryForObject(
				GET_ROLE_DETAILS_BY_ROLE_ID, new RoleDetailsMapper(),roleId);
		return details;
	}

	@Override
	public RoleDetails getRoleByRoleName(String roleName) {
		System.out.println("inside getRoleByRoleName");
		RoleDetails details = jdbcTemplate.queryForObject(
				GET_ROLE_DETAILS_BY_ROLE_NAME, new RoleDetailsMapper(),roleName);
		System.out.println(details);
		return details;
	}

}
