package com.MTSS;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

/**
 * 
 * @author sebastian (Meeting History report)
 * 
 *
 */

public class MeetingHistoryReport extends BaseClassOne {
	
	@Test(priority=1)
	public void TCED22506() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the meeting history report
			click("//a[contains(.,'Meeting History Report')]");
			
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
	public void TCED22507() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=3)
	public void TCED22512() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the meeting history report
			click("//a[contains(.,'Meeting History Report')]");
			
			//To run the report by date range
			click("//input[@id='ctl00_MainContent_rdoDateRange']");
			
			//To type the start date 
			type("//input[@id='ctl00_MainContent_rdpStart_dateInput']","2/1/2018");
			
			//To type the End date 
			type("//input[@id='ctl00_MainContent_rdgEnd_dateInput']","8/3/2018");
			
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
	public void TCED22513() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=5)
	public void TCED22515() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the meeting history report
			click("//a[contains(.,'Meeting History Report')]");
			
			//To click Run Report by Student Group
			click("//input[@id='ctl00_MainContent_rdoStudentGroup']");
			
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
	public void TCED22516() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=7)
	public void TCED22517() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on Meeting History Report 
			click("//input[@id='ctl00_MainContent_btnPrintToPDF1']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	
			
}
