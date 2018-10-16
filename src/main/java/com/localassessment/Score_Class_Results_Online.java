package com.localassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Score_Class_Results_Online extends BaseClassOne {
	
	@Test(priority=0)
	public void TCED13021() 
	{
			try
			{
				//Superintent Login
				login(Supertent_Login_id,Supertent_Login_Password);	
				
				//Assert logout button is displayed in the dashboard page
				Assert.assertTrue(isElementPresent("//*[@id='ctl00_A3']/img"),"Element is not displayed ");
			}
			catch (Exception e)
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}
	}
	
	@Test(priority=1)
	public void TCED13022() 
	{
		try
		{
			//Click on main menu local assessment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//To click on the score results
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[7]/div/a");	
			
			//To search testid
			type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']", "314");
			
			//To click the search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");
			
			// To select the assessment from dropdown
			select("//select[@id='ctl00_MainContent_ddlAssessments']","value=314");
			
			// To select the administration from dropdown
			select("//select[@id='ctl00_MainContent_ddlTestAdministration']","value=1268");
			
			// To click the  Score Class Results Online
			click("//a[@id='ctl00_MainContent_lnkScoreByClass']");
			
			//Assert the Header 
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[1]/td/span").contains("Score Class Results Online"),"failed to assert text"+"  Score Class Results Online");
					
		}catch(Exception e) 
		{
			
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
	
	
	@Test(priority=2)
	public void TCED13023() 
	{
		try
		{
			// To Assert Labels of the Score Results By Building/Teacher/Course & Score Results By Student Group
			Assert.assertTrue(getText("//label[@for='ctl00_MainContent_rbBuilding']").contains("Score Results By Building/Teacher/Course"),"failed to assert text"+" Score Results By Building/Teacher/Course");

			Assert.assertTrue(getText("//*[@id='tblBuilding']/tbody/tr[1]/td[1]").contains("Select School Type"),"failed to assert text"+" Select School Type");

			Assert.assertTrue(getText("//*[@id='tblBuilding']/tbody/tr[2]/td[1]").contains("Select School"),"failed to assert text"+" Select School");
		
			Assert.assertTrue(getText("//*[@id='tblBuilding']/tbody/tr[3]/td[1]").contains("Select Teacher"),"failed to assert text"+" Select Teacher");

			Assert.assertTrue(getText("//td[contains(text(),'Course/Section')]").contains("Course/Section"),"failed to assert text"+" Course/Section");		
	
			Assert.assertTrue(getText("//label[@for='ctl00_MainContent_rbStudentGroup']").contains("Score Results By Student Group"),"failed to assert text"+" Score Results By Student Group");
			
			Assert.assertTrue(getText("//td[contains(text(),'Student Group')]").contains("Student Group"),"failed to assert text"+" Student Group");
			
			Assert.assertTrue(getText("//td[contains(text(),'Questions to Display')]").contains("Questions to Display"),"failed to assert text"+" Questions to Display");
			
			Assert.assertTrue(getText("//label[@for='ctl00_MainContent_rblstQuestionsToDisplay_0']").contains("All Questions"),"failed to assert text"+" All Questions");
	
			Assert.assertTrue(getText("//label[@for='ctl00_MainContent_rblstQuestionsToDisplay_1']").contains("Multiple Choice"),"failed to assert text"+" Multiple Choice");

			Assert.assertTrue(getText("//label[@for='ctl00_MainContent_rblstQuestionsToDisplay_2']").contains("Open Ended"),"failed to assert text"+" Open Ended");

			Assert.assertTrue(getValue("//*[@id='ctl00_MainContent_btnDisplayGrid']").contains("Load Students to Grid"),"failed to assert text"+" Load Students to Grid");

			Assert.assertTrue(getValue("//*[@id='ctl00_MainContent_btnSave']").contains("Save Changes"),"failed to assert text"+" Save Changes");

			Assert.assertTrue(getValue("//*[@id='ctl00_MainContent_btnCalculateScore']").contains("Calculate Score"),"failed to assert text"+" Calculate Score");

			
			
		}catch(Exception e) 
		{
			
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	

	
	
	@Test(priority=3)
	public void TCED13024() 
	{
		try
		{      // To Assert the Validation Messages
			click("//*[@id='ctl00_MainContent_btnDisplayGrid']");
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_lblMsg']").contains("Please select a teacher and class to enter scores"), "failed to assert alert"+"Please select a teacher and class to enter scores");
			
		}catch(Exception e) 
		{
			
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
	
	
	@Test(priority=4)
	public void TCED13025() 
	{
		try
		{   // To Assert the Validation message
			click("//*[@id='ctl00_MainContent_rbStudentGroup']");
			
			click("//*[@id='ctl00_MainContent_btnDisplayGrid']");
			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_lblMsg']").contains("Please select a student group to enter scores"), "failed to assert alert"+"Please select a student group to enter scores");
			
		}catch(Exception e) 
		{
			
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
	
	@Test(priority=5)
	public void TCED13026() 
	{
		try
		{
			click("//input[@id='ctl00_MainContent_rbBuilding']");
			
			select("//select[@id='ctl00_MainContent_ddlStaff']","value=2737");
			
			select("//*[@id='ctl00_MainContent_ddlCourse']","value=57902,1");
			
			click("//*[@id='ctl00_MainContent_btnDisplayGrid']");
			
			Scroll_DowntoEnd();
			
			 // To  Assert the Available Labels 
			Assert.assertTrue(getText("//b[contains(text(),'Highlight for bad answers')]").contains("Highlight for bad answers"), "failed to assert alert"+"Highlight for bad answers");

			Assert.assertTrue(getText("//b[contains(text(),'Highlight for blank questions when saving changes')]").contains("Highlight for blank questions when saving changes"), "failed to assert alert"+"Highlight for blank questions when saving changes");

			Assert.assertTrue(getText("//b[contains(text(),'Highlight for blank questions when calculating sco')]").contains("Highlight for blank questions when calculating scores"), "failed to assert alert"+"Highlight for blank questions when calculating scores");

			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[3]").contains("Enter student answers or open-ended scores below"), "failed to assert alert"+" Enter student answers or open-ended scores below");

			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[4]").contains("Please check the items for marking the test as being completed."), "failed to assert alert"+"Please check the items for marking the test as being completed.");

			// To  Assert the Grid Labels 
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[1]").contains("Mark Test Complete"), "failed to assert alert"+"Mark Test Complete");

			Assert.assertTrue(getText("//th[contains(text(),'Test Completed')]").contains("Test Completed"), "failed to assert alert"+"Test Completed");

			Assert.assertTrue(getText("//th[contains(text(),'Student Id')]").contains("Student Id"), "failed to assert alert"+"Student Id");

			Assert.assertTrue(getText("//th[contains(text(),'Last Name')]").contains("Last Name"), "failed to assert alert"+"Last Name");
			
			Assert.assertTrue(getText("//th[contains(text(),'First Name')]").contains("First Name"), "failed to assert alert"+"First Name");
			
			Assert.assertTrue(getText("//th[contains(text(),'Total Score')]").contains("Total Score"), "failed to assert alert"+"Total Score");
			
			
			
			
		}catch(Exception e) 
		{
			
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
	
	
	@Test(priority=6)
	public void TCED13027() 
	{
		try
		{
			// To Assert the labels & Buttons
		click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_popupStud16004187']");
		
		Assert.assertEquals( "Online Answers and Scoring Rubric", getText("//h6[@class='rwTitle']"));
		// TO Switch to child frame
		SwitchFrameName("splitterPopup");
		
		Thread.sleep(1000);
		
		Assert.assertEquals( "Teacher comment", getValue("#ctl00_ContentPlaceHolder1_btnTeacherComment"));
		
		click("//*[@id='ctl00_ContentPlaceHolder1_rgScoringRubric_ctl00_ctl06_btnSelectRubric']");
		// TO Switch to parent frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("ctl00_MainContent_rgSearch_ctl00_ctl04_popupStud16004189")).click();
	
		driver.switchTo().frame("splitterPopup");
		
		Assert.assertEquals( "Scoring rubric (STORYBOARD)", getText("//*[@id='ctl00_ContentPlaceHolder1_lblRubricTitle']"));	
			
		Assert.assertEquals( "Strike-through", getValue("//*[@id='btnStrickThrough']"));
		
		Assert.assertEquals( "Highlight", getValue("//*[@id='btnHighlight']"));
		
		Assert.assertEquals( "Save", getValue("//*[@id='ctl00_ContentPlaceHolder1_btnSave']"));
		
		Assert.assertEquals( "Teacher comment", getValue("//*[@id='ctl00_ContentPlaceHolder1_btnTeacherComment']"));
		
		Assert.assertEquals( "Close", getValue("//*[@id='ctl00_ContentPlaceHolder1_btnClose']"));
		
		select("//*[@id='ctl00_ContentPlaceHolder1_ddLevels_1']","value=2");
			
		click("//*[@id='ctl00_ContentPlaceHolder1_btnSave']");
			
		}catch(Exception e) 
		{
			
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
	
	
	
	
	@Test(priority=7)
	public void TCED13028() 
	{
		try
		{     // To Assert the Validation message
			driver.switchTo().defaultContent();
			
			click("//*[@id='ctl00_MainContent_btnSave']");
		
			Assert.assertEquals( "All question are saved successfully..", getText("//*[@id='ctl00_MainContent_lblErrorMsg']"));
			
			
			type("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl08_templateColumnTextBoxQ16004188']", "3");
			
			click("//*[@id='ctl00_MainContent_btnSave']");
			
			Assert.assertEquals( "The question(s) provided with bad answers are marked with red background.", getText("//*[@id='ctl00_MainContent_lblErrorMsg']"));
	
		}catch(Exception e) 
			{
				
			e.printStackTrace();
			Assert.fail(e.getMessage());
			}
		  }	
		
	
	@Test(priority=8)
	public void TCED13029() 
	{
		try
		{

			 // To Assert the Validation message
			click("//*[@id='ctl00_MainContent_btnCalculateScore']");
				
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_lblErrorMsg']").contains("Bad answers are not included in total score calculation."), "failed to assert alert"+"Bad answers are not included in total score calculation.");

			
		}catch(Exception e) 
			{
				
			e.printStackTrace();
			Assert.fail(e.getMessage());
			}
		  }	
		
	@Test(priority=9)
	public void TCED13030() 
	{
		try
		{

			 // To Assert the Button
			click("//*[@id='ctl00_MainContent_btnDisplayGrid']");
			
			Thread.sleep(3000);
			
			Assert.assertEquals( "Load Students to Grid", getValue("//*[@id='ctl00_MainContent_btnDisplayGrid']"));

	
			
		}catch(Exception e) 
			{
				
			e.printStackTrace();
			Assert.fail(e.getMessage());
			}
		  }	
}
