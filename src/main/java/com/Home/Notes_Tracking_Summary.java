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
			
			//Click on  student Note
			click("//a[contains(text(),'Student Notes')]");
			
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
			type("//input[@id='ctl00_MainContent_rdpStartDate_dateInput']","7/1/2018");
			
			//Select any end Date
			type("//input[@id='ctl00_MainContent_rdpEndDate_dateInput']","7/31/2019");
			
			//Select any  school type
			//select("//select[@id='ctl00_MainContent_ddlSchoolType']","label=Elementary School");
			
			//Select any School 
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=Belle Plaine Elementary School");

			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the Heading "Teacher Notes Tracking Summary"
			Assert.assertEquals(getText("//table[@id='ctl00_MainContent_rgNotes_ctl00']/tbody/tr/td/div"),"No records to display.");
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
			
			//Select any Start Date
			type("//input[@id='ctl00_MainContent_rdpStartDate_dateInput']","7/1/2018");
			
			//Select any end Date
			type("//input[@id='ctl00_MainContent_rdpEndDate_dateInput']","7/31/2019");
			
			//Select any  school type
			select("//select[@id='ctl00_MainContent_ddlSchoolType']","label=All Schools");
			
			//Select any School 
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=Ashley High School");

			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the table header Teacher Name
			Assert.assertEquals(getText("//a[contains(text(),'Teacher Name')]"),"Teacher Name");
			
			//Assert the table header 
			Assert.assertEquals(getText("//a[contains(text(),'Total')]"),"Total");
			
			//Assert the table header 
			Assert.assertEquals(getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Total'])[2]/following::a[1]"),"Building");
			
			//Assert the table header 
			Assert.assertEquals(getText("//a[contains(text(),'Category Name')]"),"Category Name");
			
			//Assert the table header 
			Assert.assertEquals(getText("//a[contains(text(),'Academic')]"),"Academic");
			
			//Assert the table header 
			Assert.assertEquals(getText("//table[@id='ctl00_MainContent_rgNotes_ctl00']/thead/tr/th[10]/a"),"Attendance");
			
			
			//Assert the Heading "Teacher Notes Tracking Summary"
			Assert.assertEquals(getText("//tr[@id='ctl00_MainContent_rgNotes_ctl00__0']/td[7]"),"Ashley High School");
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
			
			FileDelete();
			Thread.sleep(3000);
			//Click on  Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
			//Wait for filr download complete
			waitFor_downloadfile();
			Thread.sleep(3000);
			
			
			//Assert the PDF generated			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
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
			
			FileDelete();
			
			//Click on  Export to CSV
			click("//*[@id='ctl00_MainContent_btnExportPDF']");
			
			//Assert the PDF generated		
			
			
			waitFor_downloadfile();
			Thread.sleep(3000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .pdf");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}

}
