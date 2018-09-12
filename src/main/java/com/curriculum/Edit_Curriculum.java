package com.curriculum;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Edit_Curriculum extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED29201()
	{
		
		//Superintent Login
		login(Supertent_Login_id,Supertent_Login_Password);	
		
		//hover over curriculum link
		
		Actions act=new Actions(driver);		
				
		act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
		
		//Click Edit Curriculum Menu	
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[7]/div/a");
		
		//Assert the Heading "Edit Curriculum - Department or Sub-group Login Access"
		
		Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/h4").contains("Edit Curriculum - Department or Sub-group Login Access"),"failed to assert text"+"Edit Curriculum - Department or Sub-group Login Access");
		
		
	}
	
//	@Test(priority=1)
	
	public void TCED29202()
	{
		try {
			driver.navigate().refresh();
			
          //Assert the Labels "Please select a curriculum login account you have permissions to: "
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr/td").contains("Please select a curriculum login account you have permissions to:"),"failed to assert text"+"Please select a curriculum login account you have permissions to:");
			
         //	Assert the dropdown values "Curriculum98 and Curriculum95"
			
			Select cr_drop=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlLogins']")));
			List<WebElement> cr_list= cr_drop.getOptions();
			Assert.assertTrue(cr_list.get(0).getText().contains("Curriculum98"),"failed to assert text"+" Curriculum98");
			Assert.assertTrue(cr_list.get(1).getText().contains("Curriculum95"),"failed to assert text"+" Curriculum95");
			
         //	Assert the labels "Course"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[4]/a").contains("Course"),"failed to assert text"+"Course");
			
        //	Assert the labels "Title" 
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[5]/a").contains("Title"),"failed to assert text"+"Title");
			
        //	Assert the labels "Description"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00']/thead/tr[1]/th[6]").contains("Description"),"failed to assert text"+"Description");
		} 
		
		catch (Exception e)
		
		{		
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	
	}
	
//@Test(priority=2)
	
	public void TCED29203() throws InterruptedException
	{
		
    	driver.navigate().refresh();    	
	
		//Enter "For Automation [Do not Edit and Delete]" in the Title filter text box 
		
		type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");		
		
		// Click on the filter button
		
		 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
		 
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
			    
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();		  
		 
		 //click on View/print button
		 
		 click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[1]/a"); 
		 
		 String parent_window=driver.getWindowHandle();
		 
		 Thread.sleep(3000);				 
		 
			for(String all_windows:driver.getWindowHandles())
				
			{
				if(!parent_window.equals(all_windows))
				{
					
					driver.switchTo().window(all_windows);				
					
		 
                   //Assert the heading "Curriculum Map View: For Automation [Do not Edit and Delete]" 	 
		 
		           
				   Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_lblCurriculumMap']").contains("Curriculum Map View: For Automation [Do not Edit and Delete]"),"failed to assert text"+"Curriculum Map View: For Automation [Do not Edit and Delete]");
                  
				   //Assert the labels "Layout Options (sets how the curriculum information will be displayed)"
				   
				   Assert.assertTrue(getText("//*[@id='lnkLayout']").contains("Layout Options (sets how the curriculum information will be displayed)"),"failed to assert text"+"Layout Options (sets how the curriculum information will be displayed)"); 
		            
                  //Assert the labels "Unit/Topic Filtering (optional)"
				   
				   Assert.assertTrue(getText("//*[@id='lnkFilter']").contains("Unit/Topic Filtering (optional)"),"failed to assert text"+"Unit/Topic Filtering (optional)");
				 
				   driver.close();			   
				   			   
				
				}
			}

			driver.switchTo().window(parent_window);
		
	}

	
//@Test(priority=3)
	
	public void TCED29204() throws InterruptedException
	{
		
    	driver.navigate().refresh();
    	
    	//Enter "For Automation [Do not Edit and Delete]" in the Title filter text box 
		
    			type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");		
    			
    			// Click on the filter button
    			
    			 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
    			 
    			Thread.sleep(2000);
    				
    			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
    				    
    			Thread.sleep(2000);
    					
    			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();		  
    			 
    			 //click on View/print button
    			 
    			 click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[1]/a"); 
    			 
    			 String parent_window=driver.getWindowHandle();
    			 
    			 Thread.sleep(3000);				 
    			 
    				for(String all_windows:driver.getWindowHandles())
    					
    				{
    					if(!parent_window.equals(all_windows))
    					{
    						
    						driver.switchTo().window(all_windows);	
    						
    						//Click on Layout Options
    						click("//*[@id='lnkLayout']"); 
    	
    	                     //Assert the label "View Layout  "
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblLayout']/tbody/tr[1]/td").contains("View Layout"),"failed to assert text"+"View Layout");
    	
    	                    //Assert the label "Justified "
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblLayout']/tbody/tr[1]/td").contains("Justified"),"failed to assert text"+"Justified");
    	                    
    						//Assert the label "Tabular "
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblLayout']/tbody/tr[1]/td").contains("Tabular"),"failed to assert text"+"Tabular");
    						
    	                   //Assert the label "UbD"
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblLayout']/tbody/tr[1]/td").contains("UbD"),"failed to assert text"+"UbD");
    						
    						Select cr_drp=new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlViewLayout']")));    											
    						
    						List<WebElement> dr_li=cr_drp.getOptions();
    						//Assert the label "Map Unit Review"
    						Assert.assertTrue(dr_li.get(0).getText().contains("Map Unit Review"));
    						
    						//Assert the label "Map Unit Review Condensed"
    						Assert.assertTrue(dr_li.get(1).getText().contains("Map Unit Review Condensed"));
    						
    						//Assert the label "Stage 1: Desired Results"
    						Assert.assertTrue(dr_li.get(2).getText().contains("Stage 1: Desired Results"));
    	                  
    						//Assert the label "Stage 2: Acceptable Evidence"
    						Assert.assertTrue(dr_li.get(3).getText().contains("Stage 2: Acceptable Evidence"));
    	
    	                    //Assert the label "Stage 3: Teaching-
    						Assert.assertTrue(dr_li.get(4).getText().contains("Stage 3: Teaching-"));
    						
    						
    						//Click on  Unit/Topic Filtering (optional)
    						click("//*[@id='lnkFilter']");
    						
    						
    						//Assert the label "To display entire Map
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblFiltering']/tbody/tr[1]/td").contains("To display entire Map clear the drop-down lists"),"failed to assert text"+"To display entire Map clear the drop-down lists");
    	
    						//Assert the label "Units:"
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblFiltering']/tbody/tr[2]/td[1]").contains("Units"),"failed to assert text"+"  Units");
    						    						    						
    						//Assert the label "Topics:"
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblFiltering']/tbody/tr[2]/td[2]").contains("Topics"),"failed to assert text"+"  Topics");
    						
    						
    						
    						//Assert the label "Show Unit Timeline by
    						//Assert the label "Size
    						//Assert the label "Standards Display
    						//Assert the label "Months
    						//Assert the label "Weeks
    						//Assert the label "School Day
    						//Assert the label "Date Range
    						//Assert the label "No Display 
    						//Assert the label "Text Size
    						//Assert the label "Text Font
    						//Assert the label "Unit Only
    						//Assert the label "Topic Only
    						//Assert the label "Both
    						//Assert the label "Orientation: 
    						//Assert the label "Page Break on Unit
    						//Assert the label "Page Break on Topic/Lesson"
    					}
    					
    				}
    	
	}
	
	
//	@Test(priority=4)
	
	public void TCED29205() throws InterruptedException
	{
		
    	driver.navigate().refresh();
    	
		//Enter "For Automation [Do not Edit and Delete]" in the Title filter text box 
		
		type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");		
		
		// Click on the filter button
		
		 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
		 
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
			    
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();		  
		 
		 //click on View/print button
		 
		 click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[1]/a"); 
		 
		 String parent_window=driver.getWindowHandle();
		 
		 Thread.sleep(3000);				 
		 
			for(String all_windows:driver.getWindowHandles())
				
			{
				if(!parent_window.equals(all_windows))
				{
					
					driver.switchTo().window(all_windows);	
					
					click("//*[@id='lnkLayout']");
					
					//Select  Justified from View Layout
					
					if(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_rdoLayoutList_0']")).isSelected()==false)
                    {
                    
						click("//*[@id='ctl00_ContentPlaceHolder1_rdoLayoutList_0']");
                    }
						
						//Option button > Display
						
						click("//*[@id='ctl00_ContentPlaceHolder1_SplitButton']");
						
						click("//*[@id='ctl00_ContentPlaceHolder1_RadContextMenu1_detached']/ul/li[1]/span");	
						
						Thread.sleep(2000);						
						
						//Assert the label "Curriculum Map: For Automation [Do not Edit and Delete]"
						
						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divDisplay']/div/span[1]").contains("Curriculum Map: For Automation [Do not Edit and Delete]"),"failed to assert text"+"Curriculum Map: For Automation [Do not Edit and Delete]");
						driver.close();	                                    
										
				}
				
			
			
			}
    	
			driver.switchTo().window(parent_window);
	}
	
//	@Test(priority=5)
	
	public void TCED29206() throws InterruptedException
	{
		
    	        driver.navigate().refresh();        
    	                  
    	            	        
    	        //Enter "For Automation [Do not Edit and Delete]" in the Title filter text box 
		
    			type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");		
    			
    			// Click on the filter button
    			
    			 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
    			 
    			Thread.sleep(2000);
    				
    			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
    				    
    			Thread.sleep(2000);
    					
    			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();		  
    			 
    			 //click on View/print button
    			 
    			 click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[1]/a"); 
    			 
    			 String parent_window=driver.getWindowHandle();
    			 
    			 Thread.sleep(3000);				 
    			 
    				for(String all_windows:driver.getWindowHandles())
    					
    				{
    					if(!parent_window.equals(all_windows))
    					{
    						
    						driver.switchTo().window(all_windows);	    						

    						click("//*[@id='ctl00_ContentPlaceHolder1_SplitButton']");
    						
    						FileDelete();
    						
    						click("//*[@id='ctl00_ContentPlaceHolder1_RadContextMenu1_detached']/ul/li[2]/span");
    						
    						Thread.sleep(6000);		
    						Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
    						
    						driver.close();
    						
    					}
    				}
    				
    				
    				driver.switchTo().window(parent_window);
	
	}
	
//	@Test(priority=6)
	
	public void TCED29207() throws InterruptedException
	{
        driver.navigate().refresh();
        
        Thread.sleep(3000);
        
		if(isAlertPresents())
		{	  				
			
		driver.switchTo().alert().dismiss();	
		}  
        
        
        //Enter "For Automation [Do not Edit and Delete]" in the Title filter text box 
        

		type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");		
		
		// Click on the filter button
		
		 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
		 
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
			    
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();		  
		 
		 //click on View/print button
		 
		 click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[1]/a"); 
		 
		 String parent_window=driver.getWindowHandle();
		 
		 Thread.sleep(3000);				 
		 
			for(String all_windows:driver.getWindowHandles())
				
			{
				if(!parent_window.equals(all_windows))
				{
					
					driver.switchTo().window(all_windows);    					
									
					FileDelete();
					
					//Option button > Print Word
					
					click("//*[@id='ctl00_ContentPlaceHolder1_SplitButton']");
					
					Thread.sleep(500);	
										
					click("//*[@id='ctl00_ContentPlaceHolder1_RadContextMenu1_detached']/ul/li[3]/span");					
					
					Thread.sleep(6000);			
					Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".rtf"), "Failed to download document which has extension .RTF");
					
					driver.close();
				}
		
			}
	
			driver.switchTo().window(parent_window);
	}
	
	@Test(priority=12)
	
	public void TCED29213() throws InterruptedException
	{
		
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        
		if(isAlertPresents())
		{	  				
			
		driver.switchTo().alert().dismiss();	
		}  
		
        //Enter "For Automation [Do not Edit and Delete]" in the Title filter text box        

		type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");		
		
		// Click on the filter button		
		 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
		
		Thread.sleep(2000);			
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();
		
		//Click on Copy link
		click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[3]/a");
		Thread.sleep(500);
		
		//Subject = Mathematics
		Select sub_drop=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlSubjects']")));
		sub_drop.selectByVisibleText("Mathematics");
		
	}
	
}
