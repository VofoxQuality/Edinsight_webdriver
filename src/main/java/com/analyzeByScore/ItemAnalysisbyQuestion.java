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
		{	//Supertent Login
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
			Assert.assertEquals( "Total Scheduled Students:", getText("//td[contains(text(),'Total Scheduled Students:')]"));	

			Assert.assertEquals( "Total test completed and scored:", getText("//td[contains(text(),'Total test completed and scored:')]"));	

			Assert.assertEquals( "Total tests started but not completed:", getText("//td[contains(text(),'Total tests started but not completed:')]"));	

			Assert.assertEquals( "Run Report By Building", getText("//label[@for='ctl00_MainContent_rbBuilding']"));	

			Assert.assertEquals( "School:", getText("//td[contains(text(),'School:')]"));	

			Assert.assertEquals( "Select Teacher :", getText("//td[contains(text(),'Select Teacher :')]"));	

			Assert.assertEquals( "Course/Section :", getText("//td[contains(text(),'Course/Section :')]"));	

			Assert.assertEquals( "Run Report By Student Group", getText("//label[@for='ctl00_MainContent_rbStudentGroup']"));	

			Assert.assertEquals( "Student Group", getText("//span[contains(text(),'Student Group')]"));	

			Assert.assertEquals( "Filter Questions with:", getText("//td[contains(text(),'Filter Questions with:')]"));	

			Assert.assertEquals( "Rationale Display Options:", getText("//td[contains(text(),'Rationale Display Options:')]"));	

			Assert.assertEquals( "Display question prompt for each question", getText("//label[@for='ctl00_MainContent_chkShowQuestionPrompt']"));	

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
			Assert.assertEquals( "Question Standards", getText("//*[@id='ctl00_MainContent_grdQuestions_ctl02_trQuestionStandardHeading']/td/span"));	

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
			click("//a[contains(text(),'8')]");
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
			click("//a[contains(text(),'6(75%)')]");
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
			click("//a[contains(text(),'1(12.5%)')]");
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
			click("//a[contains(text(),'4')]");
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

			click("//a[contains(text(),'2(50%)')]");
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

			click("//a[contains(text(),'1(25%)')]");
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

			Assert.assertEquals( "Question Standards", getText("//*[@id='ctl00_MainContent_grdQuestions_ctl02_trQuestionStandardHeading']/td/span"));			

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
			click("//a[contains(text(),'8')]");
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

			click("//a[contains(text(),'6(75%)')]");
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
			click("//a[contains(text(),'1(12.5%)')]");
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

			//To click on the Print on CSV
			click("//input[@id='ctl00_MainContent_btnExportToCSV']");
			Thread.sleep(4000);	
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
		//	objTestingSummary.TestingSummarypopup();

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
			objAssessmentPrint.AssessmentPrintReports();


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
		Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

		Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

		Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

		Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

		Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

		Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

		Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

		Assert.assertEquals( "IEP", getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[11]/a"));

		Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

		Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));
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









