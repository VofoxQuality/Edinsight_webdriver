package com.questionBank;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class SearchQuestion extends BaseClassOne{
	
	@Test(priority=1)
	public void TCED16117()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//To click on the Question Bank
			click("//a[contains(.,'Question Bank')]");
			
			//To click on the search question
			click("//a[@id='ctl00_MainContent_lnkSearchQuestions']");
			
			//To select the grade level 
			click("//div[@id='ctl00_MainContent_rcbGrades']//span[@class='rcbInner rcbReadOnly']");
			
			//Select the two check boxes
			click("//div[@id='ctl00_MainContent_rcbGrades_DropDown']//ul[@class='rcbList']//li[2]//label[1]//input[1]");
			click("//div[@id='ctl00_MainContent_rcbGrades_DropDown']//ul[@class='rcbList']//li[3]//label[1]//input[1]");
			
			
			//To click on the search button
			click("//a[@id='ctl00_MainContent_btnSearch']");
			
			
			//To click on the show flagged button
			click("//a[@id='ctl00_MainContent_btnShowFlagged']");
		
			//To check the validation message
			new WebDriverWait(driver, 60)
	        .ignoring(NoAlertPresentException.class)
	        .until(ExpectedConditions.alertIsPresent());
			
			Thread.sleep(2000);
			Alert alert1 = driver.switchTo().alert();
			String message1 = alert1.getText();
			alert1.accept();
			Assert.assertEquals(message1, "No questions are flagged!");
			
			 
			
			
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }
	
	@Test(priority=2)
	public void TCED16118()
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on thePrint Whole Pages To PDF
			click("//a[@id='ctl00_MainContent_btnPrint']");
			

			Thread.sleep(11000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");	
			
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }
	
	@Test(priority=3)
	public void TCED16119()
	{
		try
		{
			//To click on the Apply Standards
			click("//a[@id='ctl00_MainContent_btnApplyStandards']");
			
			//To check the validation message
			new WebDriverWait(driver, 60)
	        .ignoring(NoAlertPresentException.class)
	        .until(ExpectedConditions.alertIsPresent());
			
			Alert alert1 = driver.switchTo().alert();
			String message1 = alert1.getText();
			alert1.accept();
			Assert.assertEquals(message1, "Please select at least one search results question to apply standards!");	
			
			
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }
	@Test(priority=4)
	public void TCED16120()
	{
		try
		{
			//To click on the Apply Standards
			click("//a[@id='ctl00_MainContent_btnApplyAttribues']");
			
			//To check the validation message
			new WebDriverWait(driver, 60)
	        .ignoring(NoAlertPresentException.class)
	        .until(ExpectedConditions.alertIsPresent());
			
			Thread.sleep(2000);
			Alert alert1 = driver.switchTo().alert();
			String message1 = alert1.getText();
			alert1.accept();
			Assert.assertEquals(message1, "Please select at least one search results question to apply attributes!");	
			
			
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }
	@Test(priority=5)
	public void TCED16121()
	{
		try
		{
			//To click on the Apply Standards
			click("//a[@id='ctl00_MainContent_btnApplyExhibits']");
			
			//To check the validation message
			new WebDriverWait(driver, 60)
	        .ignoring(NoAlertPresentException.class)
	        .until(ExpectedConditions.alertIsPresent());
			
			Thread.sleep(2000);
			Alert alert1 = driver.switchTo().alert();
			String message1 = alert1.getText();
			alert1.accept();
			Assert.assertEquals(message1, "Please select at least one search results question to apply Exhibit!");	
			
			
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }
	@Test(priority=6)
	public void TCED16122()
	{
		try
		{
			//To click on the Apply Standards
			click("//input[@id='ctl00_MainContent_grdQuestion_ctl03_chkQuestion']");
			
			//To click on the Apply Standards
			click("//a[@id='ctl00_MainContent_btnApplyExhibits']");
			
			//To click on the cancel button
			click("//span[@class='rwCommandButton rwCloseButton']");
			
			//Assert the location of the page
			Assert.assertEquals(getText("//span[@class='administitle']"), "Question Bank Search");	
			
			
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }
}

