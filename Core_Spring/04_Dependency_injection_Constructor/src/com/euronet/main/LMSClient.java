package com.euronet.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.euronet.main.domain.BookIssueDetails;

public class LMSClient {
	public static void main(String[] args) {
		ApplicationContext applicationContext =new  ClassPathXmlApplicationContext("configuration.xml");
		BookIssueDetails bookIssueDetails = applicationContext.getBean("bookIssueDetails", BookIssueDetails.class);
		System.out.println(bookIssueDetails);
	}
}
