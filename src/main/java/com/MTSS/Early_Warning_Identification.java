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



import Library.BaseClassOne;

public class Early_Warning_Identification extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED22107() throws InterruptedException
	
	{
	
	//Supertent Login
	login(Supertent_Login_id,Supertent_Login_Password);		
	Thread.sleep(2000);	
	
	//hover over MTTS link			
	Actions actions = new Actions(driver);
	WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
	actions.moveToElement(mouseHover).build().perform();
	
	click("//a[starts-with(text(),'Early Warning Identification')]");
	
	click("input#ctl00_MainContent_btnRunReport");
	
	driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);
	
	Thread.sleep(3000);
	click("input#ctl00_MainContent_btnExportCSV.button");
	
	FileDelete();	
	Thread.sleep(8000);		
	Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
	
	}
	//	@Test(priority=1)
	
	public void TCED22108()
	{
		
		String s=generateRandomData();
		
		driver.navigate().refresh();
		
		click("input#ctl00_MainContent_rgSearch_ctl00_ctl04_chkSelectUserSelectCheckBox");
		
		click("input#ctl00_MainContent_btnSelectToGroup.button");
		
		driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
		
		type("input#ctl00_ContentPlaceHolder1_txtCreateNewGroup" , s);
		
		click("input#ctl00_ContentPlaceHolder1_btnCreateGroup.button");
		
		driver.switchTo().defaultContent();
		
		click("input#ctl00_MainContent_btnSelectToGroup.button");
		
		WebDriverWait wt=new WebDriverWait(driver,10);
		
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("ctl00_ContentPlaceHolder1_ddlAddStudentToGroup"))));
		
		driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
		
		Select grp_drp=new Select(driver.findElement(By.cssSelector("ctl00_ContentPlaceHolder1_ddlAddStudentToGroup")));
		List<WebElement> li= grp_drp.getOptions();
		
		int size=li.size();
		
		for (int i=0;i<=size;i++)
		{
			if (li.get(i).getText().contains(s))
			{
				Assert.assertTrue(true);
				
			}
			
		}
			
	}
	
	@Test(priority=2)
	
	public void TCED22109()
	{
		
		driver.navigate().refresh();
		
		click("input#ctl00_MainContent_btnCheckAll.button");
		
		String s1=generateRandomData();
		
		driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
		
		type("input#ctl00_ContentPlaceHolder1_txtCreateNewGroup",s1);
		
		click("//*[@id='ctl00_ContentPlaceHolder1_btnCreateGroup']");
		
		
	}
	
//	@Test(priority=2)
	
	public void TCED22114() throws InterruptedException
	{
	
		driver.navigate().refresh();		
		FileDelete();	
		click("input#ctl00_MainContent_btnPrintToPDF.buttonPDF");
				
		Thread.sleep(6000);		
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
						
				
	}
	
//	@Test(priority=3)
	
	public void TCED22111() throws InterruptedException
	{
		 
	 try 
	    {
		//driver.navigate().refresh();
		 
		 boolean status,status1;
		 
		 click("input#ctl00_MainContent_rcmbColors_Input");
		 
		 List<WebElement> li=driver.findElements(By.xpath("//*[@id='ctl00_MainContent_rcmbColors_DropDown']/div/ul/li"));
		 
		 status=li.get(2).isSelected();
		 
		 status1=li.get(3).isSelected();
		 
		 System.out.println(status);
		 
		 System.out.println(status1);
		 
		 if(status==false)
		 {
		 
		 li.get(2).click();
		 }		 
		 		 
		 if(status1==false)
		 {
		 li.get(3).click(); 		 
		 }
		 
		 Thread.sleep(2000);
		 
		 click("//*[@id='ctl00_MainContent_lblFilterMsg']");
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File fs=ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(fs, new File(".//Screenshots//Earlywarning.png"));
	} 
	 
	catch (WebDriverException e) 
    {
		e.printStackTrace();
	} 	 
	 catch (IOException e) 
    {
		e.printStackTrace();
	}
	 	
	
	}
}
