package com.curriculum;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkCoverage']")).getAttribute("innerText").contains("Standards Coverage"),"failed to assert text"+"Standards Coverage");
			
			//Assert the label "Timeline"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkTimeline']")).getAttribute("innerText").contains("Timeline"),"failed to assert text"+"Timeline");
						
			//Assert the label "Browse by Standards"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkBrowse']")).getAttribute("innerText").contains("Browse by Standards"),"failed to assert text"+"Browse by Standards");
					
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
		
		try
		 {
			//Application should be in the Standards Coverage Report			
			
			//Click on STEP 1: Select the Curriculum to report on
			click("//*[@id='lnkMapSelect']");			
			
			//Assert the label "STEP 1: Select the Curriculum to report on"
			Assert.assertTrue(getText("//*[@id='lnkMapSelect']").contains("STEP 1: Select the Curriculum to report on"),"failed to assert text"+"STEP 1: Select the Curriculum to report on");
			
			//Assert the label "Maps selected: For Automation [Do not Edit and Delete]"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_tblMapSelect']/tbody/tr[1]/td").contains("Maps selected: For Automation [Do not Edit and Delete]"),"failed to assert text"+"Maps selected: For Automation [Do not Edit and Delete]");
						
			//Assert the label "Subject"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_tblMapSelect']/tbody/tr[2]/td").contains("Subject"),"failed to assert text"+"Subject");
			
			//Assert the label "Active Maps Only"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_tblMapSelect']/tbody/tr[2]/td/label").contains("Active Maps Only"),"failed to assert text"+"Active Maps Only");
						
			//Assert the label "Available Maps"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_lblMapsToSelect']").contains("Available Maps"),"failed to assert text"+"Available Maps");
						
			//Assert the all available items in the Subject Drop-down		
			Select sel=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_ddlSubject']")));		
			List<WebElement> sub=sel.getOptions();
			
			Assert.assertTrue(sub.get(1).getText().contains("Arts & Humanities"),"failed to assert"+"  Arts & Humanities ");
			Assert.assertTrue(sub.get(2).getText().contains("Business Education"),"failed to assert"+"  Business Education ");
			Assert.assertTrue(sub.get(3).getText().contains("Career and Technical"),"failed to assert"+"  Career and Technical ");
			Assert.assertTrue(sub.get(4).getText().contains("Career Education"),"failed to assert"+"  Career Education ");
			Assert.assertTrue(sub.get(5).getText().contains("Computer Skills"),"failed to assert"+"  Computer Skills");
			Assert.assertTrue(sub.get(6).getText().contains("Family & Consumer Science"),"failed to assert"+"  Family & Consumer Science");
			Assert.assertTrue(sub.get(7).getText().contains("Health"),"failed to assert"+"  Health");
			Assert.assertTrue(sub.get(8).getText().contains("Language Arts"),"failed to assert"+"  Language Arts ");
			Assert.assertTrue(sub.get(9).getText().contains("Library Media"),"failed to assert"+"  Library Media");
			Assert.assertTrue(sub.get(10).getText().contains("Mathematics"),"failed to assert"+"  Mathematics ");
			Assert.assertTrue(sub.get(11).getText().contains("Music"),"failed to assert"+"  Music ");
			Assert.assertTrue(sub.get(12).getText().contains("Physical Education"),"failed to assert"+"  Physical Education ");
			Assert.assertTrue(sub.get(13).getText().contains("Science"),"failed to assert"+"  Science ");
			Assert.assertTrue(sub.get(14).getText().contains("Social Studies"),"failed to assert"+"  Social Studies ");
			Assert.assertTrue(sub.get(15).getText().contains("Technology"),"failed to assert"+"  Technology ");
			Assert.assertTrue(sub.get(16).getText().contains("Uncategorized"),"failed to assert"+"  Uncategorized ");
			Assert.assertTrue(sub.get(17).getText().contains("World Languages"),"failed to assert"+"  World Languages ");
		}		
		catch (Exception e)		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
    }	
	@Test(priority=3)	
	public void TCED29704()
	   
	{
		try		
		{
			//Application should be in the Standards Coverage Report			
			driver.navigate().refresh();			
			Thread.sleep(2000);
			if(isAlertPresents())
			{			
			driver.switchTo().alert().dismiss();	
			}			
			//Click on Run Report button
			click("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_btnRunReport']");
			
			//The Corresponding report should be shown Assert the label "Topic Standards Aligned for selected Maps:"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_AlignedHeading']").contains("Topic Standards Aligned for selected Maps:"),"failed to assert text"+" Topic Standards Aligned for selected Maps:");
		}		
		catch (Exception e)		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	

	}	
	@Test(priority=4)	
	public void TCED29705()	   
	 {		
	   try 		
		 {
			//Application should be in the Standards Coverage Report	
					
			//Assert the label "Selected Maps For Automation [Do not Edit and Delete]"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_lblAlignedMaps']").contains("For Automation [Do not Edit and Delete]"),"failed to assert text"+" For Automation [Do not Edit and Delete]");
			
			//Assert the label "Filter: STATE: PA Core Standards (2014); Grades - All; All Subjects"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rgMapStandardsNew_ctl00__0']/td[2]").contains("STATE: PA Core Anchors and Eligible Content (2014)"),"failed to assert text"+"  STATE: PA Core Anchors and Eligible Content (2014)");

			//Assert grid headings "Standard Code"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rgMapStandardsNew_ctl00']/thead/tr/th[3]/a").contains("Standard Code"),"failed to assert text"+"  Standard Code");
						
			//Assert grid headings "Description"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rgMapStandardsNew_ctl00']/thead/tr/th[4]").contains("Description"),"failed to assert text"+"  Description");
			
			//Assert grid headings "frequency"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rgMapStandardsNew_ctl00']/thead/tr/th[5]/a").contains("Frequency"),"failed to assert text"+"  Frequency");
		
			//Assert grid headings "Minutes from Standards"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rgMapStandardsNew_ctl00']/thead/tr/th[6]/a").contains("Minutes from Standards"),"failed to assert text"+"  Minutes from Standards");
			
			//Assert grid headings "Minutes from Topics"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rgMapStandardsNew_ctl00']/thead/tr/th[7]").contains("Minutes from Topics"),"failed to assert text"+"  Minutes from Topics");
		} 	  
	    catch (Exception e) 
	    {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
	 }	
     @Test(priority=5)	
	 public void TCED29706()	   
	 {	   
	   try	    
	   {
		   //click  STEP 2: Select the report type	   
		   click("//*[@id='lnkReportType']");
		   
		   //Select "Show Standards Coverage Only (with standards filtering)" from STEP 2		   
		   if (driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rdoCoverageOnly']")).isSelected()==false)
		   {
			  click("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rdoCoverageOnly']"); 			   
		   }	  
		   
		   //> Click on Run Report button	   
		   click("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_btnRunReport']");
		   
		   //Assert the label "Topic Standards Coverage for selected Maps:"
		   Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_CoverageHeading']").contains("Topic Standards Coverage for selected Maps:"),"failed to assert text"+"  Topic Standards Coverage for selected Maps:");
	   } 	   
	  catch (Exception e)	   
	   {
		Assert.fail(e.getMessage());
		e.printStackTrace();
	   }	   			
	}
	
    @Test(priority=6)	
	public void TCED29707()	   
	 {	   
	   try
	    {	   
		   //Application should be in the  Standards Coverage Report page
		   
		   //Assert the label "Selected Maps
		   Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_CoverageLabel']/table/tbody/tr[1]/td[1]/b").contains("Selected Maps"),"failed to assert text"+"  Selected Maps");
		   
		   
		  //Assert the label For Automation [Do not Edit and Delete]"
		   Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_lblCoverageMaps']").contains("For Automation [Do not Edit and Delete]"),"failed to assert text"+"  For Automation [Do not Edit and Delete]");
		   
		  // Assert the label "Filter: STATE: PA Core Standards (2014); Grades - All; All Subjects"
		   Assert.assertTrue(getText("#ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_lblCoverageFilter").contains("STATE: PA Core Standards (2014); Grades: All; All Subjects"),"failed to assert text"+"  Filter: STATE: PA Core Standards (2014); Grades - All; All Subjects");

		   //Assert grid headings "Standard Code"
		   Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rgStandardsNew_ctl00']/thead/tr/th[2]/a").contains("Standard Code"),"failed to assert text"+"  Standard Code");
		   
		  // Assert grid headings "Description"
		   Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rgStandardsNew_ctl00']/thead/tr/th[3]").contains("Description"),"failed to assert text"+"  Description");
		   
		   //Assert grid headings "Covered"
		   Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_rgStandardsNew_ctl00']/thead/tr/th[4]/a").contains("Covered"),"failed to assert text"+"  Covered");
	  } 	   
	 catch (Exception e) 	   
	  {
		Assert.fail(e.getMessage());
		e.printStackTrace();
	  }
	
	}
	
    @Test(priority=7)	
	public void TCED29708()	   
	{
		
	 try
		{
			//Application should be in the Standards Coverage Report		
			FileDelete();
			
			//Click on Report to PDF button
			click("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_btnPrintToPDF']");
			
			//Wait for download complete
			waitFor_downloadfile();
	
			//Verify the pdf details
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
	 
	   catch (Exception e) 
	    {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
	}

  @Test(priority=8)
  public void TCED29709()  
  {	
   try
	{
		//Application should be in the Standards Coverage Report		
		FileDelete();
		
		//Click on Report to CSV button
		click("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_btnCSV']");
		
		Thread.sleep(6000);			
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
	} 
 
   catch (Exception e) 
    {
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}
  }

   @Test(priority=9)
   public void TCED29710()	   
    { 
	try	
	  {
		//Application should be in the 	Standards Coverage Report		
		 driver.navigate().refresh();

		//Click on Analyze Curriculum				
		click("//*[@id='lnkAnalyzeSubmenu']");
		Thread.sleep(3000);
		
		//Click on Timeline link Under Analyze by Curriculum section
		click("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkTimeline']");
		
		//Assert the label "Curriculum Map Timeline Report"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblTitle']/tbody/tr/td[2]/h3").contains("Curriculum Map Timeline Report"),"failed to assert text"+" Curriculum Map Timeline Report");
		
	}	
	catch (Exception e)	
	{
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}	
  }
  @Test(priority=10)
  public void TCED29711()	   
  {	
	try 
	{		
		//Application should be in the Timeline Report
		
		//"Assert the label ""Please enter a school year begin date for time calculations!
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_ErrorMessages1_lblMessages']/p").contains("Please enter a school year begin date for time calculations!"),"failed to assert text"+"  Please enter a school year begin date for time calculations!");
			
		//Assert the label ""Select the Curriculum to report on
		Assert.assertTrue(getText("//*[@id='lnkMapSelect']").contains("Select the Curriculum to report on"),"failed to assert text"+"  Select the Curriculum to report on");
		
		//Click on Select the Curriculum to report on
		click("//*[@id='lnkMapSelect']");	
		
		//Assert the label ""Subject""
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblCurriculumFilter']/tbody/tr[1]/td[1]").contains("Subject"),"failed to assert text"+"    Subject");
		
		//Assert the label ""Active Maps Only""
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblCurriculumFilter']/tbody/tr[1]/td[1]").contains("Subject"),"failed to assert text"+"    Subject");
		
		//Assert the label ""Teachers with Lessons""
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_Label3']").contains("Teachers with Lessons"),"failed to assert text"+"    Teachers with Lessons");
		
		//Assert the label ""Available Maps""
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblCurriculumFilter']/tbody/tr[1]/td[1]").contains("Available Maps"),"failed to assert text"+"    Available Maps");
		
		//Assert the label ""View/Print""
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblCurriculumFilter']/tbody/tr[1]/td[1]").contains("View/Print"),"failed to assert text"+"    View/Print");
		
		//Assert the label ""Use Topic Minutes Only""
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblCurriculumFilter']/tbody/tr[1]/td[1]").contains("Use Topic Minutes Only"),"failed to assert text"+"    Use Topic Minutes Only");
		
		//Assert the label ""Minutes in Period:""
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblCurriculumFilter']/tbody/tr[1]/td[1]").contains("Minutes in Period"),"failed to assert text"+"    Minutes in Period:");
		
		
		//Assert the label ""School Type: "" 
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_lblSchoolType']").contains("School Type:"),"failed to assert text"+"   School Type:");
		
		//Assert the label ""Current Building:""
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_lblCurrentBuilding']").contains("Current Building:"),"failed to assert text"+" Current Building:");
			
		//Assert the dropdown values of Subject drop-down
		Select sel=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_ddlSubject']")));		
		List<WebElement> sub=sel.getOptions();
		
		Assert.assertTrue(sub.get(1).getText().contains("Arts & Humanities"),"failed to assert"+"  Arts & Humanities ");
		Assert.assertTrue(sub.get(2).getText().contains("Business Education"),"failed to assert"+"  Business Education ");
		Assert.assertTrue(sub.get(3).getText().contains("Career and Technical"),"failed to assert"+"  Career and Technical ");
		Assert.assertTrue(sub.get(4).getText().contains("Career Education"),"failed to assert"+"  Career Education ");
		Assert.assertTrue(sub.get(5).getText().contains("Computer Skills"),"failed to assert"+"  Computer Skills");
		Assert.assertTrue(sub.get(6).getText().contains("Family & Consumer Science"),"failed to assert"+"  Family & Consumer Science");
		Assert.assertTrue(sub.get(7).getText().contains("Health"),"failed to assert"+"  Health");
		Assert.assertTrue(sub.get(8).getText().contains("Language Arts"),"failed to assert"+"  Language Arts ");
		Assert.assertTrue(sub.get(9).getText().contains("Library Media"),"failed to assert"+"  Library Media");
		Assert.assertTrue(sub.get(10).getText().contains("Mathematics"),"failed to assert"+"  Mathematics ");
		Assert.assertTrue(sub.get(11).getText().contains("Music"),"failed to assert"+"  Music ");
		Assert.assertTrue(sub.get(12).getText().contains("Physical Education"),"failed to assert"+"  Physical Education ");
		Assert.assertTrue(sub.get(13).getText().contains("Science"),"failed to assert"+"  Science ");
		Assert.assertTrue(sub.get(14).getText().contains("Social Studies"),"failed to assert"+"  Social Studies ");
		Assert.assertTrue(sub.get(15).getText().contains("Technology"),"failed to assert"+"  Technology ");
		Assert.assertTrue(sub.get(16).getText().contains("Uncategorized"),"failed to assert"+"  Uncategorized ");
		Assert.assertTrue(sub.get(17).getText().contains("World Languages"),"failed to assert"+"  World Languages ");	
				
		//Assert the dropdown values of School Type drop-down
		Select sel1=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_ddlSchoolType']")));		
		List<WebElement> sub1=sel1.getOptions();
		
		Assert.assertTrue(sub1.get(0).getText().contains("All Schools"),"failed to assert"+"  All Schools ");
		Assert.assertTrue(sub1.get(1).getText().contains("Elementary School"),"failed to assert"+"  Elementary School ");
		Assert.assertTrue(sub1.get(2).getText().contains("Middle School"),"failed to assert"+"  Middle School ");
		Assert.assertTrue(sub1.get(3).getText().contains("High School"),"failed to assert"+"  High School");	
		
		//Assert the dropdown values of Current Building drop-down"
		Select sel2=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_ddlProvider']")));		
		List<WebElement> sub2=sel2.getOptions();
		
		Assert.assertTrue(sub2.get(0).getText().contains("Ashley High School"),"failed to assert"+"  Ashley High School ");
		Assert.assertTrue(sub2.get(1).getText().contains("Belle Plaine Elementary School"),"failed to assert"+"  Belle Plaine Elementary School ");
		Assert.assertTrue(sub2.get(2).getText().contains("Betterton Middle School"),"failed to assert"+"  Betterton Middle School ");
		Assert.assertTrue(sub2.get(3).getText().contains("Bird-in-Hand Elementary School"),"failed to assert"+"  Bird-in-Hand Elementary School");
		Assert.assertTrue(sub2.get(4).getText().contains("Bradley Beach Elementary School"),"failed to assert"+"  Bradley Beach Elementary School");
		
		
		//Click on Select the Timeline and Chart Options
		click("//*[@id='A1']");
		
		//Assert the label "Select the Timeline and Chart Options"
		Assert.assertTrue(getText("//*[@id='A1']").contains("Select the Timeline and Chart Options"),"failed to assert text"+"    Select the Timeline and Chart Options");
		
		//Assert the label "Timeline"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblReportType']/tbody/tr[1]/td").contains("Timeline"),"failed to assert text"+"    Timeline");
		
		//Assert the label "Units"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblReportType']/tbody/tr[1]/td").contains("Units"),"failed to assert text"+"    Units");
				
		//Assert the label "Begin Date for Timeline"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_lblStartDate']").contains("Begin Date for Timeline"),"failed to assert text"+"   Begin Date for Timeline");
		
		//Assert the label "Shorten Unit YAxis Labels"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_tblReportType']/tbody/tr[2]/td/table/tbody/tr/td[3]/label").contains("Shorten Unit YAxis Labels"),"failed to assert text"+"   Shorten Unit YAxis Labels");
	} 
	
	catch (Exception e)	
	{
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}	
 }
 @Test(priority=11)
 public void TCED29712()	   
 {
	try 	
	{		
		//Application should be in the Timeline Report
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		if(isAlertPresents())
		{			
		driver.switchTo().alert().dismiss();	
		}
		
		//Click on the Select the Timeline and Chart Options Enter "Begin Date for Timeline" Select " Units"
		click("//*[@id='A1']");	
		
		//Units = Tick Check All
		click("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_rcbUnits_Input']");
		
		click("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_rcbUnits_DropDown']/div/div/label");
		
		//Enter "Begin Date for Timeline"
		
		type("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_rdpBeginDate_dateInput']","1/1/2018");
		
		//click on Runreport
		click("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_btnRunReport']");
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src1= ts1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File(".//Screenshots//line_chart.png"));
		//Assert the Selcted date as 1/1/2018		
        //Verify the chart is present 
        //Assert the label "* Denotes Units that were calculated using minutes from topics."
       //Assert the label "** Denotes Units that were calculated using weeks of instruction."
		
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		if(isAlertPresents())
		{			
		driver.switchTo().alert().dismiss();	
		}
		
		//Click on Run Report button
		click("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_btnRunReport']");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".//Screenshots//No_data.png"));		
		//Assert the label "No Data"	
	} 	
	catch (Exception e)	
	{
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}
  }

 @Test(priority=12)
 public void TCED29713()	   
   {	
	 try
	  {
		//Application should be in the  Timeline Report	
		FileDelete();
		
		//Click on Print to PDF button
		//click("//*[@id='ctl00_MainContent_CurriculumMapTimelineDtl1_btnPrintToPDF']");
		
		Thread.sleep(6000);			
		//Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
	  } 	
	catch (Exception e)	
	  {
		Assert.fail(e.getMessage());
		e.printStackTrace();
	  }
   }
 @Test(priority=13)
 public void TCED29714()	   
   {	
	try 
	  {
		//driver.navigate().refresh();
		
		//Click on Browse by Standards link Under Analyze by Curriculum section
		
		click("//*[@id='ctl00_MainContent_CurriculumMapEditMenu1_hlkBrowse']");
		
		//	Assert the heading "Search Curriculum by Standards"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlBrowseByStandard']/table[1]/tbody/tr/td[2]/h4").contains("Search Curriculum by Standards"),"failed to assert text"+"   Search Curriculum by Standards");
	  } 	
	catch (Exception e)	
	 {	
		Assert.fail(e.getMessage());
		e.printStackTrace();
	 }
  }

  @Test(priority=14)
  public void TCED29715()	   
   {	
	try	
	 {
		//Assert the Label "Standards Type"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlBrowseByStandard']/table[2]/tbody/tr[1]/td").contains("Standards Type"),"failed to assert text"+"   Standards Type");
		
		
		//Assert the Label "Available Standards"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_pnlBrowseByStandard']/table[2]/tbody/tr[3]/td[1]/table/tbody/tr[1]/td/b").contains("Available Standards"),"failed to assert text"+"   Available Standards");
		
		//Assert the Label "No standard selected."
		Assert.assertTrue(getText("//*[@id='ctl00_ctl00_MainContent_CurriculumReportByStandards1_litStandardNamePanel']").contains("No standard selected"),"failed to assert text"+"   No standard selected");
		
		//Assert the Label "No standard has been selected."
		Assert.assertTrue(getText("//*[@id='ctl00_ctl00_MainContent_CurriculumReportByStandards1_litNumOfMapsFoundPanel']").contains("No standard has been selected"),"failed to assert text"+"   No standard has been selected");
			
		//Assert the Label "No standard has been selected"
		Assert.assertTrue(getText("//*[@id='ctl00_ctl00_MainContent_CurriculumReportByStandards1_litNumOfLessonsFoundPanel']").contains("No standard has been selected"),"failed to assert text"+"   No standard has been selected");
	}
	
	catch (Exception e)
	{
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}
  }

  @Test(priority=15)
   public void TCED29716()	 
      {
	
        try 
          {
    	    //expand standards tree view
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/div/span");
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li[1]/div/span");
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li[1]/ul/li[3]/div/span");
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li[1]/ul/li[3]/ul/li[1]/div/span");
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li[1]/ul/li[3]/ul/li[1]/ul/li/div/span");
			
			// click the label "Demonstrate an understanding that in a multi-digit number..
			click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li[1]/ul/li[3]/ul/li[1]/ul/li/ul/li[1]/div/div/span");
			Thread.sleep(2000);
			
		    //Assert the label "Demonstrate an understanding that in a multi-digit number, a digit in one place represents 1/10 of what it represents in the place to its left. Example: Recognize that in the number 770, the 7 in the tens place is 1/10 the 7 in the hundreds place"
		    Assert.assertTrue(getText("//*[@id='ctl00_ctl00_MainContent_CurriculumReportByStandards1_litStandardNamePanel']").contains("Demonstrate an understanding that in a multi-digit number, a digit in one place represents 1/10 of what it represents in the place to its left. Example: Recognize that in the number 770, the 7 in the tens place is 1/10 the 7 in the hundreds place"),"failed to assert text"+"   Demonstrate an understanding that in a multi-digit number, a digit in one place represents 1/10 of what it represents in the place to its left. Example: Recognize that in the number 770, the 7 in the tens place is 1/10 the 7 in the hundreds place");
			
			//Assert grid heading Map
		    Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_egMapsByStandard_ctl00']/thead/tr/th[2]").contains("Map"),"failed to assert text"+"   Map");
		
		    //Assert grid heading Unit
		    Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_egMapsByStandard_ctl00']/thead/tr/th[3]").contains("Unit"),"failed to assert text"+"   Unit");
		
		    //Assert grid heading Topic
		    Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_egMapsByStandard_ctl00']/thead/tr/th[4]").contains("Topic"),"failed to assert text"+"   Topic");
       
            //Click on Add to print list button		    
		    click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnAddToPrint']");
		    
		    Thread.sleep(2000);
		    
		    //Assert the label "M05.A-T.1.1.1 - Demonstrate an understanding that in a multi-digit number, (STATE: PA Core Anchors and Eligible Content (2014))"
		    Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_lblStandard']/ul/li").contains("M05.A-T.1.1.1 - Demonstrate an understanding that in a multi-digit number, (STATE: PA Core Anchors and Eligible Content (2014))"),"failed to assert text"+" M05.A-T.1.1.1 - Demonstrate an understanding that in a multi-digit number, (STATE: PA Core Anchors and Eligible Content (2014))");
         } 

  catch (Exception e) 
   {
	Assert.fail(e.getMessage());
	e.printStackTrace();
   }	
 }

 @Test(priority=16)
 public void TCED29717()	 
  {	
	try
	
	{
		//Click on Print Selected list
		
		click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintSelected']");
		//Assert the label Print PDF	
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintToPDF']").contains("Print PDF"),"failed to assert text"+"   Print PDF");
		
		//Assert the label Print CSV //*[@id="ctl00_MainContent_CurriculumReportByStandards1_LinkButton2"]
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_LinkButton2']").contains("Print CSV"),"failed to assert text"+"   Print CSV");
		
		//Click on Print Selected list > Print PDF
		click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintSelected']");
		Thread.sleep(2000);
		FileDelete();
		click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintToPDF']");
		waitFor_downloadfile();
		
		//assert PDF Should generated 
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		
		//Click on Print Selected list > Print CSV
		click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintSelected']");
		
		// click on the print csv button
		Thread.sleep(2000);
		
		click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_LinkButton2']");	
		
		FileDelete();	
		//click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_LinkButton2']");
		waitFor_downloadfile();	
		
		////assert CSV generated 
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
	} 	
	catch (Exception e)	
	{
		Assert.fail(e.getMessage());
		e.printStackTrace();
	}
 }

 @Test(priority=17)
 public void TCED29718()	 
 {
	
		
	try
	{
		//Click on Clear Print list button		
		click("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_btnClearPrintList']");
		
		Thread.sleep(500);
		//Assert the label "None selected"
		Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumReportByStandards1_lblStandard']").contains("None selected"),"failed to assert text"+"   None selected");
		
		//click on Logout button		 
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
