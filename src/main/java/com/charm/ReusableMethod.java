package com.charm;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethod {
	
	
	
	private static Logger logger = Logger.getLogger(ReusableMethod.class);
	
	static{
	PropertyConfigurator.configure("./resources/conf/test.properties");
	}
	
	public void verify () {
		
	
		
	}

	public void pageToLoad(int i, String xpathExpression) {
	logger.info("=============Wait for page to Load");
	WebDriverWait wait = new WebDriverWait(Driver.driver,i*10);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
	}
	
	public void waitForFullPageLoad(int i){
		logger.info("waitForFullPageLoad() .........");
		Driver.driver.manage().timeouts().implicitlyWait(i*10, TimeUnit.SECONDS);
		logger.error("Error ......");
	}
	
	public void pause(int i){
		logger.info("==============Wait for few seconds while page is loading properly==============");
		try {
		Thread.sleep(i*1000);
		} catch (InterruptedException e) {
		logger.error("InterruptedException", e);
		e.printStackTrace();
		}
		
	}
}
