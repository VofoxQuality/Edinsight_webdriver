package com.MTSS;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

/**
 * 
 * @author sebastian (Team Decision Report)
 *
 */
public class TeamDecisionReport extends BaseClassOne {
	
	@Test(priority=1)
	public void TCED22606() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the Team Decision Report
			click("//a[contains(.,'Team Decision Report')]"); 
			
			//To select the team decision
			click("//input[@id='ctl00_MainContent_rcmbTeamDecision_Input']");
			
			
			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[5]//label[1]//input[1]");
			
			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[6]//label[1]//input[1]");
			
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
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
	public void TCED22607() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			///To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportPDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=3)
	public void TCED22612() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the Team Decision Report
			click("//a[contains(.,'Team Decision Report')]");
			
			//To select the team decision
			click("//input[@id='ctl00_MainContent_rcmbTeamDecision_Input']");
			
			
			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[5]//label[1]//input[1]");
			
			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[6]//label[1]//input[1]");
			
			
			//To run the report by date range
			click("//input[@id='ctl00_MainContent_rbtnDateRange']");
			
			//To type the start date 
			type("//input[@id='ctl00_MainContent_rdpStartDate_dateInput']","3/1/2018 ");
			
			//To type the End date 
			type("//input[@id='ctl00_MainContent_rdpEndDate_dateInput']"," 8/3/2018");
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
				
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=4)
	public void TCED22613() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportPDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=5)
	public void TCED22615() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the Team Decision Report
			click("//a[contains(.,'Team Decision Report')]");
			
			//To select the team decision
			click("//input[@id='ctl00_MainContent_rcmbTeamDecision_Input']");
			
			
			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[5]//label[1]//input[1]");
			
			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[6]//label[1]//input[1]");
			
			
			//To click Run Report by Student Group
			click("//input[@id='ctl00_MainContent_rbtnStudentGroup']");
			
			//To select the student group
			select("//select[@id='ctl00_MainContent_ddlStudentGroup']","00 123 MR");
			
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
				
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		}
	@Test(priority=6)
	public void TCED22616() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportPDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=7)
	public void TCED22617() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on Meeting History Report 
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=8)
	public void TCED22608() 
	{
		try
		{
			//To click on the add selected students to group
			click("//input[@id='ctl00_MainContent_btnAddToGroup']");
			
			Thread.sleep(2000);
			//click("//span[@class='rwCommandButton rwCloseButton']");
			click("//span[@class='rwCommandButton rwCloseButton']");
			
			Thread.sleep(1000);
			Assert.assertFalse(isElementPresent("//input[@id='ctl00_ContentPlaceHolder1_btnAddStudents']"),"close is not working properly");
			//driver.findElement(By.xpath(""));
				
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=9)
	public void TCED22609() 
	{
		try
		{
			//To click on add all students to group
			click("//input[@id='ctl00_MainContent_btnCheckAll']");
			
			Thread.sleep(2000);
			//click("//span[@class='rwCommandButton rwCloseButton']");
			click("//span[@class='rwCommandButton rwCloseButton']");
			
			Thread.sleep(1000);
			Assert.assertFalse(isElementPresent("//input[@id='ctl00_ContentPlaceHolder1_btnAddStudents']"),"close is not working properly");
			
				
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	

}
