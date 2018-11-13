package com.MTSS;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;
import Library.BaseClassOne;

public class Fix_and_Delete_intervention_plan extends BaseClassOne
{
	
	@Test(priority=1)
	public void TCED19801()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();
			
			//click Tier / Intervention link		
			click("//a[contains(text(),'Tier / Intervention')]");
			
			//click Fix & Delete Intervention Plans  link		
			click("//a[contains(text(),'Fix & Delete Intervention Plans')]");
			
			//Assert the Label "Fix & Delete Intervention Plans"
			Assert.assertEquals(getText("//td[@class='subheading']"),"Fix/Delete Intervention Plans");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}			
	}
	@Test(priority=2)
	public void TCED19802()
	{
		try {
			//Application should be in the  Fix & Delete Intervention Plans page
			
			//Assert the Label "Search By"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblSearchLabel']"),"Search By:");
			
			//Assert the Label "School Type"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblSchoolType']"),"School Type");
			
			//Assert the Label "Provider"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblEducationProvider']"),"Provider");
			
			//Assert the Label "Grade"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblCurrentGradeLevel']"),"Grade");
			
			//Assert the Label "Group"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblStudentGroup']"),"Group");
			
			//Assert the Label "Facilitator"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblFacilitator']"),"Facilitator");
			
			//Assert the Label "Teacher" 
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblTeacherHeading']"),"Teacher");
			
			//Assert the Label "Person Responsible"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblPersonResponsible']"),"Person Responsible");
			
			//Assert the Label "Tier"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblTier']"),"Tier");
			
			//Assert the Label "Area of Need"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblAreaOfNeed']"),"Area of Need");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=3)
	public void TCED19803()
	{
		try {
			//Application should be in the Fix & Delete Intervention Plans page
			
			//Click on the Search button
			click("//input[@id='ctl00_MainContent_btnSearch']");		
			
			//Assert the Label "Student Id"
			Assert.assertEquals(getText("//a[contains(text(),'Student Id')]"),"Student Id");
			
			//Assert the Label "Last Name"
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the Label "First Name"
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
			
			//Assert the Label "Grade"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"),"Grade");
			
			//Assert the Label "Current School"  
			Assert.assertEquals(getText("//a[contains(text(),'Current School')]"),"Current School");
			
			//Assert the Label "Area of Need" 
			Assert.assertEquals(getText("//a[contains(text(),'Area of Need')]"),"Area of Need");
			
			//Assert the Label "Tier"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Tier')]"),"Tier");
			
			//Assert the Label "Facilitator"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Facilitator')]"),"Facilitator");
			
			//Assert the Label "Intervention Skill Curriculum/Materials"
			Assert.assertEquals(getText("//a[contains(text(),'Intervention Skill')]"),"Intervention Skill");
			
			//Assert the Label "Person Responsible"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Person Responsible')]"),"Person Responsible");
			
			//Assert the Label "Submitted"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Submitted')]"),"Submitted");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=4)
	public void TCED19804()
	{
		try
		{
			//Application should be in the Fix & Delete Intervention Plans page
			
			//Click on the Edit Plan button for a Student
			click("//input[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_btnEditPlan']");
			
			driver.switchTo().frame("RadWindow1");
			
			//Assert the heading "Intervention Details"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/div[3]"),"Intervention Details");
			
			driver.switchTo().parentFrame();
			
			//Click on Close button
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow1']/div[1]/div/ul/li[2]/span");
			
			//Assert the Label "Fix & Delete Intervention Plans"
			Assert.assertEquals(getText("//td[@class='subheading']"),"Fix/Delete Intervention Plans");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=5)
	public void TCED19805()
	{
		try
		{
			//Application should be in the Track Student Interventions page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,0)");
			js.executeScript("arguments[0].scrollIntoView();",find("//a[contains(text(),'103569')]//following::input[2]"));
			
			
			//waitFor("//input[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_btnTrackingForm']");
			
			//Click on Tacking form button for a selected student
			click("//a[contains(text(),'103569')]//following::input[2]");
			//click("//input[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_btnTrackingForm']");
			
			driver.switchTo().frame("RadWindow1");
			
			//Assert the label "Intervention Tracking Form"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/div[3]"),"Intervention Tracking Form");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=6)
	public void TCED19806()
	{
		
		try
		{
			//Application should be in the  Intervention Tracking form  pop-up
			
			//Assert the Label "Student ID"
			String Std_id=getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[3]");
			String[]std=Std_id.split(" ",3);
			System.out.println(std[0]);
			
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/div[3]"),"Intervention Tracking Form");
			
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[3]").contains("Student ID"),"failed to assert the label-Student ID");
			
			//Assert the Label "State Student ID"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_HeaderStudentTop1_lblStateSecureId']").contains("State Student ID"),"failed to assert the label-State Student ID");
			
			//Assert the Label "Student Demographics"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[3]"),"Student Demographics");
			
			//Assert the Label "Current School Information"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[3]"),"Current School Information");
			
			//Assert the Label "Other Demographics "
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_HeaderStudentTop1_trDemographics']/td[3]"),"Other Demographics");
			
			//Assert the Label "Date Of Birth"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[5]/span/b"),"Date Of Birth");
			
			//Assert the Label "Gender"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[8]/span/b"),"Gender");
			
			//Assert the Label "Ethnicity"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[11]/b"),"Ethnicity");
			
			//Assert the Label "School"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/b"),"School");
			
			//Assert the Label "Grade"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[8]/b"),"Grade");
			
			//Assert the Label "MTSS"
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_HeaderStudentTop1_trRTI']/td[3]"),"MTSS");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
//	@Test(priority=7)
	public void TCED19807()
	{
		
		try 
		
		{	
			//Application should be in the  Intervention Tracking form  pop-up
			
			//storing student score,expectation level,group average 
			String std_score="60";			
			String std_score1="50";			
			String std_score2="40";				
		    
			//click on tracking date
			click("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rdTrackingDate_dateInput");
			
			//scroll down to the bottom of the popup
			JavascriptExecutor js = (JavascriptExecutor) driver;					
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		

			//select date from the calendar	
			
            if(isElementPresent("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00_ctl04_gbcDeleteColumn']"))
            {						
	           JavaScriptclick("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00_ctl04_gbcDeleteColumn']");	
	           driver.switchTo().alert().accept();	           
            }
            Thread.sleep(3000);
            
            type("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rdTrackingDate_dateInput']","8/25/2018");
//			List<WebElement> allDates=driver.findElements(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rdTrackingDate_calendar_Top']//td"));
//			
//			for(WebElement ele:allDates)
//			{
//				
//				String date=ele.getText();
//				if(date.equalsIgnoreCase("25"))
//				{
//									
//					Thread.sleep(2000);				
//					ele.click();
//					break;
//				}				
//			}				
						
			type("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rtxtStudentScore",std_score);
			
			type("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rtxtStudentGoal",std_score1);
			
			type("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rtxtGroupAverage",std_score2);
			
			click("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_PerformInsertButton");
			
			String input_date="8/25/2018";			
		
			String date=getText("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00_ctl04_lblTrackingDate']");
			
			//asserting input date			
			Assert.assertEquals(date, input_date);	
					
			String save_std_score =getText("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00__0']/td[4]");			
		
			String save_std_score1=getText("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00_ctl04_lblStudentGoal']");						
		
			String save_std_score2=getText("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00__0']/td[6]");
			
			//asserting entered values			
			Assert.assertEquals(save_std_score,std_score);	
			Assert.assertEquals(save_std_score1,std_score1);
			Assert.assertEquals(save_std_score2,std_score2);			
			
			Thread.sleep(2000);
			
		} 		
		catch (Exception e) 		
		{			
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}			
	}	
//    @Test(priority=8)	
	public void TCED19808()	
	{					
		try 
		{
			driver.navigate().to("http://192.168.10.124/Edinsight/Form/RTI/FixInterventionPlans.aspx?args=fPCcek9X3JyzRdS9nDE+7KD3NBSoLWFnR+sq1TMwYPs=");
			//click Intervention tracking button		
			click("input#ctl00_MainContent_btnSearch.button");			
			//click Intervention tracking button		
			click("input#ctl00_MainContent_btnSearch.button");
			
			//click Intervention tracking button	
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl04_btnTrackingForm.button");
			
			driver.switchTo().frame("RadWindow1");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//scroll down to the bottom of the popup			
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
			FileDelete();	
			
			//click print pdf button		
			click("input#ctl00_ContentPlaceHolder1_btnPrinttoPDF.button");
			
			Robot object=new Robot();
			
			object.keyPress(KeyEvent.VK_DOWN);	
			
			object.setAutoDelay(2000);
			
			// Press Enter<br>
			object.keyPress(KeyEvent.VK_ENTER);

			// Release Enter<br>
			object.keyRelease(KeyEvent.VK_ENTER);
			
         //	driver.switchTo().alert();		
			   
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		
		catch (Exception e) 
		{			
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}		
	}
	
//	@Test(priority=9)	
	public void TCED19809()
	
	{			
		try 
		   {				
			
			Thread.sleep(2000);			
			
			driver.navigate().to("http://192.168.10.124/Edinsight/Form/RTI/FixInterventionPlans.aspx?args=fPCcek9X3JyzRdS9nDE+7KD3NBSoLWFnR+sq1TMwYPs=");
			
			//click Intervention tracking button		
			click("input#ctl00_MainContent_btnSearch.button");	
			Thread.sleep(2000);
			
			//Click Edit Measurement button 
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl06_btnEditPlan.button");
			
			driver.switchTo().frame("RadWindow1");			
						
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_Input']");
			
			Thread.sleep(3000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//scroll down to the bottom of the popup			
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
			 //Select the Measurement/Assessment Method as Study Island
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_DropDown']/div/ul/li[12]");
			
			Thread.sleep(3000);					
	
            driver.switchTo().defaultContent();         
   			
			js.executeScript("window.scrollBy(0,400)");
			
			driver.switchTo().frame("RadWindow1");
			
			js.executeScript("scroll(0, document.body.scrollHeight)");
			
			click("input#ctl00_ContentPlaceHolder1_btnSaveContinue.button");
			
			//asserting the current value in the dropdown is study island			
			
	        Assert.assertTrue(driver.findElement(By.cssSelector("input#ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_Input")).getAttribute("value").contains("Study Island"));
							

		} 		
		catch (Exception e) 		
		{					
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
		
	}
//	@Test(priority=10)	
	public void TCED19810()
	{
		try
		{
			//Application should be in the  Intervention Tracking form  pop-up
			
			driver.switchTo().parentFrame();
			
			//Click on Save & Close button
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow1']/div[1]/div/ul/li[2]/span");
			
			//Assert the Label "Fix & Delete Intervention Plans"
			Assert.assertEquals(getText("//td[@class='subheading']"),"Fix/Delete Intervention Plans");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
//	@Test(priority=11)	
	public void TCED19811()
	{
		
		try
		{
			//Application should be in the  Fix/Delete Intervention Plans page
			Thread.sleep(2000);
			
			//Click on Change Tier button for a particular Student
			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_btnChangeTier']"); 			
						
			//Assert the page heading as Change Tier
			Assert.assertEquals(getText("//h6[@class='rwTitle']"),"Change Tier");
			
			driver.switchTo().frame("rwChangeTier");
			
			//Assert the label "Please select a new tier for this plan " 
			Assert.assertEquals(getText("//*[@id='aspnetForm']/div[4]/table/tbody/tr[1]/td/span"),"Please select a new tier for this plan");
			
			//Click on Update button
			click("//*[@id='ctl00_ContentPlaceHolder1_btnUpdateTier']");
			
			if(isAlertPresents())
			{
				driver.switchTo().alert().accept();
			}
			Thread.sleep(3000);			
			driver.navigate().refresh();
			Thread.sleep(2000);
			//Assert the Label "Fix & Delete Intervention Plans"
			Assert.assertEquals(getText("//td[@class='subheading']"),"Fix/Delete Intervention Plans");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}	
 //   @Test(priority=12)	
	public void TCED19812()	
	{
		try 
		
		  {
			
			//Application should be in the  Fix/Delete Intervention Plans page
			
			//Select last student to Delete
			JavascriptExecutor js= (JavascriptExecutor)driver;						
			js.executeScript("scroll(document.body.scrollHeight,document.body.scrollHeight)");	
			
			//Click on Delete button
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl98_btnDelete.button");
			
			String msg=driver.switchTo().alert().getText();
			
			//assert text in the alert pop up			
			Assert.assertEquals(msg,"Are you sure you want to permanently delete this intervention plan and all tracking data associated with it?");
			
			driver.switchTo().alert().accept();
			
			//Assert the Label "Fix & Delete Intervention Plans"
			Assert.assertEquals(getText("//td[@class='subheading']"),"Fix/Delete Intervention Plans");
			
			//click on Logout button		 
			click("//*[@id='ctl00_A3']/img");
			
			//Assert the page Header as "Edinsight Login"					
			Assert.assertTrue(driver.getTitle().contains("EdInsight Login"));
		} 		
		catch (Exception e) 
		{
			
			e.printStackTrace();			
			Assert.fail(e.getMessage());
		}		
	}
}
