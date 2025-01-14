package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.RoleDetails;

public interface RoleDetailsRepositoryInterface {

	public List<RoleDetails> getAllRoles();

	public RoleDetails getRoleByRoleId(int roleId);
	
	public RoleDetails getRoleByRoleName(String roleName);
	
}
