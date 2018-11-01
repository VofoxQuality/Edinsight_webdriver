package com.MTSS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

/**
 * 
 * @author Ans-A
 *
 */
public class TeamDecisionReport extends BaseClassOne {


	@Test(priority=1)
	public void TCED22601() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//Hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();		

			//To click on the Team Decision Report
			click("//a[contains(.,'Team Decision Report')]"); 

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblHeading']"), "Team Decision Report");		

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

//	@Test(priority=2)
	public void TCED22602() 
	{
		try
		{
			// To Assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]"), "Team Decisions :");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]"), "Run by School Year");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[1]"), "Select School Year :");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[7]/td[1]"), "Run by Date Range");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[8]/td[1]"), "Select Date Range :");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[8]/td[3]"), "To");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[10]/td"), "Run by Building/Grade");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[11]/td[1]"), "Select Building :");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[12]/td[1]"), "Select Grade :");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[14]/td"), "Run by Student Group");		

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[15]/td[1]"), "Select Student Group :");		

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}



//	@Test(priority=3)
	public void TCED22603() 
	{
		try
		{

			//To select the team decision
			click("//input[@id='ctl00_MainContent_rcmbTeamDecision_Input']");

			//To click on the team decisions
			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[5]//label[1]//input[1]");

			ScrollTo_Location("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[6]//label[1]//input[1]");

			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[6]//label[1]//input[1]");
			Thread.sleep(1000);

			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[7]//label[1]//input[1]");

			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			// To Assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td"), "Team Decision Report");		

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


//	@Test(priority=4)
	public void TCED22604() 
	{
		try
		{
			// To Assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/span[1]"), "Team Decisions :");	

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/span[2]"), "School Year :");	

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/span[3]"), "District :");	

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/span[4]"), "Grade Level(s) :");	


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

//	@Test(priority=5)
	public void TCED22605() 
	{
		try
		{
			// To Assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[3]"), "Student Id");	

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[4]/a"), "Last Name");	

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[5]/a"), "First Name");	

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[6]/a"), "Special Demo");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[8]/a"), "Building");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[9]/a"), "Area of Need");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[10]/a"), "Tier");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[11]/a"), "Facilitator");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[12]/a"), "Intervention Skill");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[13]/a"), "Initiation Date");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[14]/a"), "Curriculum/Materials");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[15]/a"), "Person Responsible");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[16]/a"), "Review Date");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[17]/a"), "Student Response");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudents_ctl00']/thead/tr[1]/th[18]/a"), "Team Decision");

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}







//	@Test(priority=6)
	public void TCED22606() 
	{
		try
		{	

			//To delete all the files in the directory
			FileDelete();

			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			// To Assert the labels
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
//	@Test(priority=7)
	public void TCED22607() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();

			///To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportPDF']");
			Thread.sleep(4000);
			// To Assert the file downloaded
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	//@Test(priority=8)
	public void TCED22608() 
	{
		try
		{
			//To click on the add selected students to group
			click("//input[@id='ctl00_MainContent_btnAddToGroup']");

			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			// To Assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"), "Add Students to Group:");

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"), "Create New Group:");

			Thread.sleep(2000);
			driver.switchTo().defaultContent();

			click("//span[@class='rwCommandButton rwCloseButton']");
			// To Assert the  element
			Thread.sleep(1000);
			Assert.assertFalse(isElementPresent("//input[@id='ctl00_ContentPlaceHolder1_btnAddStudents']"),"close is not working properly");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

//	@Test(priority=9)
	public void TCED22609() 
	{
		try
		{
			//To click on add all students to group
			click("//input[@id='ctl00_MainContent_btnCheckAll']");

			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"), "Add Students to Group:");

			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"), "Create New Group:");

			Thread.sleep(2000);
			driver.switchTo().defaultContent();

			Thread.sleep(2000);
			click("//span[@class='rwCommandButton rwCloseButton']");

			Thread.sleep(1000);
			// To Assert the elements
			Assert.assertFalse(isElementPresent("//input[@id='ctl00_ContentPlaceHolder1_btnAddStudents']"),"close is not working properly");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}



//	@Test(priority=10)
	public void TCED22610() 
	{
		try
		{
			//To click on add all students to group
			click("//*[@id='ctl00_MainContent_btnAddToFavorite']");
			// To Assert the labels
			Thread.sleep(3000);
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td"), "Team Decision Report");		




		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=11)
	public void TCED22611() 
	{
		try
		{
			Thread.sleep(2000);
			// To logout
			click("//*[@id='ctl00_A3']");

			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);		

			///Hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();		

			//To click on the Team Decision Report
			click("//a[contains(.,'Team Decision Report')]"); 

			//To select the team decision
			click("//input[@id='ctl00_MainContent_rcmbTeamDecision_Input']");

			//To click on the team decisions
			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[5]//label[1]//input[1]");

			ScrollTo_Location("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[6]//label[1]//input[1]");

			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[6]//label[1]//input[1]");
			Thread.sleep(1000);

			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[7]//label[1]//input[1]");
			Thread.sleep(3000);
			//To run the report by date range
			click("//input[@id='ctl00_MainContent_rbtnDateRange']");

			Thread.sleep(3000);

			//To type the start date 
			type("//input[@id='ctl00_MainContent_rdpStartDate_dateInput']","3/1/2018 ");

			//To type the End date 
			type("//input[@id='ctl00_MainContent_rdpEndDate_dateInput']"," 8/3/2018");

			Thread.sleep(2000);

			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");

			// To Assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/span[1]"), "Team Decisions :");	

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/span[2]"), "Date Range :");			
			
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td").contains("3/1/2018 - 8/3/2018"), "Failed To Assert the selected dates");
			
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/span[3]"), "District :");	

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td/span[4]"), "Grade Level(s) :");
			
			

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority=12)
	public void TCED22612() 
	{
		try
		{

			//To delete all the files in the directory
			FileDelete();

			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			// To Assert the files
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=13)
	public void TCED22613() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();

			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportPDF']");
			Thread.sleep(4000);
			// To Assert the files
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}


	@Test(priority=14)
	public void TCED22614() 
	{
		try
		{
			///Hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();		

			//To click on the Team Decision Report
			click("//a[contains(.,'Team Decision Report')]"); 

			//To select the team decision
			click("//input[@id='ctl00_MainContent_rcmbTeamDecision_Input']");

			//To click on the team decisions
			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[5]//label[1]//input[1]");

			ScrollTo_Location("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[6]//label[1]//input[1]");

			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[6]//label[1]//input[1]");
			Thread.sleep(1000);

			click("//div[@id='ctl00_MainContent_rcmbTeamDecision_DropDown']//ul[@class='rcbList']//li[7]//label[1]//input[1]");
			Thread.sleep(3000);

			//To click Run Report by Student Group
			click("//input[@id='ctl00_MainContent_rbtnStudentGroup']");

			//To select the student group
			select("//select[@id='ctl00_MainContent_ddlStudentGroup']","00 123 MR");


			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");

			// To Assert the labels
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td"), "Team Decision Report");	

		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}



	@Test(priority=15)
	public void TCED22615() 
	{
		try
		{

			//To delete all the files in the directory
			FileDelete();

			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);

			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=16)
	public void TCED22616() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();

			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportPDF']");
			Thread.sleep(4000);
			// To Assert the files
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=17)
	public void TCED22617() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();

			//To click on Meeting History Report 
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			Thread.sleep(4000);
			// To Assert the files
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}




}
