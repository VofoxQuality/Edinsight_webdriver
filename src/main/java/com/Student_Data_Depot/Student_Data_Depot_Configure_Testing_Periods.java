package com.Student_Data_Depot;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.Edinsight_common_login;

import Library.BaseClassOne;

public class Student_Data_Depot_Configure_Testing_Periods extends BaseClassOne
{
	//creating the object of Edinsight_common_login class under the general method
	Edinsight_common_login ob=new Edinsight_common_login();
	
	@Test(priority=1)
	public void TCED62201()
	{
		try
		{
			//Sysadmin Login
			ob.edinsight_login(baseUrl, "sysadmin", Supertent_Login_Password);
			
			// Hover the Configuration Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click on Student Data Depot
			click("//a[contains(text(),'Student Data Depot')]");
			
			//Click on the Create an Assessment button
			click("//input[@id='ctl00_MainContent_btnCreateNewAssessment']");
			
			//Enter a Assessment Name
			String assess_name="0aaab"+generateRandomData(); 
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			type("//*[@id='ctl00_ContentPlaceHolder1_txtAssessmentName']", assess_name);
			
			//Click on Save Button
			click("#ctl00_ContentPlaceHolder1_btnSave");
			
			Thread.sleep(3000);
			
			//Click on "Configure Testing Periods and Performance Levels" Icon of created assessment
			driver.switchTo().defaultContent();
			click("//td[contains(text(),'"+assess_name+"')]//following::input[1]");
			
			//Assert the page header as "Configure Testing Periods and Performance Levels"
			Assert.assertEquals(getText("//h6[@class='rwTitle']"),"Configure Testing Period & Performance Level");
			
			//Assert the page header as "Configure Testing Periods and Performance Levels"
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/span"),"Configure Testing Period & Performance Level");						
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED62202()
	{
		try
		{
			//Application should be in the Configure Testing Period & Performance Level pop-up	
			
//			Assert the Label "Testing Period Config"
//			Assert the Label "Testing Period Name"
//			Assert the Label "Abbr."
//			Assert the Label "Enabled"
//			Assert the Label "Period Start Date"
//			Assert the Label "Period End Date "
//			Assert the Label "Add new Testing Period"
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void TCED62203()
	{
		try
		{
			//Application should be in the Configure Testing Period & Performance Level pop-up	
			click("//span[contains(text(),'Testing Period Config')]");
			
			//Click on the "Add new Testing Period" + Icon
			click("//a[contains(text(),'Add new Testing Period')]//preceding::input[1]");
			
//			Assert the "Testing Period Name" text box Element is present
//			Assert the "Abbr" text box Element is present
//			Assert the "Enabled" check box Element is present
//			Assert the "Period Start Date" date picker Element is present
//			Assert the "Period End Date" date picker Element is present
//			Assert the "Insert" Element is present
//			Assert the "Delete" Element is present
			

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED62204()
	{
		try
		{
			//Application should be in the Configure Testing Period & Performance Level pop-up	
			click("//span[contains(text(),'Testing Period Config')]");
			
			//Click on the Insert Icon
			click("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl03_ctl01_PerformInsertButton']");		
						
			//Assert the message "Entering Testing Period Range will be used to determine the targets for Progress Monitoring Data. Are you sure you want to continue without entering it?"
			String msg=driver.switchTo().alert().getText();
			Assert.assertEquals(msg,"Entering Testing Period Range will be used to determine the targets for Progress Monitoring Data. Are you sure you want to continue without entering it?");	

			//Click on the OK button	
			driver.switchTo().alert().accept();
		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

}
