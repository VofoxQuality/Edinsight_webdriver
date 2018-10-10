package com.curriculum;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
	String UnitTitle;
	String ResourceName;
	String parentHandle;
	
	String richtextboxText1;
	String richtextboxText2;
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
			Thread.sleep(2000);
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
		//@Test(priority=7)
		public void TCED29107() 
		{
			try
			{
				//To check the functionality of the pop up Course Description
				String Text1=saveandcontinue("Course Description");
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]"),Text1);
				
				Thread.sleep(2000);
				String Texta1=Saveandclose("Course Description");
				
				Thread.sleep(3000);
				System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]"));
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]"),Texta1);
				
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}	
		//@Test(priority=8)
		public void TCED29108() 
		{
			try
			{
				//To check the functionality of the pop up Course Textbooks, Workbooks, Materials Citations
				String Text1=saveandcontinue("Course Textbooks, Workbooks, Materials Citations");
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]"),Text1);
				Thread.sleep(2000);
				String Texta1=Saveandclose("Course Textbooks, Workbooks, Materials Citations");
				
				Thread.sleep(3000);
				System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]"));
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]"),Texta1);
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		//@Test(priority=9)
		public void TCED29109() 
		{
			try
			{
				//To check the functionality of the pop up Course Interdisciplinary Connections
				String Text1=saveandcontinue("Course Interdisciplinary Connections");
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[3]/tbody/tr[2]/td[2]"),Text1);
				Thread.sleep(2000);
				String Texta1=Saveandclose("Course Interdisciplinary Connections");
				
				Thread.sleep(3000);
				System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[3]/tbody/tr[2]/td[2]"));
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[3]/tbody/tr[2]/td[2]"),Texta1);
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		//@Test(priority=10)
		public void TCED29110() 
		{
			try
			{
				//To check the functionality of the pop up Course Interdisciplinary Connections
				String Text1=saveandcontinue("Pacing Calendar");
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[4]/tbody/tr[2]/td[2]"),Text1);
				Thread.sleep(2000);
				String Texta1=Saveandclose("Pacing Calendar");
				
				Thread.sleep(3000);
				System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[4]/tbody/tr[2]/td[2]"));
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[4]/tbody/tr[2]/td[2]"),Texta1);
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		} 
		
		//@Test(priority=11)
		public void TCED29111() 
		{
			try
			{
				//To check the functionality of the pop up Course Interdisciplinary Connections
				String Text1=saveandcontinue("Course Notes");
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[5]/tbody/tr[2]/td[2]"),Text1);
				Thread.sleep(2000);
				String Texta1=Saveandclose("Course Notes");
				
				Thread.sleep(3000);
				System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[5]/tbody/tr[2]/td[2]"));
				
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[5]/tbody/tr[2]/td[2]"),Texta1);
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		//@Test(priority=12)
		public void TCED29112() 
		{
			try
			{
				//To click on the copy from curriculum
				click("//input[@id='ctl00_MainContent_CurriculumMapTitleDescription1_btnCopyFromCurriculum']");
				
				Assert.assertEquals(getText("//h6[@class='rwTitle']"), "Copy From Curriculum");
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		} 
		
		//@Test(priority=13)
		public void TCED29113() 
		{
			try
			{
				SwitchFrameName("CopyCurriculum");
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Subject')]"), "Subject");
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Course Map')]"), "Course Map");
				
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Unit Name')]"), "Unit Name");
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Topic Name')]"), "Topic Name");
				
				
				//To assert the label name
				Assert.assertEquals(getText("//form[@id='aspnetForm']/div[4]/div/table/tbody/tr[7]/td[2]/label"), "Display all COPY FROM deactivated fields?");
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		
		//@Test(priority=14)
		public void TCED29114() 
		{
			try
			{
				//To select the subject
				select("//select[@id='ctl00_ContentPlaceHolder1_ddlSubject']","Mathematics");
				
				//To assert the selected value
				Assert.assertEquals(DropselectedValue("//select[@id='ctl00_ContentPlaceHolder1_ddlSubject']"), "Mathematics");
				
				//To select the course map
				select("//select[@id='ctl00_ContentPlaceHolder1_ddlCourseMap']","zxxxx 123");
				Thread.sleep(2000);
				
				//To assert the selected value
				Assert.assertEquals(DropselectedValue("//select[@id='ctl00_ContentPlaceHolder1_ddlCourseMap']"), "zxxxx 123");
				
				
				//To assert the label name
				Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblMsg']"), "Sorry No Units found...");
				
				
				  
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		//@Test(priority=15)
		public void TCED29115() 
		{
			try
			{
				//To select the course map
				Thread.sleep(2000);
				select("//select[@id='ctl00_ContentPlaceHolder1_ddlCourseMap']","01 demo");
				Thread.sleep(2000);
				
				//To assert the label
				Assert.assertEquals(getText("//a[@id='ctl00_ContentPlaceHolder1_lnkPrintView']"), "View/Print Map");
				
				//To click on the fill grid
				click("//input[@id='ctl00_ContentPlaceHolder1_btnFillGrid']");
				
				//To assert the label
				Assert.assertEquals(getText("//table[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps']/tbody/tr/th[2]"), "Copy From");
				
				//To assert the label
				Assert.assertEquals(getText("//table[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps']/tbody/tr/th[3]"), "Copy To");
				
				//To assert the label
				Assert.assertEquals(getText("//table[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps']/tbody/tr/th[4]"), "Append To");
				
				
				  
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		//@Test(priority=16)
		public void TCED29116() 
		{
			try
			{
				//To assert the label name
				Assert.assertEquals(getText("//table[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps']/tbody/tr[2]/td[2]"), "Course Description");
				
				//To assert the label name
				Assert.assertEquals(getText("//table[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps']/tbody/tr[3]/td[2]"), "Course Interdisciplinary Connections");
				
				//To assert the label name
				Assert.assertEquals(getText("//table[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps']/tbody/tr[4]/td[2]"), "Course Notes");
				
				//To assert the label name
				Assert.assertEquals(getText("//table[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps']/tbody/tr[5]/td[2]"), "Course Textbooks, Workbooks, Materials Citations");
				
				//To assert the label name
				Assert.assertEquals(getText("//table[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps']/tbody/tr[6]/td[2]"), "Pacing Calendar");
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		//@Test(priority=17)
		public void TCED29117() 
		{
			try
			{
			
			//String[] Listlabels = {"--Select--","Course Description", "Course Interdisciplinary Connections", "Course Notes", "Course Textbooks, Workbooks, Materials Citations", "Pacing Calendar"}; 
			//Assert.assertTrue(dropelementfinder("//select[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps_ctl02_ddlCopyTo']",Listlabels),"Expected list label is not found in the list");
				
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		//@Test(priority=18)
		public void TCED29118() 
		{
			try
			{
				//To check all the check boxes
				click("//input[@id='ctl00_ContentPlaceHolder1_gvCurriculumMaps_ctl01_chkHeader']");
				
				//To click on the appanded data
				click("//input[@id='ctl00_ContentPlaceHolder1_btnAppendData']");
				
				
				Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblMsg']"), "The selected fields are updated successfully");
			
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		//@Test(priority=19)
		public void TCED29119() 
		{
			try
			{
				
				//To click on the close button
				click("//input[@id='ctl00_ContentPlaceHolder1_btnCancel']");
				
				//To switch to parent frame
				driver.switchTo().parentFrame();
				
			/*	//To assert the appended data contains in the course description text box
				String actualString = driver.findElement(By.xpath(("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/a");
						
				System.out.println(actualString);
				
				String expectedString = "Helllo World";
				
				Assert.assertTrue(actualString.contains(expectedString), "Appended data not updated properly");
				
				
				//To assert the appended data contains in the Course Textbooks, Workbooks, Materials Citations
				String actualString1 = getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]");
				System.out.println(actualString1);
				String expectedString1 = "Test 123";
				
				Assert.assertTrue(actualString1.contains(expectedString1), "Appended data not updated properly");
				
				
				//To assert the appended data contains in the Course Interdisciplinary Connections
				String actualString2 = getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[3]/tbody/tr[2]/td[2]");
				System.out.println(actualString2);
				String expectedString2 = "Test 789";
				
				Assert.assertTrue(actualString2.contains(expectedString2), "Appended data not updated properly");
				
				

				//To assert the appended data contains in the Pacing Calendar
				String actualString3 = getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[4]/tbody/tr[2]/td[2]");
				System.out.println(actualString3);
				String expectedString3 = "XYZ";
				
				Assert.assertTrue(actualString3.contains(expectedString3), "Appended data not updated properly");
				
				
				//To assert the appended data contains in the Course Notes
				String actualString4 = getText("//div[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[6]/tbody/tr[2]/td/table[5]/tbody/tr[2]/td[2]");
				System.out.println(actualString4);
				String expectedString4 = "1234567890";
				
				Assert.assertTrue(actualString4.contains(expectedString4), "Appended data not updated properly"); */
			
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		
		@Test(priority=20)
		public void TCED29120() 
		{
			try
			{
				//To click on the resource link
				click("//a[@id='ctl00_MainContent_CurriculumMapTitleDescription1_btnResources']");
				
				//assert the header
				Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblSectionTitle']"), "Resources for Map - "+CourseTitle);
				
				
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		@Test(priority=21)
		public void TCED29121() 
		{
			try
			{
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='ctl00_MainContent_Resource2Search_gcResources_ctl00']/thead/tr/th[4]"), "Resource");
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='ctl00_MainContent_Resource2Search_gcResources_ctl00']/thead/tr/th[5]"), "Description");
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='ctl00_MainContent_Resource2Search_gcResources_ctl00']/thead/tr/th[6]"), "Subject");
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='ctl00_MainContent_Resource2Search_gcResources_ctl00']/thead/tr/th[7]"), "Media Type");
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='Table1']/tbody/tr[3]/td"), "Resource Name:");
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='Table1']/tbody/tr[4]/td"), "Subject:");
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='Table1']/tbody/tr[5]/td"), "Grade Level:");
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='Table1']/tbody/tr[6]/td"), "Media Type:");
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='Table1']/tbody/tr[7]/td"), "Difficulty :");
				
				//assert the label name
				Assert.assertEquals(getText("//table[@id='Table1']/tbody/tr[8]/td"), "Item Alignment :");
				
				
				
				//assert the label name
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_Resource2Search_pvMainCriteria']/div/table/tbody/tr/td[2]/table/tbody/tr[3]/td"), "Webbs Cognitive :");
				
				//assert the label name
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_Resource2Search_pvMainCriteria']/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td"), "Blooms Cognitive :");
				
				
				//assert the label name
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_Resource2Search_pvMainCriteria']/div/table/tbody/tr/td[2]/table/tbody/tr[5]/td"), "Learning Styles :");
				
				//assert the label name
				Assert.assertEquals(getText("//div[@id='ctl00_MainContent_Resource2Search_pvMainCriteria']/div/table/tbody/tr/td[2]/table/tbody/tr[7]/td/span/label"), "Filter by Standards Found in Curriculum:");
				
				
				
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		@Test(priority=22)
		public void TCED29122() 
		{
			try
			{
				
				
				 parentHandle = driver.getWindowHandle(); // get the current window handle
				
				//To click on the new resource
				click("//input[@value='New Resource']");
				
				for (String winHandle : driver.getWindowHandles()) {
					
					// switch focus of WebDriver to the next found window handle (that's your newly opened window)
				    driver.switchTo().window(winHandle);
				    
				}
				
				Assert.assertEquals(getText("//td[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr/td[2]"), "Add/Edit Resource");
				
				
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		
		@Test(priority=23)
		public void TCED29123() 
		{
			try
			{
				
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Resource Name:')]"), "Resource Name:");
				
				//assert the label name
				Assert.assertEquals(getText("//span[@id='ctl00_MainContent_requiredLbl']"), "* (required)");
				
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Description:')]"), "Description:");
				
				//assert the label name
				Assert.assertEquals(getText("//td[@colspan='3']//span[contains(text(),' ')]"), "Select the type of resource and then provide either the web url or attachment.");
				
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Web URL:')]"), "Web URL:");
				
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Attachment:')]"), "Attachment:");
				
				//assert the label name
				//Assert.assertEquals(getText("//td[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[4]/td"), " Subject:");
				
				//assert the label name
				//Assert.assertEquals(getText("//td[@class='InputGeneral']//table[2]//tbody[1]//tr[5]//td[1]"), " Media Type:");
				
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Tagging')]"), "Tagging");
				
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Grade Level:')]"), "Grade Level:");
					
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Difficulty:')]"), "Difficulty:");
					
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Webbs Cognitive:')]"), "Webbs Cognitive:");
					
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Blooms Cognitive:')]"), "Blooms Cognitive:");
					
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Learning Styles:')]"), "Learning Styles:");
					
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Age Interest:')]"), "Age Interest:");
					
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Item Alignment:')]"), "Item Alignment:");
					
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Resource Name:')]"), "Resource Name:");
					
				//assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Resource Name:')]"), "Resource Name:");
						
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		@Test(priority=24)
		public void TCED29124() 
		{
			try
			{
				//To click on the save button
				click("//div[@id='ctl00_MainContent_dataEntryMenu']/ul/li[2]/span/img");
				
				//To assert the empty validation
				Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblMessage']"), "Resource Name cannot be blank");
				
				
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		@Test(priority=25)
		public void TCED29125() 
		{
			try
			{
				//To fill the resource name
				ResourceName="Qatest"+generateRandomData();
				type("//input[@id='ctl00_MainContent_txtEntryResourceName']",ResourceName);
				
				//Tofill the Web Url ]
				type("//input[@id='ctl00_MainContent_webUrlTxt']","www.google.co.in");
				
				
				//To select the subject as mathematics
				select("//select[@id='ctl00_MainContent_ddlResourceCategoryTypeCode']","Mathematics");
				
				//To select the Media Type
				select("//select[@id='ctl00_MainContent_ddlResourceMediaTypeId']","Document");
				
				//To select the item alignment
				select("//select[@id='ctl00_MainContent_ddlItemAlignment']","At Level");
				
				//To click on the save button
				click("//div[@id='ctl00_MainContent_dataEntryMenu']/ul/li[2]/span/img");
				
				//To assert the label name
				Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StateStandardSearch1_lblSectionTitle']"), "Resource Standards");
				
				//To assert the label name
				Assert.assertEquals(getText("//span[contains(text(),'Search for Standards')]"), "Search for Standards");
				
				//To assert the label name
				Assert.assertEquals(getText("//span[contains(text(),'Edit Selected Standards')]"), "Edit Selected Standards");
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Saved Favorites:')]"), "Saved Favorites:");
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Standards Type:')]"), "Standards Type:");
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Sub-Category:')]"), "Sub-Category:");
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Grade:')]"), "Grade:");
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Organizer:')]"), "Organizer:");
				
				//To assert the label name
				Assert.assertEquals(getText("//td[contains(text(),'Standard Contains:')]"), "Standard Contains:");
				
				driver.close();
				
				//To switch to parent window
				driver.switchTo().window(parentHandle);
				
				//To assert the label name
				Assert.assertEquals(getText("//tr[@id='ctl00_MainContent_Resource2Search_gcResources_ctl00__0']/td[4]"), ResourceName);
					
			}catch(Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
			@Test(priority=26)
			public void TCED29126() 
			{
				try
				{
					//To click on the search button
					click("//input[@id='ctl00_MainContent_Resource2Search_btnSearch']");
					
					//To assert the label name
					Assert.assertEquals(getText("//span[@id='ctl00_MainContent_Resource2Search_lblFiltering']"),"Current Filtering:");
					
					//To assert the label name
					Assert.assertEquals(getText("//th[contains(text(),'View')]"),"View");
					
					//To assert the label name
					Assert.assertEquals(getText("//table[@id='ctl00_MainContent_Resource2Search_rgResources_ctl00_Header']/thead/tr/th[3]"),"Resource");
					
					//To assert the label name
					Assert.assertEquals(getText("//table[@id='ctl00_MainContent_Resource2Search_rgResources_ctl00_Header']/thead/tr/th[4]"),"Description");
					
					//To assert the label name
					Assert.assertEquals(getText("//table[@id='ctl00_MainContent_Resource2Search_rgResources_ctl00_Header']/thead/tr/th[5]"),"Subject");
					
					//To assert the label name
					Assert.assertEquals(getText("//table[@id='ctl00_MainContent_Resource2Search_rgResources_ctl00_Header']/thead/tr/th[6]"),"Media Type");
					
					//To assert the label name
					Assert.assertEquals(getText("//table[@id='ctl00_MainContent_Resource2Search_rgResources_ctl00_Header']/thead/tr/th[7]"),"Add Ref.");
					
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			@Test(priority=27)
			public void TCED29127() 
			{
				try
				{
					//click on the add unit button
					click("//a[contains(text(),'Add Unit...')]");
					
					//To assert the label name
					Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapUnit1_lblSectionTitle']"),"[Unit] for Map - ''"+ CourseTitle+"''");
					
					//To assert the label name
					Assert.assertEquals(getText("//a[@id='ctl00_MainContent_CurriculumMapUnit1_btnGeneral']"),"General Info");
					
					
					
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			@Test(priority=28)
			public void TCED29128() 
			{
				try
				{
					//To assert the label name
					Assert.assertEquals(getText("//td[contains(text(),'Status:')]"),"Status:");
					
					//To assert the label name
					Assert.assertEquals(getText("//td[contains(text(),'Begin Date:')]"),"Begin Date:");
					
					//To assert the label name
					Assert.assertEquals(getText("//td[contains(text(),'End Date:')]"),"End Date:");
					
					//To assert the label name
					Assert.assertEquals(getText("//td[contains(text(),'Week Begin:')]"),"Week Begin:");
					
					//To assert the label name
					Assert.assertEquals(getText("//td[contains(text(),'Weeks of Instruction:')]"),"Weeks of Instruction:");
					
					//To assert the label name
					Assert.assertEquals(getText("//td[contains(text(),'[No Topics Found]')]"),"[No Topics Found]");
					
					//To assert the label name
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td"),"Please enter and save the title to edit this unit.");
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			@Test(priority=29)
			public void TCED29129() 
			{
				try
				{
					click("//input[@id='ctl00_MainContent_CurriculumMapUnit1_btnSave']");
					
					//To assert the label name
					Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CurriculumMapUnit1_ErrorMessages1_lblMessages']/p"),"You must enter a title to continue! Changes not saved!");
					
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			@Test(priority=30)
			public void TCED29130() 
			{
				try
				{
					//To fill the 
					UnitTitle="Unit Title"+generateRandomData();
					type("//input[@id='ctl00_MainContent_CurriculumMapUnit1_txtUnitName']",UnitTitle);
					
					//To click on the save button
					click("//input[@id='ctl00_MainContent_CurriculumMapUnit1_btnSave']");
					
					Thread.sleep(2000);
					
					String Success=getText("//span[@id='ctl00_MainContent_CurriculumMapUnit1_ErrorMessages1_lblMessages']/p");
											
					System.out.println(Success);
					
					String result = Success.split("@")[0];
					System.out.println(result);
					
					//Assert the field validation
					Assert.assertEquals(result,"Your changes have been saved successfully - ");
					
					//To assert the label name
					Assert.assertEquals(getText("//a[contains(text(),'Unit Assignments')]"),"Unit Assignments");
					

					//To assert the label name
					Assert.assertEquals(getText("//a[contains(text(),'Unit Big Ideas')]"),"Unit Big Ideas");
					

					//To assert the label name
					Assert.assertEquals(getText("//a[contains(text(),'Unit Essential Questions')]"),"Unit Essential Questions");
					
					
					//To assert the label name
					Assert.assertEquals(getText("//a[contains(text(),'Unit Essential Questions')]"),"Unit Essential Questions");
					
					//To assert the label name
					Assert.assertEquals(getText("//a[contains(text(),'Unit Key Terminology & Definitions')]"),"Unit Key Terminology & Definitions");
					
					//To assert the label name
					Assert.assertEquals(getText("//a[contains(text(),'Unit Materials')]"),"Unit Materials");
					
					//To assert the label name
					Assert.assertEquals(getText("//a[contains(text(),'Unit Assignments')]"),"Unit Assignments");
					
					//To assert the label name
					Assert.assertEquals(getText("//a[contains(text(),'Unit Assignments')]"),"Unit Assignments");
					
					//To assert the label name
					Assert.assertEquals(getText("//a[contains(text(),'Unit Notes')]"),"Unit Notes");
					
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			//@Test(priority=31)
			public void TCED29131() 
			{
				try
				{
					//To check the functionality of the Unit Description
					String Text1=saveandcontinue("Unit Description");
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/span"),Text1);
					Thread.sleep(2000);
					String Texta1=Saveandclose("Unit Description");
					
					Thread.sleep(3000);
					System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/span"));
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/span"),Texta1);
					
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			//@Test(priority=32)
			public void TCED29132() 
			{
				try
				{
					//To check the functionality of the Unit Description
					String Text1=saveandcontinue("Unit Big Ideas");
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]"),Text1);
					Thread.sleep(2000);
					String Texta1=Saveandclose("Unit Big Ideas");
					
					Thread.sleep(3000);
					System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]"));
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]"),Texta1);
					
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			//@Test(priority=33)
			public void TCED29133() 
			{
				try
				{
					//To check the functionality of the Unit Description
					String Text1=saveandcontinue("Unit Essential Questions");
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[3]/tbody/tr[2]/td[2]"),Text1);
					Thread.sleep(2000);
					String Texta1=Saveandclose("Unit Essential Questions");
					
					Thread.sleep(3000);
					System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[3]/tbody/tr[2]/td[2]"));
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[3]/tbody/tr[2]/td[2]"),Texta1);
					
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			@Test(priority=34)
			public void TCED29134() 
			{
				try
				{
					
					//To check the functionality of the Unit Description
					String Text1=Saveandcontinue_Miss_Match("Unit Key Terminology & Definitions","Unit Key Terminology");
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[4]/tbody/tr[2]/td[2]"),Text1);
					Thread.sleep(2000);
					
					String Texta1=Saveandclose("Unit Key Terminology & Definitions");
					Thread.sleep(3000);
					System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[4]/tbody/tr[2]/td[2]"));
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[4]/tbody/tr[2]/td[2]"),Texta1);
					
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			@Test(priority=35)
			public void TCED29135() 
			{
				try
				{
					//To check the functionality of Unit Materials
					String Text1=saveandcontinue("Unit Materials");
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[5]/tbody/tr[2]/td[2]"),Text1);
					Thread.sleep(2000);
					String Texta1=Saveandclose("Unit Materials");
					
					Thread.sleep(3000);
					System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[5]/tbody/tr[2]/td[2]"));
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[5]/tbody/tr[2]/td[2]"),Texta1);
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			@Test(priority=36)
			public void TCED29136() 
			{
				try
				{
					//To check the functionality of Unit Materials
					String Text1=saveandcontinue("Unit Assignments");
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[6]/tbody/tr[2]/td[2]"),Text1);
					Thread.sleep(2000);
					String Texta1=Saveandclose("Unit Assignments");
					
					Thread.sleep(3000);
					System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[6]/tbody/tr[2]/td[2]"));
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[6]/tbody/tr[2]/td[2]"),Texta1);
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			@Test(priority=37)
			public void TCED29137() 
			{
				try
				{
					//To check the functionality of Unit Materials
					String Text1=saveandcontinue("Unit Notes");
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[7]/tbody/tr[2]/td[2]"),Text1);
					Thread.sleep(2000);
					String Texta1=Saveandclose("Unit Notes");
					
					Thread.sleep(3000);
					System.out.println(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[7]/tbody/tr[2]/td[2]"));
					
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_CurriculumMapUnit1_pnlGeneral']/table[3]/tbody/tr[2]/td/table[7]/tbody/tr[2]/td[2]"),Texta1);
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			@Test(priority=38)
			public void TCED29138() 
			{
				try
				{
					
					
				}catch(Exception e) 
				{
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
//*****************************************************Pop up *******************************************************************************		
		
		public String saveandcontinue(String Link)
		{
			//To click on the link text
			click("//a[contains(text(),'"+Link+"')]");
			
			//To switch the frame to pop up
			SwitchFrameName("rwShowEdit");
			
			//Assert the label names
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblFieldHeading']"),Link);
			
			//Assert the label names
			Assert.assertEquals(getText("//div[@id='ctl00_ContentPlaceHolder1_UpdatePanel1']/span"),"Time last updated: ---");
			
			//Assert the label names
			Assert.assertEquals(getText("//a[@id='ctl00_ContentPlaceHolder1_hlinkStanards']"),"Show Aligned Standards");
			
			//To click on the Show Aligned Standards
			click("//a[@id='ctl00_ContentPlaceHolder1_hlinkStanards']");
			
			//To switch to Show Aligned Standards parent frame
			SwitchFrameName("rwStandards");
			
			//Assert the label names
			//Assert.assertEquals(getText("//form[@id='aspnetForm']/div[4]/div/div"),"Standards Aligned for Entire Course Map");
			
			//To click on the close button
			click("//input[@id='ctl00_ContentPlaceHolder1_btnCloseTop']");
			
			//To switch to parent frame
			driver.switchTo().parentFrame();
			
			SwitchFrame("ctl00_ContentPlaceHolder1_radInput_contentIframe");
			
			//Just click and focus to the rich text box
			driver.findElement(By.xpath("//body")).click();
			
			 richtextboxText1="Lorem Ipsum is simply dummy text of the printing and typesetting industry."
					+ " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
					+ "when an unknown printer took a galley of type and scrambled it to make a type "
					+ "specimen book.";
			
			//To send the texts into rich text box
			driver.findElement(By.xpath("//body")).sendKeys(richtextboxText1);
			
			driver.switchTo().parentFrame();
			
			//To click on the save and continue button
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnUpdateContinue")).click();
			
			//To switch To parent frame
			driver.switchTo().parentFrame();
			
			click("//span[@title='Close']");
			
			return richtextboxText1;	
		}
		
		public String Saveandclose(String Link)
		{
			//To click on the link text
			click("//a[contains(text(),'"+Link+"')]");
			
			//To switch the frame to pop up
			SwitchFrameName("rwShowEdit");
			
			
			SwitchFrame("ctl00_ContentPlaceHolder1_radInput_contentIframe");
			
			//Just click and focus to the rich text box
			//driver.findElement(By.xpath("//body")).click();
			click("//body");
			
			richtextboxText2="It is a long established fact that a reader will be distracted by the"
					+ " readable content of a page when looking at its layout. The point of using "
					+ "Lorem Ipsum is that it has a more-or-less normal distribution of letters";
			
			//To send the texts into rich text box
			driver.findElement(By.xpath("//body")).clear();
			type("//body",richtextboxText2);
			//driver.findElement(By.xpath("//body")).sendKeys(Text1);
			
			driver.switchTo().parentFrame();
			
			//To click on the save and continue button
			click("//input[@id='ctl00_ContentPlaceHolder1_btnUpdate']");
			
			Alert alert = driver.switchTo().alert();
			String msg=alert.getText();
			if(msg.equals("Your changes have been saved successfully."))
			{
				alert.accept();
			}
			//To switch To parent frame
			driver.switchTo().parentFrame();
			
			return richtextboxText2;	
				
		}	
		
		//**********************************For the link Unit Key Terminology & Definitions(Bug-Labels are miss matched)**************************
		public String Saveandcontinue_Miss_Match(String Link,String Header)
		{
			//To click on the link text
			click("//a[contains(text(),'"+Link+"')]");
			
			//To switch the frame to pop up
			SwitchFrameName("rwShowEdit");
			
			//Assert the label names
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblFieldHeading']"),Header);
			
			//Assert the label names
			Assert.assertEquals(getText("//div[@id='ctl00_ContentPlaceHolder1_UpdatePanel1']/span"),"Time last updated: ---");
			
			//Assert the label names
			Assert.assertEquals(getText("//a[@id='ctl00_ContentPlaceHolder1_hlinkStanards']"),"Show Aligned Standards");
			
			//To click on the Show Aligned Standards
			click("//a[@id='ctl00_ContentPlaceHolder1_hlinkStanards']");
			
			//To switch to Show Aligned Standards parent frame
			SwitchFrameName("rwStandards");
			
			//Assert the label names
			//Assert.assertEquals(getText("//form[@id='aspnetForm']/div[4]/div/div"),"Standards Aligned for Entire Course Map");
			
			//To click on the close button
			click("//input[@id='ctl00_ContentPlaceHolder1_btnCloseTop']");
			
			//To switch to parent frame
			driver.switchTo().parentFrame();
			
			SwitchFrame("ctl00_ContentPlaceHolder1_radInput_contentIframe");
			
			//Just click and focus to the rich text box
			driver.findElement(By.xpath("//body")).click();
			
			 richtextboxText1="Lorem Ipsum is simply dummy text of the printing and typesetting industry."
					+ " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
					+ "when an unknown printer took a galley of type and scrambled it to make a type "
					+ "specimen book.";
			
			//To send the texts into rich text box
			driver.findElement(By.xpath("//body")).sendKeys(richtextboxText1);
			
			driver.switchTo().parentFrame();
			
			//To click on the save and continue button
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnUpdateContinue")).click();
			
			//To switch To parent frame
			driver.switchTo().parentFrame();
			
			click("//span[@title='Close']");
			
			return richtextboxText1;	
		}
		//****************************************************************************************************//
		
}



