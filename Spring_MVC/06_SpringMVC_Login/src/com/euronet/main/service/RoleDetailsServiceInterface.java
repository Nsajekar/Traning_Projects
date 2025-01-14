package com.euronet.main.service;

import java.util.List;

import com.euronet.main.domain.RoleDetails;

public interface RoleDetailsServiceInterface {

	public List<RoleDetails> getAllRoles();

	public RoleDetails getRoleByRoleId(int roleId);
	
	public RoleDetails getRoleByRoleName(String roleName);

}
