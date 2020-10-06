/**
 * 
 */
package com.localassessment;

import org.openqa.selenium.interactions.Actions;
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
		Actions act=new Actions(driver);					
		act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a")).build().perform();
		
		//Click on manage assessment
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[6]/div/a");
		
		//type on test id textbox		
		type("//*[@id='ctl00_MainContent_txtTestId']", test_id);
		
		//Click on search button
		click("//*[@id='ctl00_MainContent_btnTestIdSearch']");
		
		//Click on copy assessment link
		click("//*[@id='ctl00_MainContent_grdMyAssessments_ctl02_lnkCopyAssessment']");		
		
		//To get success alert message
		String success_text=driver.switchTo().alert().getText();
		
		System.out.println(success_text);
		
		driver.switchTo().alert().accept();
		
		//Assert the alert message contains "Test copied successfully....."
		
		Assert.assertTrue(success_text.contains(expected_message),"success message not displayed");	
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());		
			
		}
	
		
	}
	
	

}
