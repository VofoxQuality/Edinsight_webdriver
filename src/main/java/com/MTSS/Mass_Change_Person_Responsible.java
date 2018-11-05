package com.MTSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Mass_Change_Person_Responsible extends BaseClassOne {

	@Test(priority=1)

	public void TCED21101() 

	{
		try {
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);		
			Thread.sleep(2000);	

			//Hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();		
			// To click on the meetings
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/div/div[4]/div/a");	
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td"), "Mass Change Person Responsible");		
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}
	@Test(priority=2)
	public void TCED21102() 

	{
		try {
			// To assert the fields
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]"), "Tier");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblAreaOfNeed']"), "Area of Need");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[1]"), "School Type");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblCurrMaterials']"), "Curriculum/Materials");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td[1]"), "Educational Provider");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblMeasAssmnt']"), "Measurement/Assessment Method");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td[1]"), "Current Grade Level");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblFacilitator']"), "Facilitator");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[2]/td/table/tbody/tr[5]/td[1]"), "Student Group");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_prHead']"), "Person Responsible");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_trTeachers']/td[1]"), "Teacher");		
	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}
	@Test(priority=3)
	public void TCED21103()

	{
		try {
			// select school
			select("//*[@id='ctl00_MainContent_ddlEducationProvider']", "Ashley High School");
			// To click on the search
			click("//*[@id='ctl00_MainContent_btnSearch']");
			// To assert the fields
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblPersonRespBuilding']"), "Person Responsible Building");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblPersonResponsible']"), "Person Responsible");		

			} 
			catch (Exception e) 
			{
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}        
		}

	@Test(priority=4)

	public void TCED21104() 

	{
		try {
			// To assert the fields
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[4]/a"), "Student Id");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[5]/a"), "Last Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[6]/a"), "First Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[7]/a"), "Special Demogr.");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[8]/a"), "Grade");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[9]/a"), "Current School");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[10]/a"), "Curriculum Materials");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[11]/a"), "Measurement/Assessment");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[12]/a"), "Person(s) Responsible");		


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}
	@Test(priority=5)

	public void TCED21105()

	{
		try {
	
			// To click on the person
			click("//*[@id='ctl00_MainContent_btnaddAnotherPerson']");
			// To assert the fields
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblerrorMsg']"), "Select Person Responsible Building");		
			
			select("//*[@id='ctl00_MainContent_ddlBuilding']","Ashley High School");
			// To click on the person
			click("//*[@id='ctl00_MainContent_btnaddAnotherPerson']");
			Thread.sleep(3000);
			// To assert the element present
			Assert.assertTrue(isElementPresent("//*[@id='ctl00_MainContent_gridPersonResposible_ctl02_rcmbPersonResponsible_Input']"),"Element is not displayed ");
			
			click("//*[@id='ctl00_MainContent_gridPersonResposible_ctl02_btnRemove']");
			Thread.sleep(3000);
			Assert.assertTrue(!isElementPresent("//*[@id='ctl00_MainContent_gridPersonResposible_ctl02_rcmbPersonResponsible_Input']"),"Element is not displayed ");
	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	
	}
	
	
	@Test(priority=6)

	public void TCED21106()
	{
		try {
	
			// To click on the selected plans
			click("//*[@id='ctl00_MainContent_btnUpdateSelectedPlans']");
			// To assert the fields
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblerrorMsg']"), "Please Select at least one Intervention Plan for update");	
			
			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
			click("//*[@id='ctl00_MainContent_btnUpdateSelectedPlans']");
			// To assert the fields
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00__0']/td[12]"), "Teacher14");	
	
	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}
	@Test(priority=7)
	public void TCED21107()

	{
		try {
			// To click on the all plans
			click("//*[@id='ctl00_MainContent_btnUpdateAllPlans']");		
			// To assert the student fields
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00__0']/td[12]"), "Teacher14");	
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00__1']/td[12]"), "Teacher14");	
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00__2']/td[12]"), "Teacher14");	
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00__3']/td[12]"), "Teacher14");	


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}
}
