package com.MTSS;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Unsubmitted_Intervention_Plans extends BaseClassOne
{
	
	@Test(priority=0)
	public void TCED221001()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			// Click Unsubmitted Intervention Plans
			click("//a[contains(text(),'Unsubmitted Intervention Plans')]");
			
			//Assert the Heading Unsubmitted Intervention Plans"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblHeading']"),"Unsubmitted Intervention Plans");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=1)
	public void TCED221002()
	{
		try
		{
			//Application should be in the Unsubmitted Intervention Plans Param page
			
			//Assert the Labels "School Type"
			Assert.assertEquals(getText("//td[contains(text(),'School Type')]"),"School Type");
			
			//Assert the Labels "School"
			Assert.assertEquals(getText("//*[@id='bluetable']/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[1]"),"School");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED221003()
	{
		try
		{
			//Application should be in the Unsubmitted Intervention Plans Param page
			
			//Click on Run Report button with selected School Type and School
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the label "Unsubmitted Intervention Plan Report"
			Assert.assertEquals(getText("//span[@class='subheading']"),"Unsubmitted Intervention Plan Report");
			
			//Assert the label "Building"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblBuilding']"),"Building:");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test(priority=3)
	public void TCED221004()
	{
		try
		{
			//Application should be in the Unsubmitted Intervention Plan Report page
			
			//Assert the label "Student Id"
			Assert.assertEquals(getText("//th[contains(text(),'Student Id')]"),"Student Id");
			
			//Assert the label "Last Name"
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the label "First Name"
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
			
			//Assert the label "Provider Name
			Assert.assertEquals(getText("//a[contains(text(),'Provider Name')]"),"Provider Name");
			
			//Assert the label "Current Grade"
			Assert.assertEquals(getText("//a[contains(text(),'Current Grade')]"),"Current Grade");
			
			//Assert the label "Gender"
			Assert.assertEquals(getText("//a[contains(text(),'Gender')]"),"Gender");
			
			//Assert the label "Ethnicity"
			Assert.assertEquals(getText("//a[contains(text(),'Ethnicity')]"),"Ethnicity");
			
			//Assert the label "IEP"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'IEP')]"),"IEP");
			
			//Assert the label "ELL"
			Assert.assertEquals(getText("//a[contains(text(),'ELL')]"),"ELL");
			
			//Assert the label "Ec. Disadvantaged"
			Assert.assertEquals(getText("//a[contains(text(),'Ec. Disadvantaged')]"),"Ec. Disadvantaged");
			
			//Assert the label "504"
			Assert.assertEquals(getText("//a[contains(text(),'504')]"),"504");
			
			//Assert the label "Area of Need"
			Assert.assertEquals(getText("//a[contains(text(),'AreaOfNeed')]"),"AreaOfNeed");
			
			//Assert the label "Tier"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rtiInterventions_ctl00']/thead/tr[1]/th[17]/a"),"Tier");
			
			//Assert the label "Tier Effective Date"
			Assert.assertEquals(getText("//a[contains(text(),'TierEffectiveDate')]"),"TierEffectiveDate");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(1000,0)");		
			
			//Assert the label "Facilitator"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Facilitator')]"),"Facilitator");
			
			//Assert the label "Parent Initiated Request"
			Assert.assertEquals(getText("//a[contains(text(),'ParentInitiatedRequest')]"),"ParentInitiatedRequest");
			
			//Assert the label "Intervention Skill"
			Assert.assertEquals(getText("//a[contains(text(),'Intervention Skill')]"),"Intervention Skill");
			
			//Assert the label "Initiation Date"
			Assert.assertEquals(getText("//a[contains(text(),'InitiationDate')]"),"InitiationDate");
			
			//Assert the label "Anticipated Review Date"
			Assert.assertEquals(getText("//a[contains(text(),'AnticipatedReviewDate')]"),"AnticipatedReviewDate");
			
			//Assert the label "ParentNotification Method(s)"
			Assert.assertEquals(getText("//a[contains(text(),'ParentNotificationMethod')]"),"ParentNotificationMethod");
			
			js.executeScript("scroll(3000,0)");
			
			//Assert the label "Curriculum/Materials"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rtiInterventions_ctl00']/thead/tr[1]/th[25]/a"),"Curriculum/Materials");
			
			//Assert the label "Program Description"
			Assert.assertEquals(getText("//a[contains(text(),'Program Description')]"),"Program Description");
			
			//Assert the label "Person Responsible"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Person Responsible')]"),"Person Responsible");
			
			//Assert the label "Duration"
			Assert.assertEquals(getText("//a[contains(text(),'Duration')]"),"Duration");
			
			//Assert the label "Times Per Week"
			Assert.assertEquals(getText("//a[contains(text(),'TimesPerWeek')]"),"TimesPerWeek");
			
			//Assert the label "Minutes Per Session"
			Assert.assertEquals(getText("//a[contains(text(),'MinutesPerSession')]"),"MinutesPerSession");			
			js.executeScript("scroll(0,0)");		
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test(priority=4)
	public void TCED221005()
	{
		try
		{
			//Application should be in the Unsubmitted Intervention Plan Report page
			
			FileDelete();
			Thread.sleep(2000);	
			
			//Click on Export to CSV			
			click("//*[@id='ctl00_MainContent_btnExportCSV']");			
			
			Thread.sleep(6000);	
			
			//Assert the downloaded CSV file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test(priority=5)
	public void TCED221006()
	{
		try
		{
			//Application should be in the Unsubmitted Intervention Plan Report page
			
			FileDelete();			
			
			//Click on Click on Export to PDF		
			click("//input[@id='ctl00_MainContent_btnExportpdf']");			
			
			Thread.sleep(6000);	
			
			//Assert the downloaded PDF file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test(priority=6)
	public void TCED221007()
	{
		try
		{
			//Application should be in the Unsubmitted Intervention Plan Report page
			
			//Select Some Student
			click("//*[@id='ctl00_MainContent_rtiInterventions_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
			//Click on  Add Selected Student to Group button
			click("//input[@id='ctl00_MainContent_btnAddToGroup']");
			
			//Add Selected Student to Group pop-up should open
			//Assert the label  Add Students to Group
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			
			//Assert the label  Create New Group
			Assert.assertEquals(getText("#ctl00_ContentPlaceHolder1_Label3"),"Create New Group:");
			
			//Click on Close button
			driver.switchTo().defaultContent();
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");
			
			//Assert the label "Unsubmitted Intervention Plan Report "
			Assert.assertEquals(getText("//span[@class='subheading']"),"Unsubmitted Intervention Plan Report");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED221008()
	{
		try
		{
			//Application should be in the Unsubmitted Intervention Plan Report page
	
			//Select Some Student
			click("//*[@id='ctl00_MainContent_rtiInterventions_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
			//Click on  Add All Student to Group button
			click("#ctl00_MainContent_btnCheckAll");
			
			//Add Selected Student to Group pop-up should open
			//Assert the label  Add Students to Group
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			
			//Assert the label  Create New Group
			Assert.assertEquals(getText("#ctl00_ContentPlaceHolder1_Label3"),"Create New Group:");
			
			//Click on Close button
			driver.switchTo().defaultContent();
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");
			
			//Assert the label "Unsubmitted Intervention Plan Report "
			Assert.assertEquals(getText("//span[@class='subheading']"),"Unsubmitted Intervention Plan Report");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test(priority=8)
	public void TCED221009()
	{
		try
		{
			//Application should be in the Unsubmitted Intervention Plan Report page
			
			//Click on Add report to favorite button
			click("#ctl00_MainContent_btnAddToFavorite");
			
			//Assert the label "Unsubmitted Intervention Plan Report "
			Assert.assertEquals(getText("//span[@class='subheading']"),"Unsubmitted Intervention Plan Report");				
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
	}
	@Test(priority=9)
	public void TCED221010()
	{
		try
		{
			//Application should be in the Unsubmitted Intervention Plan Report page	
			
			FileDelete();			
			
			//Click on Print to PDF		
			click("#ctl00_MainContent_btnPrintToPDF");			
			
			Thread.sleep(6000);	
			
			//Assert the downloaded PDF file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//click on Logout button		 
			click("//*[@id='ctl00_A3']");
			
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
