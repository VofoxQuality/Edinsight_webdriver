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
			
			//Assert the label "ID"
			Assert.assertEquals(getText("//span[contains(text(),'Search for Existing Students')]//following::td[2]"),"ID:");
			
			//Assert the label "State Student ID"
			Assert.assertEquals(getText("//td[contains(text(),'State Student ID:')]"),"State Student ID:");
			
			//Assert the label "Last Name"
			Assert.assertEquals(getText("//td[contains(text(),'Last Name:')]"),"Last Name:");
			
			//Assert the label "First Name"
			Assert.assertEquals(getText("//td[contains(text(),'First Name:')]"),"First Name:");
			
			//Assert the label "School Type"
			Assert.assertEquals(getText("//td[contains(text(),'School Type:')]"),"School Type:");
			
			//Assert the label "Current School"
			Assert.assertEquals(getText("//td[contains(text(),'Current School:')]"),"Current School:");
			
			//Assert the label "Grade Level"
			Assert.assertEquals(getText("//td[contains(text(),'Grade Level:')]"),"Grade Level:");			

			//Assert the label "Search Must Be Narrowed to Display Results"
			Assert.assertEquals(getText("//td[contains(text(),'Grade Level:')]"),"Grade Level:");
			
			//Assert the label "Category"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StudentSearchGrid1_lblRecordCount']"),"Search Must Be Narrowed to Display Results");
			
			//Assert the label "There are no Measures associated for the combination of Student Grades and Assessment."
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblMessage']"),"There are no Measures associated for the combination of Student Grades and Assessment.");
			
			//Assert the label "Student Count :  0"
			Assert.assertEquals(getText("//td[contains(text(),'0')]"),"Student Count :  0");
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
			
			//Assert the coiumn header as Number"
			Assert.assertEquals(getText("//th[contains(text(),'Number')]"),"Number");
			
			//Assert the coiumn header as Decimal"
			Assert.assertEquals(getText("//th[contains(text(),'Decimal')]"),"Decimal");
			
			//Assert the coiumn header as Letter"
			Assert.assertEquals(getText("//th[contains(text(),'Letter')]"),"Letter");
			
			//Assert the coiumn header as DropDown"
			Assert.assertEquals(getText("//th[contains(text(),'DropDown')]"),"DropDown");
			
			//Assert the coiumn header as Calculated"
			Assert.assertEquals(getText("//th[contains(text(),'Calculated')]"),"Calculated");
			
			
			
			//To Verify that "Download Scoring Spreadsheet Template" button is present 
			Assert.assertTrue(isElementPresent("//input[@id='ctl00_MainContent_btnDownload']"),"failed to assert the presence of Download Scoring Spreadsheet Template button");
			
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
			
			//Assert the coiumn header as Number"
			Assert.assertEquals(getText("//th[contains(text(),'Number')]"),"Number");
			
			//Assert the coiumn header as Letter"
			Assert.assertEquals(getText("//th[contains(text(),'Letter')]"),"Letter");
			
			//To verify that "Save" button is present .
			Assert.assertTrue(isElementPresent("//input[@id='ctl00_MainContent_btnSave']"),"failed to assert the presence of Save button");

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
			
			//De-select the Category 
			select("//select[@id='ctl00_MainContent_ddlCategory']","label=");
			
			//Testing Period : Spring
			select("//select[@id='ctl00_MainContent_ddlTestingPeriod']","label=Spring");
			
			//Click on the Run Report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");	
			
			//Enter a "nbr" value for student JOHN ANDERSON nbr : 500
			type("//input[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000378TextBox']","500");
			
			//Enter a "dcml" value for student JOHN ANDERSON dcml : 50.50
			type("//input[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000379TextBox']","50.50");
			
			//Enter a "iter" value for student JOHN ANDERSON lter : F
			type("//input[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000380TextBox']","F");
			
			//select a "dd" value for student JOHN ANDERSON dd : 33
			select("//*[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000382DropDown']","label=33");
			
			//Click on the Save Button
			click("//input[@id='ctl00_MainContent_btnSave']");
			
			//Assert the message "Benchmark data Save successful!!"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblMessage']"),"Benchmark data Save successful!!");
			
			//Assert the calc column value should be "550.50" for student "JOHN ANDERSON"
			Assert.assertEquals(find("//*[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000381TextBox']").getAttribute("value"),"550.50");
			
			//Delete "nbr" value for student JOHN ANDERSON
			find("//input[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000378TextBox']").clear();
			
			//Delete "dcml" value for student JOHN ANDERSON 
			find("//input[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000379TextBox']").clear();;
			
			//Delete "lter" value for student JOHN ANDERSON
			find("//input[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000380TextBox']").clear();
			
			//De-Select "dd" value for " value for student JOHN ANDERSON
			select("//*[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000382DropDown']","label=");
			
			//Click on the Save Button
			click("//input[@id='ctl00_MainContent_btnSave']");
			
			//Assert the message "Benchmark data Save successful!!"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblMessage']"),"Benchmark data Save successful!!");
			
			//Assert the calc column value shouldn't be present for student "JOHN ANDERSON"
			Assert.assertEquals(find("//*[@id='ctl00_MainContent_StudentDataEntryGrid_ctl02_1000000381TextBox']").getAttribute("value"),"");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=6)
	public void TCED62606()
	{
		try
		{
			//Application should be in the 	"For Automation - Do_Not_Edit_n_Delete Data Entry" page			

			FileDelete();
			
			//Click on the "Download Scoring Spreadsheet Template" button 
			click("//input[@id='ctl00_MainContent_btnDownload']");	
			
			Thread.sleep(6000);	
			
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			//click on Logout button		 
			click("//*[@id='ctl00_A3']/img");
			
			//Assert the page Header as "Edinsight Login"					
			Assert.assertEquals(driver.getTitle(),"EdInsight Login");					

		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

}
