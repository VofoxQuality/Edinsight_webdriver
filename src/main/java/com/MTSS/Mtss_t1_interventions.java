package com.MTSS;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Mtss_t1_interventions extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED19704() throws InterruptedException
	{
		try {
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//click MTTS link
			
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a");
			
			//click Tier / Intervention link			
			
			click("//a[contains(text(),'Tier / Intervention')]");
			
			click("//a[contains(text(),'T1 Interventions')]");
			
			//click Search button		
			click("input#ctl00_MainContent_btnSearch.button");
			
			FileDelete();	    
			click("input#ctl00_MainContent_btnExportCSV.button");	    
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		} 
		
		catch (Exception e) 
		
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}
	
	@Test(priority=1)
	
	public void TCED19705()
	{
		
		try 
		{
			click("input#ctl00_MainContent_btnTutorial.button");
			
			String alert_text=driver.switchTo().alert().getText();
			
			Assert.assertEquals(alert_text,"No Students Selected!");
			
			driver.switchTo().alert().dismiss();
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}		
	}
	
	@Test(priority=2)
	public void TCED19709()
	
	{
		
		try {
			//click Search button		
			click("input#ctl00_MainContent_btnSearch.button");
			
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl04_chkSelectUserSelectCheckBox");
			
			click("input#ctl00_MainContent_btnTutorial.button");		
				
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow5']/div[1]/div/ul/li[2]/span");
			
			String alert_txt= driver.switchTo().alert().getText();
			
			Assert.assertEquals(alert_txt, "This intervention plan has not been submitted.  Are you sure you want to close this window?");
			
			driver.switchTo().alert().accept();
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	 }
	@Test(priority=3)
	public void window_hand() throws Exception
	{
		//click Search button		
		click("input#ctl00_MainContent_btnSearch.button");	
		
		click("//*[@id='ctl00_MainContent_rgSearch_ctl00__0']/td[4]");
		String mainWindow=driver.getWindowHandle();
		 // It returns no. of windows opened by WebDriver and will return Set of Strings
		 Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext())
		 {
		 String childWindow=itr.next();
		    // Compare whether the main windows is not equal to child window. If not equal, we will close.
		  if(!mainWindow.equals(childWindow)){
		 driver.switchTo().window(childWindow);		 
		 System.out.println("hi");
		 Thread.sleep(2000);
		  String s= driver.findElement(By.xpath("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/span")).getText();
		  System.out.println(s);
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		 driver.close();
		 }
		 }
		
	}
	
}
