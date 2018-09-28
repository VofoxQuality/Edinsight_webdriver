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
	
	@Test(priority=1)
	public void TCED34302()	
	{ 
		//Assert the Label "Legend"
		Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/div[3]/table/tbody/tr[1]/td[1]/table[1]/tbody/tr/td").contains("Legend"),"failed to assert text"+"  Legend");
		
//		Assert the Label "1st Quartile"
//		Assert the Label "2nd Quartile"
//		Assert the Label "3rd Quartile"
//		Assert the Label "4th Quartile"
//		Assert the Label "Student Absences Percentile in School to Date"
//		Assert the Label "Student Absences Percentile in District to Date"
//		Assert the Label "Last Year Student Absences Percentile in School"
//		Assert the Label "Last Year Student Absences Percentile in District"
//		Assert the Label "Absences Percentile to Date"
//		Assert the Label "Absences Percentile for Last Year"
	
	}
	
	@Test(priority=2)
	public void TCED34303()	
	{ 
	  try {
		  
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("scroll(0,380)");
		  
		    TakesScreenshot ts=	(TakesScreenshot)driver;
		    File src= ts.getScreenshotAs(OutputType.FILE);	  
		    FileUtils.copyFile(src, new File("./Screenshots/Attendance_Totals_by_Type.png"));
		    
		    Actions act=new Actions(driver);
		    act.moveToElement(driver.findElement(By.xpath("//*[@id='shcAttendanceHistory2017Toggle']/a[1]")));
		    
		   // js.executeScript("scroll(0,300)");		    
		    click("//*[@id='shcAttendanceHistory2017Toggle']/a[1]");
		    
		    //Assert the lablel "Show student attendance for 2016-2017 school year  (Hide)"
	      }       
	  catch (WebDriverException e) 
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }  
	  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Test(priority=3)
	public void TCED34304()	
	{ 
	
	}
	
}
