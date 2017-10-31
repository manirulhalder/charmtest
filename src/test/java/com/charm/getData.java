package com.charm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class getData {

	
	@Test(priority =1)
	public void testApiresponsecode()
	
	{
		
		Response resp =get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
	
		int code = resp.getStatusCode();
		
		System.out.println("Status Code is" +code);
		
		Assert.assertEquals(code,200);
		
		System.out.println("Response Code is: "+code);
		
	}
	
	@Test(priority =2)
	public void testApitime()
	
	{
		
		Response resp = get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
		
		String data=resp.asString();
		
		System.out.println("Response Data is: "+data);
		
		System.out.println("API Response Time ms: "+resp.getTime());
		
	}
	
	
	
}
