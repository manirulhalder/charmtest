package com.charm;


import java.util.Properties;

import org.openqa.selenium.WebElement;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.Utils;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class Report {

	private static Properties prop = new Properties();
	
	public static void setAuthorInfoForReports(String authorName){
		ATUReports.setAuthorInfo(authorName, Utils.getCurrentTime(), "Charm-V-3.0");
		}
	public static void setIndexPageDescription(String projectName, String projectDescriptions){
		ATUReports.indexPageDescription=projectName +"<br/> <b>"+projectName+ "is"+projectDescriptions+ "</b>";
	}
	
	public  CaptureScreen captureScreenof (String screenshot){
		 
		if(screenshot.equalsIgnoreCase("Desktop")){
			return new CaptureScreen(ScreenshotOf.DESKTOP);
		
		}
		
		if(screenshot.equalsIgnoreCase("Browser")){
			return new CaptureScreen(ScreenshotOf.BROWSER_PAGE);
		
		}
		
		
	return null;
		 }
 
	
	 public  WebElement  repoter(String SetpDescription, String InputValue, String ExpectedValue,  String ActualValue,LogAs Status, String screenshot){
		 ATUReports.add(SetpDescription,InputValue , ExpectedValue, ActualValue, Status , captureScreenof(screenshot));
		  return null;
		   
		  }
	
	 
	 
	 public void atuReports(String SetpDescription, String InputValue, String ExpectedValue, String ActualValue, LogAs Status,String screenshot) {
		  if(SetpDescription.equalsIgnoreCase("Pass Step")){
		 this.repoter(SetpDescription, InputValue, ExpectedValue, ActualValue, Status, screenshot);
		  }
		  if(SetpDescription.equalsIgnoreCase("Fail Step")){
		   this.repoter(SetpDescription, InputValue, ExpectedValue, ActualValue, Status, screenshot); 
		  }
		  if(SetpDescription.equalsIgnoreCase("Info Step")){
		   this.repoter(SetpDescription, InputValue, ExpectedValue, ActualValue, Status, screenshot);  
		  }
		  
		  if(SetpDescription.equalsIgnoreCase("Warning Step")){
		   this.repoter(SetpDescription, InputValue, ExpectedValue,ActualValue, Status, screenshot);  
		  }
		 
		 }
}
