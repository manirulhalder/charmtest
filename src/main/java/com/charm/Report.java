package com.charm;

import java.util.Properties;

import atu.testng.reports.ATUReports;
import atu.testng.reports.utils.Utils;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class Report {

	private static Properties prop = new Properties();
	
	public static void setAuthorInfoForReports(String authorName){
		ATUReports.setAuthorInfo(authorName, Utils.getCurrentTime(), "Charm-V-1.0");
		}
	public static void setIndexPageDescription(String projectName, String projectDescriptions){
		ATUReports.indexPageDescription=projectName +"<br/> <b>"+projectName+ "is"+projectDescriptions+ "</b>";
	}
	
	public  CaptureScreen captureScreenof (String screenshot, String web){
		 
		if(screenshot.equalsIgnoreCase("Desktop")){
			return new CaptureScreen(ScreenshotOf.DESKTOP);
		
		}
		
		if(screenshot.equalsIgnoreCase("Browser")){
			return new CaptureScreen(ScreenshotOf.BROWSER_PAGE);
		}if(screenshot.equalsIgnoreCase(web)){
			return new CaptureScreen(ScreenshotOf.valueOf(web));
		}
		
		
	return null;
		 }
 
}
