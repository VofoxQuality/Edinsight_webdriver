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

import Library.BaseClassOne;

public class ItemAnalysisbyQuestion extends BaseClassOne {

	@Test(priority=1)
	public void TCED14081() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

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
			// TO click the link
			click("//a[contains(text(),'8')]");
			
			// To Assert the Validation Messages

			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));

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
		{
			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//a[contains(text(),'6(75%)')]");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));

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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//a[contains(text(),'1(12.5%)')]");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));

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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblStudentNumber']/a");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));

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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblPercentage']/a");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));

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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			Thread.sleep(1000);
			//To select the building  
			select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");

			//To select the Teacher 
			Thread.sleep(2000);
			select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");

			//To click on the run report
			click("//input[@id='ctl00_MainContent_btnFilter']");

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
			// To Assert the Validation Messages
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));

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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			Thread.sleep(1000);
			//To select the building  
			select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");

			//To select the Teacher 
			Thread.sleep(2000);
			select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");


			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//a[contains(text(),'2(50%)')]");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));



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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			Thread.sleep(1000);
			//To select the building  
			select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");

			//To select the Teacher 
			Thread.sleep(2000);
			select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");


			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//a[contains(text(),'1(25%)')]");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));



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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			Thread.sleep(1000);
			//To select the building  
			select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");

			//To select the Teacher 
			Thread.sleep(2000);
			select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");


			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblStudentNumber']/a");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));



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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			Thread.sleep(1000);
			//To select the building  
			select("//*[@id='ctl00_MainContent_ddlSchool']","Ashley High School");

			//To select the Teacher 
			Thread.sleep(2000);
			select("//*[@id='ctl00_MainContent_ddlStaff']","Ableton, A - 10");


			//To click on the run report param page
			click("//input[@id='ctl00_MainContent_btnFilter']");

			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblPercentage']/a");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));



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
			
			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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
			
			click("//input[@id='ctl00_MainContent_rbStudentGroup']");
			Thread.sleep(1000);

			//To select the Student Grp  
			select("//select[@id='ctl00_MainContent_ddlStudentGroup']","00 123 MR");

			click("//input[@id='ctl00_MainContent_btnFilter']");

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
			// To Assert the Validation Messages
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));

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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			Thread.sleep(1000);
			click("//input[@id='ctl00_MainContent_rbStudentGroup']");
			Thread.sleep(1000);

			//To select the Student Grp  
			select("//select[@id='ctl00_MainContent_ddlStudentGroup']","00 123 MR");

			click("//input[@id='ctl00_MainContent_btnFilter']");
			

			click("//a[contains(text(),'6(75%)')]");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));



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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			Thread.sleep(1000);
			click("//input[@id='ctl00_MainContent_rbStudentGroup']");
			Thread.sleep(1000);

			//To select the Student Grp  
			select("//select[@id='ctl00_MainContent_ddlStudentGroup']","00 123 MR");

			click("//input[@id='ctl00_MainContent_btnFilter']");
			
			click("//a[contains(text(),'1(12.5%)')]");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));



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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			Thread.sleep(1000);
			click("//input[@id='ctl00_MainContent_rbStudentGroup']");
			Thread.sleep(1000);

			//To select the Student Grp  
			select("//select[@id='ctl00_MainContent_ddlStudentGroup']","00 123 MR");

			click("//input[@id='ctl00_MainContent_btnFilter']");
			
			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblStudentNumber']/a");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));



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

			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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

			Thread.sleep(1000);
			click("//input[@id='ctl00_MainContent_rbStudentGroup']");
			Thread.sleep(1000);

			//To select the Student Grp  
			select("//select[@id='ctl00_MainContent_ddlStudentGroup']","00 123 MR");

			click("//input[@id='ctl00_MainContent_btnFilter']");
			
			click("//*[@id='ctl00_MainContent_grdQuestions_ctl02_grdQuestionDetails_ctl02_lblPercentage']/a");

			// TO Assert the header Grid labels
			Assert.assertEquals( "Assessment Students List", getText("//span[@class='subheading']"));	

			Assert.assertEquals( "Student ID", getText("//a[contains(text(),'Student ID')]"));

			Assert.assertEquals( "Last Name", getText("//a[contains(text(),'Last Name')]"));

			Assert.assertEquals( "First Name", getText("//a[contains(text(),'First Name')]"));

			Assert.assertEquals( "Grade", getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"));

			Assert.assertEquals( "School", getText("//a[@title='Click here to sort'][contains(text(),'School')]"));

			Assert.assertEquals( "Ethnicity", getText("//a[contains(text(),'Ethnicity')]"));

			Assert.assertEquals( "ELL", getText("//a[contains(text(),'ELL')]"));

			Assert.assertEquals( "Ec. Disadvantaged", getText("//a[contains(text(),'Ec. Disadvantaged')]"));



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
		{
			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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
		{
			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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
		{
			//Click on main menu local Assesment (to handle mainframe header elements)
			WebElement w1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"));
			Actions action = new Actions(driver);	  
			action.moveToElement(w1).click().build().perform();

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the item analysis by student link text
			click("//*[@id='ctl00_MainContent_hlnkItemAnalysis']");

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
			
			//To click on run report in param page
			click("//input[@id='ctl00_MainContent_btnFilter']");
			
			//To click on the Testing Summary			
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[4]/td/table/tbody/tr/td[7]/a");
			Thread.sleep(2000);
			// To switch to frame
			driver.switchTo().frame("rwTestSummery");
			
			Thread.sleep(2000);
			//To Assert the Grid labels
			Assert.assertEquals("Testing Summary", getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='##LOC[Cancel]##'])[2]/following::span[1]"));
						
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_lblSchoolHCompletionRate']").contains("School with the highest completion rate"),"failed to assert text"+"School with the highest completion rate");
			
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_lblSchoolLCompletetionRate']").contains("School with the lowest completion rate"),"failed to assert text"+"School with the lowest completion rate");
			
			Assert.assertEquals("School/Building", getText("//*[@id='ctl00_ContentPlaceHolder1_rgTestingSummeryReportr_ctl00']/thead/tr/th[1]/a"));

			Assert.assertEquals("Scheduled Students", getText("//*[@id='ctl00_ContentPlaceHolder1_rgTestingSummeryReportr_ctl00']/thead/tr/th[5]/a"));
			
			Assert.assertEquals("Completed", getText("//*[@id='ctl00_ContentPlaceHolder1_rgTestingSummeryReportr_ctl00']/thead/tr/th[6]/a"));
			
			Assert.assertEquals("Not Completed", getText("//*[@id='ctl00_ContentPlaceHolder1_rgTestingSummeryReportr_ctl00']/thead/tr/th[7]/a"));
			
			
			//To click on the options button
			click("//*[@id='ctl00_ContentPlaceHolder1_RadButton1']");
			
			//To delete all the files in the directory
			FileDelete();
			
			
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
			Thread.sleep(3000);
			// To switch to parent 
			driver.switchTo().parentFrame();
			
			// To close the page
			click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Session Timeout'])[1]/preceding::span[3]");
			Thread.sleep(3000);
				
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
		{
			
			//To click here to see the test
			click("//a[@id='ctl00_MainContent_lnkassessmentPDF']");
			
			//To select the frame
			SwitchFrameName("Assessment Print");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click print pdf
	/*		
			click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfQuestions']");
			Thread.sleep(10000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			*/
			//To click on the print word
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkWordQuestion']");
			Thread.sleep(10000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
			
			//To delete all the files in the directory
			FileDelete();
		/*	
			//To click on the Print OE to PDF
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkOePdfQuestions']");
			Thread.sleep(6000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

			*/
			//To click on the OE to Word
			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_linkOeWordQuestions']");
			Thread.sleep(6000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");

			//*******Print answer Key**********************
			
			//To delete all the files in the directory
			FileDelete();
		/*	
			//To click print pdf
			click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfAnswer']");
			Thread.sleep(6000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			*/
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
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	
	
}

