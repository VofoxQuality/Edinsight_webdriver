package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Custom_Reports extends BaseClassOne

{
		
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
			String parent_wind=driver.getWindowHandle();			
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
	
		try 
		  {
			//Assert the Label "Maps"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[2]/td[1]").contains("Maps"),"failed to assert text"+"Maps");

			//Assert the Label "Units"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[3]/td[1]").contains("Units"),"failed to assert text"+"Units");
			
           //Assert the Label "Topics"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[4]/td[1]").contains("Topics"),"failed to assert text"+"Topics");
			
			//Assert the Label "Report Layout"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[6]/td[1]").contains("Report Layout"),"failed to assert text"+"Report Layout");
			
			//Assert the Label "Sharing View"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_ddlReportLayouts']/tbody/tr/td").contains("Sharing View"),"failed to assert text"+"Sharing View");
			
			
			//Assert the Label "Do Not Display Topics"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[8]/td[1]/label").contains("Do Not Display Topics"),"failed to assert text"+"Do Not Display Topics");
			
			//Assert the Label "Repeat Top Header for each Topic of a Unit"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[8]/td[2]/label").contains("Repeat Top Header for each Topic of a Unit"),"failed to assert text"+"Repeat Top Header for each Topic of a Unit");
			
            //Assert the Label "Show Standards Text"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[9]/td[1]/label").contains("Show Standards Text"),"failed to assert text"+"Show Standards Text");
			
            //Assert the Label "Show Standard Critical Content and Crosslinks"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[9]/td[2]").contains("Show Standard Critical Content and Crosslinks"),"failed to assert text"+"Show Standard Critical Content and Crosslinks"); 
				    
            //Assert the Label "Consolidate Topics under Unit"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[10]/td[1]/label").contains("Consolidate Topics under Unit"),"failed to assert text"+"Consolidate Topics under Unit");
			
           //Assert the Label "Avoid Page-Break on Table Row"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/table/tbody/tr[10]/td[2]/label").contains("Avoid Page-Break on Table Row"),"failed to assert text"+"Avoid Page-Break on Table Row"); 
			
           //Assert the Label "Please select a topic to continue!"
           Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']").contains("Please select a topic to continue!"),"failed to assert text"+"Please select a topic to continue!");
		
		  } 
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	   
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
			
			} 
		
		   catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	   
	   }
    @Test(priority=3)
	public void TCED30604()
	   {
		
		try 
		
		{
			//Application should be in the Custom Print Layout  page
			
			FileDelete();
			
			//Click on PDF button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnPDF']");		
			
			Thread.sleep(40000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");			
			
		} 
		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	   
	   }
    @Test(priority=4)
	public void TCED30605()
	   {
		try 
		{
			//Application should be in the Custum Print Layout  page		
			 FileDelete();
			
			//Click on WORD button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnWord']");
			
			Thread.sleep(40000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
			
			String parent_wind=driver.getWindowHandle();
			driver.close();	
			for(String child:driver.getWindowHandles())
			{
				
				if(!parent_wind.equals(child))
				{
					driver.switchTo().window(child);
				}
			}
				
		
			
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
