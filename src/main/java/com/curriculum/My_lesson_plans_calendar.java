package com.curriculum;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
public class My_lesson_plans_calendar extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED24101()
	{
		
		try
		
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over curriculum link
			
			Actions act=new Actions(driver);		
					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();
			
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[2]/div/a");
			
			//Assert the Heading "Calendar (My Lessons)"
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3")).getText().contains("Calendar (My Lessons)"));
		} 
		
		catch (Exception e)
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=1)
	
	public void TCED24102()
	{
		
		try 
		
		{
			driver.navigate().refresh();
			
			//Assert the Labels "Select PERIODS to Print
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_ddlPrintPeriod']/label").contains("Select PERIODS to Print"),"failed to assert element -Select PERIODS to Print");
			
			//Month Navigationbar School Year"
			
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr/td[1]").contains("Month Navigationbar School Year"),"failed to assert the text -Month Navigationbar School Year");
			
			//Assert the Labels "Scheduled Lessons"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_rgMonth_ctl00']/thead/tr[1]/th").contains("Scheduled Lessons"),"failed to assert the text -Scheduled Lessons");
			
			//Assert the Labels "Schedule Time Slot Configuration"
			
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[2]").contains("Schedule Time Slot Configuration"),"failed to assert the text-Schedule Time Slot Configuration");
			
			//Assert the Labels "Compress Schedule"
			
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[3]").contains("Compress Schedule"),"failed to assert the text-Compress Schedule");
			
			//Assert the Labels "Month"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_RadScheduler1']/div[1]/div[1]/ul[2]/li[1]/span").contains("Month"),"failed to assert the text-Month");
			
			//Assert the Labels "Calender"
			
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3").contains("Calendar"),"failed to assert the text-Calendar");
		} 
		
		catch (Exception e)
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
//@Test(priority=2)
	
	public void TCED24103() throws InterruptedException	
	
	{
	  
		try 
		{
			
			driver.navigate().refresh();
			
			FileDelete();		
			click("#ctl00_MainContent_btnExportToPDF");						
				
			Thread.sleep(6000);	
			
			//Assert the extension of downloaded PDF
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		
		catch (Exception e) 
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
//@Test(priority=3)
	
	public void TCED24104() throws IOException
	
	{
		
		try 
		
		{
			
			// Refresh the page
			driver.navigate().refresh();
			
			//click month view button
			
			click("//span[@class='rsButton rsHeaderMonth']");
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File src=ts.getScreenshotAs(OutputType.FILE);
			
			// taking the screenshot of Month View and saving in Screenshot folder under the project folder
			
			FileUtils.copyFile(src, new File(".//Screenshots//monthview.png"));
		} 
		
		catch (WebDriverException e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
			
	}
	
@Test(priority=4)
	
	public void TCED24105() throws Exception
	{
		
	try 
		
		{
		
		   // Refresh the page
			driver.navigate().refresh();
			
			FileDelete();	
			
			//click on Print PDF button
			
			click("//*[@id='ctl00_MainContent_btnPrintToPDF']");	
			
					
			Thread.sleep(7000);	
			//Assert the extension of downloaded PDF
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//click logout button
			
			 click("//*[@id='ctl00_A3']/img");
		} 
		
		catch (Exception e)
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	

}
