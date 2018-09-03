package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
public class Print_Lessons extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED25101()
	{
		
		//Superintent Login
		login(Supertent_Login_id,Supertent_Login_Password);	
				
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();
		
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[2]/div/a");
		
		click("a#ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintToday.smalltext");
		
		Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));		
			
	}
@Test(priority=1)
	
	public void TCED25102()
	{
		try 
		{
			driver.navigate().refresh();
			
			click("a#ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintToday.smalltext");
			
			driver.switchTo().frame("PrintDialog");
			
			System.out.println(driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/table/tbody/tr[2]/td[2]")).getText());
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/table/tbody/tr[2]/td[2]")).getText().contains("Default Report Type: "));
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/table/tbody/tr[2]/td[2]")).getText().contains("Report View:"));
			
			System.out.println(driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/table/tbody/tr[3]/td[2]")).getText());
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/table/tbody/tr[3]/td[2]")).getText().contains("Print Configuration:  "));			
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/table/tbody/tr[4]/td[2]")).getText().contains("Time Slot Configuration:"));
			
			
		} 
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
		
		
	}
	
//	@Test(priority=2)
	
	public void TCED25103()
	{
        try 
        {
			driver.navigate().refresh();
			
			click("a#ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintToday.smalltext");
			
			driver.switchTo().frame("PrintDialog");
			
			Select select = new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlPrintRangeType']")));
			WebElement option = select.getFirstSelectedOption();
			 
			 String SelectedText = option.getText();
			 
			 System.out.println(SelectedText);
			 
			 Assert.assertTrue(SelectedText.equalsIgnoreCase("Today's lessons"));
		} 
        
        catch (Exception e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
//	@Test(priority=3)
	
	public void TCED25104() throws Exception
	{
		
		try 
		{
			driver.navigate().refresh();
			
			click("a#ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintToday.smalltext");
			
			driver.switchTo().frame("PrintDialog");
			
			FileDelete();
			
			click("input#ctl00_ContentPlaceHolder1_btnPrint.buttontext");
			
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
	
//	@Test(priority=4)
	
	public void TCED25105() throws Exception
	{
		

		try 
		{
			driver.navigate().refresh();
			
			click("a#ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintToday.smalltext");
			
			driver.switchTo().frame("PrintDialog");
			
			FileDelete();
			
			click("//*[@id='ctl00_ContentPlaceHolder1_btnPrintWord']");
			
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
		}
		
		catch (Exception e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();			
			Assert.fail(e.getMessage());
		}
		
	}
	
//@Test(priority=5)
	
	public void TCED25106() throws Exception
	{
	
	  try 
	  
	  {
		  
		  driver.navigate().refresh();
		  
		  click("a#ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintToday.smalltext");
			
		  driver.switchTo().frame("PrintDialog");
		  
		  click("//*[@id='ctl00_ContentPlaceHolder1_btnReportViews']");	  
		  
		  String parent_window=driver.getWindowHandle();
			
			for(String all_windows:driver.getWindowHandles())
			{
				if(!parent_window.equals(all_windows))
				{
					
					driver.switchTo().window(all_windows);
					
					Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_lblCurriculumMap")).getText().contains("Lesson View:"));
					
					//System.out.println(driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_lblCurriculumMap")).getText());
					
					driver.close();
					
					driver.switchTo().window(parent_window);
														
				}
				
				
			}
	}
	catch (Exception e) 	  
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

//@Test(priority=6)

public void TCED25107()

{

	  try 
	  
	 {
		  
		  driver.navigate().refresh();
		  
		  click("a#ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintToday.smalltext");
		  
		  Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));
		  
		  click("//*[@id='RadWindowWrapper_ctl00_MainContent_PrintDialog']/div[1]/div/ul/li[2]/span");
	} 
	  
	  catch (Exception e) 
	  
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}

// @Test(priority=7)

  public void TCED25108()

  {
	   driver.navigate().refresh();
	   
	   click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintTomorrow']");
	   
	   Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));
	   
	   

  }
 
// @Test(priority=8)

 public void TCED25109()
 
 {
	 
	 try 
	 {
		driver.navigate().refresh();
		   
		 click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintTomorrow']"); 
		 
		 driver.switchTo().frame("PrintDialog");
		 
		 Select select = new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlPrintRangeType']")));
		 WebElement option = select.getFirstSelectedOption();
		 
		 String SelectedText = option.getText();
		 
		 System.out.println(SelectedText);
		 
		 Assert.assertTrue(SelectedText.equalsIgnoreCase("Tomorrow's lessons"));
	} 
	 catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 
 }
 
// @Test(priority=9)

 public void TCED25110() throws Exception
 {
	 
	 
	    driver.navigate().refresh();
	   
	    click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintTomorrow']"); 
	 
	    driver.switchTo().frame("PrintDialog");
		
		FileDelete();
		
		click("input#ctl00_ContentPlaceHolder1_btnPrint.buttontext");
		
		Thread.sleep(6000);			
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
	 	 
	 
 }

 
// @Test(priority=10)

 public void TCED25111() throws Exception
 {
	 
	 
	    driver.navigate().refresh();
	   
	    click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintTomorrow']"); 
	 
	    driver.switchTo().frame("PrintDialog");
		
		FileDelete();
		
		click("//*[@id='ctl00_ContentPlaceHolder1_btnPrintWord']");
		
		Thread.sleep(6000);			
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
	 
	 
	 
 }
 
//@Test(priority=11)
 
 public void TCED25112()

 {
	   try 
	   
	   {
		   driver.navigate().refresh();
		   
		   click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintTomorrow']");
		   
		   Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));
		   
		   click("//*[@id='RadWindowWrapper_ctl00_MainContent_PrintDialog']/div[1]/div/ul/li[2]/span");
	   } 
	   
	   catch (Exception e) 
	   
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
 }
 
//@Test(priority=12)
 
 public void TCED25113()
 
 {
	 
	   driver.navigate().refresh();
	   
	   click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintThisWeek']");
	   
	   Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));
	 
	 
	 
 }

