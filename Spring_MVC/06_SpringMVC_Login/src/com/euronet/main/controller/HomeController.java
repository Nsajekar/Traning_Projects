package com.euronet.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.euronet.main.domain.MemberDetails;
import com.euronet.main.domain.RoleDetails;
import com.euronet.main.service.MemberDetailsServiceInterface;
import com.euronet.main.service.RoleDetailsServiceInterface;

@Controller
public class HomeController {
	@Autowired
	private MemberDetailsServiceInterface memberDetailsServiceInterface;
	@Autowired
	private RoleDetailsServiceInterface roleDetailsServiceInterface;

	@RequestMapping("/")
	public String showLoginPage() {
		return "homepage";
	}

	@RequestMapping("registrationpage")
	public String showRegistrationpage() {
		return "registrationpage";
	}

	@RequestMapping("confirmationpage")
	public String showConfirmationtionpage(Model model,
			MemberDetails memberDetails) {
		System.out.println("inside confimation page");
		System.out.println(memberDetails);
		RoleDetails roleDetails = roleDetailsServiceInterface
				.getRoleByRoleName(memberDetails.getRoleDetails().getRoleName());

		int roleId = roleDetails.getRoleId();
		List<MemberDetails> members = memberDetailsServiceInterface
				.getAllMembers();
		for (MemberDetails details : members) {
			if (roleDetails.getRoleId() == 1 && details.getMemberCode() != 1) {
				return "alreadyexists";
			} else {
				memberDetails.getRoleDetails().setRoleId(roleId);

				model.addAttribute("memberDetails", memberDetails);

				boolean result = memberDetailsServiceInterface
						.addNewMember(memberDetails);
				if (result == true) {
					return "confirmationpage";
				}
				return "failure";

			}

		}
		memberDetails.getRoleDetails().setRoleId(roleId);

		model.addAttribute("memberDetails", memberDetails);

		boolean result = memberDetailsServiceInterface
				.addNewMember(memberDetails);
		if (result == true) {
			return "confirmationpage";
		}
		return "failure";
	}

	@RequestMapping(value = "validateuser", method = RequestMethod.GET)
	public String showcustomuserpage(@RequestParam String userName,
			@RequestParam String userPassword, Model model) {
		List<MemberDetails> allUsers = memberDetailsServiceInterface
				.getAllMembers();
		for (MemberDetails memberDetails : allUsers) {
			if (userName.equals(memberDetails.getUsername())
					&& userPassword.equals(memberDetails.getPassword())) {
				int roleId = memberDetails.getRoleDetails().getRoleId();
				RoleDetails roleDetails = roleDetailsServiceInterface
						.getRoleByRoleId(roleId);
				memberDetails.setRoleDetails(roleDetails);
				// if(roleId==1){
				//
				// }
				model.addAttribute("memberDetails", memberDetails);
				// System.out.println("name:"+memberDetails.getRoleDetails().getRoleName());
				// System.out.println("result="+memberDetails.getRoleDetails().getRoleName()
				// == "admin");
				if (memberDetails.isApprovalStatus() == true
						|| memberDetails.getRoleDetails().getRoleName()
								.equals("admin")) {
					return roleDetails.getRolePage();
				} else {
					return "notapproved";
				}
			}
		}
		return "homepage";
	}

	@RequestMapping("approvesers")
	public String showApproveUserspage(Model model) {
		List<MemberDetails> allMembers = memberDetailsServiceInterface
				.getAllMembers();
		model.addAttribute("allMembers", allMembers);
		return "approvesers";
	}

	@RequestMapping("userapproved")
	public String showApprovedPage(@RequestParam int userName, Model model) {
		boolean result = memberDetailsServiceInterface
				.updateMemberByMemberCode(userName);
		if (result == true) {
			return "userapproved";
		} else {
			return "faliure";
		}
	}

}
