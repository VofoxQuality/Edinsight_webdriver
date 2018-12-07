package com.Student_Data_Depot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
			ScrollTo_Location("//td[contains(text(),'"+assess_name+"')]");
			click("//td[contains(text(),'"+assess_name+"')]//following::input[1]");
			
			Thread.sleep(2000);
			
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
	@Test(priority=5)
	public void TCED62205()
	{
		try
		{
			//Application should be in the Configure Testing Period & Performance Level pop-up	
			click("//span[contains(text(),'Testing Period Config')]");
			
			//Click on the "Add new Testing Period" + Icon
			click("//a[contains(text(),'Add new Testing Period')]//preceding::input[1]");			
			
			//Enter Testing Period name = Spring
			type("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl03_ctl01_txtTestingPeriodName']","Spring");
			
			//Enter Abbr= Spring
			type("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl03_ctl01_txtTestingPeriodCode']","Spring");
			
			//Tick Enabled check box
			click("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl03_ctl01_chkIsActive']");
			
			//Click on the Insert Icon
			click("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl03_ctl01_PerformInsertButton']");
			
			//Assert the message "Entering Testing Period Range will be used to determine the targets for Progress Monitoring Data. Are you sure you want to continue without entering it?"
			String msg=driver.switchTo().alert().getText();
			Assert.assertEquals(msg,"Entering Testing Period Range will be used to determine the targets for Progress Monitoring Data. Are you sure you want to continue without entering it?");	

			//Click on the OK button	
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			
			//Assert the Testing Period Name as Spring
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl04_lblTestingPeriodName']"),"Spring");
			
			//Assert the Abbr as Spring
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl04_lblTestingPeriodCode']"),"Spring");
			
			//Click on the "Add new Testing Period" + Icon
			click("//a[contains(text(),'Add new Testing Period')]//preceding::input[1]");			
			
			//Enter Testing Period name = Spring
			type("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl03_ctl01_txtTestingPeriodName']","Spring");
			
			//Enter Abbr= Spring
			type("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl03_ctl01_txtTestingPeriodCode']","Spring");
			
			//Tick Enabled check box
			click("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl03_ctl01_chkIsActive']");
			
			//Click on the Insert Icon
			click("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl03_ctl01_PerformInsertButton']");
			
			//Click on the OK button	
			driver.switchTo().alert().accept();
			
			//Assert the Testing Period Name already exists..
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod']/span"),"Testing Period Name already exists..");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void TCED62206()
	{
		try
		{
			//Application should be in the Configure Testing Period & Performance Level pop-up	
			click("//span[contains(text(),'Testing Period Config')]");
			
			//Click on the Edit button of "Spring" testing period 
			click("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl04_EditButton']");		
						
			//Update Testing Period Name=Fall
			type("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl04_txtTestingPeriodName']","Fall"); 
			
			//Update Abbr= Fall
			type("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl04_TestingPeriodCode']","Fall");

			//Assert the updated Testing Period Name as fall
			click("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl04_UpdateButton']");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl04_lblTestingPeriodName']"),"Fall");
			
			//Assert the Abbr as Fall
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl04_lblTestingPeriodCode']"),"Fall");		    
					
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED62207()
	{
		try
		{			
			//Click on the Delete button of "Spring" testing period 
			click("//*[@id='ctl00_ContentPlaceHolder1_rgConfigTestingPeriod_ctl00_ctl04_btnDelete']");
			
			Thread.sleep(3000);

			// Assert.assertEquals(getText(".//*[normalize-space(text()) and normalize-space(.)='Are you sure you want to delete this record?']"),"Are you sure you want to delete this record?");
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Are you sure you want to delete this record?'])[1]/following::button[1]")).click();
		    
			//Assert the warning message "You must have at least one testing period."	
		   // Assert.assertEquals(getText(".//*[normalize-space(text()) and normalize-space(.)='OK'])[1]/preceding::b[1]"),"You must have at least one testing period.");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='You must have at least one testing period.'])[1]/following::button[1]")).click();
		    Thread.sleep(3000);
				
		   		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void TCED62208()
	{
		try
		{			
			//Application should be in the Testing Period Config tab
			
			//Click on Performance Level Config tab 
			click("//span[contains(text(),'Performance Level Config')]");
			
			//Click on the "Add new Performance Level"
			click("//a[contains(text(),'Add new Performance Level')]");
			
			//Assert the message "Adding a performance level will require you to re-configure any spotlight columns that have been set up. 
		    Assert.assertEquals(getText("//div[contains(text(),'Adding a performance level will require you to re-configure any spotlight columns that have been set up. ')]"),"You must have at least one testing period.");
		    //Thread.sleep(3000);
		   // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='You must have at least one testing period.'])[1]/following::button[1]")).click();
				
		   		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

}
