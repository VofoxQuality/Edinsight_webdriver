package com.localassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Test_Suite_Print_Login_Codes extends BaseClassOne

{
	String Test_id="314";
	
	@Test(priority=0)	
	public void TCED13301()
	{
		try
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//Assert logout button is displayed in the dashboard page
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_A3']/img")).isDisplayed());
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=1)	
	public void TCED13302()
	{
		try {
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			// Click Score Results menu
			click("//a[contains(text(),'Score Results')]");
			
			//Search a Test Test ID = 314
			type("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_txtTestId']",Test_id);
			
			//click search button
			click("//*[@id='ctl00_MainContent_TestFilterPanel1_rpbTestFilter_i2_i0_btnTestId']");
			
			//select assessment -For Automation- do not edit- in the dropdown
			select("//*[@id='ctl00_MainContent_ddlAssessments']","index=2");
			
			//select administration -For Automation- do not edit (Admin)(2017-2018)- in the dropdown
			select("//*[@id='ctl00_MainContent_ddlTestAdministration']","label=For Automation- do not edit (Admin)(2017-2018)");
			
			//Assert the Label Print Login Codes
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_lnlPrintLoginCodes']").contains("Print Login Codes"),"failed to assert text"+"Print Login Codes");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
    @Test(priority=2)	
	public void TCED13303()
	{
		try 
		{
			//Application should be in the Score Result page
			
			//Click on Print Login Codes option
			click("//a[@id='ctl00_MainContent_lnlPrintLoginCodes']");
			
			//Assert the header "Students Login Code"
			Assert.assertTrue(getText("//h6[@class='rwTitle']").contains("Students Login Code"),"failed to assert text"+"Students Login Code");
		} 
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=3)	
	public void TCED13304()
	{
		try
		{
			//Application should be in the Print Login Codes pop-up
			
			//Assert the Label Building/Teacher/Course
			driver.switchTo().frame("ViewLoginCodes");
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[1]/span/span").contains("Building/Teacher/Course"),"failed to assert text"+"Building/Teacher/Course");
					
			//Assert the Label Select School
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvBuilding']/table/tbody/tr[1]/td[1]").contains("Select School:"),"failed to assert text"+"Select School");
			
			//Assert the Label Select Teacher
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvBuilding']/table/tbody/tr[2]/td[1]").contains("Select Teacher"),"failed to assert text"+"Select Teacher");
			
			//Assert the Label Course/Section
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvBuilding']/table/tbody/tr[3]/td[1]").contains("Course/Section"),"failed to assert text"+"Course/Section");
			
			//Assert the Label 10 Per Page
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("10 Per Page"),"failed to assert text"+"10 Per Page");
			
			//Assert the Label 8 Per Page
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("8 Per Page"),"failed to assert text"+"8 Per Page");
			
			//Assert the Label 6 Per Page 
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("6 Per Page"),"failed to assert text"+" 6 Per Page ");
			
			//click on Click on Student Group Tab
			click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[2]/span/span");
			
			//Assert the Label Student Group
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvStudentGroup']/table/tbody/tr[1]/td[1]").contains("Student Group"),"failed to assert label"+"Student Group");
					
			//Assert the Label 10 Per Page
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("10 Per Page"),"failed to assert text"+" 10 Per Page");
			
			//Assert the Label 8 Per Page
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("8 Per Page"),"failed to assert text"+" 8 Per Page");
			
			//Assert the Label 6 Per Page 
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("6 Per Page"),"failed to assert text"+" 6 Per Page ");
			
			//Click on Course Grouped By Teacher Tab 
			click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[3]/span/span");
			
			Thread.sleep(500);
			
			//Assert the Label Course Grouped By Teacher 
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[3]/span/span").contains("Course Grouped by Teacher"),"failed to assert label "+" Course Grouped By Teacher ");
						
			//Assert the Label Select School 
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvCourseGroup']/table/tbody/tr[1]/td[1]").contains("Select School"),"failed to assert text"+" Select School  ");
			
			//Assert the Label Subject (optional)
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvCourseGroup']/table/tbody/tr[2]/td[1]").contains("Subject (optional)"),"failed to assert text"+" Subject (optional) ");
			
			//Assert the Label Courses
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvCourseGroup']/table/tbody/tr[3]/td[1]").contains("Courses"),"failed to assert text"+" Courses ");			
			
			
			//Assert the Label 10 Per Page
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("10 Per Page"),"failed to assert text"+"10 Per Page");
			
			//Assert the Label 8 Per Page
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("8 Per Page"),"failed to assert text"+"8 Per Page");
			
			//Assert the Label 6 Per Page 
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("6 Per Page"),"failed to assert text"+" 6 Per Page ");
			
			//Click on Student Name/ID Tab 
			click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[4]/span/span");
			
			//Assert the Label Student Name/ID
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[4]/span/span").contains("Student Name/Id"),"failed to assert label"+" Student Name/ID ");
			
			//Assert the Label First/last name 
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvStudentNameOrId']/table/tbody/tr/td/table[1]/tbody/tr[1]/td[1]").contains("First/last name"),"failed to assert label"+" First/last name ");
			
			//Assert the Label Building  
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvStudentNameOrId']/table/tbody/tr/td/table[1]/tbody/tr[2]/td[1]").contains("Building"),"failed to assert label"+" Building  ");
			
			//Assert the Label Student ID 
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvStudentNameOrId']/table/tbody/tr/td/table[1]/tbody/tr[3]/td[1]").contains("Student ID"),"failed to assert label"+" Student ID ");
			
			//Assert the Label Selected Students 
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvStudentNameOrId']/table/tbody/tr/td/table[2]/tbody/tr/td[1]").contains("Selected Students"),"failed to assert label"+" Selected Students  ");
			
			//Assert the Label 10 Per Page
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("10 Per Page"),"failed to assert text"+" 10 Per Page");
			
			//Assert the Label 8 Per Page
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("8 Per Page"),"failed to assert text"+" 8 Per Page");
			
			//Assert the Label 6 Per Page 
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_trCodesPerPage']/td").contains("6 Per Page"),"failed to assert text"+" 6 Per Page ");
		}
		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test(priority=4)	
	public void TCED13305()
	{
		
		try
		{
			//Click on Course Grouped By Teacher Tab 
			click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[3]/span/span");
			
			//Click on Print to PDF
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,200)");	
			click("//*[@id='ctl00_ContentPlaceHolder1_btnStudents']");
			
			//Assert the validation message "You must select at least one course name"
			Assert.assertTrue(getText("#ctl00_ContentPlaceHolder1_lblMsg").contains("You must select at least one course name"),"failed to assert text"+" You must select at least one course name ");  
			
			Thread.sleep(2000);
			
			//Click on Student Name/ID Tab 
			click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[4]/span/span");
			
			//Click on Search 
			click("#ctl00_ContentPlaceHolder1_btnSelectedSudentSearch");
			
			//Click on Print to PDF
			click("//*[@id='ctl00_ContentPlaceHolder1_btnStudents']");
			
			//Assert the validation message "Sorry no students found"
			Assert.assertTrue(getText("#ctl00_ContentPlaceHolder1_lblMsg").contains("Sorry no students found"),"failed to assert message"+" Sorry no students found");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}  
	    
	}
	
	@Test(priority=5)	
	public void TCED13306()
	{
		
		try
		{
			//Application should be in the Print Login Codes Student Name/ID tab.
			
			//Click on Building/Teacher/Course Tab
			click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[1]/span/span");
			
			//To delete all the files in the directory
			FileDelete();
			
			// Click on Print to PDF
			 click("//*[@id='ctl00_ContentPlaceHolder1_btnStudents']");
			 
			Thread.sleep(6000);				
            Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
            
			//To delete all the files in the directory
			FileDelete();
			
            //Click on Print to CSV
            click("#ctl00_ContentPlaceHolder1_btnCSV");
            
			Thread.sleep(6000);				
            Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
            
		} 
		
		catch (Exception e)
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}

	@Test(priority=6)	
	public void TCED13307()
	{
		
		try
		{
			//Click on Student Group Tab 
			click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[2]/span");
			
			//To delete all the files in the directory
			FileDelete();
			
			//Click on Print to PDF
			click("//*[@id='ctl00_ContentPlaceHolder1_btnStudents']");
			
			Thread.sleep(6000);				
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//To delete all the files in the directory
			FileDelete();
			
            //Click on Print to CSV
            click("#ctl00_ContentPlaceHolder1_btnCSV");
            
			Thread.sleep(6000);				
            Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
		} 
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)	
	public void TCED13308()
	{
		try
		{
			//Click on Course Grouped By Teacher Tab 
			click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[3]/span/span");
			
			//Select any Courses
			click("//*[@id='ctl00_ContentPlaceHolder1_chklstCourses_0']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//Click on Print to PDF
			click("//*[@id='ctl00_ContentPlaceHolder1_btnStudents']");
			
			Thread.sleep(6000);				
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//To delete all the files in the directory
			FileDelete();
			
			//Click on Print to CSV
			click("#ctl00_ContentPlaceHolder1_btnCSV");
			
			Thread.sleep(6000);				
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=8)	
	public void TCED13309()
	{
		try
		{
			//Click on Student Name/ID Tab 
			click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[4]/span/span");
			
			// Click on Search 
			click("#ctl00_ContentPlaceHolder1_btnSelectedSudentSearch");
			
			//Select any student 
			click("//*[@id='ctl00_ContentPlaceHolder1_rgSelectedStudents_ctl00_ctl04_chkStudent']");
			
			//Click Add Selected Students
			click("#ctl00_ContentPlaceHolder1_lnkAddSelected");		
			
			//To delete all the files in the directory
			FileDelete();
			
			//Click on Print to PDF
			click("//*[@id='ctl00_ContentPlaceHolder1_btnStudents']");
			
			//Thread.sleep(6000);				
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//To delete all the files in the directory
			FileDelete();
			
			//Click on Print to CSV
			click("#ctl00_ContentPlaceHolder1_btnCSV");
			
			//Thread.sleep(6000);				
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		}
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=9)	
	public void TCED13310()
	{
		try
		{
			//Application should be in the Student Name/ID Tab.
			
			//Click on Close Button
			driver.switchTo().defaultContent();
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_ViewLoginCodes']/div[1]/div/ul/li/span");
			
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
