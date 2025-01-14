package com.euronet.main.domain;

public class JSONformat implements ReportFormat {

	@Override
	public void generateReport() {
          System.out.println("Generating report in JSON format");
	}

}
