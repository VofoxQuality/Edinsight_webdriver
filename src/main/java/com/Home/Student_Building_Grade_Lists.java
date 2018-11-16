package com.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Student_Building_Grade_Lists extends BaseClassOne

{
	@Test(priority=1)
	public void TCED33201()
	{
		try
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			//Click on  Student Building/Grade lists 
			click("//a[contains(text(),'Student Building/Grade Lists')]");
			
			//Assert the Heading "Student Building/Grade lists"
			Assert.assertEquals(getText("//td[@class='subheading']"),"Student Building/Grade lists");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=2)
	public void TCED33202()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			
		    //Assert the Labels:-List Students By Building/Grade
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbSearchByBuilding']"),"List Students By Building/Grade");
			
			//Assert the Labels:-School Type 
			Assert.assertEquals(getText("//td[contains(text(),'School Type')]"),"School Type");
			
			//Assert the Labels:-Education Provider 
			Assert.assertEquals(getText("//td[contains(text(),'Education Provider')]"),"Education Provider");
			
			//Assert the Labels:-Grade Level 
			Assert.assertEquals(getText("//td[contains(text(),'Grade Level')]"),"Grade Level");
			
			//Assert the Labels:-Current Subgroup(s) 
			Assert.assertEquals(getText("//td[contains(text(),'Current Subgroup(s)')]"),"Current Subgroup(s)");
			
			//Assert the Labels:-Gender 
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_0']"),"Gender");
			
			//Assert the Labels:-Ethnicity
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_1']"),"Ethnicity");
			
			//Assert the Labels:-ELL
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_2']"),"ELL");
			
			//Assert the Labels:-IEP 
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_3']"),"IEP");
			
			//Assert the Labels:-Gifted 
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_4']"),"Gifted");
			
			//Assert the Labels:-Econ. Disadvantaged
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_5']"),"Econ. Disadvantaged");
			
			//Assert the Labels:-Title1 
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_6']"),"Title1");
			
			//Assert the Labels:-Title3 
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_7']"),"Title3");
			
			//Assert the Labels:-Medical Issue
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_8']"),"Medical Issue");
			
			//Assert the Labels:-Migrant 
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_9']"),"Migrant");
			
			//Assert the Labels:-504
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_10']"),"504");
			
			//Assert the Labels:-MTSS Tiered 
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl00_chkLstSubgroups_11']"),"MTSS Tiered");
			
			//Assert the Labels:-List Students By Student Groups
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rbSearchByGroup']"),"List Students By Student Groups");
			
			//Assert the Labels:-Student Group 
			Assert.assertEquals(getText("//td[contains(text(),'Student Group :')]"),"Student Group :");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=3)
	public void TCED33203()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			
		   //select Education Provider : Ashley school
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=Ashley High School");
			
		  //selct Grade Level  : Ninth Grade
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","label=Ninth Grade");
			
		 //Current Subgroup(s) : Gender, Ethinicity,ELL
		   click("//input[@id='ctl00_MainContent_ctl00_chkLstSubgroups_0']");
		   click("//input[@id='ctl00_MainContent_ctl00_chkLstSubgroups_1']");
		   click("//input[@id='ctl00_MainContent_ctl00_chkLstSubgroups_2']");
		   
		  //Click on Get List
		   click("//input[@id='ctl00_MainContent_btnGetList']");
		   
		  //Assert the label "Student Count"
		   String Std=getText("//span[@id='ctl00_MainContent_lblIncidentCount']");		  
		   String []word=Std.split(" ",3); 		   
		   Assert.assertEquals(word[0]+" "+word[1],"Student Count:");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=4)
	public void TCED33204()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,100)");
			
			//Assert the Labels:-Student ID 
			Assert.assertEquals(getText("//th[contains(text(),'Student ID')]"),"Student ID");
			
			//Assert the Labels:-State Student ID 
			Assert.assertEquals(getText("//a[contains(text(),'State Student ID')]"),"State Student ID");
			
			//Assert the Labels:-Last Name 
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the Labels:-First Name 
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
			
			//Assert the Labels:-Current Grade 
			Assert.assertEquals(getText("//a[contains(text(),'Current Grade')]"),"Current Grade");
			
			//Assert the Labels:-Provider Name  
			Assert.assertEquals(getText("//a[contains(text(),'Provider Name')]"),"Provider Name");
			
			//Assert the Labels:-Gender 
			Assert.assertEquals(getText("//a[contains(text(),'Gender')]"),"Gender");
			
			//Assert the Labels:-Ethnicity 
			Assert.assertEquals(getText("//a[contains(text(),'Ethnicity')]"),"Ethnicity");
			
			//Assert the Labels:-IEP
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'IEP')]"),"IEP");
			
			//Assert the Labels:-ELL
			Assert.assertEquals(getText("//a[contains(text(),'ELL')]"),"ELL");
			
			//Assert the Labels:-MTSS Tiered
			Assert.assertEquals(getText("//a[contains(text(),'MTSS Tiered')]"),"MTSS Tiered");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=5)
	public void TCED33205()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			FileDelete();
			
			//Click on  Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
			//Assert the csv generated		
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".CSV"), "Failed to download document which has extension .CSV");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=6)
	public void TCED33206()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			FileDelete();
			
			//Click on  Export to PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf']");
			
			//Assert the PDF generated		
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=7)
	public void TCED33207()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			
		   //Select Some Student 
		   click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl04_chkSelectUserSelectCheckBox']");
		   click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl06_chkSelectUserSelectCheckBox']");
		   
		   // Click on  Add Selected Student to Group button
		   click("//input[@id='ctl00_MainContent_btnSelectToGroup']");
		   
		   driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
		   
		   //Assert the label  Add Students to Group
		   Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
		   
		   //Assert the label  Create New Group
		   Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");
		   
		   driver.switchTo().parentFrame();
		   click("//*[@id='RadWindowWrapper_ctl00_MainContent_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=8)
	public void TCED33208()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			
		   //Select Some Student 
		   click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl04_chkSelectUserSelectCheckBox']");
		   click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl06_chkSelectUserSelectCheckBox']");
		   
		   // Click on  Add Selected Student to Group button
		   click("//*[@id='ctl00_MainContent_btnCheckAll']");
		   
		   driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
		   
		   //Assert the label  Add Students to Group
		   Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
		   
		   //Assert the label  Create New Group
		   Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");
		   
		   driver.switchTo().parentFrame();
		   click("//*[@id='RadWindowWrapper_ctl00_MainContent_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=9)
	public void TCED33209()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			
		   //Click on List Students By Student Groups
			if (find("//*[@id='ctl00_MainContent_rbSearchByGroup']").isSelected()==false)
			{
			click("//*[@id='ctl00_MainContent_rbSearchByGroup']");
			}
			//select Group: 00 123 MR
			select("//select[@id='ctl00_MainContent_ddlStudentGroup']","label=00 123 MR");
			
			//Click on Get List
			click("//input[@id='ctl00_MainContent_btnGetList']");
			
			//Assert the label "Student Count"
			 String Std=getText("//span[@id='ctl00_MainContent_lblIncidentCount']");		  
			 String []word=Std.split(" ",3); 		   
			 Assert.assertEquals(word[0]+" "+word[1],"Student Count:");
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=10)
	public void TCED33210()
	{
		try
		{
			//Application should be in the Student Building/Grade lists Param page
			
			//Assert the Labels:-Student ID 
			Assert.assertEquals(getText("//th[contains(text(),'Student ID')]"),"Student ID");
			
			//Assert the Labels:-State Student ID 
			Assert.assertEquals(getText("//a[contains(text(),'State Student ID')]"),"State Student ID");
			
			//Assert the Labels:-Last Name 
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the Labels:-First Name 
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
			
			//Assert the Labels:-Current Grade 
			Assert.assertEquals(getText("//a[contains(text(),'Current Grade')]"),"Current Grade");
			
			//Assert the Labels:-Provider Name  
			Assert.assertEquals(getText("//a[contains(text(),'Provider Name')]"),"Provider Name");
			
			//Assert the Labels:-Gender 
			Assert.assertEquals(getText("//a[contains(text(),'Gender')]"),"Gender");
			
			//Assert the Labels:-Ethnicity 
			Assert.assertEquals(getText("//a[contains(text(),'Ethnicity')]"),"Ethnicity");
			
			//Assert the Labels:-IEP
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'IEP')]"),"IEP");
			
			//Assert the Labels:-ELL
			Assert.assertEquals(getText("//a[contains(text(),'ELL')]"),"ELL");
			
			//Assert the Labels:-MTSS Tiered
			Assert.assertEquals(getText("//a[contains(text(),'MTSS Tiered')]"),"MTSS Tiered");
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=11)
	public void TCED33211()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			FileDelete();
			
			//Click on  Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
			//Assert the csv generated		
			Thread.sleep(9000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".CSV"), "Failed to download document which has extension .CSV");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=12)
	public void TCED33212()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			FileDelete();
			
			//Click on  Export to PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf']");
			
			//Assert the PDF generated		
			Thread.sleep(9000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=13)
	public void TCED33213()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			
		   //Select Some Student 
		   click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl04_chkSelectUserSelectCheckBox']");
		   click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl06_chkSelectUserSelectCheckBox']");
		   
		   // Click on  Add Selected Student to Group button
		   click("//input[@id='ctl00_MainContent_btnSelectToGroup']");
		   
		   driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
		   
		   //Assert the label  Add Students to Group
		   Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
		   
		   //Assert the label  Create New Group
		   Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");
		   
		   driver.switchTo().parentFrame();
		   click("//*[@id='RadWindowWrapper_ctl00_MainContent_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=14)
	public void TCED33214()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			
		   //Select Some Student 
		   click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl04_chkSelectUserSelectCheckBox']");
		   click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl06_chkSelectUserSelectCheckBox']");
		   
		   // Click on  Add Selected Student to Group button
		   click("//*[@id='ctl00_MainContent_btnCheckAll']");
		   
		   driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
		   
		   //Assert the label  Add Students to Group
		   Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
		   
		   //Assert the label  Create New Group
		   Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");
		   
		   driver.switchTo().parentFrame();
		   //click("//*[@id='RadWindowWrapper_ctl00_MainContent_StudentGroupWindowUniqueNameToAvoidErrorsIHope2']/div[1]/div/ul/li/span");
		   click("//span[@title='Close']");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=15)
	public void TCED33215()
	{
		try
		{
           //Application should be in the Student Building/Grade lists Param page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,0)");
			FileDelete();
			
			//Click on  Export to PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			
			//Assert the PDF generated		
			Thread.sleep(9000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
		    //click on Logout button
			waitForEnable("//*[@id='ctl00_A3']/img");
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
