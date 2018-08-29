/**
 * 
 */
package com.localassessment;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

/**
 * @author Akhil-TS
 * To verify the copy assessment successful message through Webdriver
 */
public class Copy_assessment extends BaseClassOne

{
		
	String test_id="258";
	String expected_message="Test copied successfully with the new name";
	
	@Test
	
	public void TCED15202()
	{
		
		try
		{
		//Supertent Login
		login(Supertent_Login_id,Supertent_Login_Password);
		
		//Click on main menu local Assignment.
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
		
		//Click on manage assessment
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
		
		//type on test id textbox		
		type("//*[@id='ctl00_MainContent_txtTestId']", test_id);
		
		//Click on search button
		click("//*[@id='ctl00_MainContent_btnTestIdSearch']");
		
		//Click on copy assessment link
		click("//*[@id='ctl00_MainContent_grdMyAssessments_ctl02_lnkCopyAssessment']");		
		
		//To get success alert message
		String success_text=driver.switchTo().alert().getText();
		
		System.out.println(success_text);
		
		//Assert the alert message contains "Test copied successfully....."
		
		Assert.assertTrue(success_text.contains(expected_message),"success message not displayed");	
		
		//close alert pop up
		
		//driver.switchTo().alert().accept();	
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());		
			
		}
	
		
	}
	
	

}
