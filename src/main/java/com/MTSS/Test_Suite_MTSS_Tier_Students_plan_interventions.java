package com.MTSS;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Test_Suite_MTSS_Tier_Students_plan_interventions extends BaseClassOne

{
	
	@Test
	
	public void TCED19207() throws InterruptedException
	{
		try 
		   {
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);		
			Thread.sleep(2000);	
			
			//hover over MTTS link			
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			actions.moveToElement(mouseHover).build().perform();			
			
			//click Tier / Intervention link		
			click("//a[contains(text(),'Tier / Intervention')]");
			
			click("//a[contains(text(),'Tier Students & Plan Interventions')]");
			
			Select drp_provid=new Select(driver.findElement(By.cssSelector("select#ctl00_MainContent_ddlEducationProvider")));
			drp_provid.selectByIndex(1);
			
			click("input#ctl00_MainContent_btnSearch.button");
			Thread.sleep(2000);
			click("input#ctl00_MainContent_rgSearch_ctl00_ctl04_chkSelectUserSelectCheckBox");
			
			click("span#ctl00_MainContent_rsbExportOptions");
				
			List<WebElement> lis=driver.findElements(By.xpath("//*[@id='ctl00_MainContent_rcmExportOptions_detached']/ul/li"));
			
			FileDelete();
			lis.get(1).click();
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			click("span#ctl00_MainContent_rsbExportOptions");		
			FileDelete();
			actions.doubleClick(lis.get(2)).build().perform();
			//lis.get(2).click();
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			click("span#ctl00_MainContent_rsbExportOptions");
			FileDelete();
			lis.get(3).click();
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			click("span#ctl00_MainContent_rsbExportOptions");
			FileDelete();
			lis.get(4).click();
			Thread.sleep(9000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		
		catch (Exception e)
		{
		
			e.printStackTrace();
		}

		
	}

}
