package com.analyzeByScore;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.server.handler.SwitchToParentFrame;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;

import Library.BaseClassOne;

public class AnalyzeByQuestion extends BaseClassOne {
	
	@Test(priority=1)
	public void TCED14124() 
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
			click("//*[@id='ctl00_MainContent_hlnkAnalyzeByQuestionNew']");
			
			//To fill the the Test ID Search 
			type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']", "257");
			
			//To click on the search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");
			
			//To select the Assessment 
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAssessments']"))).selectByVisibleText("For Automation- do not edit");
			
			//To select the Administrations
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAdministrations']"))).selectByVisibleText("For Automation(2017-2018)");
			
			//To click on the run report button
			click("//*[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
			click("//*[@id='ctl00_MainContent_btnPrintToPDF']");
			Thread.sleep(6000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
	}catch(Exception e) 
	{
	e.printStackTrace();
	Assert.fail(e.getMessage());
	}
  }
	
	@Test(priority=2)
	public void TCED14125()
	{
		try
		{
			//To click on the Print ot PDF
			click("//*[@id='ctl00_MainContent_btnCSV']");
			Thread.sleep(3000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
		
	}catch(Exception e) 
	{
	e.printStackTrace();
	Assert.fail(e.getMessage());
	}
}
	//To check the Testing Summary in the Analyze by Question Report.
	@Test(priority=3)
	public void TCED14126()
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
	//To Check the functionaliy "Click Here To See Test" in the Analyze by Question Report.
	@Test(priority=4)
	public void TCED14127()
	{
		try
		{
			
			driver.switchTo().parentFrame();
			
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_rwTestSummery']/div[1]/div/ul/li[2]/span");
			
			//To click here to see the test
			click("//*[@id='ctl00_MainContent_lnkAnswerKey']");
			
			//To select the frame
			SwitchFrameName("AssessmentPrint");
			
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
		
		
