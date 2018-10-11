package com.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
/**
 * 
 * @author sebastian
 *
 */

public class Schedule extends BaseClassOne {
	
	@Test(priority=1)
	public void TCED34603() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Home page
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Home')]"))).build().perform();
			
			
			//To click on the student Search
			click("//a[contains(text(),'Student Search')]"); 
			
			//To fill the search for existing students 
			type("//input[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","104104");
			
			//To click on the options button
			click("//span[@class='rbText']");
			
			
			//To click on the search active students
			click("//span[contains(text(),'Search active students')]");
			
			
			//To click on the 104104 from the searched results grid
			click("//a[contains(text(),'104104')]");
			
			
			//To click on the contacts page
			click("//span[contains(text(),'schedule')]");	
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_StudentDisplaySchedule1_btnPrintToPDF']");
			Thread.sleep(4000);
			
			
			//To verify whether the download functionality is working or not
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");	
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}
