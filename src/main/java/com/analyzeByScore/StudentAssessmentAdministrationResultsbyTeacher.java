package com.analyzeByScore;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class StudentAssessmentAdministrationResultsbyTeacher extends BaseClassOne{
	
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
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_MainContent_hlnkAdministrationResults']");
			
			//To fill the the Test ID Search 
			type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']", "257");
			
			//To click on the search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");
			
			//To select the Assessment 
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAssessment']"))).selectByVisibleText("For Automation- do not edit");
			
			//To select the Administrations
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAdministration']"))).selectByVisibleText("For Automation(2017-2018)");
			
			//To click on the show administration results
			click("//*[@id='ctl00_MainContent_btnShowResults']");
			
			//To select the School 
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlSchool']"))).selectByVisibleText("Ashley High School");
			
			//To select the Teacher
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlStaff']"))).selectByVisibleText("Ableton, A - 10");
			
			//To click on the run report
			click("//*[@id='ctl00_MainContent_btnGenerateReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the generate PDF
			click("//*[@id='ctl00_MainContent_btnPDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TCED14157() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the generate PDF
			click("//*[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	
		@Test(priority=3)
		public void TCED14159() 
		{
			try
			{
				//To check the radio button Report By Student Group
				click("//*[@id='ctl00_MainContent_rbStudentGroup']");
				
				//To select Student Group
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlStudentGroups']"))).selectByVisibleText("00 123 MR");
				
				//To click on the run report
				click("//*[@id='ctl00_MainContent_btnGenerateReport']");
				
				//To delete all the files in the directory
				FileDelete();
				
				//To click on the generate PDF
				click("//*[@id='ctl00_MainContent_btnPDF']");
				Thread.sleep(4000);
				
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
				
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		
		@Test(priority=4)
		public void TCED14160() 
		{
			try
			{
				//To delete all the files in the directory
				FileDelete();
				
				//To click on the generate PDF
				click("//*[@id='ctl00_MainContent_btnExportCSV']");
				Thread.sleep(4000);
				
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
				
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		@Test(priority=4)
		public void TCED14164() 
		{
			try
			{
				//To click on the Detailed Report
				click("//*[@id='ctl00_MainContent_rblstReportType_1']");
				
				//To click on the run report
				click("//*[@id='ctl00_MainContent_btnGenerateReport']");
				
				//To delete all the files in the directory
				FileDelete();
				
				//To click on the generate PDF
				click("//*[@id='ctl00_MainContent_btnPDF']");
				Thread.sleep(4000);
				
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
					
			}
			catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		@Test(priority=5)
		public void TCED14165()
		{
			try
			{
				//To delete all the files in the directory
				FileDelete();
				
				//To click Here To See Test
				click("//*[@id='ctl00_MainContent_lnkassessmentPDF']");
				
				//To select the frame
				SwitchFrameName("Assessment Print");
				
				//To click on the print word
				click("//*[@id='ctl00_ContentPlaceHolder1_linkWordQuestion']");
				Thread.sleep(4000);
				
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
				
				//To click print pdf
				click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfQuestions']");
				Thread.sleep(4000);
				
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
				
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
		@Test(priority=6)
		public void TCED14166()
		{
			try
			{
				
				//To delete all the files from the directory
				FileDelete();
				
				//To switch to parent frame
				driver.switchTo().parentFrame();
				
				//To click on the close button
				click("//*[@id='RadWindowWrapper_ctl00_MainContent_Assessment Print']/div[1]/div/ul/li[2]/span");
				
				
				//To click on the Testing Summary
				click("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td/a");
				
				SwitchFrameName("rwTestSummery");
				//*[@id='ctl00_ContentPlaceHolder1_RadButton1']
				
				//To click on the option button
				click("//*[@id='ctl00_ContentPlaceHolder1_RadButton1']");
				
				//To click on the print pdf button
				click("//*[@id='ctl00_ContentPlaceHolder1_RadContextMenu2_detached']/ul/li[1]/span");
				Thread.sleep(4000);
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

				//To click on the option button
				click("//*[@id='ctl00_ContentPlaceHolder1_RadButton1']");
				
				//To click on the CSV button
				click("//*[@id='ctl00_ContentPlaceHolder1_RadContextMenu2_detached']/ul/li[2]/span");
				Thread.sleep(4000);
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}	
			}
}
