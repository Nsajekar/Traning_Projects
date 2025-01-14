package com.euronet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euronet.main.domain.LoginDetails;
import com.euronet.main.repository.LoginRepositoryInterface;

@Service
public class LoginService implements LoginServiceInterface {
	@Autowired
	private LoginRepositoryInterface loginRepositoryInterface;

	@Override
	public List<LoginDetails> getLoginDetails() {
		return loginRepositoryInterface.getLoginDetails();
	}

}
