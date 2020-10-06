package com.analyzeByScore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
/**
 * 
 * @author Ans
 *
 */

public class AdministrationComparisonbyStudent extends BaseClassOne {

	@Test(priority=1)
	public void TCED14291() 
	{         // ISSUE FOUND ON PARAM HEADING ASSERTION, AS PER DEVELOPER ALREADY NOTED THE ISSUE , NOT FIXED.
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");

			//To click on the analyze by Score
			click("//a[contains(.,'Analyze Scores')]");

			//To click on the Administration Comparison by Student 
			click("//*[@id='ctl00_MainContent_hlinkStudentComparisonParams']");

			//		Assert.assertEquals(getText("//*[@id='ctl00_PlcPageCategory_spanReportHeader']"),"Administration Comparison by Student" );	


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	


	@Test(priority=2)
	public void TCED14292() 
	{
		try
		{
			//To click on the search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");

			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr/td/table[2]/tbody/tr[2]/td").contains("Administration School Year"), "failed to assert alert"+"Administration School Year");

			// To Assert the Validation Messages
			Assert.assertTrue(getText("//td[contains(text(),'Please choose up to 4 assessment administrations t')]").contains("Please choose up to 4 assessment administrations that you would like to compare."), "Please choose up to 4 assessment administrations that you would like to compare.");

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	

	@Test(priority=3)
	public void TCED14293() 
	{
		try
		{
			// To Assert the Validation Messages

			click("//*[@id='ctl00_MainContent_btnRunReport']");

			Assert.assertEquals( getText("//*[@id='ctl00_MainContent_lblMsg']"),"You must select at least two administrations.");	

			//Scroll to the object location
			ScrollTo_Location("//*[@id='ctl00_MainContent_grdTest_ctl05_chkSelect']");

			Thread.sleep(3000);
			//To select the assessment administrations you would like to compare.		
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl08_chkSelect']");
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl09_chkSelect']");
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl10_chkSelect']");
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl11_chkSelect']");
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl12_chkSelect']");	
			// To read the popup alert and accept it
			Assert.assertEquals(readAlertMessageText(),"You can select a maximum number of four administrations.");	
			AcceptAlert();

			Thread.sleep(4000);
			// To deselect the selected adminstrations
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl08_chkSelect']");
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl09_chkSelect']");
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl10_chkSelect']");
			JavaScriptclick("//*[@id='ctl00_MainContent_grdTest_ctl11_chkSelect']");

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	

	@Test(priority=4)
	public void TCED14294() 
	{
		try
		{	Thread.sleep(3000);

		click("//span[contains(text(),'Flood - PreAlgebra - Block 1')]/preceding::input[1]");

		click("//span[contains(text(),'For Automation- do not edit (Admin)')]/preceding::input[1]");

		Thread.sleep(3000);
		//To scroll up to the page
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,0)", "");

		click("//*[@id='ctl00_MainContent_btnRunReport']");

		// To Assert the Validation Messages

		Assert.assertEquals( getText("//span[@class='administitle']"), "Administration Comparison by Student");	

		Assert.assertEquals(getText("//span[@class='subheading']"), "Run Report Options");	

		Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbBuilding']"),"Run Report By Building");	

		Assert.assertEquals(getText("//*[@id='tblBuilding']/td[1]"),"School");	

		Assert.assertEquals(getText("//*[@id='tblBuildingTeacher']/td[1]"),"Select Teacher :");	

		Assert.assertEquals(getText("//*[@id='tblBuildingTeacherCourse']/td[1]"),"Course/Section :");	

		Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbStudentGroup']"),"Run Report By Student Group");	

		Assert.assertEquals(getText("//td[contains(text(),'Student Group')]"),"Student Group");	

		Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbtPercentage']"),"Percent Correct");	

		Assert.assertEquals( getText("//label[@for='ctl00_MainContent_rbtPerformance']"),"Performance Level");	

		//To  Assert Grid labels

		Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAdministrationComparisonByStudent_ctl00']/thead/tr[1]/th[1]"),"Test Points Possible");	

		Assert.assertEquals(getText("//th[contains(text(),'Student ID')]"),"Student ID");	

		Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");	

		Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");	

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	

	@Test(priority=5)
	public void TCED14295() 
	{
		try
		{
			//click on the option button
			click("//*[@id='ctl00_MainContent_rSplitButton']");

			//click on runreport
			click("//*[@id='ctl00_MainContent_rcMenu_detached']/ul/li[1]/span");

			//To  Assert Grid labels
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAdministrationComparisonByStudent_ctl00']/thead/tr[1]/th[1]"),"Test Points Possible");	
			Assert.assertEquals(getText("//th[contains(text(),'Student ID')]"),"Student ID");	
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");	
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");

			//To delete all the files in the directory
			FileDelete();
			//click on the option button
			click("//*[@id='ctl00_MainContent_rSplitButton']");
			//To click on the print to PDF button
			click("//span[contains(text(),'Print to PDF')]");
			//To assert whether the PDF document is download or not 
			Thread.sleep(4000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

			//To click on the Options
			click("//*[@id='ctl00_MainContent_rSplitButton']");
			//To click on the print to CSV button
			click("//span[contains(text(),'Print to CSV')]");
			//To assert whether the PDF document is download or not 
			Thread.sleep(4000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			click("//*[@id='ctl00_MainContent_rgAdministrationComparisonByStudent_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");
			//To click on the Options
			click("//*[@id='ctl00_MainContent_rSplitButton']");

			//To click on the Add selected students to group
			click("//span[contains(text(),'Add selected students to group')]");
			// To switch to frame
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");

			Thread.sleep(2000);
			// To Assert the Validation Messages
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");	

			Assert.assertEquals( getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");

			// To switch to default frame
			driver.switchTo().defaultContent();
			// To close popup
			click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Session Timeout'])[1]/preceding::span[2]");
			Thread.sleep(2000);

			//To click on the options
			click("//*[@id='ctl00_MainContent_rSplitButton']");

			//To click on the Add all students to group
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add all students to group')]")));

			click("//span[contains(text(),'Add all students to group')]");
			Thread.sleep(2000);
			// To switch to frame
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");

			// To Assert the Validation Messages
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");	
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");	

			// Add new grp with Auto generatednumber	
			type("//*[@id='ctl00_ContentPlaceHolder1_txtCreateNewGroup']","AutomationGRP"+ generateRandomNumber());

			//To click on the grp
			click("//*[@id='ctl00_ContentPlaceHolder1_btnCreateGroup']");	
			Thread.sleep(2000);
			// To switch to default frame
			driver.switchTo().defaultContent();

			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbtPerformance']"),"Performance Level");		

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	
	@Test(priority=6)
	public void TCED14296() 
	{
		try
		{
			//To click on the performance button
			JavaScriptclick("//*[@id='ctl00_MainContent_rbtPerformance']");
			Thread.sleep(2000);

			//To  Assert Grid labels

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgAdministrationComparisonByStudent_ctl00']/thead/tr[1]/th[1]"),"Test Points Possible");	
			Assert.assertEquals(getText("//th[contains(text(),'Student ID')]"),"Student ID");	
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");	
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");			

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	

	@Test(priority=7)
	public void TCED14297() 
	{
		try
		{
			//To click on the Options
			click("//*[@id='ctl00_MainContent_rSplitButton']");
			Thread.sleep(2000);

			//To delete all the files in the directory
			FileDelete();

			//click on the option button
			click("//*[@id='ctl00_MainContent_rSplitButton']");

			//To click on the print to PDF button
			click("//span[contains(text(),'Print to PDF')]");

			//To assert whether the PDF document is download or not 
			Thread.sleep(4000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


			//To click on the Options
			click("//*[@id='ctl00_MainContent_rSplitButton']");

			//To click on the print to CSV button
			click("//span[contains(text(),'Print to CSV')]");

			//To assert whether the PDF document is download or not 
			Thread.sleep(4000);
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");

			click("//*[@id='ctl00_MainContent_rgAdministrationComparisonByStudent_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");

			//To click on the Options
			click("//*[@id='ctl00_MainContent_rSplitButton']");

			//To click on the Add selected students to group
			click("//span[contains(text(),'Add selected students to group')]");

			// To switch to frame
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");

			Thread.sleep(2000);

			// To Assert the Validation Messages
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");	

			Assert.assertEquals( getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");

			// To switch to default frame
			driver.switchTo().defaultContent();
			// To close popup
			click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Session Timeout'])[1]/preceding::span[2]");
			Thread.sleep(2000);

			//To click on the options
			click("//*[@id='ctl00_MainContent_rSplitButton']");


			click("//span[contains(text(),'Add all students to group')]");

			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Thread.sleep(2000);
			// To Assert the Validation Messages
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");	

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");	

			// Add new grp with Auto generatednumber	
			type("//*[@id='ctl00_ContentPlaceHolder1_txtCreateNewGroup']","AutomationGRP"+ generateRandomNumber());

			//To click on the grp
			click("//*[@id='ctl00_ContentPlaceHolder1_btnCreateGroup']");	
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}	
}

