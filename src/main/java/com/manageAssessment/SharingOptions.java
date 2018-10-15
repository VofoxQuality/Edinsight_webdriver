package com.manageAssessment;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

/**
 * 
 * @author sebastian
 *
 */

public class SharingOptions extends BaseClassOne{
	
	@Test(priority=1)
	public void TCED10004()
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
			type("//input[@id='ctl00_MainContent_txtTestId']","256");
			
			//To click on the search button
			click("//input[@id='ctl00_MainContent_btnTestIdSearch']");
			
			
			//To click on the sharing option
			click("//a[@id='ctl00_MainContent_grdMyAssessments_ctl02_lnkShareOption']");
			
			//To click on the 
			SwitchFrameName("rwShareAssessment");
			
			//To select the buildings
			select("//select[@id='ctl00_ContentPlaceHolder1_ddlBuilding']","Belle Plaine Elementary School");
			
			//To click Link Selected User Accounts
			click("//a[@id='ctl00_ContentPlaceHolder1_btnLinkSelectedUser']");
			
			//To assert the validation message
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			String message = alert.getText();
			alert.accept();
			Assert.assertEquals(message, "Please Select a Teacher");
			
			//To fill the staff name
			type("//input[@id='ctl00_ContentPlaceHolder1_rgStaff_ctl00_ctl02_ctl02_FilterTextBox_ImportedStaffName']","Teacher104");
			
			//Click on filter button
			click("//button[@id='ctl00_ContentPlaceHolder1_rgStaff_ctl00_ctl02_ctl02_Filter_ImportedStaffName']");
			
			//To click on the Contains
			click("//span[contains(.,'Contains')]");
			
			//To click on the driver.findElement(By.xpath(""));
			click("//input[@id='ctl00_ContentPlaceHolder1_rgStaff_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']");
			
			//To click Link Selected User Accounts
			click("//a[@id='ctl00_ContentPlaceHolder1_btnLinkSelectedUser']");
			
			//To assert the validation message
			Thread.sleep(2000);
			Alert alert1 = driver.switchTo().alert();
			String message1 = alert1.getText();
			alert.accept();
			Assert.assertEquals(message1, "Please select at least one 'allow ' permission");
			
				
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
		
	}

	@Test(priority=2)
	public void TCED10006()
	{
		try
		{
			
			//To click on the Allow Administer
			click("//input[@id='ctl00_ContentPlaceHolder1_chbAllowAdminister']");
			
			//To click Link Selected User Accounts
			click("//a[@id='ctl00_ContentPlaceHolder1_btnLinkSelectedUser']");
			
			
			//To click on the check box
			click("//input[@id='ctl00_ContentPlaceHolder1_rgStaff_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']");
			
			//To click Link Selected User Accounts
			click("//a[@id='ctl00_ContentPlaceHolder1_btnLinkSelectedUser']");
			
			
			//To check the validation
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			String message = alert.getText();
			alert.accept();
			Assert.assertEquals(message, "Some of the selected Staff has the same assessment sharing access. These"
					+ " Staff user will not be modified. In order to make changes"
					+ " to the test sharing access of this Staff, you must remove the existing share"
					+ " access and retry. Do you wish to continue ?");
			//To unlink selected user accounts
			click("//a[@id='ctl00_ContentPlaceHolder1_btnUnLinkSelectedUser']");
			
			//To check the validation
			Thread.sleep(2000);
			Alert alert1 = driver.switchTo().alert();
			String message1 = alert1.getText();
			alert1.accept();
			Assert.assertEquals(message1, "Please Select at least one Staff Linked to an assessment");
			
			//To fill the staff name
			type("//input[@id='ctl00_ContentPlaceHolder1_rgLinkedStaff_ctl00_ctl02_ctl02_FilterTextBox_UserName']","Teacher104");
			
			//To click on the filter button
			click("//button[@id='ctl00_ContentPlaceHolder1_rgLinkedStaff_ctl00_ctl02_ctl02_Filter_UserName']");
			
			//To click on the 
			click("//input[@id='ctl00_ContentPlaceHolder1_rgLinkedStaff_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']");
			
			//To unlink selected user accounts
			click("//a[@id='ctl00_ContentPlaceHolder1_btnUnLinkSelectedUser']");
			
			//To select 
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}
	
}
	
