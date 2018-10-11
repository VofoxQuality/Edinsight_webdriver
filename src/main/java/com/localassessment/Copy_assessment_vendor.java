package com.localassessment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Copy_assessment_vendor extends BaseClassOne

{
	Random rnd = new Random();	
	
	String Test_id="311";
	
	String URL="http://192.168.10.201/Edinsight/Login.aspx";
	
	@Test	
	public void TCED15006()
	{
		try
		
		{
			//Supertent Login
			login_201(URL,"te$t$uper0nh@nd","password1!");
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Click on manage assessment
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");		
			//type on test id textbox		
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtTestId']")).sendKeys(Test_id);
			//type("//*[@id='ctl00_MainContent_txtTestId']", n);
			
			driver.findElement(By.cssSelector("input[id=ctl00_MainContent_btnTestIdSearch]")).click();
			
			driver.findElement(By.cssSelector("a#ctl00_MainContent_grdMyAssessments_ctl02_lnkCopyAssessment")).click();
			
			driver.switchTo().frame("rwCopyAssessment");
			
			Select vendor_drop=new Select(driver.findElement(By.cssSelector("select#ctl00_ContentPlaceHolder1_ddlVendorTestType")));
			
			vendor_drop.selectByIndex(1);				
			do
			{		
			int n = 100000 + rnd.nextInt(900000);
			String s=Integer.toString(n);
			type("input#ctl00_ContentPlaceHolder1_txtQuestionStartingId",s);
			
			click("input#ctl00_ContentPlaceHolder1_btnSaveAssessment.button");
			}
			while (driver.findElement(By.cssSelector("span#ctl00_ContentPlaceHolder1_lblMsg")).isDisplayed()==false);
			
			Assert.assertEquals(driver.findElement(By.cssSelector("span#ctl00_ContentPlaceHolder1_lblMsg")).getText(), "Assessment copied successfully...");
			
			driver.switchTo().defaultContent();		
			
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_rwCopyAssessment']/div[1]/div/ul/li[2]/span");
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	//login to 201 for checking vendor mode

	public void login_201(String url,String username,String password)
	 {
		driver.get(url);		
		driver.findElement(By.cssSelector("input#txtUserName.textbox")).sendKeys(username);
		driver.findElement(By.cssSelector("input#txtPassword.textbox")).sendKeys(password);		
		click("input#Submit1.name");	
	 }
	
}
