package com.charm.Pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By.ById;

import com.charm.Driver;
import com.charm.ReusableMethod;

public class Home_page {
	ReusableMethod reuse= new ReusableMethod();
	Logger logger = Logger.getLogger(Home_page.class.getName());

	
	//store locaters for Home age
	By search_Box=By.xpath("//input[@id='searchbox']");
	By click_on_2nd_Link=By.xpath(".//*[@id='recfboard']/div[1]/div/div/div[1]/a/div/img");
	
	// .//*[@id='recfboard']/div[1]/div/div/div[1]/a/div/img
	
	// .//*[@id='charm_image_317862']/img
	
	
	By click_on_product=By.xpath(".//*[@id='charm_image_367771']/img");
	
	
	//.//*[@id='mediaimage_304834']
	
	
	public void  search(String Value){
	Driver.driver.findElement(search_Box).sendKeys(Value,Keys.ENTER);
	}
	public void clickon2ndLink() throws InterruptedException{
		
		reuse.pause(5);
		String text=Driver.driver.findElement(click_on_2nd_Link).getText();
		logger.info("Find value from Home page ::"+text);
		Driver.driver.findElement(click_on_2nd_Link).click();
		logger.info("Navigate to Product select Page ...");
		reuse.pause(5);
		Driver.driver.findElement(click_on_product).click();
		logger.info("Navigate to Product page ...");
	}
	
	

	

	
	
}
