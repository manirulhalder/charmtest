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
import com.charm.Excel;
import com.charm.ReusableMethod;


public class Men {
	
	ReusableMethod reuse= new ReusableMethod();
	Logger logger = Logger.getLogger(Men.class.getName());
	
	public String value ;
	public String value1 ;	
	static Properties prop = new Properties();
	
	
	//public void menp ()
	//{
	
	//}
	
 //	public void  ClickM(String Value){
	//Driver.driver.findElement(search_Box).sendKeys(Value,Keys.ENTER);
	//driver.findElement(By.id("gbqfb")).click();
	//}
	public void clickon2ndLink() throws InterruptedException {
		
		 try {
			   
			   prop.load(new FileInputStream("./resources/conf/test.properties"));
				
				value = Excel.getexcel(prop.getProperty("Sheet3"), 1, 0);
				
				value1 = Excel.getexcel(prop.getProperty("Sheet3"), 1, 1);
		
	 reuse.pause(5);
	 
	//String text=Driver.driver.findElement(click_on_2nd_Link).getText();
	 Driver.driver.findElement(By.xpath(".//*[@id='headerholder']/div/nav/a[3]")).click();
	 	logger.info("Navigate to Men's page...");
	    //  Driver.driver.findElement(By.xpath(".//*[@id='headerholder']/div/nav/a[3]")).click();
		reuse.pause(5);
		// Driver.sendKeys(Keys.PAGE_DOWN);
	   Driver.driver.findElement(By.xpath(".//*[@id='mn_a_0']/a/div/p[3]/span")).click();
	   logger.info("Navigate to Men's Fashion Page ...");
	   reuse.pause(5);
	   logger.info("Navigate to Add To Board ...");
	   
	   // .//*[@id='trending_cards_107355_107556']
	   
	   Driver.driver.findElement(By.xpath(".//*[@id='trending_cards_107355_107556']")).click();
	   
	   reuse.pause(2);
	   
	
	   // .//*[@id='firebaseui-auth-container']/div/div/form/ul/li[1]/button
	 
	 // .//*[@id='firebaseui-auth-container']/div/div/form/ul/li[1]/button
	   
    //   reuse.pause(2);
	   
	  
			
	   
		   logger.info("Login To Gmail Account ...");
			 
			 Driver.driver.findElement(By.xpath(".//*[@id='firebaseui-auth-container']/div/div/form/ul/li[1]/button")).click();
			   
	   
	   logger.info("Login To Gmail Account Username...");
	   
		
		 reuse.pause(5);
	
		WebElement Email1 = Driver.driver.findElement(By.xpath(".//*[@id='identifierId']"));
		
		//HP.search(value); // .//*[@id='identifierId']
		
		// .//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[1]
		
		Email1.sendKeys("value");
		
		logger.info("=======Click on Next Button :--");
		
		 reuse.pause(3);
		
		Driver.driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		
		// .//*[@id='identifierNext']/div[2]

		 reuse.pause(3);
		
		logger.info("Login To Gmail Account with Password...");
		
		 reuse.pause(3);
		 
		WebElement pass = Driver.driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
		
		pass.sendKeys("value1");
		
		//.//*[@id='password']/div[1]/div/div[1]/input
		
		 reuse.pause(3);
		 
		Driver.driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();

	   } catch (Exception e) {
	   
		   logger.error("Keyword Not Found:"+value,e);
		   }
	
	}
	
}
	/* public void home_Search() {
		try {
			logger.info("Login To Gmail Account Username...");
		prop.load(new FileInputStream("./resources/conf/test.properties"));
		
		value = Excel.getexcel(prop.getProperty("Sheet3"), 1, 0);
		
		value1 = Excel.getexcel(prop.getProperty("Sheet3"), 1, 1);
		
		 reuse.pause(3);
	
		WebElement Email = Driver.driver.findElement(By.xpath(".//*[@id='identifierId']"));
		
		//HP.search(value);
		
		Email.sendKeys("value");
		
		logger.info("=======Click on Next Button :--");
		
		 reuse.pause(3);
		
		Driver.driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();

		 reuse.pause(3);
		
		logger.info("Login To Gmail Account with Password...");
		
		 reuse.pause(3);
		 
		WebElement pass = Driver.driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
		
		pass.sendKeys("value1");
		
		//.//*[@id='password']/div[1]/div/div[1]/input
		
		 reuse.pause(3);
		 
		Driver.driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();

		
		// .//*[@id='passwordNext']/div[2]
		
		} catch (Exception e) {
		logger.error("Keyword Not Found:"+value,e);
		}
		
		} */
	

	
	

