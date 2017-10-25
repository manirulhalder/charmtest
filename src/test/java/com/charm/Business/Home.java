package com.charm.Business;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.charm.Excel;
import com.charm.Pom.Home_page;

public class Home {
	private static Logger logger =Logger.getLogger(Home.class);
	private static Properties prop = new Properties();
	Home_page HP = new Home_page();
	public String value ;
	
	
	{
		PropertyConfigurator.configure("./resources/conf/log4j.properties");
	}
	
	
	public void home_Search() {
		try {
		logger.info("=============Search text===================");
		prop.load(new FileInputStream("./resources/conf/test.properties"));
		value = Excel.getexcel(prop.getProperty("Sheet2"), 1, 0);
		System.out.println(value);
		HP.search(value);
		logger.info("=======Search By Keyword :"  +value);
		} catch (Exception e) {
		logger.error("Keyword Not Found:"+value,e);
		}
		
		}
	
	public void click_on_2nd_list(){
		try{
		logger.info("=============click on 2nd link from Home page===================");
		HP.clickon2ndLink();
		}catch(Exception e){
		logger.error("Error While click on 2nd Link from Home page", e);
		e.printStackTrace();
		}
	}

}
