package com.analyzeByScore;

import java.awt.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

		{	
			Thread.sleep(3000);
			// To click on summary report
			click("//*[@id='ctl00_MainContent_rblstReportType_0']");

			select("//*[@id='ctl00_MainContent_ddlSchoolType']","High School");
			//To select a school
			select("//*[@id='ctl00_MainContent_ddlSchool']", "Ashley High School");

			click("//*[@id='ctl00_MainContent_cmbStaff']/span/button");

			check("//*[@id='ctl00_MainContent_cmbStaff_DropDown']/div/ul/li[1]/label");

			click("//*[@id='ctl00_MainContent_cmbStaff']/span/button");	

			Thread.sleep(3000);
			click("//*[@id='ctl00_MainContent_rblstAnswerOptions_0']");
			Thread.sleep(3000);		

			// To click on report
			click ("//*[@id='ctl00_MainContent_btnGenerateReport']");

			Thread.sleep(3000);

			//To Assert the Report Labels
			Assert.assertEquals(getText("//td[contains(text(),'No.Of Questions On PDF Page')]"), "No.Of Questions On PDF Page");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryMultiple']/tbody/tr[1]/td"), "Summary Report - Multiple Choice Questions");		

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_summaryMultiple']/tbody/tr[2]/td").contains("Only students with tests marked complete have been included in the report. Unfinished tests must be marked complete for inclusion on the report."), "Failed to Assert"+ "Only students with tests marked complete have been included in the report. Unfinished tests must be marked complete for inclusion on the report.");	

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_summaryMultiple']/tbody/tr[2]/td").contains("the Performance Level can only be calculated when there are no exclusions because the scoring matrix is based upon the full test."), "Failed to Assert"+ "the Performance Level can only be calculated when there are no exclusions because the scoring matrix is based upon the full test.");	

			// To scroll to particular location
			ScrollTo_Location("//td[@colspan='9']//center[contains(text(),'Standards')]");

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

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[1]/a"), "Student Id");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[2]/a"), "Last Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[3]/a"), "First Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[4]/a"), "Total Points");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[5]/a"), "Total % Score");		

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=5)
	public void TCED14155() 
	{
		try
		{


			// To scroll to particular location
			ScrollTo_Location("//td[@colspan='9']//center[contains(text(),'Standards')]");


			Thread.sleep(3000);
			//To delete all the files in the directory
			FileDelete();

			//To click on the generate PDF
			click("//*[@id='ctl00_MainContent_btnPDF']");
			Thread.sleep(7000);

			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority=6)
	public void TCED14156() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();

			//To click on the generate PDF
			click("//*[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(7000);

			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	


	@Test(priority=7)
	public void TCED14157() 
	{
		try
		{
			//To check the radio button Report By Student Group
			click("//*[@id='ctl00_MainContent_rbStudentGroup']");

			//To select Student Group
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlStudentGroups']"))).selectByVisibleText("00 123 MR");

			//To click on the run report
			click("//*[@id='ctl00_MainContent_btnGenerateReport']");

			//To Assert the Report Labels
			Assert.assertEquals(getText("//td[contains(text(),'No.Of Questions On PDF Page')]"), "No.Of Questions On PDF Page");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_summaryMultiple']/tbody/tr[1]/td"), "Summary Report - Multiple Choice Questions");		

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_summaryMultiple']/tbody/tr[2]/td").contains("Only students with tests marked complete have been included in the report. Unfinished tests must be marked complete for inclusion on the report."), "Failed to Assert"+ "Only students with tests marked complete have been included in the report. Unfinished tests must be marked complete for inclusion on the report.");	

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_summaryMultiple']/tbody/tr[2]/td").contains("the Performance Level can only be calculated when there are no exclusions because the scoring matrix is based upon the full test."), "Failed to Assert"+ "the Performance Level can only be calculated when there are no exclusions because the scoring matrix is based upon the full test.");	

			// To scroll to particular location
			ScrollTo_Location("//td[@colspan='9']//center[contains(text(),'Standards')]");

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

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[1]/a"), "Student Id");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[2]/a"), "Last Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[3]/a"), "First Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[4]/a"), "Total Points");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_grdEssaySummary']/tbody/tr[5]/th[5]/a"), "Total % Score");		


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	



	@Test(priority=8)
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

	@Test(priority=9)
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

	@Test(priority=10)
	public void TCED14160() 
	{
		try
		{
			//To click on the Detailed Report
			click("//*[@id='ctl00_MainContent_rblstReportType_1']");

			//To click on the run report
			click("//*[@id='ctl00_MainContent_btnGenerateReport']");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[4]/tbody/tr[2]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]"), "Points Possible");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[4]/tbody/tr[2]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[2]"), "Points Received");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[4]/tbody/tr[2]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[4]"), "Percent Score");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdOverallPoints']/table/tbody/tr[1]/td[1]"), "Category");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdOverallPoints']/table/tbody/tr[1]/td[2]"), "Points Possible");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdOverallPoints']/table/tbody/tr[1]/td[3]"), "Points Received");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdOverallPoints']/table/tbody/tr[1]/td[5]"), "Percent Received");		

			// TO Assert the Gridicons

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[1]"), "Question");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[2]"), "Question Type");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[3]"), "Correct Answer");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[4]"), "Student Answer");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[5]"), "Points Possible");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[6]"), "Points Scored");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[7]"), "Standards");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[8]"), "Webb's Cognitive");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[9]"), "Bloom's Cognitive");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[10]"), "Difficulty");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[11]"), "Item Alignment");		



		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}







	@Test(priority=11)
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

	@Test(priority=12)
	public void TCED14162() 
	{
		try
		{
			//To check the radio button Report By Student Group
			click("//*[@id='ctl00_MainContent_rbStudentGroup']");

			//To select Student Group
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlStudentGroups']"))).selectByVisibleText("00 123 MR");


			//To click on the Detailed Report
			click("//*[@id='ctl00_MainContent_rblstReportType_1']");

			//To click on the run report
			click("//*[@id='ctl00_MainContent_btnGenerateReport']");


			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[4]/tbody/tr[2]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]"), "Points Possible");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[4]/tbody/tr[2]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[2]"), "Points Received");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[4]/tbody/tr[2]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[4]"), "Percent Score");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdOverallPoints']/table/tbody/tr[1]/td[1]"), "Category");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdOverallPoints']/table/tbody/tr[1]/td[2]"), "Points Possible");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdOverallPoints']/table/tbody/tr[1]/td[3]"), "Points Received");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdOverallPoints']/table/tbody/tr[1]/td[5]"), "Percent Received");		

			// TO Assert the Gridicons

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[1]"), "Question");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[2]"), "Question Type");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[3]"), "Correct Answer");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[4]"), "Student Answer");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[5]"), "Points Possible");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[6]"), "Points Scored");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[7]"), "Standards");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[8]"), "Webb's Cognitive");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[9]"), "Bloom's Cognitive");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[10]"), "Difficulty");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rptrStudent_ctl00_tdQuestions']/table/tbody/tr[1]/td[11]"), "Item Alignment");		

		}
		catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority=13)
	public void TCED14163()
	{
		try
		{
			Thread.sleep(2000);
			//To check the radio button Report By Student Group
			click("//*[@id='ctl00_MainContent_rbStudentGroup']");

			//To select Student Group
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlStudentGroups']"))).selectByVisibleText("00 123 MR");


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


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}	
	}



	@Test(priority=14)
	public void TCED14164()
	{
		try
		{

			//To delete all the files from the directory
			FileDelete();

			String xpath= "//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td/a";
			TestingSummary obj1= new TestingSummary();
			obj1.TestingSummarypopup(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}	
	}


	@Test(priority=15)
	public void TCED14165()
	{
		try
		{
			driver.switchTo().parentFrame();


			Thread.sleep(2000);
			//To click here to see the test
			click("//*[@id='ctl00_MainContent_lnkassessmentPDF']");

			//To select the frame
			SwitchFrameName("Assessment Print");
			Thread.sleep(2000);
			//To delete all the files in the directory
			FileDelete();

			//To click on the print word
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkWordQuestion']");

			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");

			//To delete all the files in the directory
			FileDelete();
			//To click print pdf
			click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfQuestions']");
			Thread.sleep(5000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

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
