package com.euronet.main.factory;

import com.euronet.main.domain.JSONformat;
import com.euronet.main.domain.PDF;
import com.euronet.main.domain.ReportFormat;

public class ReportFactory {
	public static ReportFormat getReportFormat(int choice) {
		switch (choice) {
		case 1:
			return new PDF();
		case 2:
			return new JSONformat();
		default:
			break;
		}
		return null;

	}
}
