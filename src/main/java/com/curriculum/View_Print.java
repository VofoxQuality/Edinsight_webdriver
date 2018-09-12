package com.curriculum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class View_Print extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED29601() throws InterruptedException
	{
		
		try 
		
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over curriculum link
			
			Actions act=new Actions(driver);		
					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
			
			//Click Edit Curriculum Menu	
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[7]/div/a");
			
			//Enter "For Automation [Do not Edit and Delete]" in the Title filter text box 		
			type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");			
			
			// Click on the filter button		
			click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_Filter_Title']");
			Thread.sleep(2000);		
			
			//select contains					
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();
			
			
			//Click on Build/Edit 
			 click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[2]/a");
			
			//Click on View/Print
			click("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkViewEntireMap']");
			
			 
			 String parent_window=driver.getWindowHandle();
			 
			 Thread.sleep(3000);				 
			 
				for(String all_windows:driver.getWindowHandles())
					
				{
					if(!parent_window.equals(all_windows))
					{
						
						driver.switchTo().window(all_windows);						
				           
						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_lblCurriculumMap']").contains("Curriculum Map View: For Automation [Do not Edit and Delete]"),"failed to assert text"+"Curriculum Map View: For Automation [Do not Edit and Delete]");
			              
						//Assert the labels "Layout Options (sets how the curriculum information will be displayed)"
						   
						Assert.assertTrue(getText("//*[@id='lnkLayout']").contains("Layout Options (sets how the curriculum information will be displayed)"),"failed to assert text"+"Layout Options (sets how the curriculum information will be displayed)"); 
				            
			            //Assert the labels "Unit/Topic Filtering (optional)"
						
						Assert.assertTrue(getText("//*[@id='lnkFilter']").contains("Unit/Topic Filtering (optional)"),"failed to assert text"+"Unit/Topic Filtering (optional)");
						
						//Assert the labels "Display Options"
						
						Assert.assertTrue(getText("//*[@id='lnkOptions']").contains("Display Options"),"failed to assert text"+"Display Options");
						
						driver.close();	
						
						
					}
				}

				driver.switchTo().window(parent_window);
				
				driver.navigate().back();
		} 
		
		catch (Exception e)
		
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
		
	}
	
	@Test(priority=1)
	
	public void TCED29602() throws InterruptedException 

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
    						
    						//Click on  Display Options
    						click("//*[@id='lnkOptions']");
    						
    						//Assert the label "Show Unit Timeline by
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[1]/td[1]/u").contains("Show Unit Timeline by:"),"failed to assert text"+"  Show Unit Timeline by:");
    						
    						
    						//Assert the label "Size
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[1]/td[2]/u").contains("Size"),"failed to assert text"+"  Size");
    						
    						//Assert the label "Standards Display
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[1]/td[3]/u").contains("Standards Display"),"failed to assert text"+"  Standards Display");
    						
    						//Assert the label "Months
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[1]/span[1]/label").contains("Months"),"failed to assert text"+"  Months");
    						
    						//Assert the label "Weeks
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[1]/label[1]").contains("Weeks"),"failed to assert text"+"  Weeks");
    						
    						//Assert the label "School Day
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[1]/span[2]/label").contains("School Day"),"failed to assert text"+"  School Day");
    						    						
    						
    						//Assert the label "Date Range
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[1]/span[3]/label").contains("Date Range"),"failed to assert text"+"  Date Range");
    						
    						//Assert the label "No Display 
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[1]/label[2]").contains("No Display"),"failed to assert text"+"  No Display ");
    						
    						//Assert the label "Text Size
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[2]").contains("Text Size"),"failed to assert text"+"  Text Size");
    						
    						//Assert the label "Text Font
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[2]").contains("Text Font"),"failed to assert text"+" Text Font");
    						
    						
    						//Assert the label "Unit Only
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[3]/label[1]").contains("Unit Only"),"failed to assert text"+"  Unit Only ");
    						
    						//Assert the label "Topic Only
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[3]/label[2]").contains("Topic Only"),"failed to assert text"+"  Topic Only");
    						
    						
    						//Assert the label "Both
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[2]/td[3]/label[3]").contains("Both"),"failed to assert text"+"  Both ");
    						
    						
    						System.out.println("hi");
    						    						
    						//Assert the label "Orientation:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[4]/td[1]/u").contains("Orientation:"),"failed to assert text"+"  Orientation: ");
    						
    						//Assert the label "Page Break on Unit
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[4]/td[2]").contains("Page Break on Unit"),"failed to assert text"+"  Page Break on Unit ");
    						
    						//Assert the label "Page Break on Topic/Lesson"
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[4]/td[2]").contains("Page Break on Topic/Lesson"),"failed to assert text"+" Page Break on Topic/Lesson");
    						
		
    						//Assert the label "Show/Hide Page Assert the label "Elements
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[6]/td/u").contains("Show/Hide Page Elements"),"failed to assert text"+" Show/Hide Page Elements");
    						
    						
    						//Assert the label "Show Layout Name:"
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[1]").contains("Show Layout Name"),"failed to assert text"+" Show Layout Name: ");
    					
    						//Assert the label "Show Standards Text:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[1]").contains("Show Standards Text:"),"failed to assert text"+" Show Standards Text: ");
    						
    						//Assert the label "Display Logo:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[1]").contains("Display Logo:"),"failed to assert text"+"  Display Logo: ");
    						    						    						
    						//Assert the label "Show UbD Color:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[1]").contains("Show UbD Color:"),"failed to assert text"+"  Show UbD Color:");
    						
    						
    						//Assert the label "Do Not Display Topics:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[1]").contains("Do Not Display Topics:"),"failed to assert text"+"  Do Not Display Topics: ");
    						
    						
    						//Assert the label "Do Not Display Units or Topics:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[1]").contains("Do Not Display Units or Topics:"),"failed to assert text"+"  Do Not Display Units or Topics: ");
    						    						    						
    						
    						//Assert the label "Show Map Level Fields on UbD and Tabular
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[1]").contains("Show Map Level Fields on UbD and Tabular"),"failed to assert text"+"  Show Map Level Fields on UbD and Tabular");
    						
    						
    						//Assert the label "Show Edit Links for Fields Without Data:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[2]").contains("Show Edit Links for Fields Without Data:"),"failed to assert text"+"  Show Edit Links for Fields Without Data:");
    						
    						
    						
    						//Assert the label "Show Standard Critical Content and Crosslinks:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[2]").contains("Show Standard Critical Content and Crosslinks:"),"failed to assert text"+" Show Standard Critical Content and Crosslinks:");
    						
    						
    						//Assert the label "Strip All Font HTML Tags:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[2]").contains("Strip All Font HTML Tags:"),"failed to assert text"+"  Strip All Font HTML Tags:");
    						
    						//Assert the label "Strip All SPAN HTML Tags:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[2]").contains("Strip All SPAN HTML Tags:"),"failed to assert text"+"  Strip All SPAN HTML Tags:");
    						
    						//Assert the label "Strip All DIV HTML Tags:
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[2]").contains("Strip All DIV HTML Tags:"),"failed to assert text"+"  Strip All DIV HTML Tags:");
    						
    						//Assert the label "Display Grade with Each Unit: "
    						Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_tblOptions']/tbody/tr[7]/td[2]").contains("Display Grade with Each Unit:"),"failed to assert text"+"  Display Grade with Each Unit:");
    						  					   						
    						   						
    						
    						driver.close();	
						}
						
					
					}
					
					driver.switchTo().window(parent_window);	
	}
	
	
@Test(priority=2)
	
	public void TCED29603() throws InterruptedException
	{
		
        try 
        
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
        
        catch (Exception e)
        
        {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
@Test(priority=3)
	
	public void TCED29604() throws InterruptedException 

	{
    	try
    	
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
    	
    	catch (Exception e) 
    	
    	{
			
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
		
	}
	
	@Test(priority=4)
	
	public void TCED29605() throws InterruptedException
	{
        try 
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
