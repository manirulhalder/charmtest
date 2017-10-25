package com.charm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {
public static WebDriver driver;
static Properties prop = new Properties();
public static Logger logger = Logger.getLogger(Driver.class.getName());
	
	public static WebDriver driverClass (String selectbrowser) throws FileNotFoundException, IOException{
	switch (selectbrowser){
	
	case "FF":
		prop.load(new FileInputStream("./resources/conf/test.properties"));
		System.setProperty("webdriver.gecko.driver", prop.getProperty("Firefox"));
		 driver = new FirefoxDriver();
		break;
		
	case "Chrome":
		prop.load(new FileInputStream("./resources/conf/test.properties"));
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
		driver= new ChromeDriver();
		break;
		
		default:
			System.out.println("No browser");
		 }
	return driver;
		
		
		
	}
	
	public static void quitBrowser(){
		try{
		logger.info("==================Quit Browser==================");
		Driver.driver.quit();
		logger.info("==================Browser Quit successfully==================");
		}catch(Exception e){
		logger.error("Error while Quit browser ....",e);
		e.printStackTrace();
		}
		
	}
	public static void closeBrowser(){
		try{
		logger.info("==================close Browser==================");
		Driver.driver.close();
		logger.info("==================Browser closed successfully==================");
		}catch(Exception e){
		logger.error("Error while closing browser ....",e);
		e.printStackTrace();
		}
		
	}
	
}
