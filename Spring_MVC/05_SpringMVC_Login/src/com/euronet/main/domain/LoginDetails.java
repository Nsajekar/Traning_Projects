package com.euronet.main.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LoginDetails {

	private int loginId;
	private String loginUsername;
	private String loginPassword;
	private String loginPage;

	public LoginDetails() {
	}

	public LoginDetails(int loginId, String loginUsername,
			String loginPassword, String loginPage) {
		super();
		this.loginId = loginId;
		this.loginUsername = loginUsername;
		this.loginPassword = loginPassword;
		this.loginPage = loginPage;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getLoginUsername() {
		return loginUsername;
	}

	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	@Override
	public String toString() {
		return "LoginDetails [loginId=" + loginId + ", loginUsername="
				+ loginUsername + ", loginPassword=" + loginPassword
				+ ", loginPage=" + loginPage + "]";
	}

}
