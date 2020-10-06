package com.Dashboard;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class DashboardAddAttendanceWidgets extends BaseClassOne
{	
	
	@Test(priority=1)	
	public void TCED63401()
	{	
		try 
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Hover the Home Menu 
			Actions act=new Actions(driver);
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a")).build().perform();
			
			//Click on "Dashboard" under My home
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/div/div[2]/div/a");
			
			Thread.sleep(4000);	
			
			//click on the button "Restore Default Dashboard"
			click("//*[@id='ctl00_MainContent_ctl00_btnClear']");
			Thread.sleep(4000);	
			
			//Click on the OK button in the message
			driver.switchTo().alert().accept();
			
			Thread.sleep(4000);	
			
			//Click on the "Add Widget" Button 
			click("//input[@id='ctl00_MainContent_ctl00_btnAddWidget']");
			
			Thread.sleep(2000);
			
			//Click on the Attendance from the Add widget section
			click("//span[@class='rtText'][contains(text(),'Attendance')]");
			
			Thread.sleep(2000);
			
			//Assert the Students With Multiple Absences widgets under Attendance 
			Assert.assertEquals(getText("//span[contains(text(),'Students With Multiple Absences')]"), "Students With Multiple Absences");
			
			//Assert the Truancy Alert widgets under Attendance 
			Assert.assertEquals(getText("//span[contains(text(),'Truancy Alert')]"), "Truancy Alert");	
			
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)	
	public void TCED63402()
	{	
		try 
		{
			//Application should be in the Dashboard page
			
			//Double Click on the "Students With Multiple Absences" from the Add widget section
			Actions act=new Actions(driver);
			act.doubleClick(find("//span[contains(text(),'Students With Multiple Absences')]")).build().perform();
			
			//Assert the message "Do you want to add the Students With Multiple Absences widget to your dashboard?"
			String alt=readAlertMessageText();
			Assert.assertEquals(alt, "Do you want to add the Students With Multiple Absences widget to your dashboard?");
			
			//Click on the OK button in the message
			driver.switchTo().alert().accept();
			
			Thread.sleep(5000);
			
			//Click on the Attendance from the Add widget section
			click("//span[@class='rtText'][contains(text(),'Attendance')]");
			
			//Assert that the "Students With Multiple Absences" not available in the Add widget section
			Assert.assertFalse(isElementPresent("//span[contains(text(),'Students With Multiple Absences')]"), "failed-Students With Multiple Absences available in the Add widget section");
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)	
	public void TCED63403()
	{	
		try 
		{
			//Application should be in the Dashboard page
			
			//Assert the labels  Absence Reason  
			ScrollTo_xy_position(0, 500);
			
			ScrollTo_Location("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Grade Levels'])[1]/following::h6[1]");
			
			Assert.assertEquals(getText("//td[contains(text(),'Absence Reason')]"), "Absence Reason");
						
			//Assert the labels  * Number of Absences  
			Assert.assertEquals(getText("//td[contains(text(),'Number of Absences')]"), "Number of Absences");			
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)	
	public void TCED63404()
	{	
		try 
		{
			
			ScrollTo_xy_position(0, 500);
			
			Thread.sleep(2000);	
			
			//Application should be in the Dashboard page
			//Hover the Home Menu 
			Actions act1=new Actions(driver);
			act1.moveToElement(find("//*[@d='M45.5 185.5 L 59.5 185.5 59.5 266.5 45.5 266.5Z']")).build().perform();
			
			Thread.sleep(1000);	
			
			//Mouse over on the Kindergarten Bar Chart
			String s=getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='close'])[3]/following::div[2]");
			
			//Assert that the tooltip value as 64 Students  
			Assert.assertEquals(s, "64 Students");
			
			Thread.sleep(2000);	
			
			//Click on the Kindergarten Bar Chart
			//JavaScriptclick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='End range should be greater than or Equal to Start Range!'])[1]/following::area[12]");
			Actions act=new Actions(driver);
			act.doubleClick(find("//*[@d='M45.5 185.5 L 59.5 185.5 59.5 266.5 45.5 266.5Z']")).build().perform();
			
			Thread.sleep(2000);	
			
			//Assert the header "Attendance Report"
			Assert.assertEquals(getText("//span[@class='subheading']"), "Attendance Report");
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=5)	
	public void TCED63405()
	{	
		try 
		{
			driver.navigate().back();
			Thread.sleep(3000);
			ScrollTo_Location("//td[contains(text(),'Absence Reason')]");
			//ScrollTo_xy_position(0,500);
			click("//h6[contains(text(),'Students With Multiple Absences')]//following::span[2]");
			
			Thread.sleep(4000);
			
			String alt1=readAlertMessageText();			
			Assert.assertEquals(alt1, "The Students With Multiple Absences widget has been removed from your Dashboard");
			
			//Click on the OK button in the message
			driver.switchTo().alert().accept();
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6)	
	public void TCED63406()
	{	
		try 
		{
			Thread.sleep(3000);
			
			((JavascriptExecutor)driver).executeScript("scroll(0,0)");
			//Application should be in the Attendance Report student details page
			
			Thread.sleep(3000);
			
			//Click on the Attendance from the Add widget section
			click("//span[@class='rtText'][contains(text(),'Attendance')]");
			
			//Double Click on the "Truancy Alert" from the Add widget section 
			Actions act=new Actions(driver);
			act.doubleClick(find("//span[contains(text(),'Truancy Alert')]")).build().perform();
			
			//Assert the message "Do you want to add the Truancy Alert widget to your dashboard?"
			String alt=readAlertMessageText();
			Assert.assertEquals(alt, "Do you want to add the Truancy Alert widget to your dashboard?");
			
			//Click on the OK button in the message
			driver.switchTo().alert().accept();
			
			Thread.sleep(5000);
			
			//Verify that the "Truancy" widget is present in the Dashboard
			ScrollTo_xy_position(0,500);
			
			//ScrollTo_Location("//h6[contains(text(),'Truancy Alert')]");
			Assert.assertTrue(isElementPresent("//h6[contains(text(),'Truancy Alert')]"), "failed-Truancy available in the Dashboard");
			
			((JavascriptExecutor)driver).executeScript("scroll(0,0)");
			
			//Click on the Attendance from the Add widget section
			click("//span[@class='rtText'][contains(text(),'Attendance')]");

			//Assert that the "Students With Multiple Absences" not available in the Add widget section
			Assert.assertFalse(isElementPresent("//span[contains(text(),'Truancy Alert')]"), "failed-Truancy Alert available in the Add widget section");

		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)	
	public void TCED63407()
	{	
		try 
		{
			//Application should be in the Attendance Report student details page
			
			ScrollTo_xy_position(0,500);
			
			//Assert the label Truancy Alert
			Assert.assertEquals(getText("//a[contains(text(),'Truancy Alert')]"), "Truancy Alert");
			
			//Assert the label Number of Students
			Assert.assertEquals(getText("//a[contains(text(),'Number of Students')]"), "Number of Students");
			
			//Assert the label 5 Days
			Assert.assertEquals(getText("//span[contains(text(),'5 Days')]"), "5 Days");
			
			//Assert the label 10 Days
			Assert.assertEquals(getText("//span[contains(text(),'10 Days')]"), "10 Days");
			
			//Mouse over on the '?" icon of 5 Days
			String five=find("//span[contains(text(),'5 Days')]//following::img[1]").getAttribute("title");		
			
			
			//Assert the tooltip text as "Students with 5 absences in any 30 day period of calendar days qualify for this truancy type.  Absences of the following types are considered: 
			//Unexcused"
			Assert.assertTrue(five.contains("Students with 5 absences in any 30 day period of calendar days qualify for this truancy type.  Absences of the following types"), "5 tool tip text not found ");
						
			//Mouse over on the '?" icon of 10 Days
			String ten=find("//span[contains(text(),'10 Days')]//following::img[1]").getAttribute("title");	
			Assert.assertTrue(ten.contains("Students with 10 absences in any 90 day period of calendar days qualify for this truancy type.  Absences of the following types"), "10 tool tip text not found ");
		}		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=8)	
	public void TCED63408()
	{	
		try 
		{
			//Application should be in the Dashboard page
			String link_count=getText("//span[contains(text(),'5 Days')]//following::a[1]");
			
			//Click on the link "82" against the 5 Days
			click("//span[contains(text(),'5 Days')]//following::a[1]");		
						
			//Assert the header "Truancy List"
			Assert.assertEquals(getText("//span[contains(text(),'Truancy List')]"), "Truancy List");	
			
			//Verify that the count 82 should be equal to the Student count in the "Truancy List" page
			String count=getText("//span[@id='ctl00_MainContent_lblStudentCount']").substring(15,17);
			Assert.assertEquals(count,link_count);
			
			//Assert the header "Truancy List"
			Assert.assertEquals(getText("//span[@class='subheading']"), "Truancy List");
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=9)	
	public void TCED63409()
	{	
		try 
		{
			//Application should be in the "Truancy List" page
			
			driver.navigate().back();
			
			Thread.sleep(3000);			
			ScrollTo_xy_position(0,500);
			
			//Click on the close button of "Truancy" widget
			click("//h6[contains(text(),'Truancy Alert')]//following::span[2]");
			//click("//div[@id='ctl00_MainContent_ctl00_RadDock47acf22fa7bd0a435aabdc7a38df6b323de0_T']//span[@class='rdCommandButton rdClose']");
			
			Thread.sleep(2000);			
			
			//Assert the message "The Truancy Alert widget has been removed from your Dashboard"			
			String alt1=readAlertMessageText();			
			Assert.assertEquals(alt1, "The Truancy Alert widget has been removed from your Dashboard");
			
			//Click on the OK button in the message
			driver.switchTo().alert().accept();		
			
			Thread.sleep(4000);
			
			//Verify that the "The Truancy Alert" widget is not present in the Dashboard
			Assert.assertFalse(isElementPresent("//div[@id='ctl00_MainContent_ctl00_RadDock1a226a1ba2868a409aab332aabd8a3624075']//div[@class='rdTitleWrapper']"), "failed-Truancy Alert available in the Dashboard");
			
			//Click on the Attendance from the Add widget section
			click("//span[@class='rtText'][contains(text(),'Attendance')]");
			
			//Assert the Truancy Alert widgets under Attendance 
			Assert.assertEquals(getText("//span[contains(text(),'Truancy Alert')]"), "Truancy Alert");	
		} 		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

}
