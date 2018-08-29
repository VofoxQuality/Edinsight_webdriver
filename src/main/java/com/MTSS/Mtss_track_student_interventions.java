package com.MTSS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Mtss_track_student_interventions extends BaseClassOne
{
	
	@Test(priority=1)
	
	public void TCED19604()
	{
		try {
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//click MTTS link
			
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a");
			
			//click Tier / Intervention link
			
			click("//a[contains(text(),'Tier / Intervention')]");
			
			//click Track Student Interventions
			
			click("//a[contains(text(),'Track Student Interventions')]");
			
			//click Search button
			
			click("input#ctl00_MainContent_btnSearch.button");
			
			//clear value in Student Score textbox
			
			driver.findElement(By.cssSelector("input#ctl00_MainContent_rgSearch_ctl00_ctl04_rtxtStudentScore.riTextBox")).clear();
            //clear value in 	Student Goal/Grade Level Expectation textbox
			
			driver.findElement(By.cssSelector("input#ctl00_MainContent_rgSearch_ctl00_ctl04_rtxtStudentGoal.riTextBox")).clear();
			
			//clear value in ntervention Group Average textbox
			
			driver.findElement(By.cssSelector("input#ctl00_MainContent_rgSearch_ctl00_ctl04_rtxtGroupAverage.riTextBox")).clear();
			
			type("input#ctl00_MainContent_rgSearch_ctl00_ctl04_rtxtStudentScore.riTextBox","12");
			
			type("input#ctl00_MainContent_rgSearch_ctl00_ctl04_rtxtStudentGoal.riTextBox","25");
			
			type("input#ctl00_MainContent_rgSearch_ctl00_ctl04_rtxtGroupAverage.riTextBox","45");
			
			// click save button
			
			click("input#ctl00_MainContent_btnSave.button");
			
			//get text from the alert pop-up
			
			String s=driver.switchTo().alert().getText();		
			
			//assert text in alert pop-up
			
			Assert.assertEquals(s,"Data saved successfully!");
			
			//click OK button in the alert pop-up
			
			driver.switchTo().alert().accept();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
		
	}

}
