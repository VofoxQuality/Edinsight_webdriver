package com.administerAssessment;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * 
 */

import Library.BaseClassOne;

public class Create_New_Administration extends BaseClassOne
{
	String test_id="314";
    @Test(priority=1)
	public void TCED11001()
	{
	     try
	     {
			//Superintent Login
			 login(Supertent_Login_id,Supertent_Login_Password);
		 } 
	     catch (Exception e)
	     {
	    	 Assert.fail(e.getMessage());
			e.printStackTrace();
		 }
	}
    @Test(priority=2)
	public void TCED11002()
	{
		//Click on main menu local assessment.
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
		
		//Click Manage Assessments menu
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
		
		//Search a Test
		type("//*[@id='ctl00_MainContent_txtTestId']",test_id);
		
    	
	}
}
