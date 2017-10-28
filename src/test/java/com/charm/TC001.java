package com.charm;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.charm.Business.LaunchApp;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
@Listeners({ATUReportsListener.class,ConfigurationListener.class,MethodListener.class})
public class TC001 {
	static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TC001.class.getName());
	LaunchApp launchapp = new LaunchApp();
	Properties prop = new Properties();
	Excel excel= new Excel();
	
{PropertyConfigurator.configure("./resources/conf/log4j.properties");}
{System.setProperty("atu.reporter.config", "./resources/conf/atu.properties");}
	

	@Test()
	public void TC001(){
		
		try{
		logger.info(" TC001 ");
		ATUReports.setWebDriver(Driver.driver);
		Report.setAuthorInfoForReports("Manirul");
		launchapp.launch_Charm_App();
		}catch(Exception e){
		
		e.printStackTrace();
		logger.error("TC001"+e);
		}
	}
	

}
