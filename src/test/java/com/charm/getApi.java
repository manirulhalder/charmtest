package com.charm;

import org.omg.CORBA_2_3.portable.InputStream;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.charm.Business.Report_Screenshot;

import atu.testng.reports.ATUReports;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import io.restassured.response.Response;

public class getApi {

	static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(getApi.class.getName());
	Report reports= new Report();
	
	
	@Test(priority =1)
	public void testApiresponsecode()
	
	{
		
	//	Response resp =get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
	
	//	int code = resp.getStatusCode();
		
		// System.out.println("Status Code is" +code);
		
	//	Assert.assertEquals(code,200);
		
	//	System.out.println("Api Response Code is: "+code);
		
		try {
			
			logger.info(" getApi ");
			ATUReports.setWebDriver(Driver.driver);
			Report.setAuthorInfoForReports("Manirul");
			Report_Screenshot.info_report("Input type: Api response code","Code","");
			
			Response resp =get("https://apicbv3.charmboard.com/v3/relatedcharms/355559");
			
			int code = resp.getStatusCode();
			
		 System.out.println("Status Code is" +code);
			
		Assert.assertEquals(code,200);
			
		System.out.println("Api Response Code is: "+code);
			
		
		}catch(Exception e){
			
			Report_Screenshot.report_fail("Input Type: Search Failed","","Search Failed");
			e.printStackTrace();
			logger.error("getApi"+e);
                           }
		
		
		
		
	}
	
	@Test(priority =2)
	public void testApitime()
	
	{
		
try {
			
			logger.info(" getApi ");
			ATUReports.setWebDriver(Driver.driver);
			Report.setAuthorInfoForReports("Manirul");
			Report_Screenshot.info_report("Input type: Api response time","time","");

		
		Response resp = get("https://apicbv3.charmboard.com/v3/relatedcharms/355559");
		
		String data=resp.asString();
		
		System.out.println("Response Data is: "+data);
		
		System.out.println("API Response Time ms: "+resp.getTime());
		
}catch(Exception e){
	
	Report_Screenshot.report_fail("Input Type: Search Failed","","Search Failed");
	e.printStackTrace();
	logger.error("getApi"+e);
                   }
		
	}
	
	
	@Test(priority =3)
	public void testExtractDetailsusingResponse()
	{
		
try {
			
			logger.info(" getApi ");
			ATUReports.setWebDriver(Driver.driver);
			Report.setAuthorInfoForReports("Manirul");
			Report_Screenshot.info_report("Input type: Api response Content","Content","");

	
		Response resp =
				
				when().
				get("https://apicbv3.charmboard.com/v3/relatedcharms/355559").
				then().
				extract().
				 	response();
		
		System.out.println("Content Type: "+resp.contentType());
		System.out.println("Href: "+resp.path("url"));
		System.out.println("Status code: "+resp.statusCode());
		
}catch(Exception e){
	
	Report_Screenshot.report_fail("Input Type: Search Failed","","Search Failed");
	e.printStackTrace();
	logger.error("getApi"+e);
                   }


	}
	
//	@Test(priority =4)
//	public void testGetResponseAsInputStream() throws IOException 
//	{
	
	//	InputStream stream =  (InputStream) get("http://services.groupkt.com/country/search?text=lands").asInputStream();
	//	System.out.println( " stream Length : " +stream.toString().length());
	//	stream.close();
			
			
		
	//}
	
	
	
}
