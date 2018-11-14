package com.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Notes_Tracking_Summary extends BaseClassOne

{
	@Test(priority=1)
	public void TCED33601()
	{
		try
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			//Click on  Teacher Notes Tracking Summary
			click("//a[contains(text(),'Notes Tracking Summary')]");
			
			//Assert the Heading "Teacher Notes Tracking Summary"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblHeading']"),"Teacher Notes Tracking Summary");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=2)
	public void TCED33602()
	{
		try
		{
			//Application should be in the Teacher Notes Tracking Summary page
			
			//Assert the Labels:-Start Date 
			Assert.assertEquals(getText("//td[contains(text(),'Start Date')]"),"Start Date");
			
			//Assert the Labels:-End Date  
			Assert.assertEquals(getText("//td[contains(text(),'End Date')]"),"End Date");
			
			//Assert the Labels:-School Type 
			Assert.assertEquals(getText("//td[contains(text(),'School Type')]"),"School Type");
			
			//Assert the Labels:-School 
			Assert.assertEquals(getText("//tr[@id='ctl00_MainContent_trSchool']//td[contains(text(),'School')]"),"School");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=3)
	public void TCED33603()
	{
		try
		{
			//Application should be in the Teacher Notes Tracking Summary page
			
			//Select any Start Date
			type("//input[@id='ctl00_MainContent_rdpStartDate_dateInput']","11/1/2010");
			
			//Select any end Date
			type("//input[@id='ctl00_MainContent_rdpEndDate_dateInput']","11/1/2018");
			
			//Select any  school type
			select("//select[@id='ctl00_MainContent_ddlSchoolType']","label=Elementary School");
			
			//Select any School 
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=Belle Plaine Elementary School");

			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the Heading "Teacher Notes Tracking Summary"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblHeading']"),"Teacher Notes Tracking Summary");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=4)
	public void TCED33604()
	{
		try
		{
			//Application should be in the Teacher Notes Tracking Summary page
			
			FileDelete();
			
			//Click on  Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
			//Assert the PDF generated		
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=5)
	public void TCED33605()
	{
		try
		{
			//Application should be in the Teacher Notes Tracking Summary page
			
			//Assert the Labels:-Teacher Name 
			Assert.assertEquals(getText("//a[contains(text(),'Teacher Name')]"),"Teacher Name");
			
			//Assert the Labels:-Total 
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgNotes_ctl00']/thead/tr[1]/th[5]/a"),"Total");
			
			//Assert the Labels:-Building 
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Building')]"),"Building");
			
			//Assert the Labels:-Category Name 
			Assert.assertEquals(getText("//a[contains(text(),'Category Name')]"),"Category Name");
			
			//Assert the Labels:-Attendance
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Attendance')]"),"Attendance");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=6)
	public void TCED33606()
	{
		try
		{
			//Application should be in the Teacher Notes Tracking Summary page
			
			//click on Logout button		 
			click("//*[@id='ctl00_A3']/img");
			
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
