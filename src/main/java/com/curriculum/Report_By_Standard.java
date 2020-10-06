package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
public class Report_By_Standard extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED26101()
	
	{
	try 
		
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
					
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();
			
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[2]/div/a");
			
			click("//*[@id='ctl00_tdLeftMenu']/table/tbody/tr[18]/td[2]/a/strong");
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/h4")).getText().contains("Search Curriculum by Standards"));
		} 
	
	catch (Exception e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
			
				
	}
	
	@Test(priority=1)
	
	public void TCED26102()
	{
		
		try 
		{
			driver.navigate().refresh();
			
			Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Available Standards')]")).getText().contains("Available Standards"));
		}
		catch (Exception e)
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
		
				
	}
	
	@Test(priority=2)
	
	public void TCED26103() throws Exception
	{
		
		try 
		
		{
			driver.navigate().refresh();
			
			if (driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/div/div/span")).isDisplayed()==false)
			{		
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/div/span");	
			
			}
			
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/div/div/span");
			
			click("#ctl00_MainContent_CurriculumReportByStandards1_btnAddToPrint");
			
			System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_lblStandard']/ul/li")).getText());
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_lblStandard']/ul/li")).getText().contains("M - Mathematics (STATE: PA Core Anchors and Eligible Content (2014))"));
					
						
		} 
		
		catch (Exception e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
		
		
	}
	
	@Test(priority=3)
	
	public void TCED26104() throws InterruptedException
	
	{
		
		try 
		  
		  {
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintSelected']");
			
			Thread.sleep(500);
			
			System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintToPDF']")).getText());
			
			System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_LinkButton2']")).getText());
				
			
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintSelected']");
			
			Thread.sleep(500);
			
			FileDelete();
			
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintToPDF']");		
			
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintSelected']");
			
			Thread.sleep(500);
			
			FileDelete();
			
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_LinkButton2']");		
			
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		} 
		
		catch (Exception e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
		
		
	}
	
	@Test(priority=4)
	
	public void TCED26105()
	{
		
		try
		
		{
			driver.navigate().refresh();
			
			if (driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/div/div/span")).isDisplayed()==false)
			{		
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/div/span");	
			
			}
			
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/div/div/span");
			
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnClearPrintList']");
			
			System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_lblStandard']")).getText());
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_lblStandard']")).getText().contains("None selected"));
		} 
		catch (Exception e)
		
		{
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
					
	
	}
	
	@Test(priority=5)
	
	public void TCED26106()
	{
		
		try 
		 
		 {
			driver.navigate().refresh(); 
			 
			 click("//*[@id='ctl00_A3']");
		 } 
		catch (Exception e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();			
			Assert.fail(e.getMessage());
		}
		 
		 
	}

}
