package com.MTSS;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class InterventionEffectivenessBySkill extends BaseClassOne{
	
	@Test(priority=1)
	public void TCED22807() 
	{
		try
		{
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the intervention Effectiveness  
			click("//a[contains(text(),'Intervention Effectiveness By Skill')]");
			
			//To type the intervention started between
			type("//input[@id='ctl00_MainContent_rdpStartedBeginDate_dateInput']","1/2/2018");
			
			//To type the intervention end date
			type("//input[@id='ctl00_MainContent_rdpStartedEndDate_dateInput']","9/12/2018");
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To click on the report button
			click("xpath=/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]");
			
			//To delete all the files in the directory
			FileDelete();
			
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
			Thread.sleep(5000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
		}catch(Exception e) 
		{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		}
	  }	
	
	@Test(priority=2)
	public void TCED22808() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportPDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=3)
	public void TCED22811() 
	{
		try
		{

			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF1']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}
