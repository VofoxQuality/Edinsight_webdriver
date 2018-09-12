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
						
					//driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).clear();
					
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
					 
				   
				} 
		        
		        catch (Exception e)
		        
		        {
					Assert.fail(e.getMessage());
					e.printStackTrace();
				}
		
		
	}
	
	@Test
	(priority=1)
	
	public void TCED29502()
	{
		
		try {
			driver.navigate().refresh();
			
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
	
	@Test
	(priority=2)
	
	public void TCED29503()
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
	
	@Test
	(priority=3)
	
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
			
			
		} 
		
		catch (Exception e)
		
		{			
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
		
		
		
	}

}
