package com.analyzeByScore;

import java.awt.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.AssessmentPrint;
import com.generalMethods.TestingSummary;

import Library.BaseClassOne;

public class StudentAssessmentAdministrationResultsbyTeacher extends BaseClassOne{


	@Test(priority=1)
	public void TCED14151() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//Click on main menu local Assessment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//Click on  Studentasssessmentadminstration
			click("//*[@id='ctl00_MainContent_hlnkAdministrationResults']");
			// To Assert the header
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[1]/td/span"), "Student Assessment Administration Results by Teacher");

			//To fill the the Test ID Search 
			type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']", "314");

			//To click on the search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");

			//To select the Assessment 
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAssessment']"))).selectByVisibleText("For Automation- do not edit");

			//To select the Administrations
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAdministration']"))).selectByVisibleText("For Automation- do not edit (Admin)(2017-2018)");

			//To click on the show administration results
			click("//*[@id='ctl00_MainContent_btnShowResults']");
			// To Assert the header
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[1]/td/span"), "Student Assessment Administration Report By Teacher");		

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=2)
	public void TCED14152() 
	{
		try
		{
			// To Assert All Labels
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[1]/td/span"), "Student Assessment Administration Report By Teacher");		

			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbBuilding']"), "Run Report By Building/Teacher/Course");		

			Assert.assertEquals(getText("//td[contains(text(),'Select School Type')]"), "Select School Type");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_tblBuilding']/tbody/tr[2]/td[1]"), "Select School");		

			Assert.assertEquals(getText("//td[contains(text(),'Select Teacher')]"), "Select Teacher");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_tblTeacher']/tbody/tr[3]/td/span/label"), "Run Report By Student Group");		

			Assert.assertEquals(getText("//td[contains(text(),'Student Group')]"), "Student Group");		

			Assert.assertEquals(getText("//td[contains(text(),'Report Type')]"), "Report Type");		

			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rblstReportType_0']"), "Summary Report");		

			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rblstReportType_1']"), "Detailed Report");		

			Assert.assertEquals(getText("//td[contains(text(),'Answer Options')]"), "Answer Options");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rblstAnswerOptions']/tbody/tr/td[1]/label"), "Show All");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rblstAnswerOptions']/tbody/tr/td[2]/label"), "Show Correct");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rblstAnswerOptions']/tbody/tr/td[3]/label"), "Show Incorrect");		


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=3)
	public void TCED14153() 
	{
		try
		{	//To select a school
			select("//*[@id='ctl00_MainContent_ddlSchool']", "Ashley High School");

			// To click on detail report
			click("//*[@id='ctl00_MainContent_rblstReportType_1']");

			// To click on report
			click ("//*[@id='ctl00_MainContent_btnGenerateReport']");

			Assert.assertEquals(getText("//span[contains(text(),'Please select atleast one teacher')]"), "Please select atleast one teacher");		


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=4)
	public void TCED14154() 
	{
		try
		
		{	select("//*[@id='ctl00_MainContent_ddlSchoolType']","High School");
			//To select a school
			select("//*[@id='ctl00_MainContent_ddlSchool']", "Ashley High School");
			
			click("//*[@id='ctl00_MainContent_cmbStaff']/span/button");
			
			check("//*[@id='ctl00_MainContent_cmbStaff_DropDown']/div/ul/li[1]/label");
			
			click("//*[@id='ctl00_MainContent_cmbStaff']/span/button");
			
			// To click on summary report
			click("//*[@id='ctl00_MainContent_rblstReportType_0']");

			// To click on report
			click ("//*[@id='ctl00_MainContent_btnGenerateReport']");

			//To Assert the Report Labels
			Assert.assertEquals(getText("//td[contains(text(),'No.Of Questions On PDF Page')]"), "No.Of Questions On PDF Page");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryMultiple']/tbody/tr[1]/td"), "Summary Report - Multiple Choice Questions");		

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_summaryMultiple']/tbody/tr[2]/td").contains("Only students with tests marked complete have been included in the report. Unfinished tests must be marked complete for inclusion on the report."), "Failed to Assert"+ "Only students with tests marked complete have been included in the report. Unfinished tests must be marked complete for inclusion on the report.");	

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_summaryMultiple']/tbody/tr[2]/td").contains("the Performance Level can only be calculated when there are no exclusions because the scoring matrix is based upon the full test."), "Failed to Assert"+ "the Performance Level can only be calculated when there are no exclusions because the scoring matrix is based upon the full test.");	

			// To Assert the First Grid labels in the Report		
			Assert.assertEquals(getText("//td[@colspan='9']//center[contains(text(),'Standards')]"), "Standards");		

			Assert.assertEquals(getText("//td[@colspan='9']//center[contains(text(),'Questions - % correct')]"), "Questions - % correct");		

			Assert.assertEquals(getText("//td[@colspan='9'][contains(text(),'Question DOK')]"), "Question DOK");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdSummaryReport']/tbody/tr[5]/th[1]/a"), "Student Id");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdSummaryReport']/tbody/tr[5]/th[2]/a"), "Last Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdSummaryReport']/tbody/tr[5]/th[3]/a"), "First Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdSummaryReport']/tbody/tr[5]/th[4]/a"), "Total Pts Possible");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdSummaryReport']/tbody/tr[5]/th[5]/a"), "MC Score");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdSummaryReport']/tbody/tr[5]/th[6]/a"), "Essay Score");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdSummaryReport']/tbody/tr[5]/th[8]/a"), "Total % Score");		


			// To Assert the Second Grid labels in the Report	
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryEssay']/tbody/tr[1]/td"), "Summary Report - Essay Questions");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryEssay']/tbody/tr[2]/td"), "* - Only students with answers have been included in the calculations");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryEssay']/tbody/tr[5]/th[1]/a"), "Student Id");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryEssay']/tbody/tr[5]/th[2]/a"), "Last Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryEssay']/tbody/tr[5]/th[3]/a"), "First Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryEssay']/tbody/tr[5]/th[4]/a"), "Total Points");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryEssay']/tbody/tr[5]/th[5]/a"), "Total % Score");		

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}













	//	@Test(priority=1)
	public void TCED14125() 
	{
		try
		{

			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//Click on main menu local Assessment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//Click on main menu local Assignment.
			click("//*[@id='ctl00_MainContent_hlnkAdministrationResults']");

			//To fill the the Test ID Search 
			type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']", "314");

			//To click on the search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");

			//To select the Assessment 
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAssessment']"))).selectByVisibleText("For Automation- do not edit");

			//To select the Administrations
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAdministration']"))).selectByVisibleText("For Automation- do not edit (Admin)(2017-2018)");

			//To click on the show administration results
			click("//*[@id='ctl00_MainContent_btnShowResults']");

			//To select the School 
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlSchool']"))).selectByVisibleText("Ashley High School");

			//To select the Teacher
			new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_cmbStaff_Input']"))).selectByVisibleText("Ableton, A - 10");

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

	//@Test(priority=2)
	public void TCED14156() 
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



	//		@Test(priority=3)
	public void TCED14158() 
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

	//	@Test(priority=4)
	public void TCED14159() 
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
	//	@Test(priority=4)
	public void TCED14161() 
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
	//	@Test(priority=5)
	public void TCED14164()
	{
		try
		{
			AssessmentPrint obj = new AssessmentPrint();
			String xpath = "//a[@id='ctl00_MainContent_lnkassessmentPDF']";
			
			obj.AssessmentPrintReports(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}	
	}
	//	@Test(priority=6)
	public void TCED14165()
	{
		try
		{

			//To delete all the files from the directory
			FileDelete();

			//To switch to parent frame
			driver.switchTo().parentFrame();

			//To click on the close button
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_Assessment Print']/div[1]/div/ul/li[2]/span");

			String xpath= "//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td/a";

			TestingSummary obj1= new TestingSummary();
			obj1.TestingSummarypopup(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}	
	}
}
