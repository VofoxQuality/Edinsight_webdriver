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
	
	public void TCED24103() throws InterruptedException	
	
	{
	  
		try 
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			Actions act=new Actions(driver);		
					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();
			
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[2]/div/a");
			
			FileDelete();		
			click("#ctl00_MainContent_btnExportToPDF");	
					
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		
		catch (Exception e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=1)
	
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
			
			//saving screenshot to Screenshot folder under the project folder
			
			FileUtils.copyFile(src, new File(".//Screenshots//monthview.png"));
		} 
		
		catch (WebDriverException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			
	}
	
	@Test(priority=2)
	
	public void TCED24105() throws Exception
	{
		
	try 
		
		{
		
		   // Refresh the page
			driver.navigate().refresh();
			
			FileDelete();	
			
			//click on Print PDF button
			
			click("//*[@id='ctl00_MainContent_btnPrintToPDF']");
					
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		
		catch (Exception e)
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
