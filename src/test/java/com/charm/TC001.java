package com.charm;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.charm.Business.LaunchApp;

public class TC001 {
	static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TC001.class.getName());
	LaunchApp launchapp = new LaunchApp();
	Properties prop = new Properties();
	Excel excel= new Excel();
	
{PropertyConfigurator.configure("./resources/conf/log4j.properties");}
	

	@Test()
	public void TC001(){
		try{
		logger.info(" TC001 ");
		launchapp.launch_Charm_App();
		}catch(Exception e){
		
		e.printStackTrace();
		logger.error("TC001"+e);
		}
	}
	

}
