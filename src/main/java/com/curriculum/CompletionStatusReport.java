package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class CompletionStatusReport extends BaseClassOne {
	
	
	@Test(priority=1)
	public void TCED30404() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over curriculum link
			Actions act=new Actions(driver);
					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
			
			//Click Reports Menu 
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[11]/div/a");
			
			
			//To click on the completion status report
			click("//img[@src='../../Image/curric_completion_status.jpg']");
			
			
			//To select the career and technical from the drop down
			select("//select[@id='ctl00_MainContent_ddlSubjects']","Career and Technical");
			
			//To click on the display button
			click("//input[@id='ctl00_MainContent_btnDisplay']");
			

			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_btnPDF']");
			Thread.sleep(4000);
			
			
			//To verify whether the download functionality is working or not
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TCED30405() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_btnWord']");
			Thread.sleep(4000);
			
			
			//To verify whether the download functionality is working or not
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
			
			//To click on the log out button
			click("//img[@src='../../Images/btnExit.png']");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}
