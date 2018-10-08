package com.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Assessments extends BaseClassOne

{
	@Test(priority=0)	
	public void TCED34201()
	{
		//Superintent Login
		login(Supertent_Login_id,Supertent_Login_Password);	
		
		//hover over Home link			
		Actions act=new Actions(driver);					
		act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
		
		//Click on  Student Search menu
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/div/div[8]/div/a");			
				
		//type on Student ID 
		type("//*[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","104104");
		
		//Search student
		click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdBtnAction']");
		click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdContextSearch_detached']/ul/li[1]/span");			
				
		//click student Id
		click("//a[contains(text(),'104104')]");
		
		//Click on the assessments menu
		click("//*[@id='ctl00_plcLeftMenu_MenuStudentLeft1_pnlMenu']/ul/li[2]/a/span[1]");
		
		//Assert the label "Standardized Assessment Results"
		Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr/td/b").contains("Standardized Assessment Results"),"failed to assert text"+"  Standardized Assessment Results");
						
		//Assert the label "Student Data Depot"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rgInputAssessment_ctl00']/thead/tr/th").contains("Student Data Depot"),"failed to assert text"+"  Student Data Depot");
		
		//Assert the label "PVAAS Results"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_panPVAASHistory']/b").contains("PVAAS Results"),"failed to assert text"+"  PVAAS Results");
	
	}
	
	@Test(priority=1)	
	public void TCED34202()
	{
		
		//Assert the Label "Assessment"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[1]").contains("Assessment"),"failed to assert text"+"  Assessment");
		
		//Assert the Label "Gr"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[2]").contains("Gr"),"failed to assert text"+"  Gr");
		
		//Assert the Label "Math"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[3]").contains("Math"),"failed to assert text"+"  Math");
		
		//Assert the Label "Reading"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[4]").contains("Reading"),"failed to assert text"+"  Reading");
		
		//Assert the Label "Language"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[5]").contains("Language"),"failed to assert text"+"  Language");
		
		//Assert the Label "Writing"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[6]").contains("Writing"),"failed to assert text"+"  Writing");
		
		//Assert the Label "Science"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[7]").contains("Science"),"failed to assert text"+"  Science");
		
		//Assert the Label "Soc Studies"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[8]").contains("Soc Studies"),"failed to assert text"+"  Soc Studies");
	
	}

}
