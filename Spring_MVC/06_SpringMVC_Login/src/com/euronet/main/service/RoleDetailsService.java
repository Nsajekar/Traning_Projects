package com.euronet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euronet.main.domain.RoleDetails;
import com.euronet.main.repository.RoleDetailsRepositoryInterface;

@Service
public class RoleDetailsService implements RoleDetailsServiceInterface {
	@Autowired
	private RoleDetailsRepositoryInterface roleDetailsRepositoryInterface;

	@Override
	public List<RoleDetails> getAllRoles() {
		return roleDetailsRepositoryInterface.getAllRoles();
	}

	@Override
	public RoleDetails getRoleByRoleId(int roleId) {
		return roleDetailsRepositoryInterface.getRoleByRoleId(roleId);
	}

	@Override
	public RoleDetails getRoleByRoleName(String roleName) {
		System.out.println("inside roleservice");
		return roleDetailsRepositoryInterface.getRoleByRoleName(roleName);
	}

}
