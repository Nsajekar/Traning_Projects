package com.euronet.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.euronet.main.domain.LoginDetails;
import com.euronet.main.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = {RequestMethod.POST})
	public String showLoginPage() {
		return "Login";
	}

	@RequestMapping("validateuser")
	public String validateUser(@RequestParam String userName,
			@RequestParam String userPassword, Model model) {

		List<LoginDetails> allLogin = loginService.getLoginDetails();
		for (LoginDetails loginDetails : allLogin) {
			if (userName.equals(loginDetails.getLoginUsername())
					&& userPassword.equals(loginDetails.getLoginPassword())) {
				model.addAttribute("message", "Hello  " + userName);
				System.out.println(loginDetails.getLoginPage());
				return loginDetails.getLoginPage();
			}
		}
		return "failure";

	}
}
