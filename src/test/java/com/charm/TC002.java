package com.charm;

import org.testng.annotations.Test;

import com.charm.Business.Home;


public class TC002 {

	Home home = new Home();
	ReusableMethod reuse=new ReusableMethod();
	@Test
	public void Keyword_Search ()  {
	home.home_Search();
	home.click_on_2nd_list();
		
		
	}
	
	
	
	
}

