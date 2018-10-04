package com.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Student_Search extends BaseClassOne {
	
	
	@Test(priority=1)
	public void TCED33106() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over to Home link
			Actions act=new Actions(driver);
					
			act.moveToElement(driver.findElement(By.xpath("//td[@id='ctl00_tdMenuContainer']/ul/li/a"))).build().perform();	
			
			//To click on the student Search
			click("//td[@id='ctl00_tdMenuContainer']/ul/li/div/div[8]/div/a");
			
			//select the current school type as ashely High School
			select("//select[@id='ctl00_MainContent_StudentSearchGrid1_ddlCurrentSchool']","Ashley High School");
			
			//To click on the options button
			click("//span[@class='rbText']");
			
			//To click on the search active students
			click("//span[contains(text(),'Search active students')]");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print on PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			Thread.sleep(4000);
			
			//To verify whether the download functionality is working or not
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//To click on the logout button
			click("//img[@src='../../Images/btnExit.png']");
					
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}
