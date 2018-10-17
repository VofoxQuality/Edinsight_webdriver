package com.analyzeByScore;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class ItemAnalysisbyStudent extends BaseClassOne{
	
	@Test(priority=1)
	public void TCED14126() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			
			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");
			
			//To click on the item analysis by student link text
			click("//a[@id='ctl00_MainContent_hlnkBenchmarkAnalysis']");
			
			//To fill the the Test ID Search 
			type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']", "314");
			
			//To click on the search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");
			
			//To select the Assessment 
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAssessments']"))).selectByVisibleText("For Automation- do not edit");
			
			//To select the Administrations
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAdministrations']"))).selectByVisibleText("For Automation- do not edit (Admin)(2017-2018)");
			
			//To click on the run report button
			click("//*[@id='ctl00_MainContent_btnRunReport']");
			
			//To select the building  
			select("//*[@id='ctl00_MainContent_ddlBuilding']","Ashley High School");
			
			//To select the Teacher 
			Thread.sleep(2000);
			select("//*[@id='ctl00_MainContent_ddlTeachers']","Condle, C - 63");
			
			//To click on the run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print on CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
			Thread.sleep(6000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			//To click on the Print on PDF
			click("//input[@id='ctl00_MainContent_btnPrintScoringMatrix']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TCED14127() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on Testing summery button
			click("//a[contains(.,'Testing Summary')]");
			
			//To select the frame
			SwitchFrameName("rwTestSummery");
			
			//To click on the options button
			click("//*[@id='ctl00_ContentPlaceHolder1_RadButton1']");
			
			//To click on the print PDF to button
			click("//*[@id='ctl00_ContentPlaceHolder1_RadContextMenu2_detached']/ul/li[1]/span");
			
			Thread.sleep(3000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//To click on the options button
			click("//*[@id='ctl00_ContentPlaceHolder1_RadButton1']");
			
			//To click on the print PDF to button
			click("//*[@id='ctl00_ContentPlaceHolder1_RadContextMenu2_detached']/ul/li[2]/span");
			Thread.sleep(3000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	
	@Test(priority=3)
	public void TCED14128() 
	{
		try
		{
			driver.switchTo().parentFrame();
			
			click("//span[@title='Close']");
			
			//To click here to see the test
			click("//a[@id='ctl00_MainContent_lnkassessmentPDF']");
			
			//To select the frame
			SwitchFrameName("Assessment Print");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click print pdf
			click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfQuestions']");
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//To click on the print word
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkWordQuestion']");
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print OE to PDF
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkOePdfQuestions']");
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

			
			//To click on the OE to Word
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkOeWordQuestions']");
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");

			//*******Print answer Key**********************
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click print pdf
			click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfAnswer']");
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//To click on the print word
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkWordAnswer']");
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print OE to PDF
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkCondensedPDF']");
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

			
			//To click on the OE to Word
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkCondensedWord']");
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	
	
}
