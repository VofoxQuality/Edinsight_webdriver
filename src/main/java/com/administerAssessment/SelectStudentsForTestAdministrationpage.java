package com.administerAssessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class SelectStudentsForTestAdministrationpage extends BaseClassOne {
	
	@Test(priority=1)
	public void TCAA02003() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//To click on the administrator assessment
			click("//a[contains(text(),'Administer Assessment')]");
			
			//To fill the test id search
			type("//input[@id='ctl00_MainContent_rpbEditAdministration_i2_i0_txtEditTestId']","260");
			
			//To click on the search button
			click("//input[@id='ctl00_MainContent_rpbEditAdministration_i2_i0_btnEditTestId']");
			
			//To select the Assessment name
			select("//select[@id='ctl00_MainContent_ddlEditAssessmentName']","Finalized - For Automation- do not edit-2 Unfinalized");
			
			//To select the administration name
			select("//select[@id='ctl00_MainContent_ddlAdministrationName']","1212(2017-2018)");
			
			//To click on the edit button
			click("//input[@id='ctl00_MainContent_btnEdit']");
			
			
			//To click on the options
			click("//span[@class='rbIcon p-icon rbSplitIcon p-i-arrow-down']");
			
			//To click on the select students for test administration
			click("//span[contains(.,'Select Students For Test Administration')]");
			
			
			//To select the current school
			select("//select[@id='ctl00_MainContent_ddlCurrentSchool']","Ashley High School");
			
			//To click on the search button
			click("//input[@id='ctl00_MainContent_btnSearch']");
			
			//To click on the Add Selected Students
			click("//a[contains(.,'Add Selected Students')]");
			
			//To assert the validation message
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			String message = alert.getText();
			alert.accept();
			Assert.assertEquals(message, "Please select at least one student from the list");
			
			
				
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
	@Test(priority=2)
	public void TCED12007() 
	{
		try
		{	
			click("//input[@id='ctl00_MainContent_rgSearchResult_ctl00_ctl06_chkStudent']");
			click("//input[@id='ctl00_MainContent_rgSearchResult_ctl00_ctl08_chkStudent']");
			click("//input[@id='ctl00_MainContent_rgSearchResult_ctl00_ctl10_chkStudent']");
			
			//To click on the Add Selected Students
			click("//a[@id='ctl00_MainContent_lnkAddSelected']");
			Thread.sleep(4000);
			
			waitFor("//input[@id='ctl00_MainContent_rgSelectedStudents_ctl00_ctl04_chkStudent']");
			
			//To click on the remove selected
			click("//a[@id='ctl00_MainContent_lnkRemoveSelected']");
			
			//To assert the validation message
			Thread.sleep(4000);
			Alert alert2 = driver.switchTo().alert();
			String message1 = alert2.getText();
			Assert.assertEquals(message1, "Please select at least one student from the list");
			alert2.accept();
			
		}catch (NoAlertPresentException e) {
	        e.printStackTrace();
	    }
		catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
	@Test(priority=3)
	public void TCED12008() 
	{
		try
		{
			
			//To click on the Add Selected Students
			click("//a[@id='ctl00_MainContent_lnkRemoveAll']");
			
			//To assert the validation message
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			String message1 = alert.getText();
			System.out.println(message1);
			alert.sendKeys("DELETEALL");
			alert.accept();
			Assert.assertEquals(message1, "Are you sure you want to remove ALL students from this"
					+ " administration?\n\nAll testing results associated to the students in this"
					+ " administration will be permanently deleted. Any previously printed login codes"
					+ " or bubble sheets for this administration will also no longer be usable.\n\nPlease "
					+ "enter DELETEALL in caps to continue.");
			
			Thread.sleep(2000);
			Alert alert1 = driver.switchTo().alert();
			String message2 = alert1.getText();
			Assert.assertEquals(message2, "Are you sure? This action cannot be reversed.");
			System.out.println(message2);  
			alert1.accept();
				
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
}	

