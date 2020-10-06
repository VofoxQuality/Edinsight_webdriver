package com.Student_Data_Depot;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class Data_Depot_Menu_Items extends BaseClassOne 
{
	@Test(priority=1)
	public void TCED62401()
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
			
			//Assert the page header  "Superintendent View"
			Assert.assertEquals(getText("//span[@class='blackheading']"),"Superintendent View");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED62402()
	{
		try
		{
			//Application should be in the 	For Automation - Do_Not_Edit_n_Delete page
			
			//Assert the page header  "OnHand School District "	Assert the label "For Automation - Do_Not_Edit_n_Delete"
			Assert.assertEquals(getText("//span[@class='blueheading']"),"OnHand School District");
			
			//Assert the label "For Automation - Do_Not_Edit_n_Delete"
			Assert.assertEquals(getText("//h3[@class='subheading']"),"For Automation - Do_Not_Edit_n_Delete");
			
			//Assert the label "Enter Scores
			Assert.assertEquals(getText("//a[contains(text(),'Enter Scores')]"),"Enter Scores");
			
			//Assert the label "Enter Single Student Scores
			Assert.assertEquals(getText("//a[contains(text(),'Enter Single Student Scores')]"),"Enter Single Student Scores");
			
			//Assert the label "Enter Historic Scores
			Assert.assertEquals(getText("//a[contains(text(),'Enter Historic Scores')]"),"Enter Historic Scores");
			
			//Assert the label "Download Scoring Template
			Assert.assertEquals(getText("//a[contains(text(),'Download Scoring Template')]"),"Download Scoring Template");
			
			//Assert the label "Upload Scoring Template
			Assert.assertEquals(getText("//a[contains(text(),'Upload Scoring Template')]"),"Upload Scoring Template");
			
			//Assert the label "Student List By District/Building Report
			Assert.assertEquals(getText("//a[contains(text(),'Student List By District/Building Report')]"),"Student List By District/Building Report");
			
			//Assert the label "Student List By Teacher Report
			Assert.assertEquals(getText("//a[contains(text(),'Student List By Teacher Report')]"),"Student List By Teacher Report");
			
			//Assert the label "Single Year By District/Building Report
			Assert.assertEquals(getText("//a[contains(text(),'Single Year By District/Building Report')]"),"Single Year By District/Building Report");
			
			//Assert the label "Single Year Measure Comparison Report
			Assert.assertEquals(getText("//a[contains(text(),'Single Year Measure Comparison Report')]"),"Single Year Measure Comparison Report");
			
			//Assert the label "Longitudinal Measure Comparison Report
			Assert.assertEquals(getText("//a[contains(text(),'Longitudinal Measure Comparison Report')]"),"Longitudinal Measure Comparison Report");
			
			//Assert the label "Course Grade Comparison Report
			Assert.assertEquals(getText("//a[contains(text(),'Course Grade Comparison Report')]"),"Course Grade Comparison Report");
			
			//Generate Student Reports"
			Assert.assertEquals(getText("//a[contains(text(),'Generate Student Reports')]"),"Generate Student Reports");
			
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void TCED62403()
	{
		try
		{
			//Click on the Enter Scores Link
			click("//a[contains(text(),'Enter Scores')]");
			
			//Assert page header as "For Automation - Do_Not_Edit_n_Delete Data Entry"
			Assert.assertEquals(getText("//span[@class='subheading']"),"For Automation - Do_Not_Edit_n_Delete Data Entry");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED62404()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Enter Single Student Scores Link
			click("//a[contains(text(),'Enter Single Student Scores')]");
			
			//Assert page header as "Search for Existing Students "
			Assert.assertEquals(getText("//span[contains(text(),'Search for Existing Students')]"),"Search for Existing Students");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void TCED62405()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Enter Historic Scores Link
			click("//a[contains(text(),'Enter Historic Scores')]");
			
			//Assert page header as "Search for Existing Students "
			Assert.assertEquals(getText("//span[contains(text(),'For Automation - Do_Not_Edit_n_Delete Data Entry')]"),"For Automation - Do_Not_Edit_n_Delete Data Entry");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void TCED62406()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Download Scoring Template Link
			click("//a[contains(text(),'Download Scoring Template')]");
			
			//Assert page header as "Search for Existing Students "
			Assert.assertEquals(getText("//span[contains(text(),'For Automation - Do_Not_Edit_n_Delete Data Entry')]"),"For Automation - Do_Not_Edit_n_Delete Data Entry");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED62407()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Upload Scoring Template Link
			click("//a[contains(text(),'Upload Scoring Template')]");
			
			//Assert page header as "Upload Scoring Template"
			Assert.assertEquals(getText("//span[@class='subheading']"),"Upload Scoring Template");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void TCED62409()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Student List By District/Building Report Link
			click("//a[contains(text(),'Student List By District/Building Report')]");
			
			//Assert page header as "Search for Existing Students "
			Assert.assertEquals(getText("//span[@class='subheading']"),"For Automation - Do_Not_Edit_n_Delete Student List Report");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	public void TCED62410()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Student List By Teacher Report Link
			click("//a[contains(text(),'Student List By Teacher Report')]");
			
			//Assert page header as "Search for Existing Students "
			Assert.assertEquals(getText("//span[@class='subheading']"),"For Automation - Do_Not_Edit_n_Delete - Single Year By Teacher Analysis");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	public void TCED62411()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Single Year By District/Building Report Link
			click("//a[contains(text(),'Single Year By District/Building Report')]");
			
			//Assert page header as "Search for Existing Students "
			Assert.assertEquals(getText("//span[@class='subheading']"),"For Automation - Do_Not_Edit_n_Delete Single Year Analysis");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	public void TCED62412()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Single Year Measure Comparison Report Link
			click("//a[contains(text(),'Single Year Measure Comparison Report')]");
			
			//Assert page header as "Search for Existing Students "
			Assert.assertEquals(getText("//span[@class='subheading']"),"For Automation - Do_Not_Edit_n_Delete - Measure Comparison Report");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	public void TCED62413()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Longitudinal Measure Comparison Report Link
			click("//a[contains(text(),'Longitudinal Measure Comparison Report')]");
			
			//Assert page header as For Automation - Do_Not_Edit_n_Delete Longitudinal Measure Comparison Report"
			Assert.assertEquals(getText("//span[@class='subheading']"),"For Automation - Do_Not_Edit_n_Delete Longitudinal Measure Comparison Report");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void TCED62414()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Longitudinal Measure Comparison Report Link
			click("//a[contains(text(),'Course Grade Comparison Report')]");
			
			//Assert page header as For Automation - Do_Not_Edit_n_Delete Longitudinal Measure Comparison Report"
			Assert.assertEquals(getText("//span[@class='subheading']"),"Course Grade to For Automation - Do_Not_Edit_n_Delete Score Comparison Report");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=15)
	public void TCED62415()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			// Hover the Data Depot Menu 
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();	
			
			//Click on "For Automation - Do_Not_Edit_n_Delete"
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			//Click on the Generate Student Reports Link
			click("//a[contains(text(),'Generate Student Reports')]");
			
			//Assert page header as For Automation - Do_Not_Edit_n_Delete Longitudinal Measure Comparison Report"
			Assert.assertEquals(getText("//span[@class='subheading']"),"For Automation - Do_Not_Edit_n_Delete Student Reports");
			
		    //click on Logout button
			waitForEnable("//*[@id='ctl00_A3']");
			click("//*[@id='ctl00_A3']");
			
			//Assert the page Header as "Edinsight Login"					
			Assert.assertTrue(driver.getTitle().contains("EdInsight Login"));
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

}
