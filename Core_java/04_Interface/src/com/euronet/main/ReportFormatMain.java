package com.euronet.main;

import java.util.Scanner;

import com.euronet.main.domain.ReportFormat;
import com.euronet.main.factory.ReportFactory;

public class ReportFormatMain {

	public static void main(String[] args) {
		int choice;
     Scanner scanner =new Scanner(System.in);
     System.out.println("Enter choice for format");
     System.out.println("1: for PDF format");
     System.out.println("2: for JSON format");
     choice = scanner.nextInt();
     ReportFormat reportFormat = ReportFactory.getReportFormat(choice);
     reportFormat.generateReport();
	}

}
