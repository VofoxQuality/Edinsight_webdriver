package com.MTSS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Meeting_History_Report extends BaseClassOne
{
	
	@Test(priority=1)
	public void TCED22501()
	{
	 
		try
		  {
			  //Superintent Login
			  login(Supertent_Login_id,Supertent_Login_Password);
			  
			  //hover over MTTS link			
			   Actions actions = new Actions(driver);
			   WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			   actions.moveToElement(mouseHover).build().perform();
			   
			   //Click Meeting History Report 
			   click("//a[contains(text(),'Meeting History Report')]");
			   
			   //Assert the Heading Meeting History Report
			   Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblHeading']"),"Meeting History Report");
		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }	
	   
	 }
	 @Test(priority=2)
	 public void TCED22502()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  Param page
			 
			 // Assert the Labels "Run Report by School Year"
			 Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoSchoolYear']"),"Run Report by School Year");
			 
			 //Assert the Labels "School Year"
			 Assert.assertEquals(getText("//td[contains(text(),'School Year')]"),"School Year");
			 
			 //Assert the Labels "Run Report by Date Range"
			 Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoDateRange']"),"Run Report by Date Range");
			 
			 //Assert the Labels "Start Date"
			 Assert.assertEquals(getText("//td[contains(text(),'Start Date:')]"),"Start Date:");
			 
			 //Assert the Labels "End Date"
			 Assert.assertEquals(getText("//td[contains(text(),'End Date:')]"),"End Date:");
			 
			 //Assert the Labels "Run Report by Building"
			 Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoBuilding']"),"Run Report by Building");
			 
			 //Assert the Labels "School Type"
			 Assert.assertEquals(getText("//td[contains(text(),'School Type')]"),"School Type");
			 
			 //Assert the Labels "Building "
			 Assert.assertEquals(getText("//td[contains(text(),'Building')]"),"Building");
			 
			 //Assert the Labels "Run Report by Student Group"
			 Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoStudentGroup']"),"Run Report by Student Group");
			 
			 //Assert the Labels "Student Group"
			 Assert.assertEquals(getText("//td[contains(text(),'Student Group')]"),"Student Group");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	 }
	 @Test(priority=3)
	 public void TCED22503()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  Param page
			 
			 //Click on Run Report button
			 click("//input[@id='ctl00_MainContent_btnRunReport']");
			 
			 //Assert the label "Meeting History Report "
			 Assert.assertEquals(getText("//span[@class='subheading']"),"Meeting History Report");
		} 
		 catch (Exception e)
		{
			 Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	 }
//	 @Test(priority=4)
	 public void TCED22504()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  Param page
			 
			 //Assert the label "School Type"
			 Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblProviderLevel']"),"School Type:");
			 
			 //Assert the label "Building"
			 Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblBuilding']"),"Building:");
			 
			 //Assert the label "School Year"
			 Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblDateRange_SchoolYear']"),"School Year:");
		  } 
		 catch (Exception e)
		 {
			 Assert.fail(e.getMessage());
			e.printStackTrace();
		 }		 
	 }
