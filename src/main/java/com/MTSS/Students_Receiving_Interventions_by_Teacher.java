package com.MTSS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Students_Receiving_Interventions_by_Teacher extends BaseClassOne

{
	@Test(priority=1)
	public void TCED221201()
	{
		try
		  {
			  //Superintent Login
			  login(Supertent_Login_id,Supertent_Login_Password);
			  
			  //hover over MTTS link			
			   Actions actions = new Actions(driver);
			   WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			   actions.moveToElement(mouseHover).build().perform();
			   
			   // Click Students Receiving Interventions by Teacher
			   click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/div/div[17]/div/a");
			   
			   //Assert the Heading "Tiered Students by Teacher Report"
			   Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblHeading']"),"Tiered Students by Teacher Report");
		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=2)
	public void TCED221202()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report Param page
			
			//Assert the Labels "School Type"
			Assert.assertEquals(getText("//td[contains(text(),'School Type')]"),"School Type");
			
			//Assert the Labels "Building"
			Assert.assertEquals(getText("//td[contains(text(),'Building')]"),"Building");
			
			//Assert the Labels "Area of Need"
			Assert.assertEquals(getText("//td[contains(text(),'Area of Need')]"),"Area of Need");
			
			//Assert the Labels "Course Subjects"
			Assert.assertEquals(getText("//td[contains(text(),'Course Subjects')]"),"Course Subjects");

		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=3)
	public void TCED221203()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report Param page
			
			//Click on Run Report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the message "You must select at least one Area of Need"
			Assert.assertTrue(getText("//span[@id='ctl00_MainContent_lblErrorMessages']").contains("You must select at least one Area of Need"),"falied to assert-You must select at least one Area of Need");
			
			//Assert the message "You must select at least one Subject"
			Assert.assertTrue(getText("//span[@id='ctl00_MainContent_lblErrorMessages']").contains("You must select at least one Subject"),"falied to assert-You must select at least one Subject");

		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=4)
	public void TCED221204()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report Param page
			
			//Select Area of Need= All
			click("//*[@id='ctl00_MainContent_rcmbAreaOfNeed_Arrow']");
			click("//*[@id='ctl00_MainContent_rcmbAreaOfNeed_DropDown']/div/div/label/input");
			click("//*[@id='ctl00_MainContent_rcmbAreaOfNeed_Arrow']");
			
			Thread.sleep(2000);
			
			//Select Course Subjects = All
			click("//*[@id='ctl00_MainContent_rcmbSubjects_Arrow']");
			click("//*[@id='ctl00_MainContent_rcmbSubjects_DropDown']/div/div/label/input");
			click("//*[@id='ctl00_MainContent_rcmbSubjects_Arrow']");
			
			Thread.sleep(2000);
			click("//td[contains(text(),'Course Subjects')]");
			
			//Click on Run Report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the label "Tiered Students by Teacher Report"
			Assert.assertEquals(getText("//span[@class='subheading']"),"Tiered Students by Teacher Report");		
			
		  } 
		  catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=5)
	public void TCED221205()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report  page
			
			//Assert the Labels "School Type"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblSchoolType']"),"SchoolType");
			
			//Assert the Labels "Building"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblBuilding']"),"Building");
			
			//Assert the Labels "Area of Need"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblAreaOfNeed']"),"Area of Need");
			
			//Assert the Labels "Course Subjects"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblSubjects']"),"Course Subject(s)");
		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=6)
	public void TCED221206()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report  page
			
			//Assert the label "Staff Name
			Assert.assertEquals(getText("//th[contains(text(),'Staff Name')]"),"Staff Name");
			
			//Assert the label "Provider Name"
			Assert.assertEquals(getText("//a[contains(text(),'Provider Name')]"),"Provider Name");
			
			//Assert the label "Total Number of Tiered Students"
			Assert.assertEquals(getText("//a[contains(text(),'Total Number of Tiered Students')]"),"Total Number of Tiered Students");
		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=7)
	public void TCED221207()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report  page
			
			FileDelete();
			
            //Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
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
	@Test(priority=8)
	public void TCED221208()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report  page
			
			//Select Some Student
			click("//*[@id='ctl00_MainContent_rgTieredStudentsDetaildGrid_ctl00_ctl04_GECBtnExpandColumn']/span");
			click("//*[@id='ctl00_MainContent_rgTieredStudentsDetaildGrid_ctl00_ctl06_Detail10_ctl04_chkSelectUserSelectCheckBox']");
			click("//*[@id='ctl00_MainContent_rgTieredStudentsDetaildGrid_ctl00_ctl06_Detail10_ctl06_chkSelectUserSelectCheckBox']");		
			
			//Click on  Add Selected Student to Group button
			click("//input[@id='ctl00_MainContent_btnAddToGroup']");
			
			 //Assert the label  Add Students to Group
			 driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			 Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			 
			 //Assert the label  Create New Group
			 Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");
			 
			 //Click on Close button
			 driver.switchTo().parentFrame();			 
			 click("//*[@id='RadWindowWrapper_ctl00_MainContent_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");
			 
			 //Assert the Heading "Tiered Students by Teacher Report"
			 Assert.assertEquals(getText("//span[@class='subheading']"),"Tiered Students by Teacher Report");
		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=9)
	public void TCED221209()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report  page
			
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
			 
			 //Assert the Heading "Tiered Students by Teacher Report"
			 Assert.assertEquals(getText("//span[@class='subheading']"),"Tiered Students by Teacher Report");
		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=10)
	public void TCED221210()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report  page
			
			// Click on Add report to favorite button
			 click("//*[@id='ctl00_MainContent_btnAddToFavorite']");
			 
			 //Assert the Heading "Tiered Students by Teacher Report"
			 Assert.assertEquals(getText("//span[@class='subheading']"),"Tiered Students by Teacher Report");
		  } 
		catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
	@Test(priority=11)
	public void TCED221211()
	{
		try
		  {
			//Application should be in the Tiered Students by Teacher Report  page
			
			FileDelete();
			 
			//Click on Export to PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			 
			 Thread.sleep(7000);	
			 
			//Assert the extension of the downloaded file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		  } 
		  catch (Exception e)
		  {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		  }
	}
}
