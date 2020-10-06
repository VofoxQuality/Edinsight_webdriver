package com.questionBank;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Local_Assessment_Question_Bank_Add_Edit_or_View_Exhibits extends BaseClassOne

{
	@Test(priority=1)
	public void TCED16501()
	{
	     try
	     {
			//Superintent Login
			 login(Supertent_Login_id,Supertent_Login_Password);
			 
			 Assert.assertTrue(isElementPresent("//*[@id='ctl00_A3']"),"Login has some issues");
		 } 
	     catch (Exception e)
	     {
	    	 Assert.fail(e.getMessage());
			e.printStackTrace();
		 }	
	}
	@Test(priority=2)
	public void TCED16502()
	{
		try
		{
			
			//Click on main menu local Assignment.
			Thread.sleep(4000);
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"))).build().perform();	
			
			
			//To click on the Question Bank
			Thread.sleep(2000);
			click("//a[contains(.,'Question Bank')]");
			
			//Click on Add, Edit, or View Exhibits link
			click("//a[@id='ctl00_MainContent_hplAddEditViewExhibit']");
			
			//Assert the Label "Exhibit Search"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblHeader']"),"Exhibit Search");
		} 
		catch (Exception e)
		{
			 Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=3)
	public void TCED16503()
	{
		try {
			//Application should be in the Exhibit Search page.
			
			//Assert the Label "Filter Exhibits by"
			Assert.assertEquals(getText("//b[contains(text(),'Filter Exhibits by')]"),"Filter Exhibits by");
			
			//Assert the Label "Select Readability Metrics
			Assert.assertEquals(getText("//b[contains(text(),'Select Readability Metrics')]"),"Select Readability Metrics");
			
			//Assert the Label "Add New Exhibit"
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_hplAddEditViewExhibit']"),"Add New Exhibit");
			
			//Assert the Label "Refresh Grid"
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_lnkRefresh']"),"Refresh Grid");
			
			//Assert the Label "Standards Used"
			Assert.assertEquals(getText("//b[contains(text(),'Standards Used')]"),"Standards Used");
			
			//Assert the Label "Subject"
			Assert.assertEquals(getText("//b[contains(text(),'Subject')]"),"Subject");
			
			//Assert the Label "Sub-Category"
			Assert.assertEquals(getText("//b[contains(text(),'Sub-Category')]"),"Sub-Category");
			
			//Assert the Label "Organizer"
			Assert.assertEquals(getText("//b[contains(text(),'Organizer:')]"),"Organizer:");
			
			//Assert the Label "Grade"
			Assert.assertEquals(getText("//b[contains(text(),'Grade')]"),"Grade");
			
			//Assert the Label "Standard Contains"
			Assert.assertEquals(getText("//b[contains(text(),'Standard Contains')]"),"Standard Contains");

		} 
		catch (Exception e)
		{
			 Assert.fail(e.getMessage());
			e.printStackTrace();
		}					
	}
	@Test(priority=4)
	public void TCED16504()
	{
		try
		{
			//Assert the Label "Id"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgExhibitList_ctl00ExhibitId8_MultiHeader8']/a"),"Id");
			
			//Assert the Label "Title"
			Assert.assertEquals(getText("//a[contains(text(),'Title')]"),"Title");
			
			//Assert the Label "Subject"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Subject')]"),"Subject");
			
			//Assert the Label "Linked to Questions" 
			Assert.assertEquals(getText("//a[contains(text(),'Linked to Questions')]"),"Linked to Questions");
			
			//Assert the Label "Linked to Tests"
			Assert.assertEquals(getText("//a[contains(text(),'Linked to Tests')]"),"Linked to Tests");
			
			//Assert the Label "Linked to Standards"
			Assert.assertEquals(getText("//a[contains(text(),'Linked to Standards')]"),"Linked to Standards");
			
			//Assert the Label "Flesch Kincaid" 
			Assert.assertEquals(getText("//a[contains(text(),'Flesch Kincaid')]"),"Flesch Kincaid");
			
			//Assert the Label "Word Count"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgExhibitList_ctl00WordCount115_MultiHeader15']/a"),"Word Count");
			
			//Assert the Label "Passage Category"
			Assert.assertEquals(getText("//a[contains(text(),'Passage Category')]"),"Passage Category");
			
			//Assert the Label "Diff Grade Lvl Lower"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_rgExhibitList_ctl00DiffGradeLevelLower17_MultiHeader17']/a").contains("Diff Grade Lvl"),"Failed to assert-Diff Grade Lvl Lower");
			
			//Assert the Label "Diff Grade Lvl Upper"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_rgExhibitList_ctl00DiffGradeLevelUpper18_MultiHeader18']/a").contains("Diff Grade Lvl"),"Failed to assert-Diff Grade Lvl Upper");
			
			//Assert the Label "Sentiment" 
			Assert.assertEquals(getText("//a[contains(text(),'Sentiment')]"),"Sentiment");
			
			//Assert the Label "Owner"
			Assert.assertEquals(getText("//a[contains(text(),'Owner')]"),"Owner");
			
			//Assert the Label "Last Modified"
			Assert.assertEquals(getText("//a[contains(text(),'Last Modified')]"),"Last Modified");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test(priority=5)
	public void TCED16505()
	{
		try
		{
			//Application should be in the Exhibit Search page.
			
			//Select Standards Used : STATE : PA Core Anchors and Eligible Content
			select("//*[@id='ctl00_MainContent_drpStandardsType']","label=STATE: PA Core Anchors and Eligible Content (2014)");
			
			//Select Subject : English Language Arts
			select("//select[@id='ctl00_MainContent_drpSubject']","label=English Language Arts");
			
			//Select Sub-Category : Literature Text
			select("//*[@id='ctl00_MainContent_drpStandard']","label=Literature Text");
			
			//Click on Search Button
			click("//input[@id='ctl00_MainContent_btnSearch']");
			
			//Assert the ID 2100002 from the Grid
			Assert.assertEquals(getText("//td[contains(text(),'2100002')]"),"2100002");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=6)
	public void TCED16506()
	{
		try
		{
			//Application should be in the Exhibit Search page.
			
			//Click on Clear Button
			click("//input[@id='ctl00_MainContent_btn_Clear']");
			
			//Assert the ID 2100002 from the Grid
			Assert.assertEquals(getText("//td[contains(text(),'2100002')]"),"2100002");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED16507()
	{
		try
		{
			//Application should be in the Exhibit Search page.
			
			//Click on Refresh Grid Link 
			click("//a[@id='ctl00_MainContent_lnkRefresh']");
			
			//Assert the ID 2100002 from the Grid
			Assert.assertEquals(getText("//td[contains(text(),'2100002')]"),"2100002");
			
			//click on Logout button		 
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
