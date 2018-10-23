package com.administerAssessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * 
 */

import com.generalMethods.AssessmentPrint;

import Library.BaseClassOne;

public class Create_New_Administration extends BaseClassOne
{
	String test_id="314";	
    @Test(priority=1)
	public void TCED11001()
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
	public void TCED11002()
	{
		try
		{
			//Click on main menu local assessment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Click Manage Assessments menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
			
			//Search a Test
			type("//*[@id='ctl00_MainContent_txtTestId']",test_id);
			click("//*[@id='ctl00_MainContent_btnTestIdSearch']");
			
			//Click on Create New Administration
			click("//*[@id='ctl00_MainContent_grdMyAssessments_ctl02_lnkCreate']");
			
			//Asert the the Header Name as "Assessment Administration Add/Edit"
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td/span"),"Assessment Administration Add/Edit");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
    }
    @Test(priority=3)
	public void TCED11003()
	{
    	 try
    	 {
			//Asert the label name Local Assessment Name
			 Assert.assertEquals(getText("//td[contains(text(),'Local Assessment Name')]"),"Local Assessment Name");
			 
			//Asert the label name Administration Name
			 Assert.assertEquals(getText("//td[contains(text(),'Administration Name')]"),"Administration Name");
			 
			//Asert the label name Lock Administration 
			 Assert.assertEquals(getText("//td[contains(text(),'Lock Administration')]"),"Lock Administration");
			 
			//Asert the label name School Year 
			 Assert.assertEquals(getText("//td[contains(text(),'School Year')]"),"School Year");
			 
			//Asert the label name Administration Begin Date
			Assert.assertEquals(getText("//td[contains(text(),'Administration Begin Date')]"),"Administration Begin Date");
			 
			//Asert the label name Administration End Date
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pvProperties']/table/tbody/tr[7]/td[3]/table/tbody/tr/td[2]"),"Administration End Date");
			
			//Asert the label name Use short login code for early learners
			Assert.assertEquals(getText("//b[contains(text(),'Use short login code for early learners')]"),"Use short login code for early learners");
			
			//Asert the label Notes
			Assert.assertEquals(getText("//td[contains(text(),'Notes')]"),"Notes");
			
			//click Online Test Option Tab
			click("//span[contains(text(),'Online Test Options')]");
			
			//Asert the label name Test Reset Password
			Assert.assertEquals(getText("//td[contains(text(),'Test Reset Password')]"),"Test Reset Password");
						
			//Asert the label name If the students take the test online, what should be displayed at the end of the test? 
			Assert.assertEquals(getText("//td[contains(text(),'If the students take the test online, what should ')]"),"If the students take the test online, what should be displayed at the end of the test?");
			
			//Asert the dd values
			//Assert.assertEquals(getText("//td[contains(text(),'Notes')]"),"Notes");
			
			//Asert the label name Allow test to be randomized(BETA)
			Assert.assertEquals(getText("//td[contains(text(),'Allow test to be randomized(BETA):')]"),"Allow test to be randomized(BETA):");
			
			//Asert the label name Online tests include the open ended question(s)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoLstOnlineEssayOption_0']"),"Online tests include the open ended question(s)");
			
			//Asert the label name Online tests only display multiple choice question(s)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoLstOnlineEssayOption_1']"),"Online tests only display multiple choice question(s)");
			
			//Asert the label name Test Time Limit (minutes) 
			Assert.assertEquals(getText("//td[contains(text(),'Test Time Limit (minutes):')]"),"Test Time Limit (minutes):");
			
			//Asert the label name Test Window Start Time 
			Assert.assertEquals(getText("//td[contains(text(),'Test Window Start Time')]"),"Test Window Start Time");
			
			//Asert the label name Test Window End Time
			Assert.assertEquals(getText("//td[contains(text(),'Test Window End Time')]"),"Test Window End Time");
			
			//Asert the label name Restrict Test to Time Window 
			Assert.assertEquals(getText("//td[contains(text(),'Restrict Test to Time Window')]"),"Restrict Test to Time Window");
			
			//Asert the label name Allow Calculator
			Assert.assertTrue(getText("//tr[@id='ctl00_MainContent_trHideForSurveyChecksDdls']//td[@colspan='3']").contains("Allow Calculator"),"Failed to assert-Allow Calculator");
			
			//Asert the label name Allow Highlighter
			Assert.assertTrue(getText("//tr[@id='ctl00_MainContent_trHideForSurveyChecksDdls']//td[@colspan='3']").contains("Allow Highlighter"),"Failed to assert-Allow Highlighter");
			
			//Asert the label name Allow Exclusion
			Assert.assertTrue(getText("//tr[@id='ctl00_MainContent_trHideForSurveyChecksDdls']//td[@colspan='3']").contains("Allow Exclusion"),"Failed to assert-Allow Exclusion");
			
			//Asert the label name Allow Straight Edge
			Assert.assertTrue(getText("//tr[@id='ctl00_MainContent_trHideForSurveyChecksDdls']//td[@colspan='3']").contains("Allow Straight Edge"),"Failed to assert-Allow Straight Edge");
		} 
    	 catch (Exception e)
    	 {
    		 Assert.fail(e.getMessage());
			e.printStackTrace();
		}    	
	}
    @Test(priority=4)
	public void TCED11004()
	{
    	try
    	{
			//Application should be in the  Create New Administration page.
			
			//Click on  the Option Button 
			click("//span[@class='rbText']");
			
			//click save administration
			click("//*[@id='ctl00_MainContent_rcmAssessmentEditOptions_detached']/ul/li/span");
			
			//Asert the Validation message "Administration Name is Required"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_rfvAdministartionName']"),"Administration Name is Required");
		} 
    	catch (Exception e)
    	{
    		Assert.fail(e.getMessage());
			e.printStackTrace();
		}    	
	}
    @Test(priority=5)
	public void TCED11005()
	{
    	try
    	{
    		//Application should be in the  Create New Administration page.
    		click("//span[contains(text(),'Administration Properties')]");
    		
			//Enter any name to Administration Name text box
			type("//input[@id='ctl00_MainContent_txtAdministrationName']",generateRandomData());
			
			//Click on  the Option Button 
			click("//span[@class='rbText']");
			
			//click save administration
			click("//*[@id='ctl00_MainContent_rcmAssessmentEditOptions_detached']/ul/li/span");
			
			//* Assert the Successfull message "Administration Saved Successfully"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblMsg']"),"Administration Saved Successfully");
		} 
    	catch (Exception e)
    	{
    		Assert.fail(e.getMessage());
			e.printStackTrace();
		}	    	
	}
    @Test(priority=6)
	public void TCED11006()
	{
    	try
    	{
			//Application should be in the  Create New Administration page.
			
			//Click on  the Option Button 
			click("//span[@class='rbText']");
			
			//Assert the Option Button Values- Save Administration
			 List<WebElement> li=driver.findElements(By.xpath("//*[@id='ctl00_MainContent_rcmAssessmentEditOptions_detached']/ul/li"));
			 Assert.assertEquals(li.get(0).getText(),"Save Administration");
			 
			//Assert the Option Button Values- Delete Administration 
			 Assert.assertEquals(li.get(1).getText(),"Delete Administration");
			 
			//Assert the Option Button Values- Print Test
			 Assert.assertEquals(li.get(2).getText(),"Print Test");
			 
			//Assert the Option Button Values-- Select Students ForTest Administration
			 Assert.assertEquals(li.get(3).getText(),"Select Students For Test Administration");
		} 
    	catch (Exception e)
    	{
    		Assert.fail(e.getMessage());
			e.printStackTrace();
		}    	
	}
    @Test(priority=7)
	public void TCED11007()
	{
		try {
			//Application should be in the  Create New Administration page.
			
			//Click on  the Option Button 
			click("//span[@class='rbText']");
			
			Thread.sleep(1000);
			
			//Click on Print Test
			click("//*[@id='ctl00_MainContent_rcmAssessmentEditOptions_detached']/ul/li[3]/span");
			
			//Assert the Labels-Print Test Questions
			//To select the frame
			SwitchFrameName("printPopup");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_tblPrint']/tbody/tr[2]/td[1]/b"),"Print Test Questions");
			
			//Assert the Label-Print PDF
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_linkPdfQuestions']"),"Print PDF");
			
			//Assert the Label-Print Word
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_linkWordQuestion']"),"Print Word");
			
			//Assert the Label-Print OE to PDF
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_linkOePdfQuestions']"),"Print OE to PDF");
			
			//Assert the Label-Print OE to Word
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_linkOeWordQuestions']"),"Print OE to Word");
			
			//Assert the Label-Print Answer Key
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_tblPrint']/tbody/tr[2]/td[2]/b"),"Print Answer Key");
			
			//Assert the Label-Print PDF
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_linkPdfAnswer']"),"Print PDF");
			
			//Assert the Label-Print Word
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_linkWordAnswer']"),"Print Word");
			
			//Assert the Label-Print Condensed PDF 
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_linkCondensedPDF']"),"Print Condensed PDF");
			
			//Assert the Label-Print Condensed Word 
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_linkCondensedWord']"),"Print Condensed Word");
			
			driver.switchTo().parentFrame();
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_printPopup']/div[1]/div/ul/li[2]/span");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}    	
	}
//    @Test(priority=8)
	public void TCED11008()
	{
		try
		{
			//Application should be in the  Create New Administration page.
			
			//Click on  the Option Button 
			click("//span[@class='rbText']");
			
			//Click on Print Test
			click("//*[@id='ctl00_MainContent_rcmAssessmentEditOptions_detached']/ul/li[3]/span");
			
			AssessmentPrint ob=new AssessmentPrint();
	//		ob.AssessmentPrintReports();
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}   
   	}
    @Test(priority=9)
	public void TCED11009()
	{
    	try
    	{
			//Application should be in the  Create New Administration page.
			
			//Click on  the Option Button 
			click("//span[@class='rbText']");
			
			click("//*[@id='ctl00_MainContent_rcmAssessmentEditOptions_detached']/ul/li[2]/span");
			
			//* Assert the confirmation message "Are you sure you want to delete this administration?
			Assert.assertTrue(driver.switchTo().alert().getText().contains("Are you sure you want to delete this administration?"),"failed to assert-Are you sure you want to delete this administration?");
		   
			// Click on Ok button
			driver.switchTo().alert().accept();
			
			// AAssert dministration sholud delete and navigate to Manage Assessment page.
			Assert.assertEquals(getText("//span[@class='administitle']"),"Manage Assessments");			
    	
    	}
    	catch (Exception e)
    	{
    		Assert.fail(e.getMessage());
			e.printStackTrace();
		}
    	
	}
}
