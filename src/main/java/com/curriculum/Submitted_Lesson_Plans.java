package com.curriculum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;



import Library.BaseClassOne;

public class Submitted_Lesson_Plans extends BaseClassOne


{
	
	@Test(priority=0)
	
	public void TCED27101() throws Exception
	{
		try 
		
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();
			
			click("//a[contains(text(),'Submitted Lesson Plans')]");			 
			
			 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);		
			
			Assert.assertTrue(driver.findElement(By.xpath("//td[@class='subheading']")).getText().contains("Submitted Lesson Plans (only displays teachers with Edinsight login accounts)"));
		} 
		
		catch (Exception e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
		 		
	}
	
	@Test(priority=1)
	
	public void TCED27102()
	{
		
		try {
			driver.navigate().refresh();
			
			Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'School Type')]")).getText().contains("School Type"));
			
			Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'School/Building')]")).getText().contains("School/Building"));
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[7]/td")).getText().contains("Print Configuration: "));
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[6]/td")).getText().contains("Default Report Type:"));
		}
		
		catch (Exception e)
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
		
		
				
	}
	
  @Test(priority=2)
	
	public void TCED27103()
	{
	  
	try {
		driver.navigate().refresh();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Teacher Name')]")).getText().contains("Teacher Name"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Status')]")).getText().contains("Status"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Total Lessons')]")).getText().contains("Total Lessons"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Total Scheduled')]")).getText().contains("Total Scheduled"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'This Week')]")).getText().contains("This Week"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Next Week')]")).getText().contains("Next Week"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'AUG')]")).getText().contains("AUG"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'SEP')]")).getText().contains("SEP"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'OCT')]")).getText().contains("OCT"));
	} 
	
	catch (Exception e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();		
		Assert.fail(e.getMessage());
	}
	
	}
   
  @Test(priority=4)   
   
   public void TCED27104() throws Exception
   {
	   
	   try
	   {
		  driver.navigate().refresh();
		   
		   FileDelete();
		   
		   click("input#ctl00_MainContent_btnSaveToPDF.buttontext");
		   
		   Thread.sleep(6000);		
		   Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
	   } 
	 catch (Exception e)
	   
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();		
		Assert.fail(e.getMessage());
	  }
	   
   }
	
 @Test(priority=5)
   
   
   public void TCED27105() throws Exception
   {
	   
	   try 
	   {
		  driver.navigate().refresh();
		   
		   FileDelete();
		   
		   click("input#ctl00_MainContent_btnSaveToExcel.buttontext");
		   
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
	
	
	@Test(priority=6)
	
	public void TCED27106() throws InterruptedException
	{
		try 
		
		{
			driver.navigate().refresh();
			
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("scroll(0,100)");
			
			click("//a[contains(text(),'Ableton, A - 10')]");
			
					
			Assert.assertTrue(driver.findElement(By.xpath("//span[@class='bigblackheading']")).getText().contains("Teacher View :"));
					
			Assert.assertTrue(driver.findElement(By.xpath("//span[@class='bigblueheading']")).getText().contains("Ableton, A - 10"));				
							
			Thread.sleep(1000);
					
			driver.navigate().back();
		}
		
		catch (Exception e)
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
							

	}
	
@Test(priority=7)
		
	public void TCED27107() throws InterruptedException
	{
			
		try
			{
				driver.navigate().refresh();

				JavascriptExecutor js1=(JavascriptExecutor)driver;				
				js1.executeScript("scroll(0,350)");	
				click("//a[@id='ctl00_MainContent_rgTeachers_ctl00_ctl24_hlnkTotal']");
						
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3")).getText().contains("Search Existing Lessons (for Ableton, A - 7)"));				
												
				Thread.sleep(1000);
						
				driver.navigate().back();
			} 
			
			catch (Exception e) 			
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
				
	}
	
	
		
@Test(priority=8)
	
	public void TCED27108() throws InterruptedException
	{
			
			try 
			
			{
				driver.navigate().refresh();			
						
				click("//a[@id='ctl00_MainContent_rgTeachers_ctl00_ctl04_hlnkTotal']");
				
									
				Assert.assertTrue(driver.findElement(By.xpath("//h3[@class='subheading']")).getText().contains("Search Existing Lessons (for Ableton, A - 10)"));				
							
								
				Thread.sleep(1000);
						
				driver.navigate().back();
			} 
			
			catch (Exception e) 
			
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				Assert.fail(e.getMessage());
			}
							
		
	}
	

@Test(priority=9)

 public void TCED27109() throws Exception
    {
	 
	 try {
		driver.navigate().refresh();
		 
		 click("//*[@id='ctl00_MainContent_rgTeachers_ctl00__0']/td[6]/a[2]");	
		 
		 Thread.sleep(500);
		 
		 System.out.println(driver.findElement(By.xpath("//a[@id='ctl00_MainContent_lnkPrintPdf']")).getText());
		 
		 Assert.assertEquals(driver.findElement(By.xpath("//a[@id='ctl00_MainContent_lnkPrintPdf']")).getText(),"Print PDF");
		 
		 System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_lnkPrintWord']")).getText());
		
		 Assert.assertEquals(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_lnkPrintWord']")).getText(),"Print Word");
	} 
	 
	 catch (Exception e) 
	 
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		Assert.fail(e.getMessage());
	}	 
	  
    }
 
 @Test(priority=11)

  public void TCED27111() throws Exception
  {
	  try 
	  
	  {
		  driver.navigate().refresh();
		  
		  click("//*[@id='ctl00_MainContent_rgTeachers_ctl00__0']/td[8]/a");		  
		  			
		  Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3")).getText().contains("Calendar (for Ableton, A - 10)"));				
				
		   Thread.sleep(1000);
					
			driver.navigate().back();
	} 
	  
	  catch (Exception e) 
	  
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		Assert.fail(e.getMessage());
	}						
				
	  	  
	  
  }
  
 @Test(priority=12)

 public void TCED27112()
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
   }
	 
	 
 }

}
