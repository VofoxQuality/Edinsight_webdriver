package com.analyzeByScore;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.AssessmentPrint;
import com.generalMethods.TestingSummary;

import Library.BaseClassOne;
public class Local_Assessment_Item_Analysisby_Student extends BaseClassOne

{
	String Test_id="314";
	
	@Test(priority=0)
	public void TCED14121()
	{		
	     try
	     {
			//Superintent Login
			 login(Supertent_Login_id,Supertent_Login_Password);
		 } 
	     catch (Exception e)
	     {
	    	 Assert.fail(e.getMessage());
			e.printStackTrace();
		 }		
	}	
	@Test(priority=1)
	public void TCED14122()
	{
		try
		{
			//Click on main menu local assessment.
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"))).build().perform();	
			
			
			//Click Analyze Score menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[9]/div/a");
			
			
			//Click on Item Analysis by Student report
			click("//*[@id='ctl00_MainContent_hlnkBenchmarkAnalysis']");
			
			// Assert the header "Item Analysis by Student"
			Assert.assertEquals(getText("//span[@id='ctl00_PlcPageCategory_spanTitle']"),"Item Analysis by Student");
			
			//Search a Test Test ID = 314
			type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']",Test_id);
			
			//click search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");
			
			//select assessment -For Automation- do not edit- in the dropdown
			select("//*[@id='ctl00_MainContent_ddlAssessments']","index=2");
			
			//select administration -For Automation- do not edit (Admin)(2017-2018)- in the dropdown
			select("//*[@id='ctl00_MainContent_ddlAdministrations']","label=For Automation- do not edit (Admin)(2017-2018)");

			// Click on Run Report Button.
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the the Header Name as Item Analysis by Student 
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[1]/td/span"),"Item Analysis by Student");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=2)
	public void TCED14123()
	{
		try
		{
			//Application should be in the Item Analysis by Student  Report page
			
			//Assert the Labels  Run Report By Building/Teacher/Class Room
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbBuilding']"),"Run Report By Building/Teacher/Class Room");
			
			//Assert the Labels  Building 
			Assert.assertEquals(getText("//td[contains(text(),'Building')]"),"Building");
			
			//Assert the Labels  Teacher Course/Section
			Assert.assertEquals(getText("//td[contains(text(),'Course/Section')]"),"Course/Section");
			
			//Assert the Label Run Report By Student Group
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbStudentGroup']"),"Run Report By Student Group");
			
			//Assert the Label Student Group
			Assert.assertEquals(getText("//td[contains(text(),'Student Group')]"),"Student Group");
			
			//Assert the Label Print This Report
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_btnGeneratePDF']"),"Print This Report");		
			
			//Assert the Label Ordered by Question Number
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoQuestionNumber']"),"Ordered by Question Number");
			
			//Assert the Labels Ordered by Percent Correct (High to Low)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoPercentDesc']"),"Ordered by Percent Correct (High to Low)");
			
			//Assert the Label Ordered by Eligible Content
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoEligibleContent']"),"Ordered by Eligible Content");
			
			//Assert the Label Ordered by Percent Correct (Low to High)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoPercentAsc']"),"Ordered by Percent Correct (Low to High)");
			
			//Assert the Labels Questions Excluded for not having Standards
			Assert.assertEquals(getText("//td[contains(text(),'Questions Excluded for not having Standards :')]"),"Questions Excluded for not having Standards :");
			
			//Assert the Label Standards
			Assert.assertEquals(getText("//td[contains(text(),'Building')]"),"Building");
			
			//Assert the Label Standards Type
			Assert.assertEquals(getText("//td[contains(text(),'Standards Type:')]"),"Standards Type:");
			
			//Assert the label Quick Summary
			Assert.assertEquals(getText("//span[contains(text(),'Quick Summary')]"),"Quick Summary");
			
			//Assert the label Highest Scores
			Assert.assertEquals(getText("//b[contains(text(),'Highest Scores:')]"),"Highest Scores:");
			
			//Assert the label Lowest Scores
			Assert.assertEquals(getText("//b[contains(text(),'Lowest Scores:')]"),"Lowest Scores:");
			
			//Assert the label Item Detail
			Assert.assertEquals(getText("//span[contains(text(),'Item Detail')]"),"Item Detail");
			
			//Assert the label Note: A '?' indicates no answer was provided
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_litNote']"),"Note: A '?' indicates no answer was provided");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=3)
	public void TCED14124()
	{
		try
		{
			//Application should be in the  Item Analysis by Student  Report Report page
			
			//Select a Building
			select("//select[@id='ctl00_MainContent_ddlBuilding']","label=Ashley High School");
			
			//Select Teacher
			select("//select[@id='ctl00_MainContent_ddlTeachers']","label=Ableton, A - 10");
			
			//click on Run Report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the label Question Number
			Assert.assertEquals(getText("//b[contains(text(),'Question Number')]"),"Question Number");
			
			//Assert the label DOK 
			Assert.assertEquals(getText("//b[contains(text(),'DOK')]"),"DOK");
			
			//Assert the label Standard 
			Assert.assertEquals(getText("//b[contains(text(),'Standard')]"),"Standard");
			
			//Assert the label Desc 
			Assert.assertEquals(getText("//b[contains(text(),'Desc')]"),"Desc");
			
			//Assert the label Correct Answer 
			Assert.assertEquals(getText("//b[contains(text(),'Correct Answer')]"),"Correct Answer");
			
			//Assert the label Percent Correct
			Assert.assertEquals(getText("//b[contains(text(),'Percent Correct')]"),"Percent Correct");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=4)
	public void TCED14125()
	{
		try
		{  
			//Application should be in the  Item Analysis by Student  Report Report page
			
			//click Run Report By Student Group
			click("//input[@id='ctl00_MainContent_rbStudentGroup']");
			
			//Select a Group from Run Report By Student Group
			select("//select[@id='ctl00_MainContent_ddlStudentGroups']","label=00 123 MR");
			
			//click on Run Report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the label Question Number
			Assert.assertEquals(getText("//b[contains(text(),'Question Number')]"),"Question Number");
			
			//Assert the label DOK 
			Assert.assertEquals(getText("//b[contains(text(),'DOK')]"),"DOK");
			
			//Assert the label Standard 
			Assert.assertEquals(getText("//b[contains(text(),'Standard')]"),"Standard");
			
			//Assert the label Desc 
			Assert.assertEquals(getText("//b[contains(text(),'Desc')]"),"Desc");
			
			//Assert the label Correct Answer 
			Assert.assertEquals(getText("//b[contains(text(),'Correct Answer')]"),"Correct Answer");
			
			//Assert the label Percent Correct
			Assert.assertEquals(getText("//b[contains(text(),'Percent Correct')]"),"Percent Correct");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=5)
	public void TCED14126()
	{		
		try
		{
			//Application should be in the  Item Analysis by Student  Report Report page
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print on CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
			waitFor_downloadfile();
			
			//assert the downloaded CSv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=6)
	public void TCED14127()
	{
		
		try
		{
			//Application should be in the  Item Analysis by Student  Report Report page
			
			//Xpath of the testing summary link
			String xpath="//*[@id='ctl00_MainContent_pnlReport']/table[2]/tbody/tr[1]/td[3]/a";
			
			//call TestingSummarypopup(); to check the Testing Summary pop-up functionality.
			TestingSummary ob=new TestingSummary();
			ob.TestingSummarypopup(xpath);	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=7)
	public void TCED14128()
	{
		try {
			
			String Click_here_to_see_test="//a[@id='ctl00_MainContent_lnkassessmentPDF']";
			
			AssessmentPrint ob=new AssessmentPrint();
			ob.AssessmentPrintReports(Click_here_to_see_test,"printPopup");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