//	 @Test(priority=5)
	 public void TCED22505()
	 {
		 //Application should be in the Meeting History Report  page
		 
		 //Assert the label "Student Id"
		 Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgHirstoryReport_ctl00']/thead/tr[1]/th[2]"),"Student Id");
		 
		 //Assert the label "Last Name"
		 Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
		 
		 //Assert the label "First Name"
		 Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
		 
		 //Assert the label "Current Building"
		 Assert.assertEquals(getText("//a[contains(text(),'Current Building')]"),"Current Building");
		 
		 //Assert the label "Current Grade"
		 Assert.assertEquals(getText("//a[contains(text(),'Current Grade')]"),"Current Grade");
		 
		 //Assert the label "Gender"
		 Assert.assertEquals(getText("//a[contains(text(),'Gender')]"),"Gender");
		 
		 //Assert the label "Ethnicity"
		 Assert.assertEquals(getText("//a[contains(text(),'Ethnicity')]"),"Ethnicity");
		 
		 //Assert the label "IEP"
		 Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'IEP')]"),"IEP");
		 
		 //Assert the label "ELL"
		 Assert.assertEquals(getText("//a[contains(text(),'ELL')]"),"ELL");
		 
		 //Assert the label "Ec. Disadvantaged"
		 Assert.assertEquals(getText("//a[contains(text(),'Ec. Disadvantaged')]"),"Ec. Disadvantaged");
		 
		 //Assert the label "504
		 Assert.assertEquals(getText("//a[contains(text(),'504')]"),"504");
		 
		 //Assert the label "Meeting Type"
		 Assert.assertEquals(getText("//a[contains(text(),'Meeting Type')]"),"Meeting Type");
		 
		 //Assert the label "Meeting Date"
		 Assert.assertEquals(getText("//a[contains(text(),'Meeting Date')]"),"Meeting Date");
		 
		 //Assert the label "Meeting Building"
		 Assert.assertEquals(getText("//a[contains(text(),'Meeting Building')]"),"Meeting Building");
		 
		 //Assert the label "Parent/Guardian Attendance"
		 Assert.assertEquals(getText("//a[contains(text(),'Parent/Guardian Attendance')]"),"Parent/Guardian Attendance");
		 
		 //Assert the label "Student Attendance"
		 Assert.assertEquals(getText("//a[contains(text(),'Student Attendance')]"),"Student Attendance");
		 
		 //Assert the label "MTSS Tiered"
		 Assert.assertEquals(getText("//a[contains(text(),'MTSS Tiered')]"),"MTSS Tiered");
		 
		 //Assert the label "Submitted"
		 Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgHirstoryReport_ctl00']/thead/tr[1]/th[22]/a"),"Submitted");
		 
	 }
//	 @Test(priority=6)
	 public void TCED22506()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			 FileDelete();
			 
			 //Click on Export to CSV
			 click("//*[@id='ctl00_MainContent_btnExportCSV']");
			 
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
//	 @Test(priority=7)
	 public void TCED22507()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			 FileDelete();
			 
			 //Click on Export to PDF
			 click("//*[@id='ctl00_MainContent_btnExportpdf']");
			 
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
//	 @Test(priority=8)
	 public void TCED22508()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			 //Select first 2 Students in the grid 
			 click("//*[@id='ctl00_MainContent_rgHirstoryReport_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			 click("//*[@id='ctl00_MainContent_rgHirstoryReport_ctl00_ctl06_chkSelectUserSelectCheckBox']");
			 
			 //Click on  Add Selected Student to Group button
			 click("//*[@id='ctl00_MainContent_btnAddToGroup']");
			 
			 //Assert the label  Add Students to Group
			 driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			 Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			 
			 //Assert the label  Create New Group
			 Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");
			 
			 //Click on Close button
			 driver.switchTo().parentFrame();
			 //click("//*[@id='RadWindowWrapper_ctl00_MainContent_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");
			 click("//span[@title='Close']");
			 
			 //Assert the label "Meeting History Report "
			 Assert.assertEquals(getText("//span[@class='subheading']"),"Meeting History Report");

		} 
		 catch (Exception e)
		{
			 Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	 }
//	 @Test(priority=9)
	 public void TCED22509()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			 //Select first 2 Students in the grid 
			 click("//*[@id='ctl00_MainContent_rgHirstoryReport_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			 click("//*[@id='ctl00_MainContent_rgHirstoryReport_ctl00_ctl06_chkSelectUserSelectCheckBox']");
			 
			 //Click on  Add All Student to Group button
			 click("//*[@id='ctl00_MainContent_btnCheckAll']");
			 
			 //Assert the label  Add Students to Group
			 driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			 Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			 
			 //Assert the label  Create New Group
			 Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");
			 
			 //Click on Close button
			 driver.switchTo().parentFrame();
			 //click("//*[@id='RadWindowWrapper_ctl00_MainContent_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");
			 click("//span[@title='Close']");
			 
			 //Assert the label "Meeting History Report "
			 Assert.assertEquals(getText("//span[@class='subheading']"),"Meeting History Report");

		} 
		 catch (Exception e)
		{
			 Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	 }
