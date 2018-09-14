package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

import Library.BaseClassOne;

public class Analyze_curriculam extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED29701()
	{
		
		try {
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over curriculum link
			
			Actions act=new Actions(driver);		
					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
			
			//Click Edit Curriculum Menu	
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[7]/div/a");
			
			//Enter "For Automation [Do not Edit and Delete]" in the Title filter text box 
			
			type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");		
			
			// Click on the filter button
			
			 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
			 
		    Thread.sleep(2000);
			
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
				    
			Thread.sleep(2000);
					
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();
			
			//Click on Build/Edit 
			click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[2]/a");			
			
			//Click on Analyze Curriculum
			click("//*[@id='lnkAnalyzeSubmenu']");
			
			
			//Assert the label "Analyze Curriculum"
			
			
			
		}
		
		catch (Exception e)
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
		
		
	}
	
	
	

}
