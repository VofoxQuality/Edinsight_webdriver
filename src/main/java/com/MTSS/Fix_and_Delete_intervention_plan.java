package com.MTSS;
import java.awt.AWTException;
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

	public void TCED19807() throws InterruptedException
	{
		
		try 
		
		{
			
			//storing student score,expectation level,group average 
			String std_score="60";			
			String std_score1="50";			
			String std_score2="40";
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);		
			Thread.sleep(2000);	
			
			//hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();			
					
			//click Tier / Intervention link		
			click("//a[contains(text(),'Tier / Intervention')]");
			
			//click Fix & Delete Intervention Plans  link		
			click("//a[contains(text(),'Fix & Delete Intervention Plans')]");
			
			//click Intervention search button		
			click("input#ctl00_MainContent_btnSearch.button");	
			
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector("input#ctl00_MainContent_rgSearch_ctl00_ctl04_btnDelete.button")));	
			
			js.executeScript("window.scrollBy(0, -250)", "");
			
			//click Intervention tracking button	
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl04_btnTrackingForm.button");
			
			driver.switchTo().frame("RadWindow1");			
									
			
			click("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rdTrackingDate_dateInput");
			
			//scroll down to the bottom of the popup
					
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			//select date from the calendar
			
			List<WebElement> allDates=driver.findElements(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rdTrackingDate_calendar_Top']//td"));
			
			for(WebElement ele:allDates)
			{
				
				String date=ele.getText();
				if(date.equalsIgnoreCase("25"))
				{
									
					Thread.sleep(2000);				
					ele.click();
					break;
				}
				
			}	
			
			
				
			Thread.sleep(3000);
			
			type("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rtxtStudentScore",std_score);
			
			type("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rtxtStudentGoal",std_score1);
			
			type("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_rtxtGroupAverage",std_score2);
			
			click("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl03_ctl01_PerformInsertButton");
			
			String input_date="8/25/2018";
			
			String date=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00']//tr[4]/td[3]//span[1]")).getText();	
			
			//asserting input date
			
			Assert.assertEquals(date, input_date);		
			
			String save_std_score=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00']//tbody[1]//tr[4]/td[4]//span[1]")).getText();
												
			String save_std_score1=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00']//tbody[1]//tr[4]/td[5]//span[1]")).getText();
			
			String save_std_score2=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_rgData_ctl00']//tbody[1]//tr[4]/td[6]//span[1]")).getText();
			
			//asserting entered values
			
			Assert.assertEquals(save_std_score,std_score);	
			Assert.assertEquals(save_std_score1,std_score1);
			Assert.assertEquals(save_std_score2,std_score2);			
			
			//delete entered record.
			
			click("input#ctl00_ContentPlaceHolder1_rgData_ctl00_ctl07_gbcDeleteColumn");
			driver.switchTo().alert().accept();
		} 
		
		catch (Exception e) 		
		{
			
			e.printStackTrace();
		}		
			
	}
	

  @Test(priority=2)
	
	public void TCED19808() throws InterruptedException, AWTException
	
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
	
	@Test(priority=3)
	
	public void TCED19809() throws InterruptedException
	
	{
			
		try 
		   {
			driver.navigate().to("http://192.168.10.124/Edinsight/Form/RTI/FixInterventionPlans.aspx?args=fPCcek9X3JyzRdS9nDE+7KD3NBSoLWFnR+sq1TMwYPs=");
			//click Intervention tracking button		
			click("input#ctl00_MainContent_btnSearch.button");	
			
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl08_btnEditPlan.button");
			
			driver.switchTo().frame("RadWindow1");
			
			click("//*[@id='ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_Input']");
			
			List<WebElement> drp=driver.findElements(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_DropDown']/div/ul//li"));

			for (WebElement ele : drp)
 
			   {
 
			      //for every elements it will print the name using innerHTML 
			     // System.out.println("Values " + ele.getAttribute("innerHTML"));  
			    // Here we will verify if link (item) is equal to Java Script
 
			      if (ele.getAttribute("innerHTML").contains("Study Island")) {
 
			         // if yes then click on link (item) 
			         ele.click();
 
			         // break the loop or come out of loop
 
			         break;
 
			     }
 
			   }
			
			
			
					
			
            driver.switchTo().defaultContent();
            
            JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,400)");
			
			driver.switchTo().frame("RadWindow1");
			
			js.executeScript("scroll(0, document.body.scrollHeight)");
			
			click("input#ctl00_ContentPlaceHolder1_btnSaveContinue.button");
			
			//asserting the current value in the dropdown is study island			
			
	        Assert.assertTrue(driver.findElement(By.cssSelector("input#ctl00_ContentPlaceHolder1_rcmbMeasureAssmnt_Input")).getAttribute("value").contains("Study Island"));
									

		} 
		
		catch (Exception e) 
		
		{
			
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}	
				
			
		
	}
	
@Test(priority=4)
	
	public void TCED19812() throws InterruptedException
	
	{
		try 
		
		  {
			driver.navigate().to("http://192.168.10.124/Edinsight/Form/RTI/FixInterventionPlans.aspx?args=fPCcek9X3JyzRdS9nDE+7KD3NBSoLWFnR+sq1TMwYPs=");
			//click Intervention tracking button		
			click("input#ctl00_MainContent_btnSearch.button");	
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
						
			js.executeScript("scroll(document.body.scrollHeight,document.body.scrollHeight)");	
			
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl98_btnDelete.button");
			
			String msg=driver.switchTo().alert().getText();
			
			//assert text in the alert pop up
			
			Assert.assertEquals(msg,"Are you sure you want to permanently delete this intervention plan and all tracking data associated with it?");
			
			driver.switchTo().alert().accept();
			
			//asserting the text Fix/Delete Intervention Plans
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td")).getText().contains("Fix/Delete Intervention Plans"));
		} 
		
		catch (Exception e) 
		{
			
			e.printStackTrace();			
			Assert.fail(e.getMessage());
		}
		
	}
}
