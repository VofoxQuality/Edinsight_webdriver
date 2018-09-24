package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Custom_Reports extends BaseClassOne

{
	String parent_wind=driver.getWindowHandle();
	
	@Test(priority=0)	
	public void TCED30601()
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
			
			//Click on Custom Reports Menu
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[6]/td[2]/div/a/img");
			
			//Assert the Heading "Custom Report Layout"				
			
			for(String child:driver.getWindowHandles())
			{
				
				if(!parent_wind.equals(child))
				{
					driver.switchTo().window(child);
					Assert.assertTrue(getText("//*[@id='aspnetForm']/table[3]/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/h3").contains("Custom Report Layout"),"failed to assert text"+"Custom Report Layout");
								
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
	public void TCED30602()
	   {
		//Assert the Label "Maps"
		Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[2]/td[1]").contains("Maps"),"failed to assert text"+"Maps");

		//Assert the Label "Units"
		Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[3]/td[1]").contains("Units"),"failed to assert text"+"Units");
		
       //Assert the Label "Topics"
		Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[3]/td[1]").contains("Units"),"failed to assert text"+"Units");
		
//		Assert the Label "Report Layout"
//		Assert the Label "Sharing View"
//		Assert the Label "Do Not Display Topics"
//		Assert the Label "Repeat Top Header for each Topic of a Unit"
//		Assert the Label "Show Standards Text"
//		Assert the Label "Show Standard Critical Content and Crosslinks"
//		Assert the Label "Consolidate Topics under Unit"
//		Assert the Label "Avoid Page-Break on Table Row"
//		Assert the Label "Please select a topic to continue!"
	   
	   }
	
	@Test(priority=2)	
	public void TCED30603()
	   {
		
		try {
			//Click on Dispaly Button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnDisplay']");
			
			//select Map :- For Automation [Do not Edit and Delete]
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlMaps']", "label=For Automation [Do not Edit and Delete]");
			
			// Click on Dispaly Button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnDisplay']");
			
			//Assert the selected Map name as "For Automation [Do not Edit and Delete]"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table[2]/tbody/tr[1]/td").contains("For Automation [Do not Edit and Delete]"),"failed to assert text"+"For Automation [Do not Edit and Delete]");
					
			//Assert the label "IE COSMETOLOGY"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table[2]/tbody/tr[2]/td").contains("IE COSMETOLOGY"),"failed to assert text"+"IE COSMETOLOGY");
		  } 
		
		   catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	   
	   }

	public void TCED30604()
	   {
		
		try 
		
		{
			//Application should be in the Custum Print Layout  page
			
			FileDelete();
			
			//Click on PDF button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnPDF']");
			
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	   
	   }

	public void TCED30605()
	   {
		try 
		{
			//Application should be in the Custum Print Layout  page		
			FileDelete();
			
			//Click on WORD button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnWord']");
			
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
			
			driver.close();			
			driver.switchTo().window(parent_wind);
			
   			//click on Logout button			 
			click("//*[@id='ctl00_A3']/img");
			
			//Assert the page Header as "Edinsight Login"						
			Assert.assertTrue(driver.getTitle().contains("EdInsight Login"));
		} 
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
					   
	   }
	

}
