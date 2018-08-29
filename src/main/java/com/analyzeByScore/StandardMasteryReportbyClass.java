package com.analyzeByScore;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class StandardMasteryReportbyClass extends BaseClassOne  {
	
	@Test(priority=1)
	public void TCED14318() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			
			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");
			
			
			//To click on the Standards Mastery Report 
			click("//a[@id='ctl00_MainContent_hlnkStandardsMasteryByClass']");
			
			waitForSelectOption("//select[@id='ctl00_MainContent_ddlBuilding']");
		
			//To select the Building
			select("//select[@id='ctl00_MainContent_ddlBuilding']","Ashley High School");
			
			
			waitForSelectOption("//select[@id='ctl00_MainContent_ddlTeachers']");
			
			//To select the Teacher
			Thread.sleep(3000);
			select("//select[@id='ctl00_MainContent_ddlTeachers']","Ableton, A - 10");
			
			//To select the Class room
			Thread.sleep(3000);
			select("//select[@id='ctl00_MainContent_ddlClassRoom']","ENG - CONTEMP LIT");
			
			//To run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print on CSV
			click("//input[@id='ctl00_MainContent_btnGeneratePDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=2)
	public void TCED14319() 
	{
		try
		{
			
			//To click on the Print on PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TCED14323() 
	{
		try
		{
			driver.navigate().back();
			
			//Run Report By Building/Teacher/Class Room
			click("//input[@id='ctl00_MainContent_rbStudentGroup']");
			

			//To select the students group
			select("//select[@id='ctl00_MainContent_ddlStudentGroups']","122");
		
			//To run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print on CSV
			click("//input[@id='ctl00_MainContent_btnGeneratePDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

			
			//To click on the Print on PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");

			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TCED14324() 
	{
		try
		{
			//To click on the Print on PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");

			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
}



