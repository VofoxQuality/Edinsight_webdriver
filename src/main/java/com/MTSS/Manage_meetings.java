package com.MTSS;
/**
 * @author Ans-A
 */
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Manage_meetings extends BaseClassOne {

	@Test(priority=1)

	public void TCED20201() throws InterruptedException

	{
		try {
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);		
			Thread.sleep(2000);	

			//Hover over MTTS link			
			Actions actions1 = new Actions(driver);
			WebElement mouseHover1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions1.moveToElement(mouseHover1).build().perform();	

			// To click in tier intervention
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/div/div[3]/div/a");		
			// To click in intervention plans
			click("//*[@id='ctl00_MainContent_trTierStudentsPlanInterventions']/td[2]/a");

			// TO select the School & grade
			select("//*[@id='ctl00_MainContent_ddlEducationProvider']","Bird-in-Hand Elementary School");
			select("//*[@id='ctl00_MainContent_ddlCurrentGradeLevel']","Fourth Grade");

			// To click on search
			click("//*[@id='ctl00_MainContent_btnSearch']");

			Thread.sleep(2000);
			// To click and select the tire interventions
			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl06_chkSelectUserSelectCheckBox']");
			select("//*[@id='ctl00_MainContent_RTIMassTieringControl1_ddlTierMulti']","Tier 2");
			click("//*[@id='ctl00_MainContent_RTIMassTieringControl1_btnTier']");

			Thread.sleep(7000);
			// To click interventions
			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_btnIntervention']");

			Thread.sleep(4000);
			// Frame select
			SwitchFrameName("RadWindow1");
			// To click interventions
			click("//input[contains(@type,'submit')][@value='Add Intervention Plan']");		
			// Frame select
			SwitchFrameName("RadWindow2");

			// To click interventions Skill
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbInterSkill_Arrow']");
			Thread.sleep(2000);
			// To click and select  interventions from list
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbInterSkill_DropDown']/div/ul/li[1]/label/input");
			Thread.sleep(2000);
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbInterSkill_Arrow']");  
			Thread.sleep(2000);
			// To select and directly enter the dropdown values 
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlProgramDescription']","Counseling - Individual");

			type("//*[@id='ctl00_ContentPlaceHolder1_rcmbCurriculumMaterials_Input']", "Fundations");

			type("//*[@id='ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_Input']", "CDT");

			//*[@id="ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_Input"]
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlDuration']","2");

			// To scroll to location
			ScrollTo_Location("//*[@id='ctl00_ContentPlaceHolder1_litInitiationDate']");
			Thread.sleep(3000);
			// To select  details to submit the intervention details from dropdown
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlFrequencyTPR']","2");

			select("//*[@id='ctl00_ContentPlaceHolder1_ddlFrequencyMPS']","10");
			// To click the select  details to submit the intervention details from dropdown
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbParentNotification_Arrow']");
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbParentNotification_DropDown']/div/ul/li[2]/label/input");
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbParentNotification_Arrow']");
			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveSubmit']");

			Thread.sleep(3000);
			driver.switchTo().defaultContent();	
			Thread.sleep(3000);
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow1']/div[1]/div/ul/li[2]/span");
			Thread.sleep(4000);


			Thread.sleep(4000);
			// To click interventions
			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl06_btnIntervention']");

			Thread.sleep(4000);
			// Frame select
			SwitchFrameName("RadWindow1");
			// To click interventions
			click("//input[contains(@type,'submit')][@value='Add Intervention Plan']");		
			// Frame select
			SwitchFrameName("RadWindow2");
			// To click interventions Skill
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbInterSkill_Arrow']");
			Thread.sleep(2000);
			// To click and select  interventions from list
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbInterSkill_DropDown']/div/ul/li[1]/label/input");
			Thread.sleep(2000);
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbInterSkill_Arrow']");  
			Thread.sleep(2000);
			// To select and directly enter the dropdown values 
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlProgramDescription']","Counseling - Individual");

			type("//*[@id='ctl00_ContentPlaceHolder1_rcmbCurriculumMaterials_Input']", "Fundations");

			type("//*[@id='ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_Input']", "CDT");

			//*[@id="ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_Input"]
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlDuration']","2");

			// To scroll to location
			ScrollTo_Location("//*[@id='ctl00_ContentPlaceHolder1_litInitiationDate']");
			Thread.sleep(3000);
			// To select  details to submit the intervention details from dropdown
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlFrequencyTPR']","2");
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlFrequencyMPS']","10");
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbParentNotification_Arrow']");
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbParentNotification_DropDown']/div/ul/li[2]/label/input");
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbParentNotification_Arrow']");
			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveSubmit']");

			Thread.sleep(3000);
			driver.switchTo().defaultContent();	
			Thread.sleep(3000);
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow1']/div[1]/div/ul/li[2]/span");
			Thread.sleep(4000);

			//Hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();		
			// To click on the meetings
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/div/div[2]/div/a");

			click("//*[@id='ctl00_MainContent_trMeetings']/td[2]/a");
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td"), "Meetings");		


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=2)

	public void TCED20202() throws InterruptedException

	{
		try {
			// To Assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblSearchLabel']"), "Search By:");	

			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoGroup']"), "Group");		

			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoStudent']"), "Student");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblSchoolType']"), "School Type");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblEducationProvider']"), "Provider");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblCurrentGradeLevel']"), "Grade");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblStudentGroup']"), "Group");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblFacilitator']"), "Facilitator");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblTeacherHeading']"), "Teacher");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/label[1]"), "Auto Refresh");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/label[2]"), "Include Only Students Receiving Tiered Interventions");		



		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=3)

	public void TCED20203() throws InterruptedException

	{
		try {
			// To click on the search
			click("//*[@id='ctl00_MainContent_btnSearch']");
			Thread.sleep(2000);
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblRecordCount']"), "Search Must Be Narrowed to Display Results");		

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=4)

	public void TCED20204() throws InterruptedException

	{
		try {
			//  To select the parameters

			select("//*[@id='ctl00_MainContent_ddlEducationProvider']","Bird-in-Hand Elementary School");

			select("//*[@id='ctl00_MainContent_ddlCurrentGradeLevel']","Fourth Grade");

			click("//*[@id='ctl00_MainContent_btnSearch']");
			// To assert the validations
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_trInfoMessage']/td").contains("Indicates student does not have an intervention plan"), "Indicates student does not have an intervention plan");

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_trInfoMessage']/td").contains("Indicates student has an unsubmitted intervention plan"), "Indicates student has an unsubmitted intervention plan");

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=5)

	public void TCED20205() throws InterruptedException

	{
		try {
			// To assert the labels

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[4]/a"), "Student Id");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[5]/a"), "Last Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[6]/a"), "First Name");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[7]"), "Special Dem");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[8]/a"), "Current Grade");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[9]/a"), "Current School");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[15]/a"), "Reading/English Language Arts");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[16]/a"), "Mathematics");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[17]/a"), "Behavioral");		

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=6)

	public void TCED20206() throws InterruptedException

	{
		try {

			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_btnMeetings']");	
			Thread.sleep(2000);
			// To assert the label
			Assert.assertEquals(getText("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow1']/div[1]/div/h6"), "Select Meetings Type");		
			Thread.sleep(2000);
			// Switch to frame
			SwitchFrameName("RadWindow1");
			Thread.sleep(2000);	
		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=7)

	public void TCED20207() throws InterruptedException

	{
		try {
			// To assert the fields
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_pnlMeetingType']/table/tbody/tr[1]/td[1]/b"), "Select Meeting Type");				

			Assert.assertEquals(getText("//*[@id='headGrid']/b"), "Previous Meetings");				

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_gridPreviousMeetings']/tbody/tr[1]/th[1]"), "School Year");				

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_gridPreviousMeetings']/tbody/tr[1]/th[2]"), "Meeting Date");									
		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=8)

	public void TCED20208() throws InterruptedException

	{
		try {
			// to select the meeting
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlMeetingType']", "Entrance Meeting");
			// to clikc the meeting
			click("//*[@id='ctl00_ContentPlaceHolder1_btnGenerateMeeting']");
			Thread.sleep(2000);
			driver.switchTo().defaultContent();			
			// To assert the labels
			Assert.assertEquals(getText("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow1']/div[1]/div/h6"), "Meeting Summary Form");	
			Thread.sleep(2000);	
			SwitchFrameName("RadWindow1");
			Thread.sleep(2000);			

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}

	@Test(priority=9)

	public void TCED20209() throws InterruptedException

	{
		try {	
			Thread.sleep(4000);	
			// To assert the labels
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/div[1]/table/tbody/tr[1]/td[1]/b"), "Student Name:");		

			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/div[1]/table/tbody/tr[1]/td[2]/b"), "Student ID:");	

			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/b"), "Date of Birth:");		

			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/b"), "Grade:");		

			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/div[1]/table/tbody/tr[3]/td/b[1]"), "Meeting Date:");		

			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/div[1]/table/tbody/tr[3]/td/b[2]"), "Meeting Time:");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblAttendees']"), "Attendees");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblParentGuardianAttendance']"), "Parent/Guardian Attendance");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblStudentAttendance']"), "Student Attendance");				

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trAdditionalInfo']/td/fieldset/legend/b"), "Additional Information to Include in Meeting Summary:");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_StudentSubjectReportParams1_Label1']"), "# of Years");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trAdditionalInfo']/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]"), "Included Sections");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lnkViewSelectedInformation']"), "View Selected Information");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trNotes']/td/div/fieldset/legend/b"), "Notes");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trNotes']/td/div/fieldset/legend/a"), "[Open Notes in Separate Window]");		


		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}



	@Test(priority=10)

	public void TCED20210() throws InterruptedException

	{
		try {
			// To scroll to location
			ScrollTo_Location("//*[@id='ctl00_ContentPlaceHolder1_trNotes']/td/div/fieldset/legend/b");
			Thread.sleep(5000);	

			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveContinue']");
			Thread.sleep(2000);
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblMessageBottom']"), "Meeting form has been saved successfully..!");		

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=11)

	public void TCED20211() throws InterruptedException

	{
		try {
			Thread.sleep(2000);

			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveSubmit']");
			// Scroll to end
			Scroll_DowntoEnd();
			Thread.sleep(8000);
			// To assert the validations
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_lblMessageBottom']").contains("You must select a Parent/Guardian Attendance."),"Failed to Assert"+"You must select a Parent/Guardian Attendance.");	

			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_lblMessageBottom']").contains("You must select a Student Attendance."),"Failed to Assert"+"You must select a Student Attendance.");	


		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=12)

	public void TCED20212() throws InterruptedException

	{
		try {
			//To scroll up to the page
		//	JavascriptExecutor jse = (JavascriptExecutor)driver;
		//	jse.executeScript("window.scrollBy(0,0)", "");
			
			ScrollTo_Location("//*[@id='ctl00_ContentPlaceHolder1_lblMeetingPurpose']");
			// select the parameters
			select("//*[@id='ctl00_ContentPlaceHolder1_ddlParntGuardAttendance']","Parent/Guardian Attendance not Required");

			select("//*[@id='ctl00_ContentPlaceHolder1_ddlStudentAttendance']","Student in Attendance");

			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveSubmit']");
			Thread.sleep(3000);

			driver.switchTo().defaultContent();	
			// To assert the labels
			Assert.assertEquals(getText("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow1']/div[1]/div/h6"), "Next Steps");			

			Thread.sleep(2000);
			SwitchFrameName("RadWindow1");
			Thread.sleep(4000);
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div/table/tbody/tr[1]/td/span"), "Your meeting has been submitted successfully!");	


		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=13)

	public void TCED20213() throws InterruptedException

	{
		try {
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trNextSteps']/td/fieldset/legend/span"), "Next Steps");

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_spanTier']"), "Do you need to tier or re-tier this student?");	

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trNextSteps']/td/fieldset/div[2]/span"), "View, edit, or add intervention plans for this student");	

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=14)

	public void TCED20214() throws InterruptedException

	{
		try {
			Thread.sleep(2000);

			click("//*[@id='ctl00_ContentPlaceHolder1_btnReTier']");

			Thread.sleep(2000);
			driver.switchTo().defaultContent();		
			// switch to frame
			SwitchFrameName("RadWindow2");	

			Thread.sleep(3000);
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[3]/span"), "Student Information:");	

			driver.switchTo().defaultContent();	
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow2']/div[1]/div/ul/li[2]/span");
			Thread.sleep(3000);
			SwitchFrameName("RadWindow1");
			Thread.sleep(3000);
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trNextSteps']/td/fieldset/legend/span"), "Next Steps");

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=15)

	public void TCED20215() throws InterruptedException

	{
		try {
			Thread.sleep(2000);
			click("//*[@id='ctl00_ContentPlaceHolder1_btnInterventions']");
			Thread.sleep(2000);
			driver.switchTo().defaultContent();		
			// to switch to frame
			SwitchFrameName("RadWindow2");	

			Thread.sleep(2000);
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/div[2]"), "MTSS Student Summary");	

			driver.switchTo().defaultContent();	

			click("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow2']/div[1]/div/ul/li[2]/span");
			Thread.sleep(3000);
			SwitchFrameName("RadWindow1");
			Thread.sleep(3000);
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trNextSteps']/td/fieldset/legend/span"), "Next Steps");

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}



	//@Test(priority=16)

	public void TCED20216() throws InterruptedException

	{
		try {
			Thread.sleep(2000);

			//	click("//*[@id='ctl00_ContentPlaceHolder1_btnDownloadMeetingNotes']");
			Thread.sleep(4000);

			//	Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");



		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=17)

	public void TCED20217() throws InterruptedException

	{
		try {

			Thread.sleep(2000);
			driver.switchTo().defaultContent();		
			Thread.sleep(3000);
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow1']/div[1]/div/ul/li[2]/span");	
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td"), "Meetings");		

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}




	@Test(priority=18)

	public void TCED20218() throws InterruptedException

	{
		try {
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_RadAjaxPanel1']/table/tbody/tr[2]/td[1]/span"), "Meeting Type:");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_trMessage']/td/span"), "Review Plans for Selected Areas of Need*");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_chkListAreasOfNeed']/tbody/tr[1]/td/label"), "Reading/English Language Arts");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_chkListAreasOfNeed']/tbody/tr[2]/td/label"), "Mathematics");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_chkListAreasOfNeed']/tbody/tr[3]/td/label"), "Behavioral");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_trDisclaimer']/td/span"), "* Only intervention plans for tier 2 students can be reviewed using this feature");		


		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=19)

	public void TCED20219() throws InterruptedException

	{ 
		try {
			// To click on checkboxes
			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_chkSelectUserSelectCheckBox']");

			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl06_chkSelectUserSelectCheckBox']");
			Thread.sleep(3000);	
			ScrollTo_Location("//*[@id='ctl00_MainContent_trDisclaimer']/td/span");
			// To click on button
			click("//*[@id='ctl00_MainContent_btnMassMeeting']");
			Thread.sleep(3000);			
			SwitchFrameName("RadWindow1");
			Thread.sleep(3000);
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/span[1]"), "Meeting Summary Form");		

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=20)

	public void TCED20220() throws InterruptedException

	{
		try {
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/div[1]/table/tbody/tr[1]/td[1]/b"), "Selected Students:");		

			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/div[1]/table/tbody/tr[3]/td/b[1]"), "Meeting Date:");		

			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div[2]/div[1]/table/tbody/tr[3]/td/b[2]"), "Meeting Time:");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblParentGuardianAttendance']"), "Parent/Guardian Attendance");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblStudentAttendance']"), "Student Attendance");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblMeetingPurpose']"), "Purpose of Meeting");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00']/thead/tr/th[7]"), "Student");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00']/thead/tr/th[8]"), "Area of Need");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00']/thead/tr/th[10]"), "Curriculum");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00']/thead/tr/th[11]"), "Student Response");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00']/thead/tr/th[12]"), "Team Decision");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00']/thead/tr/th[13]"), "Notes");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trAdditionalInfo']/td/fieldset/legend/b"), "Additional Information to Include in Meeting Summary:");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trNotes']/td/div/fieldset/legend/b"), "Notes");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_trNotes']/td/div/fieldset/legend/a"), "[Open Notes in Separate Window]");		

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_spanDisclaimer']"), "*These notes will be attached to every selected student. Please do not include individual student names.");


		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}



	@Test(priority=21)

	public void TCED20221() throws InterruptedException

	{
		try {
			// scroll to location
			ScrollTo_Location("//*[@id='ctl00_ContentPlaceHolder1_trNotes']/td/div/fieldset/legend/b");
			Thread.sleep(5000);	

			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveContinue']");
			Thread.sleep(2000);
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblMessageBottom']"), "Meeting form has been saved successfully..!");	
		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=22)

	public void TCED20222() throws InterruptedException

	{
		try {
			Thread.sleep(2000);
			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveSubmit']");
			// To assert the validations
			Assert.assertEquals((readAlertMessageText()), "Once this form is submitted, it cannot be updated, or deleted.  Please make sure you have selected the right students and have made appropriate decisions.");		
			Thread.sleep(4000);	
			driver.switchTo().alert().accept();
			//AcceptAlert();
			Thread.sleep(4000);	

			JavascriptExecutor jse21 = (JavascriptExecutor)driver;
			jse21.executeScript("window.scrollBy(0,0)", "");

			Thread.sleep(3000);	
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblMessageTop']"), "You must select a student response and team decision for each intervention.");	
			Thread.sleep(2000);	
			// to select the details
			select("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00_ctl04_ddlStudentResponse']","Goal Attained");

			select("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00_ctl04_ddlTeamDecision']", "Discontinue intervention: no further intervention required");

			select("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00_ctl06_ddlStudentResponse']","Goal Attained");

			select("//*[@id='ctl00_ContentPlaceHolder1_rgPlans_ctl00_ctl06_ddlTeamDecision']", "Discontinue intervention: no further intervention required");

			Thread.sleep(3000);
			click("//*[@id='ctl00_ContentPlaceHolder1_btnSaveSubmit']");

			Thread.sleep(4000);	
			// to accept the alert
			driver.switchTo().alert().accept();

			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			SwitchFrameName("RadWindow1");
			Thread.sleep(3000);
			// To assert the validations
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div/table/tbody/tr[1]/td/span"), "Your meeting has been submitted successfully!");
		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}


	@Test(priority=23)

	public void TCED20223() throws InterruptedException

	{
		try {
			// To assert the validations

			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/div/table/tbody/tr[2]/td/fieldset/legend/span"), "Next Steps");

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_spanTier']"), "The following students were discussed at this meeting");

			//		Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divInterventions']/span"), "EdInsight has auto-generated the following intervention plans as a result of this meeting. Please complete, review, and submit these plans.");

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}
	@Test(priority=24)

	public void TCED20224() throws InterruptedException

	{
		try {

			click("//*[@id='ctl00_ContentPlaceHolder1_btnClose']");

			// For Future Scripts	
			// To assert the validations	
			//		Assert.assertEquals((readAlertMessageText()), "There are still unsubmitted intervention plans.  Are you sure you want to close this window?");		
			// To accept the alert
			//	AcceptAlert();		

			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			// To assert the validations		
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td"), "Meetings");		

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


}






























/************** For Future Purpose***************/



/*			//Hover over MTTS link			
			Actions actions11 = new Actions(driver);
			WebElement mouseHover11 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions11.moveToElement(mouseHover11).build().perform();	

			// To click in tier intervention
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/div/div[3]/div/a");		
			// To click in intervention plans
			click("//*[@id='ctl00_MainContent_trTierStudentsPlanInterventions']/td[2]/a");


			select("//*[@id='ctl00_MainContent_ddlEducationProvider']","Bird-in-Hand Elementary School");

			select("//*[@id='ctl00_MainContent_ddlCurrentGradeLevel']","Fourth Grade");

			// To click on search
			click("//*[@id='ctl00_MainContent_btnSearch']");

			Thread.sleep(2000);

			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_btnIntervention']");

			Thread.sleep(4000);

			SwitchFrameName("RadWindow1");

			click("//*[@id='ctl00_ContentPlaceHolder1_ctl00_ctl00_gridInvervention_ctl02_btnEditIntervention']");

			SwitchFrameName("RadWindow2");

			click("//*[@id='ctl00_ContentPlaceHolder1_btnDelete']");

			AcceptAlert();

			SwitchFrameName("RadWindow1");

			click("//*[@id='ctl00_ContentPlaceHolder1_btnClose']");
 */






