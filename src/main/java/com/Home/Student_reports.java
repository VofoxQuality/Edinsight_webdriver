package com.Home;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Student_reports extends BaseClassOne {
	
	@Test(priority=1)
	public void TCED34508() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Hover over main menu local Assignment.
			Actions act= new Actions(driver);
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
			
			
			//To click on the students reports page
			click("//span[contains(text(),'student reports')]");	
			
			//To click on the check box
			check("//td//li[@class='rtLI rtFirst']//div[@class='rtOut']//span[2]");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_ctl00_btnRunReport']");
			Thread.sleep(4000);
			
			Robot robot = new Robot();
			
			// A short pause, just to be sure that OK is selected
			Thread.sleep(3000);

			robot.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(4000);
			
			//To verify whether the download functionality is working or not
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_ctl00_btnCSV']");
			Thread.sleep(5000);
			
			
			//To verify whether the download functionality is working or not
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");	
			
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
		
	

}
