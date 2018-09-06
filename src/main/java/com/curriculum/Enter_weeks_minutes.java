package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Enter_weeks_minutes extends BaseClassOne


{
	
	@Test(priority=0)
	
	public void TCED29401() throws InterruptedException
	{
	
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
	
	click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_Filter_CourseName']");
	
	Thread.sleep(1000);
	
	Actions act1=new Actions(driver);	
	
	act1.doubleClick(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rgAttendanceData_rfltMenu_detached']/ul/li[2]/span"))).build().perform();
	
//	act1.doubleClick(//*[@id='ctl00_MainContent_rgAttendanceData_rfltMenu_detached']/ul/li[2]/span);		
	
	//click("//*[@id='ctl00_MainContent_rgAttendanceData_rfltMenu_detached']/ul/li[2]/span");
	
	
	
	
	
	}

}
