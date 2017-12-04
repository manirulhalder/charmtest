package com.charm;

import org.testng.annotations.Test;

public class TC003 {

	
	@Test
	public void closeBrowser(){
	Driver.driver.quit();
	}
}
