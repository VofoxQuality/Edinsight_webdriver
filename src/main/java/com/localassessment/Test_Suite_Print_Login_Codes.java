package com.localassessment;

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
		//Superintent Login
		login(Supertent_Login_id,Supertent_Login_Password);	
		
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
			select("//*[@id='ctl00_MainContent_ddlTestAdministration']","index=2");
			
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
		try {
			//Application should be in the Print Login Codes pop-up
			
			//Assert the Label Building/Teacher/Course
			driver.switchTo().frame("ViewLoginCodes");
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[1]/span/span").contains("Building/Teacher/Course"),"failed to assert text"+"Building/Teacher/Course");
					
			//Assert the Label Select School
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_pvBuilding']/table/tbody/tr[1]/td[1]").contains("Select School"),"failed to assert text"+"Select School");
			
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
		
		//Click on Course Grouped By Teacher Tab 
		click("//*[@id='ctl00_ContentPlaceHolder1_rtsPrintLoginCode']/div/ul/li[3]/span/span");
		
		//Click on Print to PDF
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("scroll(0,200)");	
	    click("//*[@id='ctl00_ContentPlaceHolder1_btnStudents']");
	    
	}

}
