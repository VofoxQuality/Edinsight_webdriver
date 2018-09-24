package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Batch_Print extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED28101()
	
	{
		
		try 
		
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
					
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();
			
			//Click on Batch Print		
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[4]/div/a");
			
			//Assert the label "Batch Print"
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td")).getText().contains("Batch Print"));
		}
		
		catch (Exception e) 
		
		{
			
			e.printStackTrace();			
			Assert.fail(e.getMessage());
		}
				
	}
	
@Test(priority=1)
	
	public void TCED28102()
	
	{
		try 
		
		{
			driver.navigate().refresh();
			
			//Assert the Label "School Type"		
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/b")).getText().contains("School Type"));
			
			//Assert the Label "School/Building"		
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[1]/b")).getText().contains("School/Building"));
			
			//Assert the Label "1. Select the teacher(s) whose lesson plans you wish to print"
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_tblContent']/tbody/tr/td[1]/table/tbody/tr[1]/td/b")).getText().contains("1. Select the teacher(s) whose lesson plans you wish to print."));
		
			//Assert the Label "2. Select the date range for when the lessons are being taught."
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_tblContent']/tbody/tr/td[2]/table/tbody/tr[1]/td/b")).getText().contains("2. Select the date range for when the lessons are being taught."),"failed to assert text"+"2. Select the date range for when the lessons are being taught.");
			
			//Assert the Label "Today"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rblDateRange']/tbody/tr[1]/td/label")).getText().contains("Today"),"failed to assert text"+"Today");
					
			//Assert the Label "Tomorrow'
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rblDateRange']/tbody/tr[2]/td/label")).getText().contains("Tomorrow"),"failed to assert text"+"Tomorrow");
									
			//Assert the Label "This Week"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rblDateRange']/tbody/tr[3]/td/label")).getText().contains("This Week"),"failed to assert text"+"This Week");
			
			//Assert the Label "Next Week"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rblDateRange']/tbody/tr[4]/td/label")).getText().contains("Next Week"),"failed to assert text"+"Next Week");
			
			
			//Assert the Label "Custom Date Range"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rblDateRange']/tbody/tr[5]/td/label")).getText().contains("Custom Date Range"),"failed to assert text"+"Custom Date Range");
			
			
			//Assert the Label "3. Select Periods to Print."
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_tblContent']/tbody/tr/td[2]/table/tbody/tr[5]/td/b")).getText().contains("3. Select Periods to Print"),"failed to assert text"+"3. Select Periods to Print");
			
           //Assert the Label "Select periods to print"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlPrintPeriod']/label")).getText().contains("Select periods to print"),"failed to assert text"+"Select periods to print");
			
           //Assert the Label "4. Specify print options."
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_tblContent']/tbody/tr/td[2]/table/tbody/tr[9]/td/b")).getText().contains("4. Specify print options."),"failed to assert text"+"4. Specify print options.");
			
						
           //Assert the Label "Sort by teacher, then date"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rblSortType']/tbody/tr[1]/td/label")).getText().contains("Sort by teacher, then date"),"failed to assert text"+"Sort by teacher, then date");
			
           //Assert the Label "Sort by date, then teacher"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rblSortType']/tbody/tr[2]/td/label")).getText().contains("Sort by date, then teacher"),"failed to assert text"+"Sort by date, then teacher");
			
           //Assert the Label "Put a divider sheet between days"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_cblDividerType']/tbody/tr[1]/td/label")).getText().contains("Put a divider sheet between days"),"failed to assert text"+"Put a divider sheet between days");
			
			
           //Assert the Label "Put a divider sheet between teachers"
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_cblDividerType']/tbody/tr[2]/td/label")).getText().contains("Put a divider sheet between teachers"),"failed to assert text"+"Put a divider sheet between teachers");
		} 
		
		catch (Exception e)
		
		{
		    e.printStackTrace();			
			Assert.fail(e.getMessage());
		}
	}
	
@Test(priority=2)
	
	public void TCED28103() 
	
	{
		try
		
		{
			driver.navigate().refresh();
			
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("scroll(0,document.body.scrollHeight)");			
			
			if(isAlertPresents())
			{			
			driver.switchTo().alert().dismiss();	
			}
			
			//Click on "Click Here to Dowload Lesson plans" 
			
			click("//*[@id='ctl00_MainContent_btnDownloadPDF']");
			
			//Click on Print PDF
			
			click("//*[@id='ctl00_MainContent_linkPdf']");
			
			System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_lblMsg']")).getText());
			
			//Assert the message "You must select at least one teacher."
				
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_lblMsg']")).getText().contains("You must select at least one teacher"));
			
			//Assert the message "You must select at least one Period."
			
			//Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_lblMsg']")).getText().contains("You must select at least one Period"));
			
			js.executeScript("scroll(0,document.body.scrollHeight)");
			
			//Click on "Click Here to Dowload Lesson plans" 
			
            click("//*[@id='ctl00_MainContent_btnDownloadPDF']");
            
          //Click on Print word
			
			click("//*[@id='ctl00_MainContent_linkWord']");		
			
			//Assert the message "You must select at least one teacher."
			
            Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_lblMsg']")).getText().contains("You must select at least one teacher"));
            
            //Assert the message "You must select at least one Period."
			
			//Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_lblMsg']")).getText().contains("You must select at least one Period"));            
           
			
		} 
		
		catch (Exception e)
		{
			
			e.printStackTrace();
		    Assert.fail(e.getMessage());

			
		}
		

	}
	
@Test(priority=3)
	
	public void TCED28104()	
	{
		try 
		{			

			driver.navigate().refresh();
			
			Thread.sleep(6000);		
										
			
			if(isAlertPresents())
			{			
			driver.switchTo().alert().dismiss();	
			}
			
			//select Teacher = Ableton, A - 10
			
			click("//*[@id='ctl00_MainContent_cblTeachers_0']");			
		
			FileDelete();
			
			//Click on "Click Here to Dowload Lesson plans" 
			
			click("//*[@id='ctl00_MainContent_btnDownloadPDF']");	
			
			//click on Print PDF
			
			click("//*[@id='ctl00_MainContent_linkPdf']");			
			
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//Click on "Click Here to Dowload Lesson plans" 
            click("//*[@id='ctl00_MainContent_btnDownloadPDF']");
            
            FileDelete();
            
            ////click on Print Word
			
			click("//*[@id='ctl00_MainContent_linkWord']");					
			
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
			
		} 	
				
		catch (Exception e) 
		{
					
						
			e.printStackTrace();			
			Assert.fail(e.getMessage());
		}
						
	}
@Test(priority=4)
	
public void TCED28105()
	{
	
		try 
		{
			
			
			driver.navigate().refresh(); 
			
   		    Thread.sleep(2000);
   		    
   			if(isAlertPresents())
			{			
			driver.switchTo().alert().dismiss();	
			}
   			
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
