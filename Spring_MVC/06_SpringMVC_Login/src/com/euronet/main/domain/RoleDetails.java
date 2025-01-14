package com.euronet.main.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RoleDetails {

	private int roleId;
	private String roleName;
	private String rolePage;

	public RoleDetails() {
		// TODO Auto-generated constructor stub
	}

	public RoleDetails(int roleId, String roleName, String rolePage) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.rolePage = rolePage;
	}

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName
	 *            the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the rolePage
	 */
	public String getRolePage() {
		return rolePage;
	}

	/**
	 * @param rolePage
	 *            the rolePage to set
	 */
	public void setRolePage(String rolePage) {
		this.rolePage = rolePage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RoleDetails [roleId=" + roleId + ", roleName=" + roleName
				+ ", rolePage=" + rolePage + "]";
	}

}
