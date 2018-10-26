package com.MTSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Manage_meetings extends BaseClassOne {

	@Test(priority=1)

	public void TCED20201() throws InterruptedException

	{
		try {
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);		
			Thread.sleep(2000);	

			//Hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();		

			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/div/div[2]/div/a");

			click("//*[@id='ctl00_MainContent_trMeetings']/td[2]/a");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td"), "Meetings");		


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=2)

	public void TCED20202() throws InterruptedException

	{
		try {
			// To Assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblSearchLabel']"), "Search By:");	
			
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td/label[1]"), "Group");		

			Assert.assertEquals(getText("//*[@id='tl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td/label[2]"), "Student");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblSchoolType']"), "School Type");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblEducationProvider']"), "Search By:");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblSearchLabel']"), "Provider");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblCurrentGradeLevel']"), "Grade");		
			
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblStudentGroup']"), "Group");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblFacilitator']"), "Facilitator");		
			
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblTeacherHeading']"), "Teacher");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/label[1]"), "Auto Refresh");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/label[2]"), "Include Only Students Receiving Tiered Interventions");		

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=3)

	public void TCED20203() throws InterruptedException

	{
		try {

			click("//*[@id='ctl00_MainContent_btnSearch']");
			Thread.sleep(2000);
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblRecordCount']"), "Search Must Be Narrowed to Display Results");		

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=4)

	public void TCED20204() throws InterruptedException

	{
		try {

			select("//*[@id='ctl00_MainContent_ddlEducationProvider']","Ashley High School");
			
			select("//*[@id='ctl00_MainContent_ddlCurrentGradeLevel']","Ninth Grade");
			
			click("//*[@id='ctl00_MainContent_btnSearch']");
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_trInfoMessage']/td").contains("Indicates student does not have an intervention plan"), "Indicates student does not have an intervention plan");

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_trInfoMessage']/td").contains("Indicates student has an unsubmitted intervention plan"), "Indicates student has an unsubmitted intervention plan");

		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	
	@Test(priority=5)

	public void TCED20205() throws InterruptedException

	{
		try {

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[4]/a"), "Student Id");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[5]/a"), "Last Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[6]/a"), "First Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[7]"), "Special Dem");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[8]/a"), "Current Grade");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[9]/a"), "Reading/English Language Arts");		
			
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[9]/a"), "Current School");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[9]/a"), "Current School");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[9]/a"), "Current School");		


		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


}
