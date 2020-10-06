package com.MTSS;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Test_Suite_MTSS_T1_Interventions extends BaseClassOne
{
	
	@Test(priority=1)	
	public void TCED19701()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//click MTTS link			
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a");
			
			//click Tier/Intervention link
			click("//a[contains(text(),'Tier / Intervention')]");
			
			//Click on T1 Interventions
			click("//a[contains(text(),'T1 Interventions')]");
			
			//Assert the Label "Tier 1 Interventions"
			Assert.assertEquals(getText("//td[@class='subheading']"),"Tier 1 Interventions");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		} 
	}
	@Test(priority=2)	
	public void TCED19702()
	{
		try
		{
			//Application should be in the  T1 Interventions page
			
			//Assert the Label "Student ID"
			Assert.assertEquals(getText("//td[contains(text(),'Student ID')]"),"Student ID");
			
			//Assert the Label "School Type"
			Assert.assertEquals(getText("//td[contains(text(),'School Type')]"),"School Type");
			
			//Assert the Label "Student Group" 
			Assert.assertEquals(getText("//td[contains(text(),'Student Group')]"),"Student Group");
			
			//Assert the Label "Last Name"
			Assert.assertEquals(getText("//td[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the Label "Education Provider"
			Assert.assertEquals(getText("//td[contains(text(),'Education Provider')]"),"Education Provider");
			
			//Assert the Label "Designee"
			Assert.assertEquals(getText("//td[contains(text(),'Designee')]"),"Designee");
			
			//Assert the Label "First Name"
			Assert.assertEquals(getText("//td[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the Label "Current Grade Level"
			Assert.assertEquals(getText("//td[contains(text(),'Current Grade Level')]"),"Current Grade Level");
			
			//Assert the Label "Teacher"
			Assert.assertEquals(getText("//td[@id='ctl00_MainContent_tdTeacher1']"),"Teacher");
			
			//Assert the Label "Auto Refresh"
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_chkAutoRefresh']"),"Auto Refresh");
			
			//Assert the Label "Include Only Students With Assigned Intervention"
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_chkOnlyTiered']"),"Include Only Students With Assigned Intervention");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test(priority=3)	
	public void TCED19703()
	{
		try {
			//Click on the Search button
			click("//input[@id='ctl00_MainContent_btnSearch']");
			Thread.sleep(2000);

			//Assert the Label "Student Id"
			Assert.assertEquals(getText("//a[contains(text(),'Student Id')]"),"Student Id");
			
			//Assert the Label "Last Name"
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the Label "First Name"
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
			
			//Assert the Label "Special Demogr."
			Assert.assertEquals(getText("//th[contains(text(),'Special Dem')]"),"Special Dem");
			
			//Assert the Label "Current Grade"
			Assert.assertEquals(getText("//a[contains(text(),'Current Grade')]"),"Current Grade");
			
			//Assert the Label "Current School"
			Assert.assertEquals(getText("//a[contains(text(),'Current School')]"),"Current School");
			
			//Assert the Label "Designee(s)
			Assert.assertEquals(getText("//a[contains(text(),'Designee(s)')]"),"Designee(s)");
			
			//Assert the Label "Teacher(s)
			Assert.assertEquals(getText("//a[contains(text(),'Teacher(s)')]"),"Teacher(s)");
			
			//Assert the Label "Assigned Math Min/Week"
			Assert.assertEquals(getText("//a[contains(text(),'Assigned Math Min/Week')]"),"Assigned Math Min/Week");
					
			//Assert the Label "Assigned Reading English Language Arts Min/Week"
			Assert.assertEquals(getText("//a[contains(text(),'Assigned Reading English Language Arts Min/Week')]"),"Assigned Reading English Language Arts Min/Week");
			
			//Assert the Label "Assigned Behavior or Attendance Min/Week "
			Assert.assertEquals(getText("//a[contains(text(),'Assigned Behavior or Attendance Min/Week')]"),"Assigned Behavior or Attendance Min/Week");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=4)	
	public void TCED19704()
	{
		try
		{		
			//Application should be in the Track Student Interventions page
			
			FileDelete();
			
			//Click on the Export to CSV button
			click("input#ctl00_MainContent_btnExportCSV.button");	    
		
			waitFor_downloadfile();
			
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		} 		
		catch (Exception e) 		
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}		
	}	
	@Test(priority=5)	
	public void TCED19705()
	{		
		try 
		{
			//Application should be in the Track Student Interventions page
			
			//Click on "Create T1 Intervention For Selected students" button
			click("input#ctl00_MainContent_btnTutorial.button");
			
			//Assert the message "No Students Selected!"
			String alert_text=driver.switchTo().alert().getText();			
			Assert.assertEquals(alert_text,"No Students Selected!");
			
			//Click on OK Button
			driver.switchTo().alert().accept();
			
			//Assert the Label "Tier 1 Interventions"
			Assert.assertEquals(getText("//td[@class='subheading']"),"Tier 1 Interventions");
			
			//Select some students 
			click("//input[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
			//Click on "Create T1 Intervention For Selected students" button
			click("//input[@id='ctl00_MainContent_btnTutorial']");
			
			SwitchFrameName("RadWindow5");
			
			//Assert the label "T1 Intervention Details "
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_divContents']/div[2]"),"T1 Intervention Details");
		} 		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}		
	}
	@Test(priority=6)	
	public void TCED19706()
	{
		try{
			
			//Assert the Label Cluster
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblTutorialCluster']"),"Cluster");
			
			//Assert the Label Settings
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblProgramDescription']"),"Setting");
			
			//Assert the Label Design 
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblDesigneeBuilding']"),"Designee Building");
			
			//Assert the Label Designee
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblDesignee']"),"Designee");
			
			//Assert the Label Measurement
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblMeasureAssmnt']"),"Measurement");
			
			//Assert the Label T1 Intervention Teacher Building
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblPersonRespBuilding']"),"T1 Intervention Teacher Building");
			
			//Assert the Label T1 Intervention Teacher
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblPersonResponsible']"),"T1 Intervention Teacher");
			
			//Assert the Label T1 Intervention Teacher
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_lblFrequencyTPR']"),"Frequency");
			
			//Assert the Label T1 Intervention Teacher
			Assert.assertEquals(getText("//span[@id='ctl00_ContentPlaceHolder1_litInitiationDate']"),"T1 Intervention Start Date (this should be the first day attended)");
			
			
		}catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}	
		
		
	}
	
	@Test(priority=7)	
	public void TCED19707()
	{
		try{
			
			
			//Click on the Save & Continue button
			click("//input[@id='ctl00_ContentPlaceHolder1_btnSaveContinue']");
			
			//Validation messages for T1 intervension details page 
			Assert.assertTrue(driver.getPageSource().contains("T1 Intervention Plan Could Not Be Saved:"));
			
			Assert.assertTrue(driver.getPageSource().contains("You must select a Frequency Times Per Week."));
			
			Assert.assertTrue(driver.getPageSource().contains("You must select a Frequency Minutes Per Session."));
			
			//click on the button  Save & Submit button
			click("//input[@id='ctl00_ContentPlaceHolder1_btnSaveSubmit']");
			
			//Validation messages for T1 intervension details page 
			Assert.assertTrue(driver.getPageSource().contains("T1 Intervention Plan Has Been Saved But Could Not Be Submitted:"));
			
			Assert.assertTrue(driver.getPageSource().contains("You must select an Setting."));
			
			Assert.assertTrue(driver.getPageSource().contains("You must select a Frequency Times Per Week."));
			
			Assert.assertTrue(driver.getPageSource().contains("You must select a Frequency Minutes Per Session."));
			
			Assert.assertTrue(driver.getPageSource().contains("You must select an T1 Intervention Start Date (this should be the first day attended)."));
			
			Assert.assertTrue(driver.getPageSource().contains("You must select an Curriculum/Materials."));
		}catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}	
		
	}
	@Test(priority=9)	
	public void TCED19709()
	{
		try{
			// click on the close button
			click("//input[@id='ctl00_ContentPlaceHolder1_btnClose']");
			
			//Accept the alert 
			
			String message=driver.switchTo().alert().getText(); 
			
			Assert.assertEquals(message, "This intervention plan has not been submitted.  Are you sure you want to"
					+ " close this window?");
			
			//To accept the alert
			driver.switchTo().alert().accept();
			
			
			//To switch to default content
			driver.switchTo().defaultContent();
			
			//To verify the whether the pop up is closed or not
			Assert.assertTrue(exists("//td[@class='subheading']"));	
		
		}catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=10)	
	public void TCED19710()
	{
		try{
			
			//click on the intervention button
			Thread.sleep(5000);
			click("//input[@id='ctl00_MainContent_rgSearch_ctl00_ctl04_btnIntervention']");
			//JavaScriptclick("");
			
			Thread.sleep(5000);
			
			//Switch to the frame Name
			SwitchFrameName("RadWindow1");
			//driver.switchTo().frame(3);
			
			//Assert the Heading
			Assert.assertEquals(getText("//div[@class='pageheading']"), "MTSS Student Summary");
			
			//Click on the close button
			click("//input[@id='ctl00_ContentPlaceHolder1_btnClose']");
			
			//To switch to default content
			driver.switchTo().defaultContent();
			
			//To verify the whether the pop up is closed or not
			Assert.assertTrue(exists("//td[@class='subheading']"));  
			
		}catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

//	@Test(priority=8)
	public void TCED197015()
	
	{
		
		try {
			//click Search button		
			click("input#ctl00_MainContent_btnSearch.button");
			
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl04_chkSelectUserSelectCheckBox");
			
			click("input#ctl00_MainContent_btnTutorial.button");		
				
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_RadWindow5']/div[1]/div/ul/li[2]/span");
			
			String alert_txt= driver.switchTo().alert().getText();
			
			Assert.assertEquals(alert_txt, "This intervention plan has not been submitted.  Are you sure you want to close this window?");
			
			driver.switchTo().alert().accept();
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	 }
//	@Test(priority=3)
	public void window_hand() throws Exception
	{
		//click Search button		
		click("input#ctl00_MainContent_btnSearch.button");	
		
		click("//*[@id='ctl00_MainContent_rgSearch_ctl00__0']/td[4]");
		String mainWindow=driver.getWindowHandle();
		 // It returns no. of windows opened by WebDriver and will return Set of Strings
		 Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext())
		 {
		 String childWindow=itr.next();
		    // Compare whether the main windows is not equal to child window. If not equal, we will close.
		  if(!mainWindow.equals(childWindow)){
		 driver.switchTo().window(childWindow);		 
		 System.out.println("hi");
		 Thread.sleep(2000);
		  String s= driver.findElement(By.xpath("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/span")).getText();
		  System.out.println(s);
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		 driver.close();
		 }
	 }
		
	}
	
}