//@Test(priority=13)
 
 public void TCED25114()
 
 {
	 
	 try
	
	 {
		 driver.navigate().refresh();
		   
		 click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintThisWeek']");
		 
		 driver.switchTo().frame("PrintDialog");
		 
		 Select select = new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlPrintRangeType']")));
		 WebElement option = select.getFirstSelectedOption();
		 
		 String SelectedText = option.getText();
		 
		 System.out.println(SelectedText);
		 
		 Assert.assertTrue(SelectedText.equalsIgnoreCase("This week's"));
	} 
	 
	 catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 	 
	 
 }
 

//@Test(priority=14)
 
 public void TCED25115() throws Exception
 
 {
	 
	 try {
		driver.navigate().refresh();
		   
		 click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintThisWeek']");
		 
		 driver.switchTo().frame("PrintDialog");
		 
		 FileDelete();
			
		 click("input#ctl00_ContentPlaceHolder1_btnPrint.buttontext");
			
		 Thread.sleep(6000);			
		 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
	} 
	 
	 catch (Exception e) 
	 
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 
 }
 
//@Test(priority=15)
 
 public void TCED25116() throws Exception
 
 {
	 
	 try
	 
	 {
		driver.navigate().refresh();
		   
		 click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintThisWeek']");
		 
		 driver.switchTo().frame("PrintDialog");
		 
		 FileDelete();
			
		 click("//*[@id='ctl00_ContentPlaceHolder1_btnPrintWord']");
			
		 Thread.sleep(6000);			
		 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
	} 
	 
	 catch (Exception e) 
	 
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
 
//@Test(priority=16)
 
 public void TCED25117()
 {
	 
   try
	   
	 {
		   driver.navigate().refresh();
		   
		   click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_lnkPrintThisWeek']");
		   
		   Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));
		  
		   click("//*[@id='RadWindowWrapper_ctl00_MainContent_PrintDialog']/div[1]/div/ul/li[2]/span");
	} 
	   
	 catch (Exception e) 
	   
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 }
 
//@Test(priority=17)
 
 public void TCED25118()
 
 {
	 
  try 
	   
	 {
		driver.navigate().refresh();
		   
		 click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink1']");
		   
		 Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));
	} 
  
  catch (Exception e)
    {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 
}
 
//@Test(priority=18)
 
 public void TCED25119()
 {
	 
	try 
		{
			driver.navigate().refresh();
			   
			 click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink1']");
			 
			 driver.switchTo().frame("PrintDialog");
			 
			 Select select = new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlPrintRangeType']")));
			 WebElement option = select.getFirstSelectedOption();
			 
			 String SelectedText = option.getText();
			 
			 System.out.println(SelectedText);
			 
			 Assert.assertTrue(SelectedText.equalsIgnoreCase("Next week's"));
		} 
	    catch (Exception e) 
	
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
	 
	 
 }
 
