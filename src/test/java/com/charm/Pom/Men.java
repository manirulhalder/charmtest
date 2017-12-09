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

public class Men {
	
	ReusableMethod reuse= new ReusableMethod();
	Logger logger = Logger.getLogger(Men.class.getName());

	
	//store locaters for Home age
	//By search_Box=By.xpath(".//*[@id='headerholder']/div/nav/a[3]"); 
	
	public void menp ()
	{
	//By click_on_2nd_Link = By.xpath(".//*[@id='headerholder']/div/nav/a[3]");
	
	
	
	//By click_on_Men_Fashion = By.xpath(".//*[@id='mn_a_0']/a");
	
	
	//By click_on_product=By.xpath(".//*[@id='mediaimage_304834']");
	
	
	}
	
 	public void  ClickM(String Value){
	//Driver.driver.findElement(search_Box).sendKeys(Value,Keys.ENTER);
	//driver.findElement(By.id("gbqfb")).click();
	}
	public void clickon2ndLink() throws InterruptedException {
		
	 reuse.pause(5);
	//String text=Driver.driver.findElement(click_on_2nd_Link).getText();
	 Driver.driver.findElement(By.xpath(".//*[@id='headerholder']/div/nav/a[3]")).click();
	 	logger.info("Navigate to Men's page...");
	    //  Driver.driver.findElement(By.xpath(".//*[@id='headerholder']/div/nav/a[3]")).click();
		reuse.pause(2);
		// Driver.sendKeys(Keys.PAGE_DOWN);
	   Driver.driver.findElement(By.xpath(".//*[@id='mn_a_0']/a/div/p[3]/span")).click();
	   logger.info("Navigate to Men's Fashion Page ...");
	   reuse.pause(2);
	   logger.info("Navigate to Add To Board ...");
	   
	   // .//*[@id='trending_cards_107355_107556']
	   
	   Driver.driver.findElement(By.xpath(".//*[@id='trending_cards_107355_107556']")).click();
	   
	   reuse.pause(2);
	   
	   logger.info("Login To Gmail Account ...");
	   Driver.driver.findElement(By.xpath(".//*[@id='firebaseui-auth-container']/div/div/form/ul/li[1]/button")).click();
	   
	   // .//*[@id='firebaseui-auth-container']/div/div/form/ul/li[1]/button
	   
       reuse.pause(2);
	   
	   logger.info("Login To Gmail Account Username / Password ...");
	   
	   
	   
		// logger.info("Navigate to Product page ...");
	}
	
	
	

	

	
	
}
