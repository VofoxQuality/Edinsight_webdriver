package com.analyzeByScore;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.AssessmentPrint;
import com.generalMethods.MouseOver;
import com.generalMethods.TestingSummary;

import Library.BaseClassOne;

public class AnalyzebyHigherOrderThinkingSkills extends BaseClassOne{


	@Test(priority=1)
	public void TCED14401() 
	{
		try
		{

			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			//Hover over local Assessment link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			actions.moveToElement(mouseHover).build().perform();		

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the Beta Summary reports(Analyze By Higher Order Thinking Skills New)
			click("//*[@id='ctl00_MainContent_hlnkAnalyzeByHOTNew']");
			
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[1]/td/span"), "Analyze By HigherOrder Thinking Skills");		
	

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
			// To assert the header
			Assert.assertEquals(getText("//*[@id='ctl00_PlcPageCategory_lblRptName']"), "Analyze By Higher Order Thinking Skills");		

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=2)
	public void TCED14402() 
	{
		try
		{

			// to assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[5]/td/table/tbody/tr/td[1]"), "Total Scheduled Students:");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[5]/td/table/tbody/tr/td[3]"), "Total test completed and scored:");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[5]/td/table/tbody/tr/td[5]"), "Total tests started but not completed:");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_tblSchool']/table/tbody/tr[1]/td/span/label"), "Run Report By Building");		

			Assert.assertEquals(getText("//*[@id='tblBuilding']/td[1]"), "School");		

			Assert.assertEquals(getText("//*[@id='tblBuildingTeacher']/td[1]"), "Select Teacher :");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_tblSchool']/table/tbody/tr[5]/td/span/label"), "Run Report By Student Group");		
			// to assert the report page common labels
			Reportpagelabels();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=3)
	public void TCED14403() 
	{
		try
		{
			//Drill down from Total Scheduled Students
			String	xpath= "//td[contains(text(),'Total Scheduled Students:')]//following::a[1]";


			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=4)
	public void TCED14404() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			//Drill down from  Total test completed and scored
			String	xpath= "//td[contains(text(),'Total test completed and scored:')]//following::a[1]";
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=5)
	public void TCED14405() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			//Drill down from  Total tests started but not completed
			String	xpath= "//td[contains(text(),'Total tests started but not completed:')]//following::a[1]";
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=6)
	public void TCED14406() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			Thread.sleep(3000);

			WebElement element=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Summary'])[1]/following::area[4]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);	

			JavaScriptclick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Summary'])[1]/following::area[4]");

			Studentdrilldownlabels2();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=7)
	public void TCED14407() 
	{
		try
		{	
			Thread.sleep(2000);
			// Common header parameters
			ReportParams();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,820)");
			Thread.sleep(3000);

			JavaScriptclick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Detailed'])[1]/following::area[9]");							

			Studentdrilldownlabels2();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}