//	 @Test(priority=10)
	 public void TCED22510()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			// Click on Add report to favorite button
			 click("//*[@id='ctl00_MainContent_btnAddToFavorite']");
			 
			 //Assert the label "Meeting History Report "
			 Assert.assertEquals(getText("//span[@class='subheading']"),"Meeting History Report");

		} 
		 catch (Exception e)
		{
			 Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	 }
	 @Test(priority=11)
	 public void TCED22511()
	 {
		 try
		 {
			  //hover over MTTS link			
			   Actions actions = new Actions(driver);
			   WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			   actions.moveToElement(mouseHover).build().perform();
			   
			   //Click Meeting History Report 
			   click("//a[contains(text(),'Meeting History Report')]");
			   
			   //Click on Run Report by Date Range
			   click("//*[@id='ctl00_MainContent_rdoDateRange']");
			   Thread.sleep(2000);
			   
			   //Select Start Date :- 2/1/2018 
			  // click("//*[@id='ctl00_MainContent_rdpStart_dateInput']");
			   
			   type("//*[@id='ctl00_MainContent_rdpStart_dateInput']","2/1/2018");
			   Thread.sleep(2000);
			   find("//*[@id='ctl00_MainContent_rdpStart_dateInput']").sendKeys(Keys.TAB);
			   
			   //Select End Date :-  8/3/2018
			   click("//*[@id='ctl00_MainContent_rdgEnd_dateInput']");
			   type("//*[@id='ctl00_MainContent_rdgEnd_dateInput']","8/3/2018");   
			   			   
			   Thread.sleep(2000);
			   click("//*[@id='ctl00_MainContent_rdoDateRange']");	
			   
			   JavascriptExecutor jse = (JavascriptExecutor) driver;
			   jse.executeScript("document.getElementById('ctl00_MainContent_btnRunReport').focus();");

			   
			   //click on Run Report
			   //JavaScriptclick("//*[@id='ctl00_MainContent_btnRunReport']");
			   click("//*[@id='ctl00_MainContent_btnRunReport']");
			   
			  //Assert the label "Meeting History Report "
			  Assert.assertEquals(getText("//span[@class='subheading']"),"Meeting History Report");
			  
			  //Assert the label "School Type"
			  Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblProviderLevel']"),"School Type:");
			  
			  //Assert the label "Building"
			  Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblBuilding']"),"Building:");
			  
			  //Assert the label "Date Range: 2/1/2018 - 8/8/2018 "
			  Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblDateRange_SchoolYear']"),"Date Range:");

		} 
		 catch (Exception e)
		{
			 Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	 }
	 @Test(priority=12)
	 public void TCED22512()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			 FileDelete();
			 
			 //Click on Export to CSV
			 click("//*[@id='ctl00_MainContent_btnExportCSV']");
			 
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
	 @Test(priority=13)
	 public void TCED22513()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			 FileDelete();
			 
			 //Click on Export to PDF
			 click("//*[@id='ctl00_MainContent_btnExportpdf']");
			 
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
	 @Test(priority=14)
	 public void TCED22514()
	 {
		 try
		 {
			  //hover over MTTS link			
			   Actions actions = new Actions(driver);
			   WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			   actions.moveToElement(mouseHover).build().perform();
			   
			   //Click Meeting History Report 
			   click("//a[contains(text(),'Meeting History Report')]");
			   
               //Click on Run Report by Student Group option
			   click("//*[@id='ctl00_MainContent_rdoStudentGroup']");
			   
			   //Select Group :-  00 123 MR
			   select("//*[@id='ctl00_MainContent_ddlStudentGroup']", "label=00 123 MR");
			   
			   //click on Run Report
			   click("//*[@id='ctl00_MainContent_btnRunReport']");
			   
			  //Assert the label "Meeting History Report "
			  Assert.assertEquals(getText("//span[@class='subheading']"),"Meeting History Report");
			  
			  //Assert the Group as  00 123 MR
			  Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblProviderLevelDisplay']"),"00 123 MR");
			  
		} 
		 catch (Exception e)
		{
			 Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	 }
	 @Test(priority=15)
	 public void TCED22515()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			 FileDelete();
			 
			 //Click on Export to CSV
			 click("//*[@id='ctl00_MainContent_btnExportCSV']");
			 
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
	 @Test(priority=16)
	 public void TCED22516()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			 FileDelete();
			 
			 //Click on Export to PDF
			 click("//*[@id='ctl00_MainContent_btnExportpdf']");
			 
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
	 @Test(priority=17)
	 public void TCED22517()
	 {
		 try
		 {
			//Application should be in the Meeting History Report  page
			 
			 FileDelete();
			 
			 //Click on Export to PDF
			 click("//*[@id='ctl00_MainContent_btnPrintToPDF1']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			 
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
