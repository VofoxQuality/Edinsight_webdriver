package com.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Teacher_Course_Section_Attendance extends BaseClassOne
{
	@Test(priority=1)
	public void TCED35601()
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
		    		//click("//span[contains(text(),'This Year's Classes')]//following::a[1]");
		    	}
		    }			
			//Click on the Attendance Tab
			click("//span[@class='rtsTxt'][contains(text(),'Attendance')]");
			
			//Assert the label "Attendance View"
			Assert.assertEquals(getText("//span[contains(text(),'Attendance View')]"),"Attendance View");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=2)
	public void TCED35602()
	{
		try
		{
			//Application should be in the Attendance View tab
			
			//Assert the label "Student Id"
			Assert.assertEquals(getText("//span[contains(text(),'Attendance View')]//following::a[1]"),"Student Id");
			
			//Assert the label "Last Name"
			Assert.assertEquals(getText("//span[contains(text(),'Attendance View')]//following::a[2]"),"Last Name");
			
			//Assert the label "First Name"
			Assert.assertEquals(getText("//span[contains(text(),'Attendance View')]//following::a[3]"),"First Name");
			
			//Assert the label "Excused Absences
			Assert.assertEquals(getText("//a[contains(text(),'Excused Absences')]"),"Excused Absences");
			
			//Assert the label "Unexcused Absences
			Assert.assertEquals(getText("//a[contains(text(),'Unexcused Absences')]"),"Unexcused Absences");
			
			//Assert the label "Excused Tardies
			Assert.assertEquals(getText("//a[contains(text(),'Excused Tardies')]"),"Excused Tardies");
			
			//Assert the label "Unexcused Tardies"
			Assert.assertEquals(getText("//a[contains(text(),'Unexcused Tardies')]"),"Unexcused Tardies");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=3)
	public void TCED35603()
	{
		try
		{
			//Application should be in the Attendance View tab			
			 FileDelete();
			 
			 //Click on Export to CSV
			 click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionAttendance2_btnExportCSV']");
			 
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
	public void TCED35604()
	{
		try
		{
			//Application should be in the Attendance View tab		
			
			//Select a student 
			click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionAttendance2_rgStudentList_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
			//Click on add selected students to group button 
			click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionAttendance2_btnSelectToGroup']");
			
			//Assert the label "Add Students to Group"
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			
			//Click on Close button
			driver.switchTo().defaultContent();
			//driver.switchTo().parentFrame();
			//click("//*[@id='RadWindowWrapper_ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionStoplight1_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");
			click("//span[@title='Close']");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=5)
	public void TCED35605()
	{
		try
		{
			//Application should be in the Attendance View tab		
			
			//Select a student 
			click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionAttendance2_rgStudentList_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
			//Click on add selected students to group button 
			click("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionStoplight1_btnCheckAll']");
			
			//Assert the label "Add Students to Group"
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			
			//Assert the label "Create New Group:"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");			
			
			//Click on Close button
			driver.switchTo().parentFrame();
			click("//span[@title='Close']");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}

}
