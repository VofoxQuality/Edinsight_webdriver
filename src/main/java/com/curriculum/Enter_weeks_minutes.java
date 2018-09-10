package com.curriculum;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Enter_weeks_minutes extends BaseClassOne


{
	
	@Test(priority=0)
	
	public void TCED29401() throws InterruptedException
	{
	
	try {
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
		
		// Click on Enter Weeks/Minutes
		 
		 click("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkWeeksMinutes']");
		 
		 //Assert the Heading "Enter Map Weeks or Minutes"
		 
		 Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_Label1']").contains("Enter Map Weeks or Minutes"),"failed to assert text"+"Enter Map Weeks or Minutes");
	} 
	
	catch (Exception e) 
	
	{
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}

    }
	
	@Test(priority=1)
	
	public void TCED29402()
	{
	
		try 
		{
			driver.navigate().refresh();
			
			//Assert the Labels "Enter Unit Weeks"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlEnterTime']/table[2]/tbody/tr[1]/td/label[1]").contains("Enter Unit Weeks"),"failed to assert text"+"Enter Unit Weeks");
			
			//Assert the Labels "Enter Topic Minutes"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlEnterTime']/table[2]/tbody/tr[1]/td/label[2]").contains("Enter Topic Minutes"),"failed to assert text"+"Enter Topic Minutes");
			
			//Assert the Labels "Unit Order" 
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry']/tbody/tr[1]/th[1]").contains("Unit Order"),"failed to assert text"+"Unit Order");
			
			//Assert the Labels "Unit Title"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry']/tbody/tr[1]/th[2]").contains("Unit Title"),"failed to assert text"+"Unit Title");
			
			//Assert the Labels "Week Begin"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry']/tbody/tr[1]/th[3]").contains("Week Begin"),"failed to assert text"+"Week Begin");
			
			//Assert the Labels "Week Instruction"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry']/tbody/tr[1]/th[4]").contains("Week Instruction"),"failed to assert text"+"Week Instruction");
		}
		
		catch (Exception e)
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
@Test(priority=2)
	
	public void TCED29403()
	{
		
		String WB1="2";
		String WI1="5";
		
		String WB2="2";
		String WI2="5";
		
		String WB3="2";
		String WI3="5";
		
		try 
		  
		{
			driver.navigate().refresh();
			
			if(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_rdBtnUnitweeks']")).isSelected()==false)
			{
				click("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_rdBtnUnitweeks']");
			}
			
			//Enter Week Begins for Test Unit 01 = 2
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl02_txtWeekBegin']")).clear();
			
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl02_txtWeekBegin']",WB1);
			
			//Enter Week Instruction for Test Unit 01 = 5
			
			 driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl02_txtWeekInstruction']")).clear();
			
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl02_txtWeekInstruction']",WI1);
			
			//Enter Week Begins for Test Unit 02 = 2
			
			 driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl03_txtWeekBegin']")).clear();
				
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl03_txtWeekBegin']",WB2);
			
			//Enter Week Instruction for Test Unit 02 = 5
			
			 driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl03_txtWeekInstruction']")).clear();
				
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl03_txtWeekInstruction']",WI2);
			
			//Enter Week Begins for Test Unit 03 = 2
			
			 driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekBegin']")).clear();
				
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekBegin']",WB3);
			
			//Enter Week Begins for Test Unit 03 = 2
			
			 driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekBegin']")).clear();
				
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekBegin']","2");
			
			
			//Enter Week Instruction for Test Unit 03 = 5
			
			 driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekInstruction']")).clear();
				
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekInstruction']","5");
			
			//click save changes button
			
			click("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_btnSaveChanges']");		
			
			//Assert the message "Unit Weeks Successfully Saved"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_lblMessageSuccess']").contains("Unit Weeks Successfully Saved"),"failed to assert text"+"Unit Weeks Successfully Saved");
			
			
			//Assert the Week Begins for Test Unit 01 as 2
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl02_txtWeekBegin']")).getAttribute("Value").equals(WB1));	
			
			//Assert the Week Instruction for Test Unit 01 as 5
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl02_txtWeekInstruction']")).getAttribute("Value").equals(WI1));	
			
			//Assert the Week Begins for Test Unit 02 as 2
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl03_txtWeekBegin']")).getAttribute("Value").equals(WB2));	
			
			//Assert the Week Instruction for Test Unit 02 as 5
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl03_txtWeekInstruction']")).getAttribute("Value").equals(WI2));	
			
			//Assert the Week Begins for Test Unit 03 as 2
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekBegin']")).getAttribute("Value").equals(WB3));
			
			//Assert the Week Instruction for Test Unit 03 as 5
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekInstruction']")).getAttribute("Value").equals(WI3));
			
			driver.navigate().refresh();
			
			Thread.sleep(4000);
			
   			if(isAlertPresents())
			{			
			driver.switchTo().alert().dismiss();	
			}
			
			//Delete all Entered values from Week Begins and Week Instructions columns			
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl02_txtWeekBegin']")).clear();
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl02_txtWeekInstruction']")).clear();
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl03_txtWeekBegin']")).clear();		
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl03_txtWeekInstruction']")).clear();
			 
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekBegin']")).clear();
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntry_ctl04_txtWeekInstruction']")).clear();
			
            //click save changes button
			
			click("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_btnSaveChanges']");		
						
			//Assert the message "Unit Weeks Successfully Saved"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_lblMessageSuccess']").contains("Unit Weeks Successfully Saved"),"failed to assert text"+"Unit Weeks Successfully Saved");
			
					
		}		

		catch (Exception e)
		
		{
		    Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
		
	}
	
	@Test(priority=3)
	
	public void TCED29404()
	{
		
		String TU1="15";
		
		String T1U1="20";
		
        String TU2="15";
		
		String T1U2="20";
		
        String TU3="15";
		
		String T1U3="20";


		
		try {
			
			
			driver.navigate().refresh();
			
			Thread.sleep(3000);
			
   			if(isAlertPresents())
			{	
   				
   			System.out.println(driver.switchTo().alert().getText());	
			driver.switchTo().alert().dismiss();	
			}   				
			
			if(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_rdBtnTopicweeks']")).isSelected()==false)
			{
				click("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_rdBtnTopicweeks']");
			}
			
            // Minutes For Topic for Test Topic 01 = 15
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl02_grdDataEntryUnitTopic_ctl02_txtMinutesForTopic']")).clear();
			
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl02_grdDataEntryUnitTopic_ctl02_txtMinutesForTopic']",TU1);
			
            //Minutes For Topic for Test Topic 02 = 20
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl02_grdDataEntryUnitTopic_ctl03_txtMinutesForTopic']")).clear();
			
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl02_grdDataEntryUnitTopic_ctl03_txtMinutesForTopic']",T1U1);
			
			
             //	Minutes For Topic for Test Topic 03 = 15
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl03_grdDataEntryUnitTopic_ctl02_txtMinutesForTopic']")).clear();		
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl03_grdDataEntryUnitTopic_ctl02_txtMinutesForTopic']",TU2);
			
            //	Minutes For Topic for Test Topic 04 = 20
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl03_grdDataEntryUnitTopic_ctl03_txtMinutesForTopic']")).clear();		
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl03_grdDataEntryUnitTopic_ctl03_txtMinutesForTopic']",T1U2);
			
			
           //	Minutes For Topic for Test Topic 05 = 15
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl04_grdDataEntryUnitTopic_ctl02_txtMinutesForTopic']")).clear();		
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl04_grdDataEntryUnitTopic_ctl02_txtMinutesForTopic']",TU3);
			
            //	Minutes For Topic for Test Topic 06 = 20
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl04_grdDataEntryUnitTopic_ctl03_txtMinutesForTopic']")).clear();		
			type("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl04_grdDataEntryUnitTopic_ctl03_txtMinutesForTopic']",T1U3);
			
			//click save changes button
			
			click("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_btnSaveChanges']");		
			
			//Assert the message "Topic Minutes Successfully Saved"
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_lblMessageSuccess']").contains("Topic Minutes Successfully Saved"),"failed to assert text"+"Topic Minutes Successfully Saved");
			
			//Delete all Entered values from Minutes For Topic column
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl02_grdDataEntryUnitTopic_ctl02_txtMinutesForTopic']")).clear();
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl02_grdDataEntryUnitTopic_ctl03_txtMinutesForTopic']")).clear();
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl03_grdDataEntryUnitTopic_ctl02_txtMinutesForTopic']")).clear();		
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl03_grdDataEntryUnitTopic_ctl03_txtMinutesForTopic']")).clear();
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl04_grdDataEntryUnitTopic_ctl02_txtMinutesForTopic']")).clear();
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_grdDataEntryTopics_ctl04_grdDataEntryUnitTopic_ctl03_txtMinutesForTopic']")).clear();		

			//click save changes button
			
			click("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_btnSaveChanges']");		
					
			//Assert the message "Topic Minutes Successfully Saved"
					
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapWeeksMinutes1_lblMessageSuccess']").contains("Topic Minutes Successfully Saved"),"failed to assert text"+"Topic Minutes Successfully Saved");
			
			//Click on Exit button
			
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
