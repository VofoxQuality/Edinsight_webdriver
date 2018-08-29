package com.analyzeByScore;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class AdministrationComparisonbyStudent extends BaseClassOne {
	
	@Test(priority=1)
	public void TCED14296() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");
			
			//To click on the Beta Summary reports(Analyze by questons)
			click("//*[@id='ctl00_MainContent_hlinkStudentComparisonParams']");
		
			//To click on the search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");
			
			//Scroll to the object location
			ScrollTo_Location("//*[@id='ctl00_MainContent_grdTest_ctl124_chkSelect']");
			
			
			//To select the assessment administrations you would like to compare.		
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl125_chkSelect']");
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl08_chkSelect']");
			
			
			//To scroll up to the page
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,0)", "");
			
			//To click on the run report button
			click("//*[@id='ctl00_MainContent_btnRunReport']");
			
			//click on the option button
			click("//*[@id='ctl00_MainContent_rSplitButton']");
			
			//To click on the Options
			click("//*[@id='ctl00_MainContent_rSplitButton']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the print to PDF button
			click("//*[@id='ctl00_MainContent_rcMenu_detached']/ul/li[3]/span");
			
			//To assert whether the PDF document is download or not 
			Thread.sleep(4000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
			//To click on the Options
			click("//*[@id='ctl00_MainContent_rSplitButton']");
			
			//To click on the print to CSV button
			click("//*[@id='ctl00_MainContent_rcMenu_detached']/ul/li[4]/span");
			
			//To assert whether the PDF document is download or not 
			Thread.sleep(4000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			
		
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
	

	@Test(priority=2)
	public void TCED14298() 
	{
		try
		{
			//***********************Perfoamance level***********
			//To click on the performance button
			JavaScriptclick("//*[@id='ctl00_MainContent_rbtPerformance']");
			
			//To click on the Options
			Thread.sleep(2000);
			click("//*[@id='ctl00_MainContent_rSplitButton']");
			
			//To click on the print to PDF button
			click("//span[contains(text(),'Print to PDF')]");
			
			//To assert whether the PDF document is download or not 
			Thread.sleep(4000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//To click on the Options
			click("//*[@id='ctl00_MainContent_rSplitButton']");
			
			//To click on the print to CSV button
			click("//span[contains(text(),'Print to CSV')]");
			
			//To assert whether the PDF document is download or not 
			Thread.sleep(4000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
}
			
