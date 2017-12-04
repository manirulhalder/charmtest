package com.charm.Business;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;

import com.charm.Driver;
import com.charm.Excel;
import com.charm.ReusableMethod;
import com.charm.Pom.Verify_App;

import sun.net.www.http.PosterOutputStream;

public class LaunchApp {
 static org.apache.log4j.Logger Logger = org.apache.log4j.Logger.getLogger(LaunchApp.class);
 static Properties prop = new Properties();
	ReusableMethod reusbale = new ReusableMethod();
	Verify_App verify = new Verify_App();
	Excel excel= new Excel();
	
	{
		
		try {
			
			prop.load(new FileInputStream("./resources/conf/test.properties"));
			//prop.load(new FileInputStream("./resources/conf/log4j.properties"));
			PropertyConfigurator.configure("./resources/conf/log4j.properties");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

	
	public void launch_Charm_App (){
		try{
		Logger.info("==================Launching  charmBoard ===================");	
		@SuppressWarnings("static-access")
		String fireFox= Excel.getexcel(prop.getProperty("SheetName"), 1, 1);
		Driver.driverClass(fireFox);
		Driver.driver.get(prop.getProperty("URL"));	
		String veriFy_URL=Driver.driver.getCurrentUrl();
		if((prop.getProperty("URL").equals(veriFy_URL))){
		Assert.assertEquals(prop.getProperty("URL"), veriFy_URL,"Pass:: URL is verified");
		Report_Screenshot.report_pass("Input Type: Application Launched","","Browser launched properly");
			}else{
		Assert.assertNotEquals(prop.getProperty("URL"),veriFy_URL,"Fail::   URL is not verified");	
			}
		}catch(Exception e){
			Logger.error("===================App not Launching==============="+e);
			System.out.println(e);
			e.printStackTrace();
		}
		
		}
	}

