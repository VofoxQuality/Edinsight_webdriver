package com.Dashboard;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class DashboardAddKeystoneExamsWidgets extends BaseClassOne
{
	@Test(priority=1)	
	public void TCED63601()
	{	
		try   
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			click("//input[@id='ctl00_MainContent_ctl00_btnClear']");
			
			driver.switchTo().alert().accept();
			
			//Click on the "Add Widget" Button 
			Thread.sleep(3000);
			click("//input[@id='ctl00_MainContent_ctl00_btnAddWidget']");
			
			Thread.sleep(3000);
			
			//Click on the Assessments from the Add widget section 
			click("//span[@class='rtText'][contains(text(),'Assessments')]");
			
			//Click on Keystone Exams
			click("//span[contains(text(),'Keystone Exams')]");
			
			//Assert the  Keystone Anchor Breakdown widgets under  Keystone Exams 
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_ctl00_RadTreeView1']/ul/li[3]/ul/li[2]/ul/li/div/div/span"),"Keystone Anchor Breakdown");	
			
			//Assert the label Algebra1 Keystone Single Test Chart
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_ctl00_RadTreeView1']/ul/li[3]/ul/li[2]/ul/li[2]/div/div/span"),"Algebra 1 Keystone Single Test Chart");
			
			//Assert the label Biology Keystone Single Test Chart
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_ctl00_RadTreeView1']/ul/li[3]/ul/li[2]/ul/li[3]/div/div/span"),"Biology Keystone Single Test Chart");
			
			//Assert the label Literature Keystone Single Test Chart
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_ctl00_RadTreeView1']/ul/li[3]/ul/li[2]/ul/li[4]/div/div/span"),"Literature Keystone Single Test Chart");
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)	
	public void TCED63602()
	{	
		try 
		{
			//Application should be in the Dashboard page
			Thread.sleep(3000);
			
			//Double Click on the "Keystone Anchor Breakdown" from the Add widget section of Keystone Exams
			Actions act=new Actions(driver);
			act.moveToElement(find("//span[contains(text(),'Keystone Anchor Breakdown')]")).doubleClick().build().perform();		
			
			//Assert the message Do you want to add the Keystone Anchor Breakdown widget to your dashboard?"
			String alt=readAlertMessageText();
			Assert.assertEquals(alt, "Do you want to add the Keystone Anchor Breakdown widget to your dashboard?");
			
			//Click on the OK button in the message
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			
			//Verify that the "Keystone Anchor Breakdown" widget is present in the Dashboard
			ScrollTo_xy_position(0,500);
			Assert.assertTrue(isElementPresent("//h6[contains(text(),'Keystone Anchor Breakdown')]"));
			
			//Click on the Assessments from the Add widget section 
			click("//span[@class='rtText'][contains(text(),'Assessments')]");
			
			//Click on Keystone Exams
			click("//span[contains(text(),'Keystone Exams')]");
			
			//Verify that the "Keystone Anchor Breakdown" not available in the Add widget Assessment/Keystone Exams section
			Assert.assertFalse(isElementPresent("//span[contains(text(),'Keystone Anchor Breakdown')]"),"hi");		
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)	
	public void TCED63603()
	{	
		try 
		{
			//Application should be in the Dashboard page
			
			//Assert the label Testing Year
			Assert.assertEquals(getText("//td[contains(text(),'Testing Year :')]"), "Testing Year :");
			
			//Assert the label Testing Period 
			Assert.assertEquals(getText("//td[contains(text(),'Testing Period :')]"), "Testing Period :");
			
			//Assert the View
			Assert.assertEquals(getText("//td[contains(text(),'View :')]"), "View :");
			
			//Assert the labeGrid Headings Anchor Code
			Assert.assertEquals(getText("//td[contains(text(),'Anchor Code')]"),"Anchor Code");
			
			//Assert the label perf
			Assert.assertEquals(getText("//td[contains(text(),'Anchor Code')]//following::td[1]"),"Perf");
			
			//Assert the label 	Target Perf
			Assert.assertEquals(getText("//td[contains(text(),'Target Perf')]"),"Target Perf");
			
			//Assert the label Distance From Target
			Assert.assertEquals(getText("//td[contains(text(),'Distance From Target')]"),"Distance From Target");
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)	
	public void TCED63604()
	{	
		try 
		{
			//Application should be in the Dashboard page
			//String parent=driver.getWindowHandle();
			//Click on the Anchor Code "A1.1.1"	
			click("//a[@title='Operations with Real Numbers and Expressions']");

			
			String parentWindow = driver.getWindowHandle();
			Set<String> handles =  driver.getWindowHandles();
			   for(String windowHandle  : handles)
			       {
			       if(!windowHandle.equals(parentWindow))
			          {
			          driver.switchTo().window(windowHandle);
			        // <!--Perform your operation here for new window-->

			          Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StateStandardDisplay1_Label1']"), "Teaching Aids for Standard Code1");
			          
			         driver.close(); //closing child window
			         driver.switchTo().window(parentWindow); //cntrl to parent window
			          }
			       }
			
			//verify the switching is success or not
			Assert.assertTrue(isElementPresent("//h6[contains(text(),'Keystone Anchor Breakdown')]"));

		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=5)	
	public void TCED63605()
	{	
		try 
		{
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a")).build().perform();

			//Click on the home button
			click("//a[contains(text(),'Dashboard')]");
			
			
			//click on the view full report
			click("//a[contains(text(),'View Full Report')]");
			
		
			
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(2));
			
			Thread.sleep(5000);
			
			Assert.assertEquals(driver.getTitle(), "Keystone Exam Anchor Report");
			
			Thread.sleep(2000);
			
			driver.close(); 
			
			driver.switchTo().window(tabs.get(0));
			//verify the switching is success or not
			Assert.assertTrue(isElementPresent("//h6[contains(text(),'Keystone Anchor Breakdown')]"));
			
				
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6,enabled=true)	
	public void TCED63606()
	{	
		try 
		{
			driver.switchTo().defaultContent();
			
			//Click on the close button
			click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Keystone Anchor Breakdown'])[1]/following::span[2]");
			
			Thread.sleep(5000);
			
			Alert alert = driver.switchTo().alert();
			
			Assert.assertEquals(alert.getText(), "The Keystone Anchor Breakdown widget has been removed from your Dashboard");
			
			//click on the ok button
			alert.accept();
			
			driver.switchTo().defaultContent();
			
			//Verify the Keystone Anchor Breakdown is removed from the page
			Assert.assertTrue(exists("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Testing Year :'])[1]/preceding::h6[1]"));
			
			//Click on the "Add Widget" Button 
			Thread.sleep(3000);
			click("//input[@id='ctl00_MainContent_ctl00_btnAddWidget']");
			
			//Click on the Assessments from the Add widget section 
			click("//span[@class='rtText'][contains(text(),'Assessments')]");
			
			//Click on Keystone Exams
			click("//span[contains(text(),'Keystone Exams')]");
			
			//Assert the  Keystone Anchor Breakdown widgets under  Keystone Exams 
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_ctl00_RadTreeView1']/ul/li[3]/ul/li[2]/ul/li/div/div/span"),"Keystone Anchor Breakdown");	
			
				
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)	
	public void TCED63607()
	{	
		try 
		{
			//Application should be in the Dashboard page
			
			//Double Click on the "Algebra1 Keystone Single Test Chart" from the Add widget section
			
			Actions act=new Actions(driver);
			act.moveToElement(find("//div[@id='ctl00_MainContent_ctl00_RadTreeView1']/ul/li[3]/ul/li[2]/ul/li[2]/div/div/span")).doubleClick().build().perform();
			
			
			
			String alt=readAlertMessageText();
			Assert.assertEquals(alt, "Do you want to add the Algebra 1 Keystone  Single Test Chart widget to your dashboard?");
			
			//Click on the OK button in the message
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			
			//Verify that the "Keystone Anchor Breakdown" widget is present in the Dashboard
			ScrollTo_xy_position(0,500);
			Assert.assertEquals(getText("//td[2]/div/div/div/div/h6"), "Algebra 1 Keystone Single Test Chart");
			
			//Click on the Assessments from the Add widget section 
			click("//span[@class='rtText'][contains(text(),'Assessments')]");
			
			//Click on Keystone Exams
			click("//span[contains(text(),'Keystone Exams')]");
			
			//Verify that the "Keystone Anchor Breakdown" not available in the Add widget Assessment/Keystone Exams section
			Assert.assertFalse(isElementPresent("//span[contains(text(),'Algebra1 Keystone Single Test Chart')]"),"hi");
			
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=8)	
	public void TCED63608()
	{	
		try 
		{
			//Verify that the "Keystone Anchor Breakdown" not available in the Add widget Assessment/Keystone Exams section
			Assert.assertEquals(getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Testing Period:'])[1]/preceding::td[2]"),"Year:");
			
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
		@Test(priority=9)	
		public void TCED63609()
		{	
			try 
			{
			
				//Click on the close button
				click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='All'])[3]/following::span[2]");
				
				Thread.sleep(5000);
				
				Alert alert = driver.switchTo().alert();
				
				Assert.assertEquals(alert.getText(), "The Algebra 1 Keystone  Single Test Chart widget has been removed from your Dashboard");
				
				//click on the ok button
				alert.accept();
				
				driver.switchTo().defaultContent();
				
				//Verify the Algebra 1 Keystone  Single Test Chart is removed from the page
				Assert.assertTrue(exists("xpath=(.//*[normalize-space(text()) and normalize-space(.)='All'])[4]/following::h6[1]"));
				
				//hover over MTTS link			
				Actions actions = new Actions(driver);
				WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
				actions.moveToElement(mouseHover).build().perform();
				
				//click Tier / Intervention link		
				click("//a[contains(text(),'Tier / Intervention')]");
				
				//hover over report link			
				Actions act3=new Actions(driver);					
				act3.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a")).build().perform();
				
				Actions actions1 = new Actions(driver);
				WebElement mouseHover1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"));
				actions1.moveToElement(mouseHover1).build().perform();

				//Click on the home button
				click("//a[contains(text(),'Dashboard')]");
				
				//Click on the "Add Widget" Button 
				Thread.sleep(10000);
				click("//input[@id='ctl00_MainContent_ctl00_btnAddWidget']");
				
				//Click on the Assessments from the Add widget section 
				click("//span[@class='rtText'][contains(text(),'Assessments')]");
				
				//Click on Keystone Exams
				click("//span[contains(text(),'Keystone Exams')]");
				
				//Assert the  Keystone Anchor Breakdown widgets under  Keystone Exams 
				Assert.assertEquals(getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Keystone Anchor Breakdown'])[1]/following::span[1]"),"Algebra 1 Keystone Single Test Chart");	
			} 		
			catch (Exception e) 
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}
	}

		//@Test(priority=10)	
		public void TCED63610()
		{	
			try 
			{
				

				Actions act=new Actions(driver);
				act.moveToElement(find("//div[@id='ctl00_MainContent_ctl00_RadTreeView1']/ul/li[3]/ul/li[2]/ul/li[3]/div/div/span")).doubleClick().build().perform();
				
				
				
				String alt=readAlertMessageText();
				Assert.assertEquals(alt, "Do you want to add the Biology Keystone  Single Test Chart widget to your dashboard?");
				
				//Click on the OK button in the message
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
				
				//Verify that the "Keystone Anchor Breakdown" widget is present in the Dashboard
				ScrollTo_xy_position(0,500);
				Assert.assertEquals(getText("//td[2]/div/div/div/div/h6"), "Algebra 1 Keystone Single Test Chart");
				Thread.sleep(5000);
				
				driver.switchTo().defaultContent();
				
				//hover over MTTS link			
				Actions actions = new Actions(driver);
				WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
				actions.moveToElement(mouseHover).build().perform();
				
				//click Tier / Intervention link		
				click("//a[contains(text(),'Tier / Intervention')]");
				
				//hover over report link			
				Actions act3=new Actions(driver);					
				act3.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a")).build().perform();
				
				Actions actions1 = new Actions(driver);
				WebElement mouseHover1 = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"));
				actions1.moveToElement(mouseHover1).build().perform();

				//Click on the home button
				click("//a[contains(text(),'Dashboard')]");
				
				Thread.sleep(5000);
				//Click on the Hide widgents
				click("//*[@id='ctl00_MainContent_ctl00_btnAddWidget']");
				
				Thread.sleep(5000);
				click("//*[@id='ctl00_MainContent_ctl00_btnAddWidget']");
				
				//Click on the Assessments
				click("//span[@class='rtText'][contains(text(),'Assessments')]");
				
				//Click on Keystone Exams
				click("//span[contains(text(),'Keystone Exams')]");
				
				//Verify that the "Keystone Anchor Breakdown" not available in the Add widget Assessment/Keystone Exams section
				Assert.assertFalse(isElementPresent("//span[contains(text(),'Algebra1 Keystone Single Test Chart')]"),"hi");
				
			} 		
			catch (Exception e) 
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}
	}
}


