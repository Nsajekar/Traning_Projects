package com.euronet.main;

import java.time.LocalDate;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.domain.BookIssueDetails;
import com.euronet.main.domain.MemberDetails;

public class LMSClient {
	public static void main(String[] args) {
		BookDetails bookDetails = new BookDetails(101, "Harry potter",
				"J.k.Rowing", 500, true);
		MemberDetails memberDetails = new MemberDetails(1380, "Nitesh",
				"Sajekar", "Student", 2);
		BookIssueDetails bookIssueDetails = new BookIssueDetails(101,
				LocalDate.now(), LocalDate.now().plusDays(8), bookDetails,
				memberDetails);
		System.out.println(bookIssueDetails);
		System.out.println();
		System.out.println("Using setter method:");

		bookDetails.setBookcode(102);
		bookDetails.setTitle("Marvels");
		bookDetails.setAuther("Stan Lee");
		bookDetails.setPrice(1000);
		bookDetails.setIssuable(true);

		memberDetails.setMembercode(1381);
		memberDetails.setFirstname("Ritesh");
		memberDetails.setLastname("Choughule");
		memberDetails.setMembertype("Faculty");

		bookIssueDetails.setIssueserialNumber(102);
		bookIssueDetails.setIssuedate(LocalDate.now());
		bookIssueDetails.setReturndate(LocalDate.now().plusDays(15));
		bookIssueDetails.setBookDetails(bookDetails);
		bookIssueDetails.setMemberDetails(memberDetails);
		
		System.out.println(bookIssueDetails);
	}
}
