package com.charm.Business;

import com.charm.Report;

import atu.testng.reports.logging.LogAs;

public  class Report_Screenshot {
	
	public static Report report= new Report();
	
	public static void info_report (String InputType,String ExpectedRsult, String ActualResult) {
	
		report.atuReports("Info Step", InputType, ExpectedRsult, ActualResult, LogAs.INFO, "Desktop");
		
		
	}

	public static void report_pass (String InputType,String ExpectedRsult, String ActualResult) {
		
		report.atuReports("Pass Step", InputType, ExpectedRsult, ActualResult, LogAs.PASSED, "Browser");

		
	}
	
	public static void report_fail (String InputType,String ExpectedRsult, String ActualResult) {
		
		report.atuReports("Fail Step", InputType, ExpectedRsult, ActualResult, LogAs.FAILED, "Browser");

		
	}
}
