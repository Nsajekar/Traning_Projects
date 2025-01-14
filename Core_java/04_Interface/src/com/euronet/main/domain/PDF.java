package com.euronet.main.domain;

public class PDF implements ReportFormat {

	@Override
	public void generateReport() {
           System.out.println("Generating report in PDF format");
	}

}
