package com.charm;

import org.testng.annotations.Test;

import com.charm.Business.Home;
import com.charm.Business.Report_Screenshot;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;



public class TC002 {

	static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TC002.class.getName());
	Report reports= new Report();
	
	
	Home home = new Home();
	ReusableMethod reuse=new ReusableMethod();
	@Test
	public void Keyword_Search ()  {
		
		try {
			
			logger.info(" TC002 ");
			ATUReports.setWebDriver(Driver.driver);
			Report.setAuthorInfoForReports("Manirul");
			Report_Screenshot.info_report("Input type: Search Key Word: Shah Rukh","Shah Rukh","");
		home.home_Search();
		home.click_on_2nd_list();
		ATUReports.add("INfo Step", LogAs.INFO, new CaptureScreen (ScreenshotOf.BROWSER_PAGE));
			}catch(Exception e){
				
				Report_Screenshot.report_fail("Input Type: Search Failed","","Search Failed");
				e.printStackTrace();
				logger.error("TC002"+e);
	                           }
	
	                                  }

}