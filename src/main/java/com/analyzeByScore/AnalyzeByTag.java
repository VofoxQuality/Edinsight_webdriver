package com.analyzeByScore;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;



public class AnalyzeByTag extends BaseClassOne{
	
	
	@Test(priority=1)
	public void TCED14321() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED14322() 
	{
		try
		{
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");		
			
			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");
			
			//To click on the Beta Summary reports(Analyze By Tag New)
			click("//*[@id='ctl00_MainContent_hlnkAnalyzeByTagNew']");
			
			//* Assert the header "Analyze by Tag"
			Assert.assertEquals(getText("//span[@class='administitle']"),"Analyze by Tag");
			
			//To fill the the Test ID Search 
			type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']", "314");
			
			//To click on the search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");
			
			//To select the Assessment 
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAssessments']"))).selectByVisibleText("For Automation- do not edit");
			
			//To select the Administrations
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAdministrations']"))).selectByVisibleText("For Automation(2017-2018)");
			
			//Assert the Label  "All Tags"
		    Assert.assertEquals(getText("//label[@for='ctl00_MainContent_chkAll']"),"All Tags");
			
			//To click on the run report button
			click("//*[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the the Header Name as Analyze By Tag
			Assert.assertEquals(getText("//span[@id='ctl00_PlcPageCategory_lblRptName']"),"Analyze by Tag");		
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	@Test(priority=3)
	public void TCED14323() 
	{
		try
		{
			//Application should be in the Analyze by Tag Report page
			
			//Assert the Labels Total Scheduled Students
			Assert.assertEquals(getText("//td[contains(text(),'Total Scheduled Students:')]"),"Total Scheduled Students:");			
			
			//Assert the Labels  Total test completed and scored
			Assert.assertEquals(getText("//td[contains(text(),'Total test completed and scored:')]"),"Total test completed and scored:");	
			
			//Assert the Labels  Total tests started but not completed
			Assert.assertEquals(getText("//td[contains(text(),'Total tests started but not completed:')]"),"Total tests started but not completed:");	
			
			//Assert the Labels  Run Report By Building
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbBuilding']"),"Run Report By Building");	
			
			//Assert the Labels  School  
			Assert.assertEquals(getText("//td[contains(text(),'School')]"),"School");	
			
			//Assert the Labels Select Teacher
			Assert.assertEquals(getText("//td[contains(text(),'Select Teacher :')]"),"Select Teacher :");
			
			//Assert the Labels Run Report By Student Group
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbStudentGroup']"),"Run Report By Student Group");
			
			//Assert the label Summary
			Assert.assertEquals(getText("//h3[contains(text(),'Summary')]"),"Summary");			
			
			//Assert the label Detailed
			Assert.assertEquals(getText("//h3[contains(text(),'Detailed')]"),"Detailed");		
			
			//Assert the Label Tag
			Assert.assertEquals(getText("//th[contains(text(),'Tag')]"),"Tag");	
			
			//Assert the Label Question Numbers 
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgTagAnalysis_ctl00']/thead/tr/th[2]"),"Question Numbers");	
			
			//Assert the Label DOK 
			Assert.assertEquals(getText("//a[contains(text(),'DOK')]"),"DOK");	
			
			//Assert the Label % Points Earned 
			Assert.assertEquals(getText("//a[contains(text(),'% Points Earned')]"),"% Points Earned");
			
			//Assert the Label Points Earned 
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgTagAnalysis_ctl00']/thead/tr/th[6]/a"),"Points Earned");
			
			//Assert the Label Question Points Possible
			Assert.assertEquals(getText("//a[contains(text(),'Question Points Possible')]"),"Question Points Possible");
			
			//Assert the Label Total Points Possible 
			Assert.assertEquals(getText("//a[contains(text(),'Total Points Possible')]"),"Total Points Possible ");
			
			//Assert the Label Question Type
			Assert.assertEquals(getText("//a[contains(text(),'Question Type')]"),"Question Type");
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=4)
	public void TCED14324() 
	{
		try
		{
			
			//Application should be in the Analyze by Tag Report page
			
			//Drill down from Total Scheduled Students
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	
//	@Test(priority=24)
//	public void TCED14324() 
	{
		try
		{

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
			
			
	    }
	catch(Exception e) 
	{
	e.printStackTrace();
	Assert.fail(e.getMessage());
	}
  }
	
	@Test(priority=2)
	public void TCED14325()
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
	@Test(priority=3)
	public void TCED14326()
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
	@Test(priority=4)
	public void TCED14327()
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

