package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

import Library.BaseClassOne;

public class Analyze_curriculam extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED29701()
    {
		
	 try
		
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over curriculum link
			
			Actions act=new Actions(driver);		
					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
			
			//Click Edit Curriculum Menu	
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[7]/div/a");
			
			//Enter "For Automation [Do not Edit and Delete]" in the Title filter text box 
			
			type("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title']", "For Automation [Do not Edit and Delete]");		
			
			// Click on the filter button
			
			 driver.findElement(By.id("ctl00_MainContent_rgAttendanceData_ctl00_ctl02_ctl02_FilterTextBox_Title")).click();
			 
		    Thread.sleep(2000);
			
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
				    
			Thread.sleep(2000);
					
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NoFilter'])[1]/following::span[1]")).click();
			
			//Click on Build/Edit 
			click("//*[@id='ctl00_MainContent_rgAttendanceData_ctl00__0']/td[2]/a");			
			
			//Click on Analyze Curriculum
			click("//*[@id='lnkAnalyzeSubmenu']");
			
			
			//Assert the label "Analyze Curriculum"
			Assert.assertTrue(getText("//*[@id='lnkAnalyzeSubmenu']").contains("Analyze Curriculum"),"failed to assert text"+"Analyze Curriculum");
			
			Thread.sleep(2000);
			
			
			//Click on Analyze Curriculum
			click("//*[@id='lnkAnalyzeSubmenu']");
			Thread.sleep(3000);
			
			//Assert the label "Standards Coverage"
			Assert.assertTrue(getText("a#ctl00_MainContent_CurriculumMapEditMenu1_hlkCoverage").contains("Standards Coverage"),"failed to assert text"+"Standards Coverage");
			
			//Assert the label "Timeline"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkTimeline']").contains("Timeline"),"failed to assert text"+"Timeline");
			
			
			//Assert the label "Browse by Standards"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkBrowse']").contains("Browse by Standards"),"failed to assert text"+"Browse by Standards");
			
			
		}
		
		catch (Exception e)
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	 
		
		
	}
	
	@Test(priority=1)
	
	public void TCED29702()
    {
		
		
		try
		
		{
			//Click on Analyze Curriculum
			click("//*[@id='lnkAnalyzeSubmenu']");
			Thread.sleep(3000);
			
			//Click on Standards Coverage link.		
			click("a#ctl00_MainContent_CurriculumMapEditMenu1_hlkCoverage");
			
			//Assert the heading "Standards Coverage Report"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlStandardsCoverage']/table[1]/tbody/tr/td[2]/h3").contains("Standards Coverage Report"),"failed to assert text"+"Standards Coverage Report");
		}
		
		catch (Exception e)
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
    
    }
	
	@Test(priority=2)
	
	public void TCED29703()
   
	{
		
		//Application should be in the Standards Coverage Report
		
		
		//Click on STEP 1: Select the Curriculum to report on
		click("//*[@id='lnkMapSelect']");		
		
//		Assert the label "STEP 1: Select the Curriculum to report on"
		Assert.assertTrue(getText("//*[@id='lnkMapSelect']").contains("STEP 1: Select the Curriculum to report on"),"failed to assert text"+"STEP 1: Select the Curriculum to report on");
		
//		Assert the label "Maps selected: For Automation [Do not Edit and Delete]"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_tblMapSelect']/tbody/tr[1]/td").contains("Maps selected: For Automation [Do not Edit and Delete]"),"failed to assert text"+"Maps selected: For Automation [Do not Edit and Delete]");
		
		
//		Assert the label "Subject"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_tblMapSelect']/tbody/tr[2]/td").contains("Subject"),"failed to assert text"+"Subject");
		
//		Assert the label "Active Maps Only"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_tblMapSelect']/tbody/tr[2]/td/label").contains("Active Maps Only"),"failed to assert text"+"Active Maps Only");
		
		
//		Assert the label "Available Maps"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_lblMapsToSelect']").contains("Available Maps"),"failed to assert text"+"Available Maps");
		
		
//		Assert the all available items in the Subject Drop-down
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_tblMapSelect']/tbody/tr[2]/td").contains("Subject"),"failed to assert text"+"Subject");

		
		
    }

}
