package com.localassessment;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Copy_assessment_vendor extends BaseClassOne

{
	Random rnd = new Random();	
	
	String Test_id="5354";
	
	String URL="http://192.168.10.201/Edinsight/Login.aspx";
	
	@Test(priority=1)
	public void TCED15001()
	{
	     try
	     {
			//Supertent Login
			login_201(URL,"te$t$uper0nh@nd","password1!");
		 } 
	     catch (Exception e)
	     {
	    	 Assert.fail(e.getMessage());
			e.printStackTrace();
		 }		
	}
	@Test(priority=2)
	public void TCED15002()
	{
		try
		{
			//Hover over main menu local Assignment.
			Actions act= new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"))).build().perform();	
			
			//Click Manage Assessments menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
			
			//Search a Test
			type("//*[@id='ctl00_MainContent_txtTestId']",Test_id);
			click("//*[@id='ctl00_MainContent_btnTestIdSearch']");
			
			//click on Copy Assessment
			click("//a[@id='ctl00_MainContent_grdMyAssessments_ctl02_lnkCopyAssessment']");
			
			Assert.assertTrue(find("//*[@id='ctl00_MainContent_rwCopyAssessment_C']").isDisplayed(),"Copy assessment pop-up not found");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=3)
	public void TCED15003()
	{		
		try
		{
			//Application should be in the Copy Assessment pop-up
			
			driver.switchTo().frame("rwCopyAssessment");				
			//Assert the label "Copy Assessment"
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div/h3/span"),"Copy Assessment");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=4)
	public void TCED15004()
	{
		try
		{
			//Application should be in the Copy Assessment pop-up
			
			//Assert the label Assessment Name
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]"),"Assessment Name");
			
			//Assert the label Test Type 
			Assert.assertEquals(getText("//td[contains(text(),'Test Type')]"),"Test Type");
			
			//Assert the label Test Edition
			Assert.assertEquals(getText("//td[contains(text(),'Test Edition')]"),"Test Edition");
			
			//Assert the label Testing Period
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div/table/tbody/tr[2]/td/table/tbody/tr[4]/td[1]"),"Testing Period");
			
			//Assert the label Vendor Test Type
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div/table/tbody/tr[2]/td/table/tbody/tr[5]/td[1]"),"Vendor Test Type");
			
			//Assert the label Question Starting ID
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]"),"Question Starting ID");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=5)
	public void TCED15005()
	{
		try {
			//Application should be in the Copy Assessment pop-up
			
			//Click on the Copy Assessment button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveAssessment']");
			
			//Assert the label All fields are mandatory. 
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div/table/tbody/tr[2]/td/table/tbody/tr[7]/td[3]/div[2]/span"),"All fields are mandatory.");
			
			//Assert the label You must select a test type
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rfvTestType']"),"You must select a test type");
			
			//Assert the label You must select test edition
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rfvTestEdition']"),"You must select test edition");
			
			//Assert the label You must select a testing period
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rfvTestingPeriod']"),"You must select a testing period");
			
			//Assert the label You must select a vendor test type
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rfvVendorTestType']"),"You must select a vendor test type");
					
			//Assert the label You must provide question starting Id
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rfvQuestionStartingId']"),"You must provide question starting Id");
			
			//Enter abc in Question Starting ID
			type("//*[@id='ctl00_ContentPlaceHolder1_txtQuestionStartingId']","abc");
			
			//Click on the Copy Assessment button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveAssessment']");
			
			//Assert the label Only numeric and between 1 to 2,147,483,647 are allowed
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rvQuestionStartingId']"),"Only numeric and between 1 to 2,147,483,647 are allowed");
			
			//Enter Existing question id in Question Starting ID
			type("//*[@id='ctl00_ContentPlaceHolder1_txtQuestionStartingId']","16128134");
			click("//*[@id='ctl00_ContentPlaceHolder1_rcbTestType_Input']");
			click("//*[@id='ctl00_ContentPlaceHolder1_rcbTestType_DropDown']/div/ul/li[1]");

			select("//*[@id='ctl00_ContentPlaceHolder1_rcbTestType_Input']", "index=1");
			select("//*[@id='ctl00_ContentPlaceHolder1_rcbTestEdition_Input']", "index=1");
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlTestingPeriod']", "index=1");
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlVendorTestType']", "index=1");
			
			//Click on the Copy Assessment button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveAssessment']");
			
			// Assert the label The Question Starting ID and number of question is overlapping with existing question range of another test. Please use another question starting ID value
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblMsg']"),"The Question Starting ID and number of question is overlapping with existing question range of another test. Please use another question starting ID value");
		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	
//	@Test(priority=6)	
	public void TCED15006()
	{		
		
		try
		
		{
			//Supertent Login
			login_201(URL,"te$t$uper0nh@nd","password1!");
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Click on manage assessment
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");		
			//type on test id textbox		
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtTestId']")).sendKeys(Test_id);
			//type("//*[@id='ctl00_MainContent_txtTestId']", n);
			
			driver.findElement(By.cssSelector("input[id=ctl00_MainContent_btnTestIdSearch]")).click();
			
			driver.findElement(By.cssSelector("a#ctl00_MainContent_grdMyAssessments_ctl02_lnkCopyAssessment")).click();
			
			driver.switchTo().frame("rwCopyAssessment");
			
			Select vendor_drop=new Select(driver.findElement(By.cssSelector("select#ctl00_ContentPlaceHolder1_ddlVendorTestType")));
			
			vendor_drop.selectByIndex(1);				
			do
			{		
			int n = 100000 + rnd.nextInt(900000);
			String s=Integer.toString(n);
			type("input#ctl00_ContentPlaceHolder1_txtQuestionStartingId",s);
			
			click("input#ctl00_ContentPlaceHolder1_btnSaveAssessment.button");
			}
			while (driver.findElement(By.cssSelector("span#ctl00_ContentPlaceHolder1_lblMsg")).isDisplayed()==false);
			
			Assert.assertEquals(driver.findElement(By.cssSelector("span#ctl00_ContentPlaceHolder1_lblMsg")).getText(), "Assessment copied successfully...");
			
			driver.switchTo().defaultContent();		
			
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_rwCopyAssessment']/div[1]/div/ul/li[2]/span");
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	//login to 201 for checking vendor mode

	public void login_201(String url,String username,String password)
	 {
		driver.get(url);		
		driver.findElement(By.cssSelector("input#txtUserName.textbox")).sendKeys(username);
		driver.findElement(By.cssSelector("input#txtPassword.textbox")).sendKeys(password);		
		click("input#Submit1.name");	
	 }
	
}
