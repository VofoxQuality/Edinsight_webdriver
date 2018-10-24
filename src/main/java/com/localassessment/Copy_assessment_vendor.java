package com.localassessment;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
public class Copy_assessment_vendor extends BaseClassOne

{	
	String Test_id="417";	
	
	@Test(priority=1)
	public void TCED15001()
	{
	     try
	     {	    	 
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);
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
			type("//*[@id='ctl00_ContentPlaceHolder1_txtQuestionStartingId']","501");
			
			//Select Test Type 
			click("//*[@id='ctl00_ContentPlaceHolder1_rcbTestType_Input']");
			click("//*[@id='ctl00_ContentPlaceHolder1_rcbTestType_DropDown']/div/ul/li[1]");
			
			//Select Test Edition
			click("//*[@id='ctl00_ContentPlaceHolder1_rcbTestEdition_Arrow']");
			click("//*[@id='ctl00_ContentPlaceHolder1_rcbTestEdition_DropDown']/div/ul/li[2]");
			
			Thread.sleep(2000);	
			
			//Select Testing Period					
			waitForSelectOption("//*[@id='ctl00_ContentPlaceHolder1_ddlTestingPeriod']");
			
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlTestingPeriod']", "label=Baseline");
			
			//Select Vendor Test Type
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlVendorTestType']", "index=2");
			
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
	@Test(priority=6)
	public void TCED15006()
	{
		try
		{
			//Application should be in the Copy Assessment pop-up
			
			//Question Starting ID = any numeric entry 		
			do
			{	
			   String Starting_Qid=generateRandomNumber();
			   type("input#ctl00_ContentPlaceHolder1_txtQuestionStartingId",Starting_Qid);
			
			   //Click on the Copy Assessment button
			   click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveAssessment']");
			}
			while (find("span#ctl00_ContentPlaceHolder1_lblMsg").isDisplayed()==false);
					
			Thread.sleep(2000);
			//Assert the label Assessment copied successfully.
			Assert.assertEquals(getText("span#ctl00_ContentPlaceHolder1_lblMsg"), "Assessment copied successfully...");
			
			driver.switchTo().defaultContent();
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_rwCopyAssessment']/div[1]/div/ul/li[2]/span");
			
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
