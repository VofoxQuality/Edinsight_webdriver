package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
/**
 * 
 * @author sebastian jose(Aligned Standards)
 *
 */

public class Aligned_Standards extends BaseClassOne  {
	
	@Test(priority=0)
	public void TCED291001()
	{
		
		try {
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the Tier History Report
			click("//a[contains(text(),'Tier History Report')]"); 
			
			//To type the start date 
			type("//input[@id='ctl00_MainContent_rdpStart_dateInput']","1/1/2018");
			
			//To type the End date 
			type("//input[@id='ctl00_MainContent_rdgEnd_dateInput']","8/4/2018");
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}		
			
	}
	
	

}
