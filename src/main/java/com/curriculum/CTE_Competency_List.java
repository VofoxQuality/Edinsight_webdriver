package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class CTE_Competency_List extends BaseClassOne

{
	
	String parent_wind;
	String child;
	
   @Test(priority=0)	
   public void TCED30701()
   {
		
	 try
		
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over curriculum link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
			
			//Click Reports Menu 
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[11]/div/a");
			
			 parent_wind=driver.getWindowHandle();	
			
			//Click on CTE Competency List Menu
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[6]/td[3]/div/a/img");				
								
			for(String child:driver.getWindowHandles())
			{
				
				if(!parent_wind.equals(child))
				{
					driver.switchTo().window(child);	
					
					WebDriverWait wt=new WebDriverWait(driver,60);
					wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_divReport']/table/tbody/tr[1]/td")));
					
					//Assert the Heading "CTE Competency List"
					Assert.assertTrue(getText("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_divReport']/table/tbody/tr[1]/td").contains("CTE Competency List"),"failed to assert text"+"CTE Competency List");
				}
			}
		}
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
@Test(priority=1)
  
public void TCED30702()
 {
    try
    
       {
    	
    	driver.manage().window().maximize();
		//Assert the Label "PO# 
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_divReport']/table/tbody/tr[2]/td[1]/b").contains("PO#"),"failed to assert text"+" PO#");
        
		//Assert the Label "Level"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_divReport']/table/tbody/tr[2]/td[2]").contains("Level"),"failed to assert text"+" Level");
		
        //Assert the Label "Division"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_divReport']/table/tbody/tr[2]/td[3]").contains("Division"),"failed to assert text"+" Division");
		
       //Assert the Label "Skill Level"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_divReport']/table/tbody/tr[2]/td[4]").contains("Skill Level"),"failed to assert text"+" Skill Level");
		
       //Assert the Label "Teacher"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_divReport']/table/tbody/tr[6]/td[1]").contains("Teacher"),"failed to assert text"+" Teacher");
      		
		//Assert the Label "Student"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_divReport']/table/tbody/tr[6]/td[3]").contains("Student"),"failed to assert text"+" Student");
	   } 
    
    catch (Exception e)
   {
    	Assert.fail(e.getMessage());
		e.printStackTrace();
	}		
 }
@Test(priority=2)

public void TCED30703()
 {
	
	try
	 {
		FileDelete();
			
		//Click on PDF button
		click("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_btnSaveToPDF']");
		
		Thread.sleep(30000);		
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
	} 
	
	catch (Exception e)
	
	{
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}	
		
 }

@Test(priority=3)

public void TCED30704()
 {
	
 try {
		FileDelete();
			
		//Click on WORD button
		click("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_btnSaveToRTF']");
		
		Thread.sleep(35000);		
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
	} 
 
 catch (Exception e)
    {
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}	
		
 }

@Test(priority=4)

public void TCED30705()
 {
	
	 try
	  
	 {
		FileDelete();
			
		//Click on CSV button
		click("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_btnSaveToExcel']");
		
		Thread.sleep(35000);		
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath,".csv"), "Failed to download document which has extension .CSV");
		
		if(!parent_wind.equals(child))
		{
			driver.close();
		}
		
			driver.switchTo().window(parent_wind);
		
		//click on Logout button			 
		click("//*[@id='ctl00_A3']/img");
		
		//Assert the page Header as "Edinsight Login"						
		Assert.assertTrue(driver.getTitle().contains("EdInsight Login"));
		
		 CheckExtraTabs();
	} 
	 
	 catch (Exception e)
	{
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}
		
 }
			

}
