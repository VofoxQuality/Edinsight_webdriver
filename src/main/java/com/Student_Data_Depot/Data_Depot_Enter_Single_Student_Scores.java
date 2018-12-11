package com.Student_Data_Depot;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Data_Depot_Enter_Single_Student_Scores extends BaseClassOne
{
	@Test(priority=1)
	public void TCED62601()
	{
		try
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the "Enter Single Student Scores" menu
			click("//a[contains(text(),'Enter Single Student Scores')]");
			
			//Assert the page header  "Search for Existing Students"
			Assert.assertEquals(getText("//table[@width='790']//span[@class='subheading']"),"Search for Existing Students");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED62602()
	{
		try
		{
			//Application should be in the "Search for Existing Students" page
			
			//Assert the page header  "Search for Existing Students"
			Assert.assertEquals(getText("//table[@width='790']//span[@class='subheading']"),"Search for Existing Students");
			
//			Assert the label "ID"
//			Assert the label "State Student ID"
//			Assert the label "Last Name"
//			Assert the label "First Name"
//			Assert the label "School Type"
//			Assert the label "Current School"
//			Assert the label "Grade Level"
//
//			Assert the label "Search Must Be Narrowed to Display Results"
//			Assert the label "Category"
//			Assert the label "There are no Measures associated for the combination of Student Grades and Assessment."
//			Assert the label "Student Count :  0"
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void TCED62603()
	{
		try
		{
			//Application should be in the "Search for Existing Students" page
			
			//Enter a Student ID
			type("//*[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","110668");
			
			//Option Button
			click("//span[@id='ctl00_MainContent_StudentSearchGrid1_rdBtnAction']");
			
			//Search active student
			click("//span[contains(text(),'Search active students')]");
			
			//Assert the label "Student Id"
			Assert.assertEquals(getText("//a[contains(text(),'Student Id')]"),"Student Id");		
			
			//Assert the label "Last Name "
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the label "First Name "
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
			
			//Assert the label "Middle "
			Assert.assertEquals(getText("//a[contains(text(),'Middle')]"),"Middle");
			
			//Assert the label "School
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'School')]"),"School");
			
			//Assert the label "grade
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"),"Grade");
			
			//Click on the Student ID
			click("//a[contains(text(),'110668')]");
			
			//Assert the label "Category"
			Assert.assertEquals(getText("//td[contains(text(),'Category')]"),"Category");
			
			//Assert the label "Testing Period"
			Assert.assertEquals(getText("//td[contains(text(),'Testing Period')]"),"Testing Period");
			
			//The corresponding measure colums should show in the Grid
			//Assert the coiumn header as "Student"
			Assert.assertEquals(getText("//th[contains(text(),'Student')]"),"Student");
			
			//Assert the coiumn header as nbr"
			Assert.assertEquals(getText("//th[contains(text(),'nbr')]"),"nbr");
			
			//Assert the coiumn header as dcml"
			Assert.assertEquals(getText("//th[contains(text(),'dcml')]"),"dcml");
			
			//Assert the coiumn header as lter"
			Assert.assertEquals(getText("//th[contains(text(),'lter')]"),"lter");
			
			//Assert the coiumn header as dd"
			Assert.assertEquals(getText("//th[contains(text(),'dd')]"),"dd");
			
			//Assert the coiumn header as calc"
			Assert.assertEquals(getText("//th[contains(text(),'calc')]"),"calc");
			
			//To verify that "Save" button is present .
			Assert.assertTrue(isElementPresent("//input[@id='ctl00_MainContent_btnSave']"));
			
			//To Verify that "Download Scoring Spreadsheet Template" button is present 
			Assert.assertTrue(isElementPresent("//input[@id='ctl00_MainContent_btnDownload']"));
			
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED62604()
	{
		try
		{
			//Application should be in the "Search for Existing Students" page
			
			//Select category: Category
			select("//select[@id='ctl00_MainContent_ddlCategory']","label=Category");
			
			//Testing Period : Spring
			select("//select[@id='ctl00_MainContent_ddlTestingPeriod']","label=Spring");
			
			//Click on the Run Report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");			
			
			//Assert the coiumn header as "Student"
			Assert.assertEquals(getText("//th[contains(text(),'Student')]"),"Student");
			
			//Assert the coiumn header as nbr"
			Assert.assertEquals(getText("//th[contains(text(),'nbr')]"),"nbr");
			
			//Assert the coiumn header as lter"
			Assert.assertEquals(getText("//th[contains(text(),'lter')]"),"lter");

		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void TCED62605()
	{
		try
		{
			//Application should be in the "Search for Existing Students" page
			
			

		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void TCED62606()
	{
		try
		{
			//Application should be in the "Search for Existing Students" page
			
			

		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

}
