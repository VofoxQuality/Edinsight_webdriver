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
		
		try 
		
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
		
		
		catch (Exception e) 
		
		{
			Assert.fail(e.getMessage());			
			e.printStackTrace();
		}
		
		
	}
	
@Test(priority=1)
	
	public void TCED29202()
	{
		try 
		
		{
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
	
@Test(priority=2)
	
	public void TCED29203()
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
    	
    	catch (Exception e)
    	
    	{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}

	
@Test(priority=3)
	
public void TCED29204()
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
    	         
    	         
    	         catch (Exception e) 
    	         
    	         
    	        {
    	        	 
    	        	Assert.fail(e.getMessage());
					e.printStackTrace();
				}
    	
	}
	
	
@Test(priority=4)
	
	public void TCED29205()
	{
		
    	try {
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
	
@Test(priority=5)
	
	public void TCED29206()
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
    	        
    	        catch (Exception e) 
    	        
    	        {
					Assert.fail(e.getMessage());
					e.printStackTrace();
				}
	
	}
	
@Test(priority=6)
	
	public void TCED29207()
	{
        try {
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
        
        catch (InterruptedException e)         
        {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
     @Test(priority=7)
	
	public void TCED29208()
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
			
			//Click on Build/Edit link
			
			click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[2]/a");
			
			
			//Assert the heading "Title and Description"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTitleDescription1_pnlGeneral']/table[1]/tbody/tr/td[2]").contains("Title and Description"),"failed to assert text"+"Title and Description");
			
			
			//Assert the Course title as "For Automation [Do not Edit and Delete]"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapTitleDescription1_txtTitle']")).getAttribute("value").equals("For Automation [Do not Edit and Delete]"),"failed to assert text"+"  For Automation [Do not Edit and Delete]");
			 		
			//Assert the unit names "Test Unit 01"
			Assert.assertTrue(getText("//*[@id='table1']/table/tbody/tr/td[1]/table/tbody/tr[6]/td/a").contains("Test Unit 02"),"failed to assert text"+"  Test Unit 02");
			
			
			//Assert the unit names "Test Unit 02"
			Assert.assertTrue(getText("//*[@id='table1']/table/tbody/tr/td[1]/table/tbody/tr[7]/td/a").contains("Test Unit 01"),"failed to assert text"+"  Test Unit 01");
			
			//Assert the unit names "Test Unit 03"
			Assert.assertTrue(getText("//*[@id='table1']/table/tbody/tr/td[1]/table/tbody/tr[8]/td").contains("Test Unit 03"),"failed to assert text"+"  Test Unit 03");
		
			driver.navigate().back();
    	
    	} 
    	
    	catch (Exception e) 
    	
    	{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	
	}
     
@Test(priority=8)
 	
 public void TCED29209()
 	{    
	
	try {
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
		
		//Click on Copy link
		
		click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[3]/a");
				
		//Assert the heading "Copy Current Map to New Map"
		
		Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span").contains("Copy Current Map to New Map"),"failed to assert text"+"Copy Current Map to New Map");
		
		driver.navigate().back();
	}  
	
	catch (InterruptedException e)
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		Assert.fail(e.getMessage());
	}
			
	
 	}
	
@Test(priority=9)
	
	public void TCED29210()
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
			
			//Click on Copy link
			
			click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[3]/a");
			
            //Assert the label "Return to Current Map"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_LinkButton1']").contains("Return to Current Map"),"failed to assert text"+"Return to Current Map");
			
           //Assert the label "Copy Current Map to New Map"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span").contains("Copy Current Map to New Map"),"failed to assert text"+"Copy Current Map to New Map");
			
          //Assert the label "Current Map to Copy: For Automation [Do not Edit and Delete]"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_lblMapTitle']").contains("Current Map to Copy: For Automation [Do not Edit and Delete]"),"failed to assert text"+"Current Map to Copy: For Automation [Do not Edit and Delete]");
			
          //Assert the label "Title for New Curriculum Map"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_Label2']").contains("Title for New Curriculum Map"),"failed to assert text"+"Title for New Curriculum Map");
			
          //Assert the label "Target School Year"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_Label4']").contains("Target School Year"),"failed to assert text"+"Target School Year");
			
          //Assert the label "Return to Current Map"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_LinkButton2']").contains("Return to Current Map"),"failed to assert text"+"Return to Current Map");
			
			
          //Assert the label "Copy From Selected Map to Current Map"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlCopyFrom']/span").contains("Copy From Selected Map to Current Map"),"failed to assert text"+"Copy From Selected Map to Current Map");
			
			
         //Assert the label "Current Map: For Automation [Do not Edit and Delete]"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_lblCopyFromMapTitle']").contains("Current Map: For Automation [Do not Edit and Delete]"),"Current Map: For Automation [Do not Edit and Delete]");
					
         //Assert the label "1. To find a map select a Subject and then select the map"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_Label6']").contains("1. To find a map select a Subject and then select the map"),"failed to assert text"+"1. To find a map select a Subject and then select the map");
			
         //Assert the label "Subject:"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlCopyFrom']/table/tbody/tr[2]/td[2]").contains("Subject:"),"failed to assert text"+"Subject:");
			
         //Assert the label "Existing Map (Title):"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlCopyFrom']/table/tbody/tr[2]/td[3]").contains("Existing Map (Title):"),"failed to assert text"+"Existing Map (Title):");
			
       //Assert the label "2. To copy an entire Unit select the Unit only."
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_Label5']").contains("2. To copy an entire Unit select the Unit only."),"failed to assert text"+"2. To copy an entire Unit select the Unit only.");
			
			
       //Assert the label "Existing Map Units:
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlCopyFrom']/table/tbody/tr[4]/td[2]").contains("Existing Map Units:"),"failed to assert text"+"Existing Map Units:");
			
       //Existing Map Topics:"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlCopyFrom']/table/tbody/tr[4]/td[3]").contains("Existing Map Topics:"),"failed to assert text"+"Existing Map Topics:");
			
        //Assert the label "3. If copying a single topic please select the Current Map Unit it will be copied to."
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlCopyFrom']/table/tbody/tr[6]/td[1]").contains("3. If copying a single topic please select the Current Map Unit it will be copied to."),"failed to assert text"+"3. If copying a single topic please select the Current Map Unit it will be copied to.");
			
        //Assert the label "Current Map Units:"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlCopyFrom']/table/tbody/tr[6]/td[2]").contains("Current Map Units:"),"failed to assert text"+"Current Map Units:");
			
        //Assert the label "Return to Current Map"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_btnEditCurrentMap']").contains("Return to Current Map"),"failed to assert text"+"Return to Current Map");
		} 		
		
		catch (Exception e) 
		
		{
			
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
				
		
	}
	
@Test(priority=10)
	
	public void TCED29211()
	{
	
		try
		
		{
			driver.navigate().refresh();
			
			//Click on "Copy to New Map" button
			
			click("//*[@id='ctl00_MainContent_btnCopy']");
			
			//Assert the message "Both the ''Title'' and ''Target School Year'' must be entered to copy!"
			
			String alt_msg=driver.switchTo().alert().getText();
			
			Assert.assertEquals(alt_msg,"Both the ''Title'' and ''Target School Year'' must be entered to copy!");
			
			driver.switchTo().alert().accept();
		} 
		
		catch (Exception e)
		
		{		
			e.printStackTrace();
			Assert.fail(e.getMessage());
			
		}
		
	
	}
	
	
@Test(priority=11)
	
	public void TCED29212()
	{
		
		try {
			driver.navigate().refresh();
			
			Thread.sleep(3000);
			
   			if(isAlertPresents())
			{	  				
   			
			driver.switchTo().alert().dismiss();	
			}  
			
			String title=generateRandomData();
			
			//Enter Title = Random generated Text
			
			type("//*[@id='ctl00_MainContent_txtTitle']",title);
			
			//Enter Target School Year 2
			
			type("//*[@id='ctl00_MainContent_txtTargetSchoolYear']","2");
			
			//Click on "Copy to New Map" button
			
			click("//*[@id='ctl00_MainContent_btnCopy']");
			
			//Assert the random generated text as Title
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapTitleDescription1_txtTitle']")).getAttribute("value").equals(title));
			
			
		} 
		
		catch (Exception e)
		
		{			
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
		
		
		
	}
	
@Test(priority=12)
			
    public void TCED29213()
	    {
			
	        try
	        {       	
	        	
	        	
				driver.navigate().refresh();
				
				Thread.sleep(2000);
				
				if(isAlertPresents())
				{	  				
					
				driver.switchTo().alert().dismiss();	
				} 
				
				//hover over curriculum link
				
				Actions act=new Actions(driver);		
						
				act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
				
				//Click Edit Curriculum Menu	
				click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[7]/div/a");
				
				 //Enter "For Automation [Do not Edit and Delete]" in the Title filter text box				 

				type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");		
				
				// Click on the filter button
				
				 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
				 
				Thread.sleep(2000);				
				driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
					    
				Thread.sleep(2000);
						
				driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();
								 
				//Click on Copy link
					
				click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[3]/a");						
				
				//Subject = Mathematics
				Select sub_drop=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlSubjects']")));
				sub_drop.selectByVisibleText("Mathematics");
				
				//Existing Map = 01 demo1
				Select sub_map=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlMaps']")));
				sub_map.selectByVisibleText("01 demo1");
				
				Thread.sleep(500);
				
				//Existing Map Unit = unit 1
				Select sub_map_unit=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlUnits']")));
				sub_map_unit.selectByVisibleText("Unit 1");
				
				//Existing Map Topics = Topic1
				Select sub_map_top=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlTopics']")));
				sub_map_top.selectByVisibleText("Topic1");		
						
				//Current Map Units = Test Unit 01
				Select sub_map_un=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlCurrentMapUnits']")));
				sub_map_un.selectByVisibleText("Test Unit 01");
				
				//Click on Copy to Current Map button
				click("//*[@id='ctl00_MainContent_btnCopyFrom']");
				
				
				//Assert the message "Topic Topic1 has been successfully added to the current map!"
				String success=driver.switchTo().alert().getText();
				
				Assert.assertEquals("Topic Topic1 has been successfully added to the current map!", success);
				
				driver.switchTo().alert().accept();
				
				//Click on "Return to Current Map" link 
				click("//*[@id='ctl00_MainContent_LinkButton2']");				
				
				// Click on "Test Unit 01"
				click("//a[@title='Test Unit 01']");
				
				//Assert the newly copied Topic as "Topic1"
				Assert.assertEquals( getText("//a[contains(text(),'Add Topic...')]//preceding::a[1]"),"Topic1");
				
				//Click on Topic1 			
				click("//a[contains(text(),'Add Topic...')]//preceding::a[1]");
				
				// Click on Delete this topic button				
				click("//*[@id='ctl00_MainContent_CurriculumMapUnitTopic1_btnDeleteTopic']");
				
				//Assert the message "Are you sure you want to delete the selected Topic?"
				
				String del=driver.switchTo().alert().getText();
				Assert.assertEquals("Are you sure you want to delete the selected Topic?",del);
				
				//Click OK button in the "Are you sure you want to delete the selected Topic?" 
				
				driver.switchTo().alert().accept();
				
				Thread.sleep(2000);
				
				//Assert the message "Topic Deleted Successfully !!!"
				
				String top_del=driver.switchTo().alert().getText();
				Assert.assertEquals("Topic Deleted Successfully !!!",top_del);
				
				driver.switchTo().alert().accept();
				
				//click on Logout button
				 
				click("//*[@id='ctl00_A3']/img");
				
				//Assert the page Header as "Edinsight Login"
							
				Assert.assertTrue(driver.getTitle().contains("EdInsight Login"));
			} 
	        
	        catch (Exception e) 
	        
	        {
			
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
			
		}
	
}
