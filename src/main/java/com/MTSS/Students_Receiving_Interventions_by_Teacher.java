package com.MTSS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Students_Receiving_Interventions_by_Teacher extends BaseClassOne

{
	@Test(priority=1)
	public void TCED221201()
	{
		try
		  {
			  //Superintent Login
			  login(Supertent_Login_id,Supertent_Login_Password);
			  
			  //hover over MTTS link			
			   Actions actions = new Actions(driver);
			   WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			   actions.moveToElement(mouseHover).build().perform();
			   
			   // Click Students Receiving Interventions by Teacher
			   click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/div/div[17]/div/a");
			   
			   //Assert the Heading "Tiered Students by Teacher Report"
			   Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblHeading']"),"Tiered Students by Teacher Report");
		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=2)
	public void TCED221202()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report Param page
			
			//Assert the Labels "School Type"
			Assert.assertEquals(getText("//td[contains(text(),'School Type')]"),"School Type");
			
			//Assert the Labels "Building"
			Assert.assertEquals(getText("//td[contains(text(),'Building')]"),"Building");
			
			//Assert the Labels "Area of Need"
			Assert.assertEquals(getText("//td[contains(text(),'Area of Need')]"),"Area of Need");
			
			//Assert the Labels "Course Subjects"
			Assert.assertEquals(getText("//td[contains(text(),'Course Subjects')]"),"Course Subjects");

		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=3)
	public void TCED221203()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report Param page
			
			//Click on Run Report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the message "You must select at least one Area of Need"
			Assert.assertTrue(getText("//span[@id='ctl00_MainContent_lblErrorMessages']").contains("You must select at least one Area of Need"),"falied to assert-You must select at least one Area of Need");
			
			//Assert the message "You must select at least one Subject"
			Assert.assertTrue(getText("//span[@id='ctl00_MainContent_lblErrorMessages']").contains("You must select at least one Subject"),"falied to assert-You must select at least one Subject");

		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=4)
	public void TCED221204()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report Param page
			
			//Select Area of Need= All
			click("//*[@id='ctl00_MainContent_rcmbAreaOfNeed_Arrow']");
			click("//*[@id='ctl00_MainContent_rcmbAreaOfNeed_DropDown']/div/div/label/input");
			click("//*[@id='ctl00_MainContent_rcmbAreaOfNeed_Arrow']");
			
			Thread.sleep(2000);
			
			//Select Course Subjects = All
			click("//*[@id='ctl00_MainContent_rcmbSubjects_Arrow']");
			click("//*[@id='ctl00_MainContent_rcmbSubjects_DropDown']/div/div/label/input");
			click("//*[@id='ctl00_MainContent_rcmbSubjects_Arrow']");
			
			Thread.sleep(2000);
			click("//td[contains(text(),'Course Subjects')]");
			
			//Click on Run Report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the label "Tiered Students by Teacher Report"
			Assert.assertEquals(getText("//span[@class='subheading']"),"Tiered Students by Teacher Report");		
			
		  } 
		  catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}

}
