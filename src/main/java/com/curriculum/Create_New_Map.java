package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
/**
 * 
 * @author sebastian jose(Create new Map)
 *
 */

public class Create_New_Map extends BaseClassOne {
	
	String CourseTitle;
	
	@Test(priority=1)
	public void TCED29101() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
		
			//hover over curriculum link
			Actions act=new Actions(driver);
					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
			
			//To click on the create a new map
			click("//a[contains(text(),'Create New Map')]");
			
			Assert.assertEquals(getText("//h4[@class='CurriculumTitle']"), "Create New Map - Department or Sub-group Login Access");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	

	@Test(priority=2)
	public void TCED29102() 
	{
		try
		{
			Assert.assertEquals(getText("//table[@class='InputGeneral']//tbody//tr[1]//td[1]"), "To create a new curriculum map"
					+ " you must first select the curriculum login account it will be created under.");
			
			Assert.assertTrue(driver.getPageSource().contains("Please select a curriculum login account you have permissions to: "));
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=3)
	public void TCED29103() 
	{
		try
		{
			//To click on the the create map button
			click("//input[@id='ctl00_MainContent_btnCreateMap']");
			
			//Assert the location of the page
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapTitleDescription1_lblSectionTitle']"), "Title and Description","Create Map Button Navigation is not working properly");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=4)
	public void TCED29104() 
	{
		try
		{
			//Assert the curriculum Map Section
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapEditMenu1_lblMenuHeading']"), "Curriculum Map Sections");
			
			//Assert the Course Title and Description
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkMap']"), "Course Title and Description");
			
			//Assert the Course Units/Topics
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapEditMenu1_lblUnitTopic']"), "Units/Topics");
			
			//Assert the Course Units/Topics
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_CurriculumMapEditMenu1_chkExpandAllUnits']"), "Expand All Units");
			
			//Assert the Course Topic/Unit Order
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkOrder']"), "Topic/Unit Order");
			
			//Assert the Course Enter Weeks/Minutes
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkWeeksMinutes']"), "Enter Weeks/Minutes");
			
			//Assert the Course Enter Weeks/Minutes
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkCopyCurrentMap']"), "Copy Current Map");
			
			//Assert the Course Enter Weeks/Minutes
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkViewEntireMap']"), "View/Print");
			
			//Assert the Course Enter Weeks/Minutes
			Assert.assertEquals(getText("//a[@id='lnkAnalyzeSubmenu']"), "Analyze Curriculum");
			
			//Assert the Course Enter Weeks/Minutes
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_CurriculumMapEditMenu1_lnkMainMenu']"), "Back to main menu");
			
			
			//******Title and description detaills*************************
			
			//Assert the the label name
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_CurriculumMapTitleDescription1_btnGeneral']"), "General Info");
			
			//Assert the the label name
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_CurriculumMapTitleDescription1_btnResources']"), "Resources");
			
			//Assert the the label name
			Assert.assertEquals(getText("//td[contains(text(),'Course Title:')]"), "Course Title:");
			
			//Assert the the label name
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapTitleDescription1_Label1']"), "*");
			
			//Assert the the label name
			Assert.assertEquals(getText("//td[contains(text(),'View Type:')]"), "View Type:");
			
			//Assert the the label name
			Assert.assertTrue(driver.getPageSource().contains("Status:"));
			//Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']//table[3]//tbody[1]//tr[1]//td[3]"), "Status:");
			
			//Assert the the label name
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_CurriculumMapTitleDescription1_chkShareMap']"), "Share Map:");
			
			//Assert the the label name
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapTitleDescription1_lblCourse']"), "Course");
			
			//Assert the the label name
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapTitleDescription1_lblMinutes']"), "Minutes in Period:");
			
			//Assert the the label name
			Assert.assertTrue(driver.getPageSource().contains("Beginning Grade:"));
			//Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']//table[5]//tbody[1]//tr[1]//td[3]"), "Beginning Grade:");
			
			//Assert the the label name
			Assert.assertTrue(driver.getPageSource().contains("Ending:"));
			//Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']//table[5]//tbody[1]//tr[1]//td[4]"), "Ending:");
			
			//Assert the the label name
			Assert.assertEquals(getText("//table[@class='InputGeneral']//td[@colspan='3']"), "[No Topics Found]");
			
			//Assert the the label name
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']//table[6]//tbody[1]//tr[2]//td[1]"), "Please enter and save the title"
					+ " and course to edit the entire map.");
		
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=5)
	public void TCED29105() 
	{
		try
		{
			//To click on the save map general info
			click("//input[@id='ctl00_MainContent_CurriculumMapTitleDescription1_btnSave']");
			
			//Assert the validation message
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']//table[6]//tbody[1]//tr[2]//td[1]"), "You must enter both a title and course name to "
																																						+ "continue! Changes not saved!\n \nPlease enter and save the title"
																																						+ " and course to edit the entire map.");
			
			//Assert the field validation
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapTitleDescription1_Label3']"), "* (required)");
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=6)
	public void TCED29106() 
	{
		try
		{
			CourseTitle="Course Title"+generateRandomData();
			//To fill the course title
			type("//input[@id='ctl00_MainContent_CurriculumMapTitleDescription1_txtTitle']",CourseTitle);
			
			//To select mathematics as subject
			select("//select[@id='ctl00_MainContent_CurriculumMapTitleDescription1_cbddlSubjects']","Mathematics");
			
			
			//To select course as 7 months
			select("//select[@id='ctl00_MainContent_CurriculumMapTitleDescription1_ddlCourse']","7 Math");
			
			//To click on the save map general information
			click("//input[@id='ctl00_MainContent_CurriculumMapTitleDescription1_btnSave']");
			
			//Assert the field validation
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapTitleDescription1_Label3']"), "* (required)");
			
			String Success=getText("//span[@id='ctl00_MainContent_CurriculumMapTitleDescription1_ErrorMessages1_lblMessages']/p");
			System.out.println(Success);
			
			String result = Success.split("@")[0];
			System.out.println(result);
			
			//Assert the field validation
			Assert.assertEquals(result,"Your changes have been saved successfully - ");
			
			//Assert the randomly generated data
			Assert.assertEquals(getValue("//input[@id='ctl00_MainContent_CurriculumMapTitleDescription1_txtTitle']"),CourseTitle );
			
			//Assert the label names
			Assert.assertEquals(getText("//a[contains(text(),'Course Description')]"),"Course Description");
			
			//Assert the label names
			Assert.assertEquals(getText("//a[contains(text(),'Course Textbooks, Workbooks, Materials Citations')]"),"Course Textbooks, Workbooks, Materials Citations");
			
			//Assert the label names
			Assert.assertEquals(getText("//a[contains(text(),'Course Interdisciplinary Connections')]"),"Course Interdisciplinary Connections");
			
			//Assert the label names
			Assert.assertEquals(getText("//a[contains(text(),'Pacing Calendar')]"),"Pacing Calendar");
			
			//Assert the label names
			Assert.assertEquals(getText("//a[contains(text(),'Course Notes')]"),"Course Notes");
			
				
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
		@Test(priority=7)
		public void TCED29107() 
		{
			try
			{
				String Text1=EditpopUp("Course Description");
				
				String Text2=EditpopUp("Course Textbooks, Workbooks, Materials Citations");
				
				String Text3=EditpopUp("Course Interdisciplinary Connections");
				
				String Text4=EditpopUp("Pacing Calendar");
				
				String Text5=EditpopUp("Course Notes");
					
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		
		
		public String EditpopUp(String Link)
		{
			click("//a[contains(text(),'"+Link+"')]");
			
			//To click on the 
			SwitchFrameName("rwShowEdit");
			
			//Assert the label names
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblFieldHeading']"),Link);
			
			//Assert the label names
			Assert.assertEquals(getText("//div[@id='ctl00_ContentPlaceHolder1_UpdatePanel1']/span"),"Time last updated: ---");
			
			//Assert the label names
			Assert.assertEquals(getText("//a[@id='ctl00_ContentPlaceHolder1_hlinkStanards']"),"Show Aligned Standards");
			
			//To click on the Show Aligned Standards
			click("//a[@id='ctl00_ContentPlaceHolder1_hlinkStanards']");
			
			SwitchFrameName("rwStandards");
			
			//Assert the label names
			Assert.assertEquals(getText("//form[@id='aspnetForm']/div[4]/div/div[2]/input"),"Standards Aligned for Entire Course Map");
			
			click("//input[@id='ctl00_ContentPlaceHolder1_btnCloseTop']");
			
			driver.switchTo().parentFrame();
			
			
			SwitchFrame("ctl00_ContentPlaceHolder1_radInput_contentIframe");
			
			driver.findElement(By.xpath("//body")).click();
			
			String Text="asdas joseee ssdf f sf fjhsdfh svhf sdjvfsfsdfs";
			driver.findElement(By.xpath("//body")).sendKeys(Text);
			
			driver.switchTo().parentFrame();
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnUpdateContinue")).click();
			
			driver.switchTo().parentFrame();
			
			click("//span[@title='Close']");
			
			return Text;
			
		}
}



