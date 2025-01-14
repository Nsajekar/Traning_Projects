package com.euronet.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.domain.IssueDetails;
import com.euronet.main.domain.MemberDetails;
import com.euronet.main.repository.BookDetailsRepository;
import com.euronet.main.repository.BookDetailsRepositoryInterface;
import com.euronet.main.repository.IssueDetailsRepository;
import com.euronet.main.repository.IssueDetailsRepositoryInterface;
import com.euronet.main.repository.MemberDeatailsRepositoryInterface;
import com.euronet.main.repository.MemberDetailsRepository;

public class LmsMain {
	public static void main(String[] args) {
		MemberDetails memberDetails;
		BookDetails bookDetails;
		IssueDetails issueDetails = new IssueDetails();
		Scanner scanner = new Scanner(System.in);
		BookDetailsRepositoryInterface bookDetailsRepositoryInterface = new BookDetailsRepository();
		IssueDetailsRepositoryInterface issueDetailsRepositoryInterface = new IssueDetailsRepository();
		MemberDeatailsRepositoryInterface memberDeatailsRepositoryInterface = new MemberDetailsRepository();

		System.out.println("Welcome To Euronet Library");
		// Step-1 :- stored memberDetails
		System.out.println("Enter Member Code");
		int membercode = scanner.nextInt();
		memberDetails = memberDeatailsRepositoryInterface
				.getMemberByMemberId(membercode);
		System.out.println("Full Name :  " + memberDetails.getFirstname()
				+ "  " + memberDetails.getLastname());
		System.out.println("Member Type :  " + memberDetails.getMembertype());

		System.out.println();

		// Step-2 :- stored bookDetails
		System.out.println("Enter Book Code : ");
		int bookcode = scanner.nextInt();
		bookDetails = bookDetailsRepositoryInterface.getBookByBookId(bookcode);
		System.out.println("Book Name :  " + bookDetails.getBookname());
		System.out
				.println("Book Auther Name :  " + bookDetails.getAuthername());
		System.out.println("Book Status :  " + bookDetails.getStatus());

		// Step-3 :- Store Issue Date and Return Date into Issue Date Object
		
        LocalDate issuedate = LocalDate.now();
        issueDetails.setIssuedate(issuedate);
        System.out.println(issuedate);
        if(memberDetails.getMembertype().equals("Student") ){
        	 LocalDate returndate = issuedate.plusDays(8);
             issueDetails.setReturndate(returndate);
        }else{
        	 LocalDate returndate = issuedate.plusDays(15);
             issueDetails.setReturndate(returndate);
        }
        
        
		
	//	 * Step-4 :- Store Issue Details in Table from Database if Book Status
	//	 * is open and Store return date As 8 days After issuing Book for
	//	 * Student And 15 Days for Faculty
        System.out.println("Your IssueDate is : :  "+issueDetails.getIssuedate());
        System.out.println("Your ReturnDate is : :  "+issueDetails.getReturndate());
        System.out.println("Do you want to issue this Book : yes/no");
        scanner.nextLine();
        String choice =scanner.nextLine();
        if(choice.equals("Yes") || choice.equals("yes")){
        	issueDetails.setBookDetails(bookDetails);
        	issueDetails.setMemberDetails(memberDetails);
        	issueDetailsRepositoryInterface.addNewIssue(issueDetails);
        	//add status to unavailable in database
        	
        }else{
        	System.out.println("Thanks !!!!!");
        }


		scanner.close();

	}
}
