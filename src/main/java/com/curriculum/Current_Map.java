package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Current_Map extends BaseClassOne

{
	
	@Test
	(priority=0)
	
	public void TCED29501() throws InterruptedException
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
					
					//Clear filter box
						
					driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).clear();
					
					// Click on the filter button
					
					 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
					 
					//Enter "For Automation [Do not Edit and Delete]" in the Title filter text box 
						
					type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");

					Thread.sleep(2000);
						
					driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
					    
					 Thread.sleep(2000);
						
					 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();
					
					//Click on Build/Edit
					 
					 click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[2]/a");
					 
					 // Click on Copy Current Map
					 
					 click("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkCopyCurrentMap']");
					 
					 //Assert the Heading "Copy Current Map to New Map"
					 
					 Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span").contains("Copy Current Map to New Map"),"failed to assert text"+"Copy Current Map to New Map");
					 
					//Click on Exit button
						
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