	@Test(priority=8)
	public void TCED14408() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			Thread.sleep(5000);
			ScrollTo_Location("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[2]");	
			Thread.sleep(3000);
			click("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00__0']/td[4]/a");
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels2();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}



	@Test(priority=9)
	public void TCED14409() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");
			select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");

			click("//*[@id='ctl00_MainContent_btnRunReport']");

			// to assert the report page common labels
			Reportpagelabels();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}



	@Test(priority=10)
	public void TCED14410() 
	{
		try
		{

			//Drill down from Total Scheduled Students
			String	xpath= "//td[contains(text(),'Total Scheduled Students:')]//following::a[1]";
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=11)
	public void TCED14411() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			//Drill down from  Total test completed and scored
			String	xpath= "//td[contains(text(),'Total test completed and scored:')]//following::a[1]";
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=12)
	public void TCED14412() 
	{
		try
		{
			// Common header parameters
			ReportParams();

			//Drill down from  Total tests started but not completed
			String	xpath= "//td[contains(text(),'Total tests started but not completed:')]//following::a[1]";
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=13)
	public void TCED14413() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			Thread.sleep(3000);

			WebElement element=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Summary'])[1]/following::area[4]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);	

			JavaScriptclick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Summary'])[1]/following::area[4]");

			Studentdrilldownlabels2();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=14)
	public void TCED14414() 
	{
		try
		{
			Thread.sleep(2000);
			// Common header parameters
			ReportParams();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,820)");
			Thread.sleep(3000);

			JavaScriptclick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Detailed'])[1]/following::area[9]");							

			Studentdrilldownlabels2();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}




	@Test(priority=15)
	public void TCED14415() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			Thread.sleep(3000);
			ScrollTo_Location("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[2]");	
			Thread.sleep(3000);
			click("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00__0']/td[4]/a");
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels2();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=16)
	public void TCED14416() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			click("//*[@id='ctl00_MainContent_rbStudentGroup']");
			select("//*[@id='ctl00_MainContent_ddlStudentGroup']","00 123 MR");
			click("//*[@id='ctl00_MainContent_btnRunReport']");

			// to assert the report page common labels
			Reportpagelabels();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}



	@Test(priority=17)
	public void TCED14417() 
	{
		try
		{

			//Drill down from Total Scheduled Students
			String	xpath= "//td[contains(text(),'Total Scheduled Students:')]//following::a[1]";
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=18)
	public void TCED14418() 
	{
		try
		{
			// Common header parameters
			ReportParams();

			//Drill down from  Total test completed and scored
			String	xpath= "//td[contains(text(),'Total test completed and scored:')]//following::a[1]";
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=19)
	public void TCED14419() 
	{
		try
		{
			// Common header parameters
			ReportParams();

			//Drill down from  Total tests started but not completed
			String	xpath= "//td[contains(text(),'Total tests started but not completed:')]//following::a[1]";
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=20)
	public void TCED14420() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			Thread.sleep(3000);

			WebElement element=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Summary'])[1]/following::area[4]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);	

			JavaScriptclick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Summary'])[1]/following::area[4]");

			Studentdrilldownlabels2();



		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=21)
	public void TCED14421() 
	{
		try
		{
			Thread.sleep(2000);
			// Common header parameters
			ReportParams();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,820)");
			Thread.sleep(3000);

			JavaScriptclick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Detailed'])[1]/following::area[9]");							

			Studentdrilldownlabels2();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}




	@Test(priority=22)
	public void TCED14422() 
	{
		try
		{
			// Common header parameters
			ReportParams();
			Thread.sleep(3000);
			ScrollTo_Location("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[2]");	
			Thread.sleep(3000);
			click("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00__0']/td[4]/a");
			// To Click the link & Assert the drilldown labels
			Studentdrilldownlabels2();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=23)
	public void TCED14423() 
	{
		try
		{

			ReportParams();

			//To delete all the files in the directory
			FileDelete();

			//To click on the Print ot PDF
			click("//*[@id='ctl00_MainContent_btnPrintToPDF']");
			Thread.sleep(4000);
			// TO assert the PDF
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority=24)
	public void TCED14424()
	{
		try
		{
			//To click on the Print ot PDF
			click("//*[@id='ctl00_MainContent_btnCSV']");
			Thread.sleep(3000);
			// TO assert the CSV
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=25)
	public void TCED14425()
	{
		try
		{

			String xpath = "//a[contains(.,'Testing Summary')]";
			// TO Click on testing summary and assert it contents
			TestingSummary t1= new TestingSummary();

			t1.TestingSummarypopup(xpath);

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority=26)
	public void TCED14426()
	{
		try
		{	

			String xpath = "//*[@id='ctl00_MainContent_lnkAnswerKey']";
			Thread.sleep(3000);
			// TO Click on Assessment Print and assert it contents
			AssessmentPrintReports12(xpath);

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}	
	}

















	/***** Common Methods used above testcases
	 * @throws InterruptedException ****/


	public void Studentdrilldownlabels(String xpath) throws InterruptedException

	{

		// To Click on Students LIst

		click(xpath);
		Thread.sleep(9000);
		// To assert the student list page labels
		Assert.assertEquals(getText("//span[@class='subheading']"), "Assessment Students List");	
		
		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_tblSummary']/tbody/tr[1]/td[2]"), "Analyze By Higher Order Thinking Skills");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[2]/a"), "Student ID");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[5]/a"), "Last Name");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[6]/a"), "First Name");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[7]/a"), "Grade");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[8]/a"), "School");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[9]/a"), "Ethnicity");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[11]/a"), "IEP");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[12]/a"), "ELL");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[13]/a"), "Ec. Disadvantaged");		



	}

	public void ReportParams() throws InterruptedException

	{


		//Hover over local Assessment link			
		
		WebElement element = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
		
		MouseOver overmenuItem=new MouseOver();
		overmenuItem. MouseOver_DataAnalyst();
		
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		Thread.sleep(1000);	
		//To click on the analyze by Score
		click("//a[contains(.,'Analyze Scores')]");

		//To click on the Beta Summary reports(Analyze By Higher Order Thinking Skills New)
		click("//*[@id='ctl00_MainContent_hlnkAnalyzeByHOTNew']");

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

	}


	public void Reportpagelabels()
	{

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_trSummaryChart']/td/table/tbody/tr[1]/td/h3"), "Summary");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_trDetailedChart']/td/table/tbody/tr[1]/td/h3"), "Detailed");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[2]"), "Question");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[3]/a"), "DOK");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[4]/a"), "% Points Earned");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[5]/a"), "Points Earned");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[6]/a"), "Question Points Possible");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[7]/a"), "Total Points Possible");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgHOTAnalysis_ctl00']/thead/tr/th[8]/a"), "Question Type");		

	}



	public void Studentdrilldownlabels2() throws InterruptedException

	{

		Thread.sleep(2000);
		// To assert the student list page labels
		Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/span"), "Assessment Students List");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_tblSummary']/tbody/tr[1]/td[2]"), "Analyze by Higher Order Thinking Skills");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[2]/a"), "Student ID");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[5]/a"), "Last Name");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[6]/a"), "First Name");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[7]/a"), "Grade");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[8]/a"), "School");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[9]/a"), "Ethnicity");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[11]/a"), "IEP");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[12]/a"), "ELL");		

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[13]/a"), "Ec. Disadvantaged");		



	}



	public void AssessmentPrintReports12(String xpath) throws InterruptedException

	{
		//To click here to see the test

		click(xpath);	

		//To select the frame
		SwitchFrameName("printPopup");

		//To delete all the files in the directory
		FileDelete();

		//To click on the print word
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkWordQuestion']");
		Thread.sleep(10000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");

		//To click print pdf

		click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfQuestions']");
		Thread.sleep(10000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		//To delete all the files in the directory
		FileDelete();

		//To click on the Print OE to PDF
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkOePdfQuestions']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		//To click on the OE to Word
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkOeWordQuestions']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");

		//*******Print answer Key**********************

		//To delete all the files in the directory
		FileDelete();

		//To click print pdf
		click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfAnswer']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

		//To click on the print word
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkWordAnswer']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");

		//To delete all the files in the directory
		FileDelete();

		//To click on the Print condensed PDF
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkCondensedPDF']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		//To click on the OE to Word
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkCondensedWord']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");


	}
}
