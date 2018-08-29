package com.manageAssessment;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class EditAssessment extends BaseClassOne{
	
	@Test(priority=1)
	public void TCAA02003() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//To click on the Administer assessment
			click("//a[contains(.,'Manage Assessments')]");
			
			//type Test id search
			type("//input[@id='ctl00_MainContent_txtTestId']","261");
			
			//To click on the search button
			click("//input[@id='ctl00_MainContent_btnTestIdSearch']");
			
			//To click on the Edit assessment button
			click("//a[@id='ctl00_MainContent_grdMyAssessments_ctl02_lnkEditAssessment']");
			
			//To click on the applay stnadards
			click("//input[@id='ctl00_MainContent_FullTestView1_btnApplyStandards']");
			
			//To assert the validation message
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			String message = alert.getText();
			alert.accept();
			Assert.assertEquals(message, "Please select at least one question to apply standards!");
			
			//To click on the applay atributes
			click("//input[@id='ctl00_MainContent_FullTestView1_btnApplyAttribues']");
			
			//To assert the validation message
			Thread.sleep(2000);
			Alert alert1 = driver.switchTo().alert();
			String message1 = alert1.getText();
			alert.accept();
			Assert.assertEquals(message1, "Please select at least one question to apply attributes!");
			
			
			//To click on the Exibits
			click("//input[@id='ctl00_MainContent_FullTestView1_btnApplyExhibits']");
			
			//To assert the validation message
			Thread.sleep(2000);
			Alert alert2 = driver.switchTo().alert();
			String message2 = alert2.getText();
			alert.accept();
			Assert.assertEquals(message2, "Please select at least one question to apply Exhibit!");
			
			//To click on the Delete Questions
			click("//input[@id='ctl00_MainContent_FullTestView1_btnDeleteQuestions']");
			
			//To assert the validation message
			Thread.sleep(2000);
			Alert alert3 = driver.switchTo().alert();
			String message3 = alert3.getText();
			alert.accept();
			Assert.assertEquals(message3, "Please select atleast one question to perform delete");
					
			
	}catch(Exception e) 
	{
	e.printStackTrace();
	Assert.fail(e.getMessage());
	}
}
}
