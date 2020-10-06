package com.MTSS;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class Early_Warning_Identification extends BaseClassOne {

	@Test(priority=1)

	public void TCED22101() throws InterruptedException

	{
		try {

			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);		
			Thread.sleep(2000);	

			//Hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();

			click("//a[starts-with(text(),'Early Warning Identification')]");

			// To Assert Header
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/span"), "Early Warning Identification");

			// To Assert other labels on page
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]"), "Select View");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]"), "Identify Students With");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]"), "Cells of the Color(s)");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]"), "Indicators to Consider");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/label"), "Run Report by Building/Grade");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[7]/td[2]"), "School Type");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[8]/td[2]"), "Current Building");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblGradeLevel']"), "Current Grade Level");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_groupTable']/tbody/tr/td[2]"), "Current Subgroup(s)");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[1]/td[1]/label"), "Gender");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[1]/td[2]/label"), "Ethnicity");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[1]/td[3]/label"), "ELL");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[2]/td[1]/label"), "IEP");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[2]/td[2]/label"), "Gifted");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[2]/td[3]/label"), "Econ. Disadvantaged");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[3]/td[1]/label"), "Title1");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[3]/td[2]/label"), "Title3");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[3]/td[3]/label"), "Medical Issue");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[4]/td[1]/label"), "Migrant");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[4]/td[2]/label"), "504");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl05_chkLstSubgroups']/tbody/tr[4]/td[3]/label"), "MTSS Tiered");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[13]/td[2]/label"), "Run Report by Student Group");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[14]/td[2]"), "Student Group");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=2)

	public void TCED22102() throws InterruptedException

	{
		try 
		{
			// TO select the parameters
			select("//*[@id='ctl00_MainContent_ddlRTITierType']","Keystone Spotlight");

			select("//*[@id='ctl00_MainContent_ddlProvider']","Belle Plaine Elementary School");

			click("//*[@id='ctl00_MainContent_ddlFilterType_Arrow']");

			click("//*[@id='ctl00_MainContent_ddlFilterType_DropDown']/div/ul/li[2]");			
			//To click report
			click("input#ctl00_MainContent_btnRunReport");

			driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);

			Thread.sleep(3000);

			// To Assert Header
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/span"), "Early Warning Identification");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}
	@Test(priority=3)

	public void TCED22103() throws InterruptedException

	{
		try {

			// To Assert the labels
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[5]/td/span/b").contains("Education Provider:"), "Failed to Assert"+"Education Provider:");

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_lblGradeLevel']").contains("Grade Level:"), "Failed to Assert"+"Grade Level:");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblFilterDisplay']"), "Current Subgroup(s) :");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[8]/td[1]/table[2]/tbody/tr[1]/td/span"), "Filter Students");

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_trFilterLine']/td[2]/span").contains("Show only students with"), "Failed to Assert"+"Show only students with");

			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_trFilterLine']/td[2]/span").contains("colors in any combination of cells in the following columns only:"), "Failed to Assert"+"colors in any combination of cells in the following columns only:");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		} 
	}	

	@Test(priority=4)

	public void TCED22104() throws InterruptedException

	{
		try {

			// To Assert the Grid labels

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00_Header']/thead/tr[1]/th[2]/a"), "Student Id");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00_Header']/thead/tr[1]/th[3]/a"), "Last Name");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00_Header']/thead/tr[1]/th[4]/a"), "First Name");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00_Header']/thead/tr[1]/th[5]/a"), "Special Demogr.");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00_Header']/thead/tr[1]/th[6]/a"), "MTSS Tiered");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00_Header']/thead/tr[1]/th[7]/a"), "Current Grade");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00_Header']/thead/tr[1]/th[8]/a"), "Current School");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	//	@Test(priority=5)

	public void TCED22105() throws InterruptedException

	{
		try {

			//To click on CSV
			click("input#ctl00_MainContent_btnExportCSV.button");

			FileDelete();	
			Thread.sleep(8000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}

	@Test(priority=6)
	public void TCED22106() throws InterruptedException
	{

		try {

			//To click on PDF		
			FileDelete();	
			click("input#ctl00_MainContent_btnPrintToPDF.buttonPDF");

			Thread.sleep(60000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}

	@Test(priority=7)

	public void TCED22107() throws InterruptedException
	{

		try {
			// To select students
			click("//*[@id='ctl00_MainContent_rgSearch_ctl00_ctl02_ctl00_chkSelectUserSelectCheckBox']");	

			//To click on the Add selected students to group
			click("//*[@id='ctl00_MainContent_btnSelectToGroup']");
			Thread.sleep(4000);	
			// To switch to frame
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Thread.sleep(2000);

			// To Assert the Validation Messages
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");	

			Assert.assertEquals( getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");

			// To switch to default frame
			driver.switchTo().defaultContent();
			// To close popup
			click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Session Timeout'])[1]/preceding::span[2]");
			Thread.sleep(4000);
			// To Assert Header
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/span"), "Early Warning Identification");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}

	@Test(priority=8)
	public void TCED22108()
	{

		try {


			String s=generateRandomData();
			// To click the students
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl04_chkSelectUserSelectCheckBox");

			click("input#ctl00_MainContent_btnSelectToGroup.button");
			Thread.sleep(4000);
			// To switch to frame
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");

			// To Assert the Validation Messages
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");	

			Assert.assertEquals( getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");

			type("input#ctl00_ContentPlaceHolder1_txtCreateNewGroup" , s);

			click("input#ctl00_ContentPlaceHolder1_btnCreateGroup.button");
			// To switch to parent
			driver.switchTo().defaultContent();

			// To Assert Header
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/span"), "Early Warning Identification");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}


	@Test(priority=9)

	public void TCED22109()
	{

		try {
			// To click on favourites
			click("//*[@id='ctl00_MainContent_btnAddToFavorite']");
			Thread.sleep(5000);
			
			// To Assert Header
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/span"), "Early Warning Identification");


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}

	//	@Test(priority=10)
	public void TCED22110()
	{

		try {
			// To click on update button
			click("//*[@id='ctl00_MainContent_btnFilter']");
			//			Thread.sleep(5000);
			// To Assert Header
			//			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/span"), "Early Warning Identification");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}

	@Test(priority=11)
	public void TCED22111()
	{

		try {

			//Hover over MTTS link			
			Actions actions = new Actions(driver);
			
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();

			click("//a[starts-with(text(),'Early Warning Identification')]");

			select("//*[@id='ctl00_MainContent_ddlRTITierType']","Keystone Spotlight");

			// To click on run report by student Grp
			click ("//*[@id='ctl00_MainContent_rdoStudentGroup']");
			
			select("//*[@id='ctl00_MainContent_ddlStudentGroup']","Ans- GRP");

			click("input#ctl00_MainContent_btnRunReport");

			// To Assert Header
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/span"), "Early Warning Identification");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}

	//	@Test(priority=12)
	public void TCED22112() throws InterruptedException

	{
		try {

			// To click on CSV
			click("input#ctl00_MainContent_btnExportCSV.button");

			FileDelete();	
			Thread.sleep(8000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}


	@Test(priority=13)

	public void TCED22113() throws InterruptedException
	{

		try {
	
			FileDelete();	
			// To click on PDF
			click("input#ctl00_MainContent_btnPrintToPDF.buttonPDF");

			Thread.sleep(8000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        
	}

}	









