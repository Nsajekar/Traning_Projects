package com.euronet.main;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.domain.BookIssueDetails;
import com.euronet.main.domain.MemberDetails;
import com.euronet.main.service.BookDetailsServiceInterface;
import com.euronet.main.service.BookIssueDetailsServiceInterface;
import com.euronet.main.service.MemberDetailsServiceInterface;

@Component("lmsApplication")
public class LmsApllication {
	@Autowired
	private BookDetailsServiceInterface bookDetailsServiceInterface;
	@Autowired
	private MemberDetailsServiceInterface memberDetailsServiceInterface;
	@Autowired
	private BookIssueDetailsServiceInterface bookIssueDetailsServiceInterface;
	
	private Scanner scanner = new Scanner(System.in);
	private int memberCode;
	private int bookCode;
	private LocalDate issueDate;
	private LocalDate returnDate;
	
	private BookDetails bookDetails;
	private MemberDetails memberDetails;
	private BookIssueDetails bookIssueDetails;
	
	public void issueBook(){
		System.out.println("Enter Member Code :  ");
		memberCode = scanner.nextInt();
		memberDetails = memberDetailsServiceInterface.getMemberDetailsByMemberCode(memberCode);
		System.out.println("First Name :"+ memberDetails.getFirstName());
		System.out.println("Last Name :"+ memberDetails.getLastName());
	}
}
