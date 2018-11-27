package com.analyzeByScore;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.AssessmentPrint;
import com.generalMethods.TestingSummary;

import Library.BaseClassOne;

public class ItemAnalysisbyQuestion extends BaseClassOne {

	TestingSummary objTestingSummary = new TestingSummary();
	AssessmentPrint objAssessmentPrint = new AssessmentPrint();

	@Test(priority=1)
	public void TCED14081() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			// Method for Report param pages
			ReportParam ();
			// Assert Header
			Assert.assertEquals( "Item Analysis by Question", getText("//span[@class='administitle']"));	

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority=2)
	public void TCED14082() 
	{
		try
		{
			// To Assert the Validation Messages
			Assert.assertEquals(getText("//td[contains(text(),'Total Scheduled Students:')]"), "Total Scheduled Students:");	

			Assert.assertEquals( getText("//td[contains(text(),'Total test completed and scored:')]"),"Total test completed and scored:");	

			Assert.assertEquals(getText("//td[contains(text(),'Total tests started but not completed:')]"), "Total tests started but not completed:");	

			Assert.assertEquals( getText("//label[@for='ctl00_MainContent_rbBuilding']"),"Run Report By Building");	

			Assert.assertEquals(getText("//td[contains(text(),'School:')]"), "School:");	

			Assert.assertEquals( getText("//td[contains(text(),'Select Teacher :')]"),"Select Teacher :");	

			Assert.assertEquals( getText("//td[contains(text(),'Course/Section :')]"),"Course/Section :");	

			Assert.assertEquals( getText("//label[@for='ctl00_MainContent_rbStudentGroup']"),"Run Report By Student Group");	

			Assert.assertEquals(getText("//span[contains(text(),'Student Group')]"), "Student Group");	

			Assert.assertEquals( getText("//td[contains(text(),'Filter Questions with:')]"),"Filter Questions with:");	

			Assert.assertEquals( getText("//td[contains(text(),'Rationale Display Options:')]"),"Rationale Display Options:");	

			Assert.assertEquals( getText("//label[@for='ctl00_MainContent_chkShowQuestionPrompt']"),"Display question prompt for each question");	

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}		

	@Test(priority=3)
	public void TCED14083() 
	{
		try
		{	// TO click the link
			click("//input[@id='ctl00_MainContent_btnFilter']");
			// To Assert the label
			Assert.assertEquals( getText("//*[@id='ctl00_MainContent_grdQuestions_ctl02_trQuestionStandardHeading']/td/span"),"Question Standards");	

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	


	@Test(priority=4)
	public void TCED14084() 
	{
		try
		{
			// To click the Studentcountlink
			click("//a[contains(text(),'16')]");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=5)
	public void TCED14085() 
	{
		try
		{	// Method for Report param pages
			ReportParam ();

			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");
			// To click the Studentcountlink
			click("//a[contains(text(),'6(37.5%)')]");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=6)
	public void TCED14086() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();

			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");
			// To click the Studentcountlink
			click("//a[contains(text(),'1(6.25%)')]");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=7)
	public void TCED14087() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();

			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");
			// To click the Studentcount
			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblStudentNumber']/a");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=8)
	public void TCED14088() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();

			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");
			// To click the Studentcountpercentage
			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblPercentage']/a");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority=9)
	public void TCED14089() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			Thread.sleep(1000);
			// Method for Buildingfilters
			BuildingFiltersParamPage();		

			// To Assert the header
			Assert.assertEquals( "Question Standards", getText("//*[@id='ctl00_MainContent_grdQuestions_ctl02_trQuestionStandardHeading']/td/span"));	

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}




	@Test(priority=10)
	public void TCED14090() 
	{
		try
		{
			// TO click the link
			click("//a[contains(text(),'5')]");
			// Method for Studentdetail
			AssertStudentdetailHeaders();
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority=11)
	public void TCED14091() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			Thread.sleep(1000);
			//To select the building  
			select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");

			//To select the Teacher 
			Thread.sleep(2000);
			select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");


			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//a[contains(text(),'5')]");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=12)
	public void TCED14092() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			Thread.sleep(1000);
			//To select the building  
			select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");

			//To select the Teacher 
			Thread.sleep(2000);
			select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");


			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//a[contains(text(),'1(20%)')]");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	


	@Test(priority=13)
	public void TCED14093() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			Thread.sleep(1000);
			//To select the building  
			select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");

			//To select the Teacher 
			Thread.sleep(2000);
			select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");

			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblStudentNumber']/a");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	

	@Test(priority=14)
	public void TCED14094() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			Thread.sleep(1000);
			// Method for Buildingfilters
			BuildingFiltersParamPage();	

			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblPercentage']/a");
			// Method for Studentdetail
			AssertStudentdetailHeaders();


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	



	@Test(priority=15)
	public void TCED14095() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			// Method for StudentFilters
			StudentFiltersParampage();

			Assert.assertEquals( getText("//*[@id='ctl00_MainContent_grdQuestions_ctl02_trQuestionStandardHeading']/td/span"),"Question Standards");			

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	




	@Test(priority=16)
	public void TCED14096() 
	{
		try
		{
			// TO click the link
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[4]/td/table/tbody/tr/td[2]/a");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	





	@Test(priority=17)
	public void TCED14097() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			Thread.sleep(1000);
			// Method for StudentFilters
			StudentFiltersParampage();

			click("//a[contains(text(),'6(37.5%)')]");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	



	@Test(priority=18)
	public void TCED14098() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			Thread.sleep(1000);
			// Method for StudentFilters
			StudentFiltersParampage();
			click("//a[contains(text(),'1(6.25%)')]");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	


	@Test(priority=19)
	public void TCED14099() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			Thread.sleep(1000);
			// Method for StudentFilters
			StudentFiltersParampage();

			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblStudentNumber']/a");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	

	@Test(priority=20)
	public void TCED14100() 
	{
		try
		{
			// Method for Report param pages
			ReportParam ();
			Thread.sleep(1000);
			// Method for StudentFilters
			StudentFiltersParampage();

			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblPercentage']/a");
			// Method for Studentdetail
			AssertStudentdetailHeaders();

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	


	@Test(priority=21)
	public void TCED14101() 
	{
		try
		{	// Method for Report param pages
			ReportParam ();
			//To click on run report in param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			//To delete all the files in the directory
			FileDelete();
			//To click on the Print on PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF1']");
			Thread.sleep(4000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");		

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	


	@Test(priority=22)
	public void TCED14102() 
	{
		try
		{	// Method for Report param pages
			ReportParam ();

			//To click on run report in param page
			click("//input[@id='ctl00_MainContent_btnFilter']");
			Thread.sleep(2000);	
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print on CSV
			click("//input[@id='ctl00_MainContent_btnExportToCSV']");
			Thread.sleep(5000);	
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	

	@Test(priority=23)
	public void TCED14103() 

	{
		try
		{	// Method for Report param pages
			ReportParam ();

			//To click on run report in param page
			click("//input[@id='ctl00_MainContent_btnFilter']");
			//To check the Testing Summary page
			
			String xpath = "//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[4]/td/table/tbody/tr/td[7]/a";
			objTestingSummary.TestingSummarypopup(xpath);

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	


	@Test(priority=24)
	public void TCED14104() 
	{
		try
		{	//To check the Assessment print reports
			
			String xpath = "//a[@id='ctl00_MainContent_lnkassessmentPDF']";
			
			objAssessmentPrint.AssessmentPrintReports(xpath);


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	



	//***************Methods****************//

	public void ReportParam ()

	{

		WebElement element = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	
		//Click on main menu local Assesment.
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");

		//To click on the analyze by Score
		click("//a[contains(.,'Analyze Scores')]");

		//To click on the item analysis by student link text
		click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

		Assert.assertEquals( "Item Analysis by Question", getText("//span[@class='administitle']"));	

		//To fill the the Test ID Search 
		type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']", "314");

		//To click on the search button
		click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");

		//To select the Assessment 
		new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAssessments']"))).selectByVisibleText("For Automation- do not edit");

		//To select the Administrations
		new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlAdministrations']"))).selectByVisibleText("For Automation- do not edit (Admin)(2017-2018)");

		//To click on the run report button
		click("//*[@id='ctl00_MainContent_btnAnalyse']");

	}


	public void AssertStudentdetailHeaders()

	{
		// To Assert the Validation Messages
		Assert.assertEquals( getText("//span[@class='subheading']"),"Assessment Students List");	

		Assert.assertEquals( getText("//*[@id='ctl00_MainContent_tblSummary']/tbody/tr[1]/td[2]"),"Item Analysis");	

		Assert.assertEquals(getText("//a[contains(text(),'Student ID')]"), "Student ID");

		Assert.assertEquals( getText("//a[contains(text(),'Last Name')]"),"Last Name");

		Assert.assertEquals( getText("//a[contains(text(),'First Name')]"),"First Name");

		Assert.assertEquals( getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"),"Grade");

		Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'School')]"), "School");

		Assert.assertEquals(getText("//a[contains(text(),'Ethnicity')]"), "Ethnicity");

		Assert.assertEquals( getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[11]/a"),"IEP");

		Assert.assertEquals( getText("//a[contains(text(),'ELL')]"),"ELL");

		Assert.assertEquals( getText("//a[contains(text(),'Ec. Disadvantaged')]"),"Ec. Disadvantaged");
	}

	public void BuildingFiltersParamPage() throws InterruptedException

	{
		//To select the building  
		select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");

		//To select the Teacher 
		Thread.sleep(2000);
		select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");

		//To click on the run report
		click("//input[@id='ctl00_MainContent_btnFilter']");
	}

	public void StudentFiltersParampage() throws InterruptedException

	{
		click("//input[@id='ctl00_MainContent_rbStudentGroup']");
		Thread.sleep(1000);

		//To select the Student Grp  
		select("//select[@id='ctl00_MainContent_ddlStudentGroup']","00 123 MR");
		//To click on the run report
		click("//input[@id='ctl00_MainContent_btnFilter']");
	}
}









