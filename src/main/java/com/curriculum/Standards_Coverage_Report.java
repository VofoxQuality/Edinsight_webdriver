package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Standards_Coverage_Report extends BaseClassOne

{
	//creating object of Analyze_curriculam class	
	Analyze_curriculam ob=new Analyze_curriculam();
	
	@Test
	(priority=0)	
	public void TCED30201()
	{		

		try 
		
		 {
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over curriculum link
			
			Actions act=new Actions(driver);
					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
			
			//Click Reports Menu 
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[11]/div/a");
			
			//Click on Standards Coverage Report
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[3]/td[2]/div");
			
			//Assert the label "Standards Coverage Report"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/h3").contains("Standards Coverage Report"),"failed to assert text"+"Standards Coverage Report");
			
			//click on STEP 1: Select the Curriculum to report on
			click("//*[@id='lnkMapSelect']");
			
			//Select Subject as Career and Technical
			select("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_ddlSubject']","label=Music");
			
			Thread.sleep(3000);	
		    
			//Tick curriculum "For Automation [Do not Edit and Delete]"
			click("//label[contains(text(),'For Automation [Do not Edit and Delete]')]//preceding::input[1]");
			
			//Assert the selected subject as Career and Technical 
			Select sel=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_ddlSubject']")));
			Assert.assertTrue(sel.getFirstSelectedOption().getText().contains("Music"));
			
			//Assert the selected curriculum as "For Automation [Do not Edit and Delete]"			
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_CurriculumMapStandardsCoverageDtl1_lblCheckedMaps']").contains("For Automation [Do not Edit and Delete]"),"failed to assert text"+"  For Automation [Do not Edit and Delete]");
		} 
		
		catch (Exception e) 
		
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
				
	}
	
@Test(priority=1)	
public void TCED30202()
	
	{
	
	 try
		{ 	 

			//Click on STEP 1: Select the Curriculum to report on
     		click("//*[@id='lnkMapSelect']");	
		
			//calling TCED29703 tc from the Analyze Curriculum test suite			
			ob.TCED29703();
		} 
	 
	 catch (Exception e)
	 {
		 Assert.fail(e.getMessage());
		 e.printStackTrace();
	 }
	
	}

@Test(priority=2)	
public void TCED30203()
	
	{
	
	 try
		{ 	 
			
		    //calling TCED29704 tc from the Analyze Curriculum test suite
			ob.TCED29704();
		} 
	 
	 catch (Exception e)
	 {
		 Assert.fail(e.getMessage());
		 e.printStackTrace();
	 }
	
	}

@Test(priority=3)	
public void TCED30204()
	
	{
	
	 try
		{ 	 
			
		    //calling TCED29705 tc from the Analyze Curriculum test suite
			
			ob.TCED29705();
		} 
	 
	 catch (Exception e)
	 {
		 Assert.fail(e.getMessage());
		 e.printStackTrace();
	 }
	
	}

@Test(priority=4)	
public void TCED30205()
	
	{
	
	 try
		{ 	 
			
		    //calling TCED29706 tc from the Analyze Curriculum test suite
			
			ob.TCED29706();
		} 
	 
	 catch (Exception e)
	 {
		 Assert.fail(e.getMessage());
		 e.printStackTrace();
	 }
	
	}
@Test(priority=5)	
public void TCED30206()
	
	{
	
	 try
		{ 	 
			
		    //calling TCED29707 tc from the Analyze Curriculum test suite
			
			ob.TCED29707();
		} 
	 
	 catch (Exception e)
	 {
		 Assert.fail(e.getMessage());
		 e.printStackTrace();
	 }
	
	}

@Test(priority=6)	
public void TCED30207()
	
	{
	
	 try
		{ 	 
			
		    //calling TCED29708 tc from the Analyze Curriculum test suite
			ob.TCED29708();
		} 
	 
	 catch (Exception e)
	 {
		 Assert.fail(e.getMessage());
		 e.printStackTrace();
	 }
	
	}

@Test(priority=7)	
public void TCED30208()
	
	{
	
	 try
		{ 	 
			
		    //calling TCED29709 tc from the Analyze Curriculum test suite
			ob.TCED29709();
		} 
	 
	 catch (Exception e)
	 {
		 Assert.fail(e.getMessage());
		 e.printStackTrace();
	 }
	
	}

}
