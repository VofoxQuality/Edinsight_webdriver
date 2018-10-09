package com.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Assessments extends BaseClassOne

{
	@Test(priority=0)	
	public void TCED34201()
	{
		try
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			//Click on  Student Search menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/div/div[8]/div/a");			
					
			//type on Student ID 
			type("//*[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","104104");
			
			//Search student
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdBtnAction']");
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdContextSearch_detached']/ul/li[1]/span");			
					
			//click student Id
			click("//a[contains(text(),'104104')]");
			
			//Click on the assessments menu
			click("//*[@id='ctl00_plcLeftMenu_MenuStudentLeft1_pnlMenu']/ul/li[2]/a/span[1]");
			
			//Assert the label "Standardized Assessment Results"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr/td/b").contains("Standardized Assessment Results"),"failed to assert text"+"  Standardized Assessment Results");
							
			//Assert the label "Student Data Depot"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rgInputAssessment_ctl00']/thead/tr/th").contains("Student Data Depot"),"failed to assert text"+"  Student Data Depot");
			
			//Assert the label "PVAAS Results"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_panPVAASHistory']/b").contains("PVAAS Results"),"failed to assert text"+"  PVAAS Results");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}
	
	@Test(priority=1)	
	public void TCED34202()
	{
		
		try
		{
			//Assert the Label "Assessment"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[1]").contains("Assessment"),"failed to assert text"+"  Assessment");
			
			//Assert the Label "Gr"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[2]").contains("Gr"),"failed to assert text"+"  Gr");
			
			//Assert the Label "Math"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[3]").contains("Math"),"failed to assert text"+"  Math");
			
			//Assert the Label "Reading"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[4]").contains("Reading"),"failed to assert text"+"  Reading");
			
			//Assert the Label "Language"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[5]").contains("Language"),"failed to assert text"+"  Language");
			
			//Assert the Label "Writing"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[6]").contains("Writing"),"failed to assert text"+"  Writing");
			
			//Assert the Label "Science"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[7]").contains("Science"),"failed to assert text"+"  Science");
			
			//Assert the Label "Soc Studies"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[8]").contains("Soc Studies"),"failed to assert text"+"  Soc Studies");
		}
       catch (Exception e)
		{
    	   Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}
	
	@Test(priority=2)	
	public void TCED34203()
	{
		
		try
		{
			//Application should be in the assessment page
			
			//Click on "PSSA 2013-2014" link from the 1st grid
			click("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[2]/td[1]/a");
			
			//Assert the heading "PSSA 2013|2014 Assessment Data "
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/table/tbody/tr/td[2]").contains("PSSA 2013|2014 Assessment Data"),"failed to assert text"+"  PSSA 2013|2014 Assessment Data");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
			
	}
	
	@Test(priority=3)	
	public void TCED34204()
	{
		
//		Assert the Label "How did this student score on each reporting category?  (Hide)"
//		Assert the Label "Reporting Category"
//		Assert the Label "Description"
//		Assert the Label "Possible Score"
//		Assert the Label "Student Score" 
//		Assert the Label "Pct Correct" 
//		Assert the Label "Last Years Strength"
//		Assert the Label "Score Type"
//		Assert the Label "Score"
	
	}

	@Test(priority=4)	
	public void TCED34205()
	{
		
		try
		{
			//Application should be in the PSSA 2013|2014 Assessment Data page
			
			FileDelete();	
			
			//click on Print PDF		
			click("//*[@id='ctl00_MainContent_ctl00_btnPrintToPDF']");			
			
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}

	@Test(priority=5)	
	public void TCED34206()
	{
		try 
		 {
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			//Click on  Student Search menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/div/div[8]/div/a");			
					
			//type on Student ID 
			type("//*[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","104104");
			
			//Search student
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdBtnAction']");
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdContextSearch_detached']/ul/li[1]/span");			
					
			//click student Id
			click("//a[contains(text(),'104104')]");
			
			//Click on the assessments menu
			click("//*[@id='ctl00_plcLeftMenu_MenuStudentLeft1_pnlMenu']/ul/li[2]/a/span[1]");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,500)");
			
			//Click on Keystone Exams 2015-2016 Spring
			click("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptKeystone']/tbody/tr[3]/td[1]/a");
			
			//Assert the heading "Keystone Exams 2015-2016 "
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_theReportDiv']/div[1]/table/tbody/tr/td[2]").contains("Keystone Exams 2015-2016"),"failed to assert text"+"  Keystone Exams 2015-2016");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
		
}
