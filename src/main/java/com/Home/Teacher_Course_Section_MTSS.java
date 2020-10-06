package com.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Teacher_Course_Section_MTSS extends BaseClassOne
{
	@Test(priority=1)
	public void TCED351101()
	{
		try
		{
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			// Click on Teacher list 
			click("//a[contains(text(),'Teacher List')]");
			
			// Select Education Provider as Ashley High School 
			select("//*[@id='ctl00_MainContent_ddlEducationalProviders']","label=Ashley High School");
			
			//Click on Classes Link
			click("//*[@id='ctl00_MainContent_rgTeacherList_ctl00_ctl04_hlnkClasses']");
			
			Thread.sleep(2000);
			
			//Click on the any class (TEACHING ASST (S)) Link 
		    String parent_window=driver.getWindowHandle();
		    for(String child:driver.getWindowHandles())
		    {
		    	if(!parent_window.equals(child)) 
		    	{
		    		driver.switchTo().window(child);
		    		click("//*[@id='ctl00_MainContent_pnlScheduleNotSorted']/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td/span[1]/u/a");		    		
		    	}
		    }			
			//Click on the MTSS Tab
			click("//span[contains(text(),'MTSS')]");
			
			//Assert the label "MTSS"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_lblRTIIFullName']"),"MTSS");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=2)
	public void TCED351102()
	{
		try
		{
			//Application should be in the MTSS tab
			
			//Assert the Label "Student Id
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_lblRTIIFullName']//following::a[1]"),"Student Id");
			
			//Assert the Label "Last Name
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_rgStudentRTII_ctl00']/thead/tr[1]/th[4]/a"),"Last Name");
			
			//Assert the Label "First Name
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_rgStudentRTII_ctl00']/thead/tr[1]/th[5]/a"),"First Name");
			
			//Assert the Label "Mathematics Tier
			Assert.assertEquals(getText("//a[contains(text(),'Mathematics Tier')]"),"Mathematics Tier");
			
			//Assert the Label "Mathematics Intervention
			Assert.assertEquals(getText("//a[contains(text(),'Mathematics Intervention')]"),"Mathematics Intervention");
			
			//Assert the Label "Reading/English Language Arts Tier
			Assert.assertEquals(getText("//a[contains(text(),'Reading/English Language Arts Tier')]"),"Reading/English Language Arts Tier");
			
			//Assert the Label "Reading/English Language Arts Intervention
			Assert.assertEquals(getText("//a[contains(text(),'Reading/English Language Arts Intervention')]"),"Reading/English Language Arts Intervention");
			
			//Assert the Label "Behavioral Tier
			Assert.assertEquals(getText("//a[contains(text(),'Behavioral Tier')]"),"Behavioral Tier");
			
			//Assert the Label "Behavioral Intervention
			Assert.assertEquals(getText("//a[contains(text(),'Behavioral Intervention')]"),"Behavioral Intervention");
			
			//Assert the Label "Keystone View Tier
			Assert.assertEquals(getText("//a[contains(text(),'Keystone View Tier')]"),"Keystone View Tier");
			
			//Assert the Label "Keystone View Intervention"
			Assert.assertEquals(getText("//a[contains(text(),'Keystone View Intervention')]"),"Keystone View Intervention");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=3)
	public void TCED351103()
	{
		try
		{
			//Application should be in the MTSS tab
					
			 FileDelete();
			 
			 //Click on Export to CSV
			 click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_btnExportCSV']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");	 

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=4)
	public void TCED351104()
	{
		try
		{
			//Application should be in the MTSS tab
					
			 FileDelete();
			 
			 //Click on Export to PDF
			 click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_btnExportpdf']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=5)
	public void TCED351105()
	{
		try
		{
			//Application should be in the Attendance View tab		
			
			//Select a student 
			click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_rgStudentRTII_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");
			
			Thread.sleep(3000);	
			//Click on add selected students to group button 
			click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_btnSelectToGroup']");
			
			Thread.sleep(3000);
			//Assert the label "Add Students to Group"
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");

			Thread.sleep(3000);
			driver.switchTo().parentFrame();
			
			Thread.sleep(3000);			
			click("//span[@title='Close']");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=6)
	public void TCED351106()
	{
		try
		{
			//Application should be in the Attendance View tab			
			driver.get(driver.getCurrentUrl());
			
			Thread.sleep(3000);

			click("//span[contains(text(),'MTSS')]");
			
			//select a student
			click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_rgStudentRTII_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");
			
			//Click on add all selected students to group button 
			click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionRTII_btnCheckAll']");
			
			Thread.sleep(3000);
			//Assert the label "Add Students to Group"
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			
			//Assert the label "Create New Group:"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");			
			
			//Click on Close button
			Thread.sleep(3000);
			driver.switchTo().parentFrame();
			
			
			click("//span[@title='Close']");
			
			//click on Logout button
			waitForEnable("//*[@id='ctl00_A3']");
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
