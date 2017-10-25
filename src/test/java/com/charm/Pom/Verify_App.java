package com.charm.Pom;

import org.openqa.selenium.By;

import com.charm.Driver;


public class Verify_App {
	
	
By verifycharm= By.xpath("//img[@alt='Charmboard']");



public void verify_charm(){
String print_text=Driver.driver.findElement(verifycharm).getAttribute("alt");
System.out.println("charm logo printerd===============>"+print_text);	
}
}

