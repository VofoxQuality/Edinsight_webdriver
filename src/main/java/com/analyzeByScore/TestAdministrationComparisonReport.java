package com.analyzeByScore;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class TestAdministrationComparisonReport extends BaseClassOne {
	
	@Test(priority=1)
	public void TCED14216() 
	{
		try
		{
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			
			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");
			
			//To click on the Test Administrations Comparison report
			click("//a[@id='ctl00_MainContent_HyperLink4']");
			
			//To click on the search button
			click("//input[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");
			
			// To select the assessment administrations you would like to compare 
			JavaScriptclick("//input[@id='ctl00_MainContent_grdTest_ctl127_chkSelect']");
			JavaScriptclick("//input[@id='ctl00_MainContent_grdTest_ctl115_chkSelect']");
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the print pdf button 
			click("//input[@id='ctl00_MainContent_btnPDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
				
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TCED14220() 
	{
		try
		{

			//To click on the radio button Performance Level
			JavaScriptclick("//input[@id='ctl00_MainContent_rblstReportType_1']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the print pdf button 
			click("//input[@id='ctl00_MainContent_btnPDF']");
			Thread.sleep(6000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority=3)
	public void TCED14224() 
	{
		try
		{
			//To click on the radio button Standards
			JavaScriptclick("//input[@id='ctl00_MainContent_rblstReportType_2']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the print pdf button 
			click("//input[@id='ctl00_MainContent_btnPDF']");
			Thread.sleep(6000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}

