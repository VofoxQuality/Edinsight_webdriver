package com.Home;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;


public class Attendance extends BaseClassOne

{
	
	@Test(priority=0)
	public void TCED34301()
	{
		try 
		
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
			
			//Click on the attendance menu
			click("//*[@id='ctl00_plcLeftMenu_MenuStudentLeft1_pnlMenu']/ul/li[3]/a");
			
			//Assert the label "Absence Tracker"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[2]").contains("Absence Tracker"),"failed to assert text"+"Absence Tracker");
		} 
		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Test(dependsOnMethods={"TCED34301"})
	public void TCED34302()	
	{ 
		try
		{
			//Assert the Label "Legend"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[1]/tbody/tr/td").contains("Legend"),"failed to assert text"+"  Legend");
			
            //Assert the Label "1st Quartile"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[2]/tbody/tr/td[1]").contains("1st Quartile"),"failed to assert text"+"  1st Quartile");

			//Assert the Label "2nd Quartile"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[2]/tbody/tr/td[2]").contains("2nd Quartile"),"failed to assert text"+"  2nd Quartile");

			//Assert the Label "3rd Quartile"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[2]/tbody/tr/td[3]").contains("3rd Quartile"),"failed to assert text"+"  3rd Quartile");

			//Assert the Label "4th Quartile"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[2]/tbody/tr/td[4]").contains("4th Quartile"),"failed to assert text"+"  4th Quartile");

			//Assert the Label "Student Absences Percentile in School to Date"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[3]/tbody/tr[1]/td[1]").contains("Student Absences Percentile in School to Date"),"failed to assert text"+"  Student Absences Percentile in School to Date");

			//Assert the Label "Student Absences Percentile in District to Date"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[3]/tbody/tr[2]/td[1]").contains("Student Absences Percentile in District to Date"),"failed to assert text"+"  Student Absences Percentile in District to Date");

			//Assert the Label "Last Year Student Absences Percentile in School"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[3]/tbody/tr[3]/td[1]").contains("Last Year Student Absences Percentile in School"),"failed to assert text"+"  Last Year Student Absences Percentile in School");

			//Assert the Label "Last Year Student Absences Percentile in District"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[3]/tbody/tr[4]/td[1]").contains("Last Year Student Absences Percentile in District"),"failed to assert text"+"  Last Year Student Absences Percentile in District");

			//Assert the Label "Absences Percentile to Date"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[2]/div/div[2]").contains("Absences Percentile to Date"),"failed to assert text"+"  Absences Percentile to Date");

			//Assert the Label "Absences Percentile for Last Year"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[2]/td/div/div[2]").contains("Absences Percentile for Last Year"),"failed to assert text"+"  Absences Percentile for Last Year");
		
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("scroll(0,1200)");
		    
			//Assert the Label "Show Truancy Alerts  (Hide)"
		    Assert.assertTrue(getText("//*[@id='TruancyAlertsToggle']/a[1]").contains("Show Truancy Alerts"),"failed to assert text"+"  Show Truancy Alerts");
			
			//Assert the Label "Truancy Alert"
		    Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_TruancyAlerts_ctl01_lblHeading']").contains("Truancy Alert"),"failed to assert text"+"  Truancy Alert");
		    
			//Assert the Label "Date Range"
		    Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_TruancyAlerts_ctl01_rgdTruancyAlert_ctl00']/thead/tr/th[2]").contains("Date Range"),"failed to assert text"+"  Date Range");
			
		    //Assert the Label "NumAbsences"
		    Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_TruancyAlerts_ctl01_rgdTruancyAlert_ctl00']/thead/tr/th[3]").contains("NumAbsences"),"failed to assert text"+" NumAbsences");
			
		    //Assert the Label "Total Unexcused Absence YTD"
		    Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_TruancyAlerts_ctl01_rgdTruancyAlert_ctl00']/thead/tr/th[4]").contains("Total Unexcused Absence YTD"),"failed to assert text"+"  Total Unexcused Absence YTD");
			
		    //Assert the Label "Qualifies"
		    Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_TruancyAlerts_ctl01_rgdTruancyAlert_ctl00']/thead/tr/th[5]").contains("Qualifies"),"failed to assert text"+"  Qualifies");
		
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}
	
	@Test(priority=2)
	public void TCED34303()	
	{ 
	  try
	  {
		    //Application should be in the attendance page
		    
		     driver.navigate().refresh();
		  
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("scroll(0,380)");
		    
		    //Taking screenshot of the Attendance_Totals_by_Type chart and saving in the screenshot folder under the project root folder		    
		    TakesScreenshot ts=	(TakesScreenshot)driver;
		    File src= ts.getScreenshotAs(OutputType.FILE);	  
		    FileUtils.copyFile(src, new File("./Screenshots/Attendance_Totals_by_Type.png"));
		    
		    //Click on the  Show student attendance for 2016-2017 school year link		    
		    Actions act=new Actions(driver);
		    act.moveToElement(driver.findElement(By.xpath("//*[@id='shcAttendanceHistory2017Toggle']/a[1]")));    		   		    
		    click("//*[@id='shcAttendanceHistory2017Toggle']/a[1]");
		    
		    //Assert the lablel "Show student attendance for 2016-2017 school year  (Hide)"
			Assert.assertTrue(getText("//*[@id='LinkHideshcAttendanceHistory2017']").contains("(Hide)"),"failed to assert text"+"(Hide)");
	      }       
	  catch (Exception e) 
	  {
		Assert.fail(e.getMessage());
		e.printStackTrace();
	  }  

	}

	@Test(priority=3)
	public void TCED34304()	
	{ 	
		
		try
		{			
			
			//Assert the Label "Year"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2017_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[1]/a").contains("Year"),"failed to assert text"+"Year");
			
			//Assert the Label "Date"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2017_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[2]/a").contains("Date"),"failed to assert text"+"Date");
			
			//Assert the Label "Reason"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2017_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[3]/a").contains("Reason"),"failed to assert text"+"Reason");
			
			//Assert the Label "Type"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2017_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[4]/a").contains("Type"),"failed to assert text"+" Type");
			
			Thread.sleep(1000);
			
			//Click on the (Hide) link
			click("//*[@id='LinkHideshcAttendanceHistory2017']");
			
			//Assert the label "Show student attendance for 2016-2017 school year"
			Assert.assertTrue(getText("//*[@id='shcAttendanceHistory2017Toggle']/a[1]").contains("Show student attendance for 2016-2017 school year"),"failed to assert text"+"Show student attendance for 2016-2017 school year");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}
	
	@Test(priority=4)
	public void TCED34305()	
	{ 
		
		try 
		 
		{
			//Application should be in the attendance page
			driver.navigate().refresh();
			Thread.sleep(2000);		
						
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("scroll(0,1200)");
		    
		    //Click on the  Show student attendance for 2015-2016 school year link
			click("//*[@id='shcAttendanceHistory2016Toggle']/a[1]");
			
			
			//Assert the lablel "Show student attendance for 2015-2016 school year  (Hide)"
			Assert.assertTrue(getText("//*[@id='LinkHideshcAttendanceHistory2016']").contains("(Hide)"),"failed to assert text"+"(Hide)");
			
			//Assert the Label "Year"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2016_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[1]/a").contains("Year"),"failed to assert text"+"Year");
			
			//Assert the Label "Date"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2016_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[2]/a").contains("Date"),"failed to assert text"+"Date");
			
			//Assert the Label "Reason"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2016_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[3]/a").contains("Reason"),"failed to assert text"+"Reason");
			
			//Assert the Label "Type"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2016_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[4]/a").contains("Type"),"failed to assert text"+" Type");
			
			
			//Click on the (Hide) link
			click("//*[@id='LinkHideshcAttendanceHistory2016']");
			
			//Assert the label "Show student attendance for 2015-2016 school year"
			Assert.assertTrue(getText("//*[@id='shcAttendanceHistory2016Toggle']/a[1]").contains("Show student attendance for 2015-2016 school year"),"failed to assert text"+"Show student attendance for 2015-2016 school year");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}	

	@Test(priority=5)
	public void TCED34306()	
	{ 
		
		try 
		 
		{
			//Application should be in the attendance page
			driver.navigate().refresh();
			Thread.sleep(2000);		
						
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("scroll(0,1200)");
		    
		    //Click on the  Show student attendance for 2015-2016 school year link
			click("//*[@id='shcAttendanceHistory2015Toggle']/a[1]");
			
			
			//Assert the lablel "Show student attendance for 2015-2016 school year  (Hide)"
			Assert.assertTrue(getText("//*[@id='LinkHideshcAttendanceHistory2015']").contains("(Hide)"),"failed to assert text"+"(Hide)");
			
			//Assert the Label "Year"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2015_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[1]/a").contains("Year"),"failed to assert text"+"Year");
			
			//Assert the Label "Date"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2015_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[2]/a").contains("Date"),"failed to assert text"+"Date");
			
			//Assert the Label "Reason"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2015_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[3]/a").contains("Reason"),"failed to assert text"+"Reason");
			
			//Assert the Label "Type"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAttendance1_shcAttendanceHistory2015_ctl00_rdgStudentScores_ctl00']/thead/tr[1]/th[4]/a").contains("Type"),"failed to assert text"+" Type");
			
			
			//Click on the (Hide) link
			click("//*[@id='LinkHideshcAttendanceHistory2015']");
			
			//Assert the label "Show student attendance for 2014-2015 school year"
			Assert.assertTrue(getText("//*[@id='shcAttendanceHistory2015Toggle']/a[1]").contains("Show student attendance for 2014-2015 school year"),"failed to assert text"+"Show student attendance for 2014-2015 school year");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
					
	}	
	
	@Test(priority=6)
	public void TCED34307()	
	{ 
		
		try
		{
			//Application should be in the attendance page
			driver.navigate().refresh();				
						
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,1300)");
			
			//Click on the Hide link of Show Truancy Alerts  (Hide)	    
			click("//*[@id='LinkHideTruancyAlerts']");
			
			//Assert the label "Show Truancy Alerts"
			Assert.assertTrue(getText("//*[@id='TruancyAlertsToggle']/a[1]").contains("Show Truancy Alerts"),"failed to assert text"+" Show Truancy Alerts");
		} 
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}

@Test(priority=7)
	public void TCED34308()	
	{ 
		
		try
		{
			//Application should be in the attendance page
			driver.navigate().refresh();
			
			FileDelete();
			
			//Click on the Print to PDF
			click("//*[@id='ctl00_MainContent_btnPrintToPDF']");
			
			//Assert the PDF generated 
			
			Thread.sleep(6000);		
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