//@Test(priority=19)
 
 public void TCED25120() throws Exception
 
 {
	 
	 try 
	 {
		driver.navigate().refresh();
		   
		click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink1']");
		 
		 driver.switchTo().frame("PrintDialog");
		 
		 FileDelete();
			
		 click("input#ctl00_ContentPlaceHolder1_btnPrint.buttontext");
			
		 Thread.sleep(6000);			
		 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
	} 
	 
	 catch (Exception e) 
	 
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 
	 
 }

//@Test(priority=20)

public void TCED25121() throws Exception

{
	 
	 try 
	 {
		driver.navigate().refresh();
		   
		click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink1']");
		 
		 driver.switchTo().frame("PrintDialog");
		 
		 FileDelete();
			
		 click("//*[@id='ctl00_ContentPlaceHolder1_btnPrintWord']");
			
		 Thread.sleep(6000);			
		 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
	} 
	 
	 catch (Exception e) 
	 
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 
}

//@Test(priority=21)

public void TCED25122()

{
	 
try 
	   
	 {
		driver.navigate().refresh();
		   
		 click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink1']");
		   
		 Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));
		 
		 click("//*[@id='RadWindowWrapper_ctl00_MainContent_PrintDialog']/div[1]/div/ul/li[2]/span");
	} 

catch (Exception e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
 } 
	 
}

//@Test(priority=22)

public void TCED25123()

{
	 
try 
	   
	 {
		driver.navigate().refresh();
		   
		 click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink2']");
		   
		 Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));		 
		 
	} 

catch (Exception e)
{
		// TODO Auto-generated catch block
		e.printStackTrace();
} 
	 
}

//@Test(priority=23)

public void TCED25124()
{
	 
	try 
		{
			driver.navigate().refresh();
			   
			click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink2']");
			 
			 driver.switchTo().frame("PrintDialog");
			 
			 Select select = new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlPrintRangeType']")));
			 WebElement option = select.getFirstSelectedOption();
			 
			 String SelectedText = option.getText();
			 
			 System.out.println(SelectedText);
			 
			 Assert.assertTrue(SelectedText.equalsIgnoreCase("Date Range"));
		} 
	    catch (Exception e) 
	
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
	 
	 
}

//@Test(priority=24)

public void TCED25125() throws Exception

{
	
	try 
	
	{
		driver.navigate().refresh();
		   
		click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink2']");
		 
		driver.switchTo().frame("PrintDialog");
		
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_radBeginningLessonDate_dateInput']")).sendKeys("8/1/2018");
		
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_radEndingLessonDate_dateInput']")).sendKeys("8/30/2018");
		
		 FileDelete();
		
		  click("input#ctl00_ContentPlaceHolder1_btnPrint.buttontext");
			
		 Thread.sleep(6000);			
		 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
	} 
	
	catch (Exception e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}

//@Test(priority=25)

public void TCED25126() throws Exception

{
	
	try 
	
	{
		driver.navigate().refresh();
		   
		click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink2']");
		 
		driver.switchTo().frame("PrintDialog");
		
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_radBeginningLessonDate_dateInput']")).sendKeys("8/1/2018");
		
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_radEndingLessonDate_dateInput']")).sendKeys("8/30/2018");
		
		 FileDelete();
		
		 click("//*[@id='ctl00_ContentPlaceHolder1_btnPrintWord']");
			
		 Thread.sleep(6000);			
		 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
	} 
	
	catch (Exception e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

//@Test(priority=26)

public void TCED25127()

{
	 
try 
	   
	 {
	
		driver.navigate().refresh();
		   
		click("//*[@id='ctl00_plcLeftMenu_LessonPlannerLeftMenu1_HyperLink2']");
		   
		 Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='rwTitle']")).getText().contains("Print Lesson(s)"));
		 
		 click("//*[@id='RadWindowWrapper_ctl00_MainContent_PrintDialog']/div[1]/div/ul/li[2]/span");
	} 

catch (Exception e)
{
		// TODO Auto-generated catch block
		e.printStackTrace();
} 
	 
}

//@Test(priority=27)

public void TCED27128()
{
	
	try 
	 
	 {
		driver.navigate().refresh(); 
		 
		 click("//*[@id='ctl00_A3']/img");
	 } 
	catch (Exception e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
}

}
