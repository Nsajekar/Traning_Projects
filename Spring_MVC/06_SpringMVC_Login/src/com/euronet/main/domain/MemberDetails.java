package com.euronet.main.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MemberDetails {

	private int memberCode;
	private String firstName;
	private String lastName;
	private RoleDetails roleDetails;
	private int bookIssuedCount;
	private boolean approvalStatus;
	private String username;
	private String password;
	
	public MemberDetails() {
		// TODO Auto-generated constructor stub
	}

	public MemberDetails(int memberCode, String firstName, String lastName,
			RoleDetails roleDetails, int bookIssuedCount,
			boolean approvalStatus, String username, String password) {
		super();
		this.memberCode = memberCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roleDetails = roleDetails;
		this.bookIssuedCount = bookIssuedCount;
		this.approvalStatus = approvalStatus;
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the memberCode
	 */
	public int getMemberCode() {
		return memberCode;
	}

	/**
	 * @param memberCode the memberCode to set
	 */
	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the roleDetails
	 */
	public RoleDetails getRoleDetails() {
		return roleDetails;
	}

	/**
	 * @param roleDetails the roleDetails to set
	 */
	public void setRoleDetails(RoleDetails roleDetails) {
		this.roleDetails = roleDetails;
	}

	/**
	 * @return the bookIssuedCount
	 */
	public int getBookIssuedCount() {
		return bookIssuedCount;
	}

	/**
	 * @param bookIssuedCount the bookIssuedCount to set
	 */
	public void setBookIssuedCount(int bookIssuedCount) {
		this.bookIssuedCount = bookIssuedCount;
	}

	/**
	 * @return the approvalStatus
	 */
	public boolean isApprovalStatus() {
		return approvalStatus;
	}

	/**
	 * @param approvalStatus the approvalStatus to set
	 */
	public void setApprovalStatus(boolean approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MemberDetails [memberCode=" + memberCode + ", firstName="
				+ firstName + ", lastName=" + lastName + ", roleDetails="
				+ roleDetails + ", bookIssuedCount=" + bookIssuedCount
				+ ", approvalStatus=" + approvalStatus + ", username="
				+ username + ", password=" + password + "]";
	}

	
}